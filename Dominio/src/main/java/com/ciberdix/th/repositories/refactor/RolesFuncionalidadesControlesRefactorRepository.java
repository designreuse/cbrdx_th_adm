package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidadesControles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 23/04/17.
 */
public interface RolesFuncionalidadesControlesRefactorRepository extends CrudRepository<RolesFuncionalidadesControles, Integer> {
    List<RolesFuncionalidadesControles> findByIndicadorHabilitadoIsTrue();
}
