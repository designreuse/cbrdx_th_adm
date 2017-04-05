package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosJuridicos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasEstadosJuridicosRefactorRepository extends CrudRepository<ListasEstadosJuridicos, Integer>{
    List<ListasEstadosJuridicos> findByIndicadorHabilitadoIsTrue();
}