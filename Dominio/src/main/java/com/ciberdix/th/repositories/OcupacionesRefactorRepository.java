package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Ocupaciones;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface OcupacionesRefactorRepository extends CrudRepository<Ocupaciones, Integer>{
    List<Ocupaciones> findByIndicadorHabilitadoIsTrue();
    List<Ocupaciones> findByIdOcupacionTipo(Integer id);

    @Query("SELECT o FROM Ocupaciones  o where o.idOcupacion in (select idOcupacion FROM CargosOcupaciones WHERE indicadorHabilitado = true AND idCargo = ?1)")
    List<Ocupaciones> findByIdCargo(Integer idCargo);
}
