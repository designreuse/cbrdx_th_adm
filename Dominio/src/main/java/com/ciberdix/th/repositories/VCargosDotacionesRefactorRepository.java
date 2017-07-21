package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosDotaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface VCargosDotacionesRefactorRepository extends CrudRepository<VCargosDotaciones, Integer> {

    List<VCargosDotaciones> findAllByIndicadorHabilitadoIsTrue();

    List<VCargosDotaciones> findAllByIdCargo(Integer id);

    List<VCargosDotaciones> findAllByIdGrupoDotacion(Integer id);

}