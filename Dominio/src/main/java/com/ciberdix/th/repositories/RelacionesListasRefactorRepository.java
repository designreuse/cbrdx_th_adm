package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RelacionesListas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */
public interface RelacionesListasRefactorRepository extends CrudRepository<RelacionesListas, Integer> {

    List<RelacionesListas> findByIndicadorHabilitadoIsTrue();

    RelacionesListas findByCodigo(String codigo);

    List<RelacionesListas> findByIdListaPadreAndIdItemPadreAndIndicadorHabilitadoIsTrue(Integer idListaPadre, Integer idItemPadre);

}
