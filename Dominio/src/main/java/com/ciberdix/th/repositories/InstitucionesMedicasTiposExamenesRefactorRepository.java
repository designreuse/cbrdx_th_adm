package com.ciberdix.th.repositories;

import com.ciberdix.th.models.InstitucionesMedicasTiposExamenes;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface InstitucionesMedicasTiposExamenesRefactorRepository extends CrudRepository<InstitucionesMedicasTiposExamenes, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE InstitucionesMedicasTiposExamenes i SET i.indicadorHabilitado = 0 WHERE i.idInstitucionMedica = ?1")
    void queryUpdateTiposExamenes(Integer idInstitucionMedica);

}
