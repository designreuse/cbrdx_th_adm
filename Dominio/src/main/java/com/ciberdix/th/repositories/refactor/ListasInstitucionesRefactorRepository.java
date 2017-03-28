package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasInstituciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasInstitucionesRefactorRepository extends CrudRepository<ListasInstituciones, Integer> {
    List<ListasInstituciones> findByIndicadorHabilitadoIsTrue();
    List<ListasInstituciones> findByIndicadorHabilitadoIsTrueAndNombreListaInstitucionContains(String nombreListaInstitucion);
}
