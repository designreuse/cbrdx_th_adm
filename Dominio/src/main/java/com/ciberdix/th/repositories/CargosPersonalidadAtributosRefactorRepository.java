package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CargosPersonalidadAtributos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CargosPersonalidadAtributosRefactorRepository extends CrudRepository<CargosPersonalidadAtributos, Integer> {

    List<CargosPersonalidadAtributos> findByIdCargo(Integer idCargo);
}
