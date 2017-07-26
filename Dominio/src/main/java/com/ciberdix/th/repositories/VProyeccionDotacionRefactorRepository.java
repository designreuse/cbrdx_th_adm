package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionDotacion;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface VProyeccionDotacionRefactorRepository extends CrudRepository<VProyeccionDotacion, Integer> {

    List<VProyeccionDotacion> findAllByIndicadorHabilitadoIsTrue();

    List<VProyeccionDotacion> findAllByFechaSolicitudBetween(Date FechaInicio, Date FechaFin);

    List<VProyeccionDotacion> findAllByFechaSolicitudBetweenAndAuditoriaUsuario(Date FechaInicio, Date FechaFin, Integer idUsuario);

}
