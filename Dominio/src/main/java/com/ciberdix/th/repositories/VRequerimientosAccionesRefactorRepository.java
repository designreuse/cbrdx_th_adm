package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RequerimientosAcciones;
import com.ciberdix.th.models.VRequerimientosAcciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface VRequerimientosAccionesRefactorRepository extends CrudRepository<VRequerimientosAcciones, Integer>{

    List<VRequerimientosAcciones> findByIdRequerimiento(Integer idRequerimiento);

}
