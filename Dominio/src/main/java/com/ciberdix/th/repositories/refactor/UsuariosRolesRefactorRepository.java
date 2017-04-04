package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.UsuarioRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuariosRolesRefactorRepository extends CrudRepository<UsuarioRoles, Integer> {

    List<UsuarioRoles> findByIdUsuarioAndIndicadorHabilitadoTrue(Integer idUsuario);
}
