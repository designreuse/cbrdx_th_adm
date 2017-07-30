package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VDotaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface VDotacionesRefactorRepository extends CrudRepository<VDotaciones, Integer> {

    List<VDotaciones> findAllByIndicadorHabilitadoIsTrue();

    List<VDotaciones> findAllByIdGrupoDotacion(Integer id);

    @Query("SELECT D FROM VDotaciones D WHERE D.indicadorHabilitado AND D.idGrupoDotacion IN (SELECT P.idGrupoDotacion FROM ProyeccionDotacion P WHERE P.idProyeccionDotacion = ?1)")
    List<VDotaciones> queryAllByIdProyeccionDotacion(Integer id);

}
