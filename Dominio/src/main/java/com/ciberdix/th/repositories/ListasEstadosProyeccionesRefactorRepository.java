package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosProyecciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasEstadosProyeccionesRefactorRepository extends CrudRepository<ListasEstadosProyecciones, Integer> {
    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosProyecciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
