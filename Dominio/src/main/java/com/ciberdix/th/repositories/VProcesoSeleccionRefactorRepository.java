package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesoSeleccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */
public interface VProcesoSeleccionRefactorRepository extends CrudRepository<VProcesoSeleccion, Integer> {

    List<VProcesoSeleccion> findAllByIdTerceroPublicacion(Integer idTerceroPublicaicon);

    @Query("SELECT P FROM VProcesoSeleccion P WHERE P.idTerceroPublicacion IN (SELECT T.idTercerosPublicaciones FROM TercerosPublicaciones T WHERE T.idPublicacion = ?1)")
    List<VProcesoSeleccion> queryAllByIdPublicacion(Integer id);

    VProcesoSeleccion findAllByIdTerceroPublicacionAndIdProcesoPaso(Integer idTerceroPublicacion, Integer idProcesoPaso);

}
