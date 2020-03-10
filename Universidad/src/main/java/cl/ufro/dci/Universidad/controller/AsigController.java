package cl.ufro.dci.Universidad.controller;

import cl.ufro.dci.Universidad.modelo.Asignatura;
import cl.ufro.dci.Universidad.modelo.Universidad;

import cl.ufro.dci.Universidad.modelo.data.AsignaturaDao;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.ArrayList;


@RestController
@RequestMapping(value="/asignaturas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AsigController {
    private Universidad universidad= Universidad.getInstance();
    @Autowired
    AsignaturaDao asignaturaDao;
    ArrayList<MultipartFile> aob=new ArrayList<>();

    @RequestMapping(value="/",method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Asignatura> getIndex(){
        return universidad.getAsignaturas();
    }


    @RequestMapping(value = "/",method = RequestMethod.POST, produces = "application/json")
    public String postIndex( @RequestBody Asignatura asignatura){
        universidad.addAsignatura(asignatura);
        return "status:200";
    }
    @RequestMapping(value = "/ob",method = RequestMethod.POST,consumes = {"multipart/form-data"})
    public String postobjects(@RequestParam("file") MultipartFile file) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            Asignatura tempStudent = new Asignatura();

            XSSFRow row = worksheet.getRow(i);

            tempStudent.setCodigo((String) row.getCell(1).getStringCellValue());
            tempStudent.setNombre(row.getCell(0).getStringCellValue());
            asignaturaDao.save(tempStudent);
        }
        return "4001";
    }

    @RequestMapping(value = "/ob",method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Asignatura> getobjects(){
        ArrayList<Asignatura>asig=(ArrayList<Asignatura>)asignaturaDao.findAll();
        return asig ;
    }
}