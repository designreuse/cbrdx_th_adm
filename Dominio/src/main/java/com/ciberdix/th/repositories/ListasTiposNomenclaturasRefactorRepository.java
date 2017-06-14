package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposNomenclaturas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposNomenclaturasRefactorRepository extends CrudRepository<ListasTiposNomenclaturas, Integer> {
    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposNomenclaturas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposNomenclaturas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
