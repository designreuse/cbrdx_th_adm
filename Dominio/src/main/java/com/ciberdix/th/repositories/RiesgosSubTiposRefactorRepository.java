package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RiesgosSubTipos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface RiesgosSubTiposRefactorRepository extends CrudRepository<RiesgosSubTipos, Integer> {
    List<RiesgosSubTipos> findByIndicadorHabilitadoIsTrue();
}
