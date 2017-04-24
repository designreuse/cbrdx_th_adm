package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasClasificaciones;
import com.ciberdix.th.models.refactor.ListasClasificacionesSedes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasClasificacionesRefactorRepository extends CrudRepository<ListasClasificaciones, Integer> {
    List<ListasClasificaciones> findByIndicadorHabilitadoTrue();

    ListasClasificaciones findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasClasificaciones> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasClasificaciones> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
