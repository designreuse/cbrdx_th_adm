package com.ciberdix.th.repositories;

import com.ciberdix.th.models.FuncionalidadesControles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */
public interface FuncionalidadesControlesRefactorRepository extends CrudRepository<FuncionalidadesControles, Integer> {

    List<FuncionalidadesControles> findByIdPadre(Integer idPadre);

    @Query("SELECT fc FROM FuncionalidadesControles fc WHERE (fc.idFuncionalidad = ?1) AND " +
            "fc.indicadorSeccion = ?2")
    List<FuncionalidadesControles> queryAllByIdSecCam(Integer idFuncionalidadControl, Boolean indicador);

    @Query("SELECT fc FROM FuncionalidadesControles fc WHERE fc.indicadorSeccion = ?1")
    List<FuncionalidadesControles> queryAllBySecCam(Boolean indicador);

}
