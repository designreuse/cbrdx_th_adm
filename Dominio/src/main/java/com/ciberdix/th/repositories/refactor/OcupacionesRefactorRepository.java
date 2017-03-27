package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Ocupaciones;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface OcupacionesRefactorRepository extends CrudRepository<Ocupaciones, Integer>{
    List<Ocupaciones> findByIndicadorHabilitadoIsTrue();
}
