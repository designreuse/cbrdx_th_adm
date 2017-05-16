package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Widgets;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */
public interface WidgetsRefactorRepository extends CrudRepository<Widgets, Integer> {
    List<Widgets> findByIndicadorHabilitadoIsTrue();

    @Query("SELECT DISTINCT w FROM Widgets w WHERE w.indicadorHabilitado=1 " +
            "AND w.idWidget IN (SELECT rw.idWidget FROM RolesWidgets rw " +
            "WHERE rw.indicadorHabilitado=1 AND rw.idRol IN (SELECT ur.idRol FROM UsuarioRoles ur " +
            "WHERE ur.indicadorHabilitado=1 AND ur.idUsuario=?1))")
    List<Widgets> queryAllByIdUsuario(Integer id);
}
