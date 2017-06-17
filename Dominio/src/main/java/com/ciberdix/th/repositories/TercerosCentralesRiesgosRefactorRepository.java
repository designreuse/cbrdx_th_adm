package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosCentralesRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */
public interface TercerosCentralesRiesgosRefactorRepository extends CrudRepository<TercerosCentralesRiesgos, Integer> {

    List<TercerosCentralesRiesgos> findByIndicadorHabilitadoIsTrue();

    List<TercerosCentralesRiesgos> findAllByIdTercero(Long idTercero);

}
