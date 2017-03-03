package com.ciberdix.th.repositories;

import com.ciberdix.th.models.EstructuraAreasEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by felip on 2/03/2017.
 */
public interface TipoAreaRepository extends CrudRepository<EstructuraAreasEntity, Integer> {
}
