package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasRolesProceso;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface ListasRolesProcesoRefactorRepository extends CrudRepository<ListasRolesProceso, Integer> {
    List<ListasRolesProceso> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasRolesProceso findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasRolesProceso> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasRolesProceso> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
