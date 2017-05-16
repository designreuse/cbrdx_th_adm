package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasInstituciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasInstitucionesRefactorRepository extends CrudRepository<ListasInstituciones, Integer> {
    List<ListasInstituciones> findByIndicadorHabilitadoTrue();

    ListasInstituciones findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasInstituciones> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasInstituciones> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
