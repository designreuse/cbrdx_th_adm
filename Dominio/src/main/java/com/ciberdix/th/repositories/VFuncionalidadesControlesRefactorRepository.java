package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VFuncionalidadesControles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 23/04/2017.
 */
public interface VFuncionalidadesControlesRefactorRepository extends CrudRepository<VFuncionalidadesControles, Integer> {

    List<VFuncionalidadesControles> findByIndicadorHabilitadoIsTrue();

    List<VFuncionalidadesControles> findByIndicadorHabilitadoIsTrueAndIdFuncionalidad(Integer idFuncionalidad);

    List<VFuncionalidadesControles> findByIdPadre(Integer idPadre);

    List<VFuncionalidadesControles> findAllByIdFuncionalidad(Integer id);

    @Query("SELECT fc FROM VFuncionalidadesControles fc WHERE (fc.idFuncionalidad = ?1) AND " +
            "fc.indicadorSeccion = ?2")
    List<VFuncionalidadesControles> queryAllByIdSecCam(Integer idFuncionalidadControl, Boolean indicador);

    @Query("SELECT fc FROM VFuncionalidadesControles fc WHERE fc.indicadorSeccion = ?1")
    List<VFuncionalidadesControles> queryAllBySecCam(Boolean indicador);

}
