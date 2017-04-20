package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VProyeccionLaboralResumen;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface VProyeccionLaboralResumenRefactorRepository extends CrudRepository<VProyeccionLaboralResumen, Integer> {

    @Procedure(name = "ConProy", outputParameterName = "Output")
    Integer executeConfirmation();
}
