package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CargosOcupaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface CargosOcupacionesRefactorRepository extends CrudRepository<CargosOcupaciones, Integer> {
    List<CargosOcupaciones> findByIndicadorHabilitadoIsTrue();
    List<CargosOcupaciones> findByIdCargo(Integer idCargo);
}
