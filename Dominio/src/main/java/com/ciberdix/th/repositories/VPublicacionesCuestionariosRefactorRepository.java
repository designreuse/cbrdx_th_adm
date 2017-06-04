package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPublicacionesCuestionarios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */
public interface VPublicacionesCuestionariosRefactorRepository extends CrudRepository<VPublicacionesCuestionarios, Integer> {

    List<VPublicacionesCuestionarios> findAllByIdPublicacion(Integer id);

}
