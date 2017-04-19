package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VEstructuraOrganizacionalCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface VEstructuraOrganizacionalCargosRefactorRepository extends CrudRepository<VEstructuraOrganizacionalCargos, Integer> {
    List<VEstructuraOrganizacionalCargos> findByIndicadorHabilitadoIsTrue();
    List<VEstructuraOrganizacionalCargos> findByIndicadorHabilitadoIsTrueAndIdEstructuraOrganizacional(Integer id);
}
