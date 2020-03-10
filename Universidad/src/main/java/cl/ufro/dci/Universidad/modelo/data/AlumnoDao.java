package cl.ufro.dci.Universidad.modelo.data;

import cl.ufro.dci.Universidad.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoDao extends JpaRepository<Alumno,Long>{

}