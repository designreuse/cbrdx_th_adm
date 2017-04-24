package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VRolesFuncionalidadesControles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesFuncionalidadesControlesRefactorRepository extends CrudRepository<VRolesFuncionalidadesControles, Integer> {
    List<VRolesFuncionalidadesControles> findByIndicadorHabilitadoIsTrue();
}
