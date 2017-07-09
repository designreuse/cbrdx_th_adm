package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Respuestas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface RespuestasRefactorRepository extends CrudRepository<Respuestas, Integer> {
}
