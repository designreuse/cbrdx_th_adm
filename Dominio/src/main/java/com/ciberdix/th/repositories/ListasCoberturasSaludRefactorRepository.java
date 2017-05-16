package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCoberturasSalud;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasCoberturasSaludRefactorRepository extends CrudRepository<ListasCoberturasSalud, Integer>{
    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrue();

    ListasCoberturasSalud findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasCoberturasSalud> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
