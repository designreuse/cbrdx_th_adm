package com.ciberdix.th.repositories;

import com.ciberdix.th.models.DivisionPolitica;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface DivisionPoliticaRefactorRepository extends CrudRepository<DivisionPolitica, Integer> {
    List<DivisionPolitica> findByIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre);

    @Query("SELECT D FROM DivisionPolitica D WHERE D.idDivisionPolitica IN (SELECT DP.idDivisionPoliticaPadre FROM DivisionPolitica DP WHERE DP.idDivisionPolitica IN (SELECT L.idDivisionPolitica FROM Localizaciones L WHERE L.idLocalizacion IN (SELECT E.idLocalizacion FROM EstructuraFisica E WHERE E.idEstructuraFisica IN (SELECT R.idEstructuraFisica FROM Requerimientos R WHERE R.idRequerimiento IN (SELECT P.idRequerimiento FROM Publicaciones P WHERE P.indicadorHabilitado = 1))))) OR D.idDivisionPolitica IN (SELECT DP.idDivisionPolitica FROM DivisionPolitica DP WHERE DP.idDivisionPolitica IN (SELECT L.idDivisionPolitica  FROM Localizaciones L WHERE L.idLocalizacion IN (SELECT E.idLocalizacion FROM EstructuraFisica E WHERE E.idEstructuraFisica IN (SELECT R.idEstructuraFisica FROM Requerimientos R WHERE R.idRequerimiento IN (SELECT P.idRequerimiento FROM Publicaciones P WHERE P.indicadorHabilitado = 1)))))")
    List<DivisionPolitica> queryAllByPublicacion();
}
