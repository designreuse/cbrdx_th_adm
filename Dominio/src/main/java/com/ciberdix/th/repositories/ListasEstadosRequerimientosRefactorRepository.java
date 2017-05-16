package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosRequerimientos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasEstadosRequerimientosRefactorRepository extends CrudRepository<ListasEstadosRequerimientos, Integer> {
    List<ListasEstadosRequerimientos> findByIndicadorHabilitadoTrue();

    ListasEstadosRequerimientos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosRequerimientos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosRequerimientos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
