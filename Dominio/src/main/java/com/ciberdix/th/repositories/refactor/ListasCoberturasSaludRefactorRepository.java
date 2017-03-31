package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasCoberturasSalud;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasCoberturasSaludRefactorRepository extends CrudRepository<ListasCoberturasSalud, Integer>{
    List<ListasCoberturasSalud> findByIndicadorHabilitadoIsTrue();
}
