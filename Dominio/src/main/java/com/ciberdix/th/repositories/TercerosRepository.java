package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface TercerosRepository extends CrudRepository<TercerosEntity, Integer> {
    List<TercerosEntity> findByIdTercero(int idTercero);
}
