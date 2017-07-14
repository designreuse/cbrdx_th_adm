package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosPublicacionesHistoricos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 10/07/2017.
 */
public interface VTercerosPublicacionesHistoricosRefactorRepository extends CrudRepository<VTercerosPublicacionesHistoricos, Integer> {

    List<VTercerosPublicacionesHistoricos> findAllByIdTercero(Long id);

}
