package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposElementos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasTiposElementosRefactorRepository extends CrudRepository<ListasTiposElementos, Integer> {
    List<ListasTiposElementos> findByIndicadorHabilitadoIsTrue();
}
