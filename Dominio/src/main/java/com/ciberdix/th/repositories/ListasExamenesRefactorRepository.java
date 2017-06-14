package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasExamenes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface ListasExamenesRefactorRepository extends CrudRepository<ListasExamenes, Integer> {
    List<ListasExamenes> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasExamenes findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasExamenes> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasExamenes> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
