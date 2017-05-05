package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VListasRolesProcesoCargoRolesProceso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 5/05/2017.
 */

public interface VListasRolesProcesoCargoRolesProcesoRefactorRepository extends CrudRepository<VListasRolesProcesoCargoRolesProceso, Integer>{

    List<VListasRolesProcesoCargoRolesProceso> findAllByIdCargo(Integer idCargo);

}
