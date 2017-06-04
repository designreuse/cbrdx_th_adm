package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosCompetencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 1/06/2017.
 */
public interface VCargosCompetenciasRefactorRepository extends CrudRepository<VCargosCompetencias, Integer> {

    List<VCargosCompetencias> findByIdCargo(Integer idCargo);

}
