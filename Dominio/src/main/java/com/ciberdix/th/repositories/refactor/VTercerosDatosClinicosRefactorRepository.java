package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VTercerosDatosClinicos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface VTercerosDatosClinicosRefactorRepository extends CrudRepository<VTercerosDatosClinicos, Long> {

    List<VTercerosDatosClinicos> findByIdTercero(Long id);
}
