package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosAccidentes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasEstadosAccidentesRefactorRepository extends CrudRepository<ListasEstadosAccidentes, Integer> {
    List<ListasEstadosAccidentes> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosAccidentes findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosAccidentes> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosAccidentes> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
