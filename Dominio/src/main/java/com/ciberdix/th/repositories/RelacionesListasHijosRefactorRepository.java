package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RelacionesListasHijos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */
public interface RelacionesListasHijosRefactorRepository extends CrudRepository<RelacionesListasHijos, Integer> {

    List<RelacionesListasHijos> findByIndicadorHabilitadoIsTrue();

    List<RelacionesListasHijos> findAllByIdRelacionLista(Integer id);

    List<RelacionesListasHijos> findAllByIdRelacionListaAndIndicadorHabilitadoIsTrue(Integer id);

}
