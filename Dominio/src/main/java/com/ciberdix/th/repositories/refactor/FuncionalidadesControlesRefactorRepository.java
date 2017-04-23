package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.FuncionalidadesControles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */
public interface FuncionalidadesControlesRefactorRepository extends CrudRepository<FuncionalidadesControles, Integer> {

    @Query("SELECT fc FROM FuncionalidadesControles fc WHERE (fc.idFuncionalidadControl = ?1) AND " +
            "(LOWER(SUBSTRING(fc.codigo,1,3)) = ?2)")
    List<FuncionalidadesControles> queryAllByIdSecCam(Integer idListaClasificacion, String codigo);

    @Query("SELECT fc FROM FuncionalidadesControles fc WHERE (LOWER(SUBSTRING(fc.codigo,1,3)) = ?1)")
    List<FuncionalidadesControles> queryAllBySecCam(String codigo);

}
