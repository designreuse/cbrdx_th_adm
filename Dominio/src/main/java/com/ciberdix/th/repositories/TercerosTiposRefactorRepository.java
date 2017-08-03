package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosTipos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TercerosTiposRefactorRepository extends CrudRepository<TercerosTipos, Integer> {

    List<TercerosTipos> findAllByIndicadorHabilitadoIsTrue();

}
