package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRequerimientosCuestionarios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 19/05/2017.
 */
public interface VRequerimientosCuestionariosRefactorRepository extends CrudRepository<VRequerimientosCuestionarios, Integer> {

    List<VRequerimientosCuestionarios> findAllByIndicadorHabilitadoIsTrueAndIdRequerimiento(Integer idRequerimiento);

}
