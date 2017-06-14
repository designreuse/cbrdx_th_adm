package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCoberturasSalud;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasCoberturasSaludRefactorRepository extends CrudRepository<ListasCoberturasSalud, Integer>{
    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasCoberturasSalud findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
