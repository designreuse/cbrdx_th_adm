package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasSectoresEmpresas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface SectoresEmpresasRefactorRepository extends CrudRepository<ListasSectoresEmpresas, Integer> {
    List<ListasSectoresEmpresas> findByIndicadorHabilitadoIsTrue();
}
