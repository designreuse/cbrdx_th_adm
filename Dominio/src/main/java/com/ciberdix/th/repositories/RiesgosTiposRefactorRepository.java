package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RiesgosTipos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface RiesgosTiposRefactorRepository extends CrudRepository<RiesgosTipos, Integer> {
    List<RiesgosTipos> findByIndicadorHabilitadoIsTrue();

    @Query("SELECT RT FROM RiesgosTipos RT WHERE RT.indicadorHabilitado = 1 AND RT.idRiesgoTipo IN (SELECT R.idTipoRiesgo FROM Riesgos R WHERE R.indicadorHabilitado = 1 AND R.idRiesgo IN (SELECT CR.idRiesgo FROM CargosRiesgos CR WHERE CR.indicadorHabilitado = 1 AND CR.idCargo = ?1))")
    List<RiesgosTipos> queryByIdCargo(Integer id);

}
