package com.ciberdix.th.repositories;

import com.ciberdix.th.models.EstructuraOrganizacionalCargos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface EstructuraOrganizacionalCargosRefactorRepository extends CrudRepository<EstructuraOrganizacionalCargos, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE EstructuraOrganizacionalCargos SET indicadorHabilitado = 0 WHERE idCargo = ?1")
    void disabled(Integer idCargo);

}
