package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasInstituciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasInstitucionesRefactorRepository extends CrudRepository<ListasInstituciones, Integer> {
    List<ListasInstituciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasInstituciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasInstituciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasInstituciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
