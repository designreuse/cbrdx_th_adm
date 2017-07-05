package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Roles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 19/04/2017.
 */
public interface RolesRefactorRepository extends CrudRepository<Roles, Integer> {

    @Query("select u from Roles u where u.idRol not in (select b.idRol from UsuarioRoles b where (b.indicadorHabilitado = true) and (b.idUsuario = ?1))")
    List<Roles> findUserAvaliable(Integer IdUsuario);

    Roles findByCodigoRol(String codigoRol);
}
