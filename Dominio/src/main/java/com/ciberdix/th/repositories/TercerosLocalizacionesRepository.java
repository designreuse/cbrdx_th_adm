package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosLocalizacionesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface TercerosLocalizacionesRepository extends CrudRepository<TercerosLocalizacionesEntity, Integer> {
    List<TercerosLocalizacionesEntity> findByIdTercero(int terceros);
}
