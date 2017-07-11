package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VExamenesMedicos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */
public interface VExamenesMedicosRefactorRepository extends CrudRepository<VExamenesMedicos, Integer> {

    VExamenesMedicos findAllByIdProcesoSeleccion(Integer id);

}
