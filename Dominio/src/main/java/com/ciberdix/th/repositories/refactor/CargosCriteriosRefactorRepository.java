package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosCriterios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface CargosCriteriosRefactorRepository extends CrudRepository<CargosCriterios, Integer> {
    List<CargosCriterios> findByIndicadorHabilitadoTrueAndIdCargoEquals(Integer id);
}
