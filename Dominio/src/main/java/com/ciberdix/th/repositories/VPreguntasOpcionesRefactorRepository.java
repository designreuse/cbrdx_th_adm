package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPreguntasOpciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
public interface VPreguntasOpcionesRefactorRepository extends CrudRepository<VPreguntasOpciones, Integer> {

    List<VPreguntasOpciones> findAllByIndicadorHabilitadoIsTrue();

    List<VPreguntasOpciones> findAllByIdCuestionarioPregunta(Integer id);

    List<VPreguntasOpciones> findAllByIdCuestionarioPreguntaAndIndicadorHabilitadoIsTrue(Integer id);

}
