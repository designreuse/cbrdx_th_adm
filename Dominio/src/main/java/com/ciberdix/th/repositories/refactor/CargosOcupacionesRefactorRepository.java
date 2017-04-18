package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosOcupaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface CargosOcupacionesRefactorRepository extends CrudRepository<CargosOcupaciones, Integer> {

    List<CargosOcupaciones> findByIdCargo(Integer idCargo);
}
