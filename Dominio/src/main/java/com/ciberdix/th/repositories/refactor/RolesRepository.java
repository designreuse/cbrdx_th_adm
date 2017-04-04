package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Roles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
    @Query("select u from RolesEntity u where u.idRol not in (select b.idRol from UsuarioRolesEntity b where (b.indicadorHabilitado = true)and (b.idUsuario = ?1))")
    List<Roles> findUserAvaliable(Integer IdUsuario);
}
