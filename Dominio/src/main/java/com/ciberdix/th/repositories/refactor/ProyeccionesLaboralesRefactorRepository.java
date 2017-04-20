package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ProyeccionesLaborales;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ProyeccionesLaboralesRefactorRepository extends CrudRepository<ProyeccionesLaborales, Integer> {

    List<ProyeccionesLaborales> findByIdEstructuraOrganizacional(Integer idEstructuraOrganizacional);

    @Procedure(name = "GenProy",outputParameterName = "Output")
    Integer executeCreation(@Param("Usuario") Integer IdUsuario);
}
