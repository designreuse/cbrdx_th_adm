package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposReferencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposReferenciasRefactorRepository extends CrudRepository<ListasTiposReferencias, Integer> {
    List<ListasTiposReferencias> findByIndicadorHabilitadoIsTrue();
}
