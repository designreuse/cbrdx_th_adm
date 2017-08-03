package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosTiposClasificaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TercerosTiposClasificacionesRefactorRepository extends CrudRepository<TercerosTiposClasificaciones, Integer> {

    List<TercerosTiposClasificaciones> findAllByIndicadorHabilitadoIsTrue();

    List<TercerosTiposClasificaciones> findAllByIdTerceroTipo(Integer id);

}
