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

    @Query("SELECT c FROM Cargos c WHERE (c.codigoCargo LIKE CONCAT('%',?1,'%') OR c.cargo LIKE CONCAT('%',?1,'%')) AND c.idCargo IN (SELECT eoc.idCargo FROM EstructuraOrganizacionalCargos eoc WHERE eoc.idEstructuraOrganizacional = ?2 AND eoc.indicadorHabilitado = 1)")
    List<Cargos> queryByIdEstructuraOrganizacional(String query, Integer idEstructuraOrganicacional);

    @Transactional
    @Modifying
    @Query("UPDATE Cargos SET indicadorHabilitado = 0 WHERE idCargo = ?1")
    void disabled(Integer idCargo);

}
