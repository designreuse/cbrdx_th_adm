package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosCargosAreasFisicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */
public interface VTercerosCargosAreasFisicasRefactorRepository extends CrudRepository<VTercerosCargosAreasFisicas, Integer> {

    VTercerosCargosAreasFisicas findAllByIdTercero(Long idTercero);

    List<VTercerosCargosAreasFisicas> findAllByIdEstructuraFisica(Integer idEstructuraFisica);

}
