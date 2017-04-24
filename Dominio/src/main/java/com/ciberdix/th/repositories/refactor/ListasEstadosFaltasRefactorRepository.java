package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosFaltas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasEstadosFaltasRefactorRepository extends CrudRepository<ListasEstadosFaltas, Integer> {
    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrue();

    ListasEstadosFaltas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosFaltas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
