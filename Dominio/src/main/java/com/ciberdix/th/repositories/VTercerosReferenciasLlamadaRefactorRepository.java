package com.ciberdix.th.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface VTercerosReferenciasLlamadaRefactorRepository extends CrudRepository<VTercerosReferenciasLlamada, Integer> {

    List<VTercerosReferenciasLlamada> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosReferenciasLlamada> findAllByIdTerceroReferencia(Integer id);

    List<VTercerosReferenciasLlamada> findAllByIdResultadoLlamada(Integer id);

}
