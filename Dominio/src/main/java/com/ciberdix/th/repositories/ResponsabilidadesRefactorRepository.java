package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Responsabilidades;
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
}
