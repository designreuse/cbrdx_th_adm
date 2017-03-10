package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosFamiliaresEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface TercerosFamiliaresRepository extends CrudRepository<TercerosFamiliaresEntity, Integer> {
    List<TercerosFamiliaresEntity> findByIdTerceros(int idTerceros);
}
