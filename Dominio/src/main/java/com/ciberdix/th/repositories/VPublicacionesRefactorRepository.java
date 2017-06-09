package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPublicaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 2/06/2017.
 */
public interface VPublicacionesRefactorRepository extends CrudRepository<VPublicaciones, Integer> {

    @Query("SELECT P FROM VPublicaciones P WHERE P.idRequerimiento IN (SELECT R.idRequerimiento FROM Requerimientos R WHERE R.idEstructuraFisica IN (SELECT E.idEstructuraFisica FROM EstructuraFisica E WHERE E.idLocalizacion IN (SELECT L.idLocalizacion FROM Localizaciones L WHERE L.idDivisionPolitica IN (SELECT D.idDivisionPolitica FROM DivisionPolitica D WHERE D.idDivisionPolitica = ?1))))")
    List<VPublicaciones> queryAllByDivPolitica(Integer idDivisionPolitica);

}
