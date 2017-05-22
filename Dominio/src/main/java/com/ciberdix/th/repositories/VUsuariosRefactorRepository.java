package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VUsuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VUsuariosRefactorRepository extends CrudRepository<VUsuarios, Integer> {

    @Query("SELECT u FROM VUsuarios u WHERE u.idUsuario IN (SELECT ur.idUsuario FROM  UsuarioRoles ur WHERE ur.idRol = ?1 AND ur.indicadorHabilitado = 1)")
    List<VUsuarios> queryAllByIdRol(Integer idRol);

}
