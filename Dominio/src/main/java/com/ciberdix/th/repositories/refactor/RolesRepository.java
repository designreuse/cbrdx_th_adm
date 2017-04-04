package com.ciberdix.th.repositories.refactor;

import com.ciberdix.sp.model.RolesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RolesRepository extends CrudRepository<RolesEntity, Integer> {
    @Query("select u from RolesEntity u where u.idRol not in (select b.idRol from UsuarioRolesEntity b where (b.indicadorHabilitado = true)and (b.idUsuario = ?1))")
    List<RolesEntity> findUserAvaliable(Integer IdUsuario);
}
