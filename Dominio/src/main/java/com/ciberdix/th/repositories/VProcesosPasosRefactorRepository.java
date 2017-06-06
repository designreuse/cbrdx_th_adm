package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesosPasos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */
public interface VProcesosPasosRefactorRepository extends CrudRepository<VProcesosPasos, Integer> {

    List<VProcesosPasos> findAllByIdProceso(Integer idProceso);

}
