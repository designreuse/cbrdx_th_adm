package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosFaltas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasEstadosFaltasRefactorRepository extends CrudRepository<ListasEstadosFaltas, Integer> {
    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosFaltas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
