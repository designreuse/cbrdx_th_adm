package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasificacionesSedes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasClasificacionesSedesRefactorRepository extends CrudRepository<ListasClasificacionesSedes, Integer> {
    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasClasificacionesSedes findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
