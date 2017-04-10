package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosCompetencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 10/04/2017.
 */
public interface CargosCompetenciasRefactorRepository extends CrudRepository<CargosCompetencias, Integer> {

    List<CargosCompetencias> findByIdCargo(Integer idCargo);
}
