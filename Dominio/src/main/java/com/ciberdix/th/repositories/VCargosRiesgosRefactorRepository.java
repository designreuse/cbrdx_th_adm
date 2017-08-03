package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosRiesgos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRiesgosRefactorRepository extends CrudRepository<VCargosRiesgos, Integer> {

    List<VCargosRiesgos> findByIdCargo(Integer id);

    @Query("SELECT V FROM VCargosRiesgos V WHERE V.indicadorHabilitado = 1 AND V.idCargo = ?1 AND V.idRiesgo IN (SELECT R.idRiesgo FROM Riesgos R WHERE R.idTipoRiesgo = ?2 AND R.indicadorHabilitado = 1)")
    List<VCargosRiesgos> queryByIdCargoAndIdTipoRiesgoAndIndicadorHabilitadoIsTrue(Integer idCargo, Integer idTipoRiesgo);

}
