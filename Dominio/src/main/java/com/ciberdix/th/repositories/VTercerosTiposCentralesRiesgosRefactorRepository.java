package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosTiposCentralesRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosTiposCentralesRiesgosRefactorRepository extends CrudRepository<VTercerosTiposCentralesRiesgos, Integer> {

    List<VTercerosTiposCentralesRiesgos> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosTiposCentralesRiesgos> findAllByIdTerceroTipo(Integer id);

}
