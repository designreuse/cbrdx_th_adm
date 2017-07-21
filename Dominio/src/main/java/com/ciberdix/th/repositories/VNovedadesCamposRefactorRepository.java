package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VNovedadesCampos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VNovedadesCamposRefactorRepository extends CrudRepository<VNovedadesCampos, Integer> {

    List<VNovedadesCampos> findAllByIndicadorHabilitadoIsTrue();

    List<VNovedadesCampos> findAllByIdNovedad(Integer id);

    List<VNovedadesCampos> findAllByIdCampoNovedad(Integer id);

}
