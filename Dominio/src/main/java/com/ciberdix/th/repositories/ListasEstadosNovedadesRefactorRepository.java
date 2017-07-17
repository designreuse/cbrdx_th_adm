package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosNovedades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface ListasEstadosNovedadesRefactorRepository extends CrudRepository<ListasEstadosNovedades, Integer> {
    List<ListasEstadosNovedades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosNovedades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosNovedades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosNovedades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
