package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasEstadosCargosRefactorRepository extends CrudRepository<ListasEstadosCargos, Integer> {
    List<ListasEstadosCargos> findByIndicadorHabilitadoIsTrue();
    ListasEstadosCargos findByCodigo(String codigo);
}