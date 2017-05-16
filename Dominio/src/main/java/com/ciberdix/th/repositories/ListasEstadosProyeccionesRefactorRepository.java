package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosProyecciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasEstadosProyeccionesRefactorRepository extends CrudRepository<ListasEstadosProyecciones, Integer> {
    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrue();

    ListasEstadosProyecciones findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosProyecciones> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
