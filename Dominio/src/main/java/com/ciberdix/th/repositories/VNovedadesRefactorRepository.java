package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VNovedades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface VNovedadesRefactorRepository extends CrudRepository<VNovedades, Integer> {

    List<VNovedades> findAllByIndicadorHabilitadoIsTrue();

    List<VNovedades> findAllByIdTipoNovedad(Integer id);

}
