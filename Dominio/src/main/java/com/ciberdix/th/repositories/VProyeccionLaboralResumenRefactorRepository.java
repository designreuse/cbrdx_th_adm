package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionLaboralResumen;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface VProyeccionLaboralResumenRefactorRepository extends CrudRepository<VProyeccionLaboralResumen, Integer> {

    @Procedure(name = "ConProy", outputParameterName = "Output")
    Integer executeConfirmation(@Param("Usuario") Integer IdUsuario);
}
