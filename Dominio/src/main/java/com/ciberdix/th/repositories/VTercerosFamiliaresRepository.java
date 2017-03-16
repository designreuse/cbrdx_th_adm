package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosFamiliaresEntity;
import com.ciberdix.th.models.VTercerosFamiliaresEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface VTercerosFamiliaresRepository extends CrudRepository<VTercerosFamiliaresEntity, Integer> {
    List<VTercerosFamiliaresEntity> findByIdTercero(Long idTercero);
    VTercerosFamiliaresEntity findByIdTerceroFamiliar(Integer idTerceroFamiliar);
    List<VTercerosFamiliaresEntity> findByIndicadorHabilitado(boolean indicadorHabilitado);
    List<VTercerosFamiliaresEntity> findByIdTerceroAndIndicadorHabilitado(Long idTercero, boolean indicadorHabilitado);

}
