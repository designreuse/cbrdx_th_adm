package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VRolesFuncionalidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesFuncionalidadesRefactorRepository extends CrudRepository<VRolesFuncionalidades,Integer>{
    List<VRolesFuncionalidades> findByIndicadorHabilitadoIsTrue();
    List<VRolesFuncionalidades> findByIdRol(Integer id);
}
