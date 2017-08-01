package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosPlanesAccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasEstadosPlanesAccionRefactorRepository extends CrudRepository<ListasEstadosPlanesAccion, Integer> {
    List<ListasEstadosPlanesAccion> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosPlanesAccion findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosPlanesAccion> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosPlanesAccion> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
