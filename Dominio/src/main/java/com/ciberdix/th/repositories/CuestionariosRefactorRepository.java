package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Cuestionarios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */
public interface CuestionariosRefactorRepository extends CrudRepository<Cuestionarios, Integer> {

    List<Cuestionarios> findByIndicadorHabilitadoTrue();

    Cuestionarios findByCodigoCuestionario(String code);

}
