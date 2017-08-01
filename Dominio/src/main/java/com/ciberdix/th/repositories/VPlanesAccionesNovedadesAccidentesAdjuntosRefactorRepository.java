package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPlanesAccionesNovedadesAccidentesAdjuntos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository extends CrudRepository<VPlanesAccionesNovedadesAccidentesAdjuntos, Integer> {

    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findAllByIndicadorHabilitadoIsTrue();

    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findAllByIdPlanAccionNovedadAccidente(Integer id);

}
