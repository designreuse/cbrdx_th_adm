package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasRequerimientosAcciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasRequerimientosAccionesRefactorRepository extends CrudRepository<ListasRequerimientosAcciones, Integer> {
    List<ListasRequerimientosAcciones> findByIndicadorHabilitadoTrue();

    ListasRequerimientosAcciones findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasRequerimientosAcciones> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasRequerimientosAcciones> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
