package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRolesFuncionalidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesFuncionalidadesRefactorRepository extends CrudRepository<VRolesFuncionalidades,Integer>{
    List<VRolesFuncionalidades> findByIndicadorHabilitadoIsTrue();
    List<VRolesFuncionalidades> findByIdRol(Integer id);
    List<VRolesFuncionalidades> findByRol(String rol);
}
