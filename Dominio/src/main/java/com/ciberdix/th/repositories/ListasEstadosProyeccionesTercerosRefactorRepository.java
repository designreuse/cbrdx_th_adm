package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosProyeccionesTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasEstadosProyeccionesTercerosRefactorRepository extends CrudRepository<ListasEstadosProyeccionesTerceros, Integer> {
    List<ListasEstadosProyeccionesTerceros> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosProyeccionesTerceros findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosProyeccionesTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosProyeccionesTerceros> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
