package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposViviendasRefactorRepository extends CrudRepository<ListasTiposViviendas, Integer> {
    List<ListasTiposViviendas> findByIndicadorHabilitadoIsTrue();
}
