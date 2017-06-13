package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesoSeleccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */
public interface VProcesoSeleccionRefactorRepository extends CrudRepository<VProcesoSeleccion, Integer> {

    List<VProcesoSeleccion> findAllByIdPublicacionAndIdTercero(Integer idPublicacion, Long idTercero);

}
