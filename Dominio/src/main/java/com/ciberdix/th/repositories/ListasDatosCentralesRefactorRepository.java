package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasDatosCentrales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasDatosCentralesRefactorRepository extends CrudRepository<ListasDatosCentrales, Integer> {
    List<ListasDatosCentrales> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasDatosCentrales findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasDatosCentrales> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasDatosCentrales> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
