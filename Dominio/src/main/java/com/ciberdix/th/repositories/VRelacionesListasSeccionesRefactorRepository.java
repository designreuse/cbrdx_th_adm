package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRelacionesListasCampos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 27/06/2017.
 */
public interface VRelacionesListasSeccionesRefactorRepository extends CrudRepository<VRelacionesListasCampos, Integer> {

    List<VRelacionesListasCampos> findAllByIndicadorHabilitadoIsTrue();

    List<VRelacionesListasCampos> findAllByIdRelacionLista(Integer id);

    List<VRelacionesListasCampos> findAllByIdFuncionalidadesControles(Integer id);

}
