package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasIntensidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasIntensidadesRefactorRepository extends CrudRepository<ListasIntensidades, Integer> {
    List<ListasIntensidades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasIntensidades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasIntensidades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasIntensidades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
