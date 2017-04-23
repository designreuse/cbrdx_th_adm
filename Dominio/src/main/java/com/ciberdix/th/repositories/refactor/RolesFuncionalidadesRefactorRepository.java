package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 23/04/17.
 */
public interface RolesFuncionalidadesRefactorRepository extends CrudRepository<RolesFuncionalidades, Integer>{
    List<RolesFuncionalidades> findByIndicadorHabilitadoIsTrue();
}
