package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionesDotacionesTercerosDotaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VProyeccionesDotacionesTercerosDotacionesRefactorRepository extends CrudRepository<VProyeccionesDotacionesTercerosDotaciones, Integer> {

    List<VProyeccionesDotacionesTercerosDotaciones> findAllByIndicadorHabilitadoIsTrue();

    List<VProyeccionesDotacionesTercerosDotaciones> findAllByIdDotacion(Integer id);

    List<VProyeccionesDotacionesTercerosDotaciones> findAllByIdProyeccionDotacionTercero(Integer id);

}
