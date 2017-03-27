package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposAfiliacion;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TiposAfiliacionRefactorRepository extends CrudRepository<ListasTiposAfiliacion, Integer>{
    List<ListasTiposAfiliacion> findByIndicadorHabilitadoIsTrue();
}
