package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface VTercerosVehiculosRefactorRepository extends CrudRepository<VTercerosVehiculos, Integer> {
    List<VTercerosVehiculos> findByIndicadorHabilitadoIsTrueAndIdTercero(Long id);
}
