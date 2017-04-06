package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VUsuarioRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VUsuarioRolesRefactorRepository extends CrudRepository<VUsuarioRoles, Integer> {
    List<VUsuarioRoles> findByIdUsuario(Integer IdUsuario);
}
