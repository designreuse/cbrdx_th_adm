package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposPersonas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TiposPersonaRepository extends CrudRepository<ListasTiposPersonas, Long>{
    
}
