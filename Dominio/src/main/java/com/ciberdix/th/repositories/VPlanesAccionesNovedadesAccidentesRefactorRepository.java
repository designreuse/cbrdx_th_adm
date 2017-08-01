package com.ciberdix.th.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VPlanesAccionesNovedadesAccidentesRefactorRepository extends CrudRepository<VPlanesAccionesNovedadesAccidentes, Integer> {

    List<VPlanesAccionesNovedadesAccidentes> findAllByIndicadorHabilitadoIsTrue();

    List<VPlanesAccionesNovedadesAccidentes> findAllByIdNovedadAccidente(Integer id);

}
