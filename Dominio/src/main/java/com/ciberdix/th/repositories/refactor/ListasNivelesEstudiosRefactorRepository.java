package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasNivelesEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasNivelesEstudiosRefactorRepository extends CrudRepository<ListasNivelesEstudios, Integer> {
    List<ListasNivelesEstudios> findByIndicadorHabilitadoIsTrue();
}
