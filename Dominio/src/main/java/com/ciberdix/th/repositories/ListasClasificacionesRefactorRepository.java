package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasificaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasClasificacionesRefactorRepository extends CrudRepository<ListasClasificaciones, Integer> {
    List<ListasClasificaciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasClasificaciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasClasificaciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasClasificaciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
