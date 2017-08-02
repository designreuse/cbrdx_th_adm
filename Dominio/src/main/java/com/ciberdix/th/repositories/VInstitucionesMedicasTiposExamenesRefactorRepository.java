package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VInstitucionesMedicasTiposExamenes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VInstitucionesMedicasTiposExamenesRefactorRepository extends CrudRepository<VInstitucionesMedicasTiposExamenes, Integer> {

    List<VInstitucionesMedicasTiposExamenes> findAllByIndicadorHabilitadoIsTrue();

    List<VInstitucionesMedicasTiposExamenes> findAllByIdInstitucionMedica(Integer id);

    List<VInstitucionesMedicasTiposExamenes> findAllByIdTipoExamen(Integer id);

}
