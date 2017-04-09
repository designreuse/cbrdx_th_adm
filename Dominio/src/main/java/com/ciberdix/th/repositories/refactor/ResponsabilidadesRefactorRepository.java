package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Responsabilidades;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface ResponsabilidadesRefactorRepository extends CrudRepository<Responsabilidades, Integer> {
    List<Responsabilidades> findByIndicadorHabilitadoIsTrue();

    @Query("SELECT r FROM Responsabilidades r WHERE r.idResponsabilidad NOT IN (SELECT t.idResponsabilidad FROM CargosResponsabilidades t WHERE t.idCargo = ?1 AND t.indicadorHabilitado=true)")
    List<Responsabilidades> queryAll(Integer idCargo);

//    SELECT r.*
//    FROM crz_th.Responsabilidades r
//    WHERE r.IdResponsabilidad NOT IN (SELECT t.IdResponsabilidad
//            FROM crz_th.CargosResponsabilidades t
//            WHERE t.IdCargo = 17 and t.IndicadorHabilitado = 1 )
}
