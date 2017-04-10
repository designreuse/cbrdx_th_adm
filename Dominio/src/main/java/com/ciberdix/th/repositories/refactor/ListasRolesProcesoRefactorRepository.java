package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasRolesProceso;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface ListasRolesProcesoRefactorRepository extends CrudRepository<ListasRolesProceso, Integer> {
    List<ListasRolesProceso> findByIndicadorHabilitadoIsTrue();
}
