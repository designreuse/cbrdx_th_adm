package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosFamiliaresEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface VTercerosFamiliaresRepository extends CrudRepository<VTercerosFamiliaresEntity, Integer> {
    List<VTercerosFamiliaresEntity> findByIdTercero(Long idTercero);
}
