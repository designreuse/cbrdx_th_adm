package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CargosEstadosObservaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface CargosEstadosObservacionesRefactorRepository extends CrudRepository<CargosEstadosObservaciones, Integer> {
    List<CargosEstadosObservaciones> findByIdCargo(Integer id);
}
