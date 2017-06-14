package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosDiligenciados;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */
public interface ListasEstadosDiligenciadosRefactorRepository extends CrudRepository<ListasEstadosDiligenciados, Integer> {
    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosDiligenciados findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
