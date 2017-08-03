package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRelacionesListas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 21/06/2017.
 */
public interface VRelacionesListasRefactorRepository extends CrudRepository<VRelacionesListas, Integer> {

    List<VRelacionesListas> findByIndicadorHabilitadoIsTrue();

    List<VRelacionesListas> findAllByIdRelacionLista(Integer id);

}
