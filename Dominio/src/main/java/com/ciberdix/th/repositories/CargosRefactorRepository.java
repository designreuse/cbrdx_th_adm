package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Cargos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface CargosRefactorRepository extends CrudRepository<Cargos, Integer> {

    @Query("SELECT c FROM Cargos c WHERE (c.codigoCargo LIKE CONCAT('%',?1,'%') OR " +
            "lower(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(c.cargo,'Á','a')" +
            ",'À','a')" +
            ",'Â','a')" +
            ",'Ã','a')" +
            ",'Ä','a')" +
            ",'Å','a')" +
            ",'á','a')" +
            ",'à','a')" +
            ",'â','a')" +
            ",'ã','a')" +
            ",'ä','a')" +
            ",'å','a')" +
            ",'É','e')" +
            ",'È','e')" +
            ",'Ê','e')" +
            ",'Ë','e')" +
            ",'é','e')" +
            ",'è','e')" +
            ",'ê','e')" +
            ",'ë','e')" +
            ",'Í','i')" +
            ",'Ì','i')" +
            ",'Î','i')" +
            ",'Ï','i')" +
            ",'í','i')" +
            ",'ì','i')" +
            ",'î','i')" +
            ",'ï','i')" +
            ",'Ó','o')" +
            ",'Ò','o')" +
            ",'Ô','o')" +
            ",'Õ','o')" +
            ",'Ö','o')" +
            ",'ó','o')" +
            ",'ò','o')" +
            ",'ô','o')" +
            ",'õ','o')" +
            ",'ö','o')" +
            ",'Ú','u')" +
            ",'Ù','u')" +
            ",'Û','u')" +
            ",'Ü','u')" +
            ",'ú','u')" +
            ",'ù','u')" +
            ",'û','u')" +
            ",'ü','u')" +
            ",'ñ','n')" +
            ",'Ñ','n')" +
            ",'ÿ','y')" +
            ") " + " LIKE CONCAT('%',?1,'%')) AND c.idCargo IN (SELECT eoc.idCargo FROM EstructuraOrganizacionalCargos eoc WHERE eoc.idEstructuraOrganizacional = ?2 AND eoc.indicadorHabilitado = 1) ORDER BY c.cargo")
    List<Cargos> queryByIdEstructuraOrganizacional(String query, Integer idEstructuraOrganicacional);

    @Transactional
    @Modifying
    @Query("UPDATE Cargos SET indicadorHabilitado = 0 WHERE idCargo = ?1")
    void disabled(Integer idCargo);

}
