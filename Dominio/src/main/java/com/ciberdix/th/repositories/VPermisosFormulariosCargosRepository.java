package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPermisosFormularios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 27/06/17.
 */
public interface VPermisosFormulariosCargosRepository extends CrudRepository<VPermisosFormularios, Integer> {
    List<VPermisosFormularios> queryByCodigoMenu(String codigo);

    List<VPermisosFormularios> findByRolAndCodigoMenu(String rol, String codigo);
}
