package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VDivisionPoliticaRec;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VDivisionPoliticaRecRefactorRepository extends CrudRepository<VDivisionPoliticaRec, Integer> {

    @Query("SELECT u from VDivisionPoliticaRec u where u.camino like concat('%',?1,'%') and u.idDivisionPoliticaTipo in (select idDivisionPoliticaTipo from DivisionPoliticaTipos where substring(codigoDivisionPoliticaTipo,1,1) IN  ('3','4'))")
    List<VDivisionPoliticaRec> queryLocations(String queryString);

    @Query("SELECT u from VDivisionPoliticaRec u where u.camino like concat('%',?1,'%') and u.idDivisionPoliticaTipo in (select idDivisionPoliticaTipo from DivisionPoliticaTipos where substring(codigoDivisionPoliticaTipo,1,1) IN  ('3'))")
    List<VDivisionPoliticaRec> queryAllCities(String queryString);

}
