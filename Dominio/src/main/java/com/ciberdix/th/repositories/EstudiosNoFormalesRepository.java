package com.ciberdix.th.repositories;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.EstudiosNoFormalesEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by felip on 2/03/2017.
 */
public interface EstudiosNoFormalesRepository extends CrudRepository<EstudiosNoFormalesEntity, Integer> {
}