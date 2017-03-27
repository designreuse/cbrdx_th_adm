package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasAreasEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasAreasEstudiosRefactorRepository extends CrudRepository<ListasAreasEstudios, Integer> {
    List<ListasAreasEstudios> findByIndicadorHabilitadoIsTrue();
}
