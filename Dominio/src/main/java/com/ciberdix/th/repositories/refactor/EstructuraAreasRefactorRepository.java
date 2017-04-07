package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.EstructuraAreas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface EstructuraAreasRefactorRepository extends CrudRepository<EstructuraAreas, Integer> {
    List<EstructuraAreas> findByIndicadorHabilitadoIsTrue();
}
