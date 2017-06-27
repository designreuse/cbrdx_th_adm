package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPermisosFormulariosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 27/06/17.
 */
public interface VPermisosFormulariosCargosRepository extends CrudRepository<VPermisosFormulariosCargos, Integer> {
    List<VPermisosFormulariosCargos> queryByCodigoMenu(String codigo);
}
