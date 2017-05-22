package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosCargosAreasFisicas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */
public interface VTercerosCargosAreasFisicasRefactorRepository extends CrudRepository<VTercerosCargosAreasFisicas, Integer> {

    VTercerosCargosAreasFisicas findAllByIdTercero(Long idTercero);

    @Query("SELECT vt FROM VTercerosCargosAreasFisicas vt WHERE vt.idArea = ?1 AND vt.nombreCompleto LIKE CONCAT('%',?2,'%')")
    List<VTercerosCargosAreasFisicas> queryAllByIdEstructuraFisica(Integer idArea, String query);

    @Query("SELECT vt FROM VTercerosCargosAreasFisicas vt WHERE vt.idArea = ?1 AND vt.idCargo = ?3 AND vt.nombreCompleto LIKE CONCAT('%',?2,'%')")
    List<VTercerosCargosAreasFisicas> queryAllByIdEstructuraFisicaAndIdCargo(Integer idArea, String query, Integer idCargo);

}
