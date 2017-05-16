package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasRolesProceso;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface ListasRolesProcesoRefactorRepository extends CrudRepository<ListasRolesProceso, Integer> {
    List<ListasRolesProceso> findByIndicadorHabilitadoTrue();

    ListasRolesProceso findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasRolesProceso> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasRolesProceso> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
