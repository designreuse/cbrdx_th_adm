package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRequerimientosCompras;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */
public interface VRequerimientosComprasRefactorRepository extends CrudRepository<VRequerimientosCompras, Integer> {

    List<VRequerimientosCompras> findByIdRequerimientoAndIndicadorHabilitadoIsTrue(Integer idRequerimiento);

}
