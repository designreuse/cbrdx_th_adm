package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesoSeleccionPruebasTecnicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface VProcesoSeleccionPruebasTecnicasRefactorRepository extends CrudRepository<VProcesoSeleccionPruebasTecnicas, Integer> {

    List<VProcesoSeleccionPruebasTecnicas> findAllByIndicadorHabilitadoIsTrue();

    List<VProcesoSeleccionPruebasTecnicas> findAllByIdProcesoSeleccion(Integer id);

    List<VProcesoSeleccionPruebasTecnicas> findAllByIdPruebaTecnica(Integer id);

}
