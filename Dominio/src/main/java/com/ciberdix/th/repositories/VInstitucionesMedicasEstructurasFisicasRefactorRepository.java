package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VInstitucionesMedicasEstructurasFisicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */
public interface VInstitucionesMedicasEstructurasFisicasRefactorRepository extends CrudRepository<VInstitucionesMedicasEstructurasFisicas, Integer> {

    List<VInstitucionesMedicasEstructurasFisicas> findAllByIndicadorHabilitadoIsTrue();

    List<VInstitucionesMedicasEstructurasFisicas> findAllByIdInstitucionMedica(Integer idInstitucionMedica);

    List<VInstitucionesMedicasEstructurasFisicas> findAllByIdEstructuraFisica(Integer idEstructuraFisica);

}
