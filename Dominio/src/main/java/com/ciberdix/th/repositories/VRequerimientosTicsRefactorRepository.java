package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRequerimientosTics;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface VRequerimientosTicsRefactorRepository extends CrudRepository<VRequerimientosTics, Integer> {

    List<VRequerimientosTics> findByIdRequerimientoAndIndicadorHabilitadoIsTrue(Integer idRequerimiento);

}
