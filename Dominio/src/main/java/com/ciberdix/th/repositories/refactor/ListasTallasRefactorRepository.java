package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTallas;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTallasRefactorRepository extends CrudRepository<ListasTallas, Integer> {
    List<ListasTallas> findByIndicadorHabilitadoIsTrueAndCodigoStartingWith(String codigo);
}
