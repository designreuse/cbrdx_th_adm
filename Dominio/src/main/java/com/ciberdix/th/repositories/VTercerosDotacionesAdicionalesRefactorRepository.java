package com.ciberdix.th.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosDotacionesAdicionalesRefactorRepository extends CrudRepository<VTercerosDotacionesAdicionales, Integer> {

    List<VTercerosDotacionesAdicionales> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosDotacionesAdicionales> findAllByIndicadorHabilitadoIsTrueAndIdTercero(Long id);

    List<VTercerosDotacionesAdicionales> findAllByIndicadorHabilitadoIsTrueAndIdTerceroAndIdProyeccionDotacion(Long idTercero, Integer idProyeccionDotacion);

}
