package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosDiligenciados;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */
public interface ListasEstadosDiligenciadosRefactorRepository extends CrudRepository<ListasEstadosDiligenciados, Integer> {

    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrue();

    ListasEstadosDiligenciados findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosDiligenciados> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);

}
