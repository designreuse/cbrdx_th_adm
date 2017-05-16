package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VUsuarioRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VUsuarioRolesRefactorRepository extends CrudRepository<VUsuarioRoles, Integer> {
    List<VUsuarioRoles> findByIdUsuario(Integer IdUsuario);
    List<VUsuarioRoles> findByIdUsuarioAndIndicadorHabilitadoTrue(Integer idUsuario);
}
