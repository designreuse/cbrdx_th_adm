package com.ciberdix.th.repositories;

import com.ciberdix.th.models.GruposDotaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface GruposDotacionesRefactorRepository extends CrudRepository<GruposDotaciones, Integer> {

    List<GruposDotaciones> findAllByIndicadorHabilitadoIsTrue();

}
