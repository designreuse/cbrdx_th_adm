package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPlanesAccionesNovedadesAccidentes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VPlanesAccionesNovedadesAccidentesRefactorRepository extends CrudRepository<VPlanesAccionesNovedadesAccidentes, Integer> {

    List<VPlanesAccionesNovedadesAccidentes> findAllByIndicadorHabilitadoIsTrue();

    List<VPlanesAccionesNovedadesAccidentes> findAllByIdNovedad(Integer id);

}
