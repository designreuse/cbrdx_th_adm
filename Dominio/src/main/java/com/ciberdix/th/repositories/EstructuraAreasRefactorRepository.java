package com.ciberdix.th.repositories;

import com.ciberdix.th.models.EstructuraAreas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface EstructuraAreasRefactorRepository extends CrudRepository<EstructuraAreas, Integer> {
    List<EstructuraAreas> findByIndicadorHabilitadoIsTrue();
}
