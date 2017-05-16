package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosInmuebles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
public interface VTercerosInmueblesRefactorRepository extends CrudRepository<VTercerosInmuebles, Integer> {
    List<VTercerosInmuebles> findByIndicadorHabilitadoIsTrueAndIdTercero(Long id);
}
