package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposPersonas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TiposPersonaRefactorRepository extends CrudRepository<ListasTiposPersonas, Long>{
    List<ListasTiposPersonas> findByIndicadorHabilitadoIsTrue();
}