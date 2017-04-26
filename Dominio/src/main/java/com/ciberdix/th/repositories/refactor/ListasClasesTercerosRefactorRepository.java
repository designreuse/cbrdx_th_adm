package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasClasesTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface ListasClasesTercerosRefactorRepository extends CrudRepository<ListasClasesTerceros, Integer> {

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrue();

    ListasClasesTerceros findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);

}
