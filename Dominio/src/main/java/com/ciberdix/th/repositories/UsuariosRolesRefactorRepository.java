package com.ciberdix.th.repositories;

import com.ciberdix.th.models.UsuarioRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuariosRolesRefactorRepository extends CrudRepository<UsuarioRoles, Integer> {

    List<UsuarioRoles> findByIdUsuarioAndIndicadorHabilitadoTrue(Integer idUsuario);
}
