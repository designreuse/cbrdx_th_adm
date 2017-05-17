package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RequerimientosReferidos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */
public interface RequerimientosReferidosRefactorRepository extends CrudRepository<RequerimientosReferidos, Integer> {

    List<RequerimientosReferidos> findByIdRequerimiento(Integer idRequerimiento);

}
