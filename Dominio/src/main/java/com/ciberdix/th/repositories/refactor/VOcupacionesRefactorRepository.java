package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VOcupaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface VOcupacionesRefactorRepository extends CrudRepository<VOcupaciones, Integer> {
    List<VOcupaciones> findByLabelContains(String value);
}