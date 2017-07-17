package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VDotaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface VDotacionesRefactorRepository extends CrudRepository<VDotaciones, Integer> {

    List<VDotaciones> findAllByIndicadorHabilitadoIsTrue();

}
