package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasificacionesSedes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasClasificacionesSedesRefactorRepository extends CrudRepository<ListasClasificacionesSedes, Integer> {
    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrue();

    ListasClasificacionesSedes findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasClasificacionesSedes> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
