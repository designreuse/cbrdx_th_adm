package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Ponderaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 10/04/2017.
 */
public interface PonderacionesRefactorRepository extends CrudRepository<Ponderaciones, Integer> {

    List<Ponderaciones> findByIndicadorHabilitadoTrue();
}
