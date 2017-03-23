package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosReferenciasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface VTercerosReferenciasRepository extends CrudRepository<VTercerosReferenciasEntity, Integer> {
    List<VTercerosReferenciasEntity> findByIdTercero(Long idTercero);
}
