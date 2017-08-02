package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RelacionesListasCampos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 27/06/2017.
 */
public interface RelacionesListasSeccionesRefactorRepository extends CrudRepository<RelacionesListasCampos, Integer> {
    List<RelacionesListasCampos> findByIndicadorHabilitadoTrueAndIdFuncionalidadesControles(Integer idFuncionalidadesControles);
}
