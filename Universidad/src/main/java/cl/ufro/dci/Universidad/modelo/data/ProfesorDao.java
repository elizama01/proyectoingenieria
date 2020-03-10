package cl.ufro.dci.Universidad.modelo.data;

import cl.ufro.dci.Universidad.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorDao extends JpaRepository<Profesor,Long>{

}