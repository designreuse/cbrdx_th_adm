package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasEstadosCargosRefactorRepository extends CrudRepository<ListasEstadosCargos, Integer> {
    List<ListasEstadosCargos> findByIndicadorHabilitadoTrue();

    ListasEstadosCargos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosCargos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosCargos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
