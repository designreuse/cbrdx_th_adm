package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposNomenclaturas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposNomenclaturasRefactorRepository extends CrudRepository<ListasTiposNomenclaturas, Integer> {
    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrue();

    ListasTiposNomenclaturas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
