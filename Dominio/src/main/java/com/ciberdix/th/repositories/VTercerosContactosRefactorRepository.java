package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosContactos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface VTercerosContactosRefactorRepository extends CrudRepository<VTercerosContactos, Integer> {
    List<VTercerosContactos> findByIndicadorHabilitadoIsTrueAndIdTercero(Long id);
}
