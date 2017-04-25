package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasExamenes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface ListasExamenesRefactorRepository extends CrudRepository<ListasExamenes, Integer> {
    List<ListasExamenes> findByIndicadorHabilitadoTrue();

    ListasExamenes findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasExamenes> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasExamenes> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
