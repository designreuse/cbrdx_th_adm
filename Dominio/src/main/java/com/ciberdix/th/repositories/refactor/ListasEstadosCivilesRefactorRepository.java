package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosCiviles;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasEstadosCivilesRefactorRepository extends CrudRepository<ListasEstadosCiviles, Integer>{
    List<ListasEstadosCiviles> findByIndicadorHabilitadoIsTrue();
}
