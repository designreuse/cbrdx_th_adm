package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VTercerosExperienciasLaborales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VTercerosExperienciasLaboralesRefactorRepository extends CrudRepository<VTercerosExperienciasLaborales, Integer> {
    List<VTercerosExperienciasLaborales> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
