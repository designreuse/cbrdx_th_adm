package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VUsuariosWidgets;
import com.ciberdix.th.models.refactor.UsuarioRoles;
import com.ciberdix.th.models.refactor.RolesWidgets;
import com.ciberdix.th.models.refactor.Widgets;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 26/04/17.
 */
public interface VUsuariosWidgetsRefactorRepository extends CrudRepository<VUsuariosWidgets, Integer> {
    List<VUsuariosWidgets> findByIndicadorHabilitadoIsTrueAndIdUsuario(Integer id);

    /*
    @Query("SELECT DISTINCT w FROM UsuarioRoles ur JOIN RolesWidgets rw ON rw.idRol=ur.idRol" +
            " JOIN Widgets w ON rw.idWidget=w.idWidget " +
            "WHERE ur.indicadorHabilitado=1 AND rw.indicadorHabilitado=1 " +
            "AND w.indicadorHabilitado=1 AND ur.idUsuario=?1")
    List<VUsuariosWidgets> queryAllByIdUsuario(Integer id);
    */
}
