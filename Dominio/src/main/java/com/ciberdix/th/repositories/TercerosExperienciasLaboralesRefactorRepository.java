package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosExperienciasLaborales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface TercerosExperienciasLaboralesRefactorRepository extends CrudRepository<TercerosExperienciasLaborales, Integer> {
    List<TercerosExperienciasLaborales> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
