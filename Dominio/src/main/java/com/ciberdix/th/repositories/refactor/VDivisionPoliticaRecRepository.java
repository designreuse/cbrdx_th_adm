package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VDivisionPoliticaRec;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VDivisionPoliticaRecRepository extends CrudRepository<VDivisionPoliticaRec, Integer> {

    @Query("SELECT u from VDivisionPoliticaRec u where u.camino like concat('%',?1,'%') and u.idDivisionPoliticaTipo in (select idDivisionPoliticaTipo from DivisionPoliticaTipos where length(codigoDivisionPolitica)>2)")
    List<VDivisionPoliticaRec> queryLocations(String queryString);

    @Query("SELECT u from VDivisionPoliticaRec u where u.camino like concat('%',?1,'%') and u.idDivisionPoliticaTipo in (select idDivisionPoliticaTipo from DivisionPoliticaTipos where length(codigoDivisionPolitica)=3)")
    List<VDivisionPoliticaRec> queryAllCities(String queryString);
}
