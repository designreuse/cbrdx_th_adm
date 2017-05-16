package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosRolesProcesos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface VCargosRolesProcesosRefactorRepository extends CrudRepository<VCargosRolesProcesos, Integer> {
    List<VCargosRolesProcesos> findByIndicadorHabilitadoIsTrue();
    List<VCargosRolesProcesos> findByIndicadorHabilitadoIsTrueAndIdCargo(Integer id);
}
