package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VHistoricoUsuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VHistoricoUsuariosRefactorRepository extends CrudRepository<VHistoricoUsuarios, Integer> {


    List<VHistoricoUsuarios> findByObjetoAndIdObjeto(String objeto, Long idObjeto);

    @Query("SELECT au FROM VHistoricoUsuarios au where au.objeto = ?1 and au.idObjeto = ?2 or au.idObjeto in (select ur.idUsuarioRol from UsuarioRoles ur where ur.idUsuario = ?2) or au.idObjeto in (select ug.idUsuarioGrupoGestion from UsuarioGruposGestion ug where ug.idUsuario= ?2)")
    List<VHistoricoUsuarios> findUserRelated(String objeto, Long idObjeto);
}
