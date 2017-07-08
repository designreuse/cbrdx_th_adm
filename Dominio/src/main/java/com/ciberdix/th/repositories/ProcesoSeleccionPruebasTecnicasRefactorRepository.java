package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ProcesoSeleccionPruebasTecnicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface ProcesoSeleccionPruebasTecnicasRefactorRepository extends CrudRepository<ProcesoSeleccionPruebasTecnicas, Integer> {

    List<ProcesoSeleccionPruebasTecnicas> findAllByIndicadorHabilitadoIsTrue();

    List<ProcesoSeleccionPruebasTecnicas> findAllByIdProcesoSeleccion(Integer id);

    List<ProcesoSeleccionPruebasTecnicas> findAllByIdPruebaTecnica(Integer id);

}
