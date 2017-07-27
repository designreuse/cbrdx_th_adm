package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionesDotacionesTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VProyeccionesDotacionesTercerosRefactorRepository extends CrudRepository<VProyeccionesDotacionesTerceros, Integer> {

    List<VProyeccionesDotacionesTerceros> findAllByIndicadorHabilitadoIsTrue();

    List<VProyeccionesDotacionesTerceros> findAllByIdProyeccionDotacion(Integer id);

    List<VProyeccionesDotacionesTerceros> findAllByIdProyeccionDotacionAndIndicadorHabilitadoIsTrue(Integer id);

    VProyeccionesDotacionesTerceros findAllByIdProyeccionDotacionAndIdTercero(Integer idProyeccionDotacion, Long idTercero);

}
