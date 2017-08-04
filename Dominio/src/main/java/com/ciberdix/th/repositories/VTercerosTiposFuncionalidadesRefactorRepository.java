package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosTiposFuncionalidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosTiposFuncionalidadesRefactorRepository extends CrudRepository<VTercerosTiposFuncionalidades, Integer> {

    List<VTercerosTiposFuncionalidades> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosTiposFuncionalidades> findAllByIdTipoTercero(Integer id);

}
