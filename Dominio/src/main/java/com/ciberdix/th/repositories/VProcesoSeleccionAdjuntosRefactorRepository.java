package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesoSeleccionAdjuntos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */
public interface VProcesoSeleccionAdjuntosRefactorRepository extends CrudRepository<VProcesoSeleccionAdjuntos, Integer> {

    List<VProcesoSeleccionAdjuntos> findAllByIdTerceroPublicacionAndIdProcesoPaso(Integer idTerceroPublicacion, Integer idProcesoPaso);

}
