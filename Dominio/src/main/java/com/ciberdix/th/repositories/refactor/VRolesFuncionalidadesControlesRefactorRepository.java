package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VRolesFuncionalidadesControles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesFuncionalidadesControlesRefactorRepository extends CrudRepository<VRolesFuncionalidadesControles, Integer> {
    List<VRolesFuncionalidadesControles> findByIndicadorHabilitadoIsTrue();

    List<VRolesFuncionalidadesControles> findByIdFuncionalidadControl(Integer id);

    @Query("SELECT U FROM VRolesFuncionalidadesControles U WHERE U.idRol = ?1 AND U.idFuncionalidadControl IN (SELECT idFuncionalidadControl FROM FuncionalidadesControles WHERE idFuncionalidad = ?2)")
    List<VRolesFuncionalidadesControles> findByIdRolIdFuncionalidad(Integer idRol, Integer idFuncionalidad);
}
