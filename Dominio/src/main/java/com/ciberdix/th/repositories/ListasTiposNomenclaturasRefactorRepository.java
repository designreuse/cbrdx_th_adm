package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposNomenclaturas;
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
