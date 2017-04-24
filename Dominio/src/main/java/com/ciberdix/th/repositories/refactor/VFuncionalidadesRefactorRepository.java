package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VFuncionalidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 23/04/2017.
 */

public interface VFuncionalidadesRefactorRepository extends CrudRepository<VFuncionalidades, Integer> {
    List<VFuncionalidades> findByIndicadorHabilitadoIsTrue();
}
