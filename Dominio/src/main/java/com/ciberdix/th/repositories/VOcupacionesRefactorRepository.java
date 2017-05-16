package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VOcupaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface VOcupacionesRefactorRepository extends CrudRepository<VOcupaciones, Integer> {
    List<VOcupaciones> findByLabelContains(String value);
}
