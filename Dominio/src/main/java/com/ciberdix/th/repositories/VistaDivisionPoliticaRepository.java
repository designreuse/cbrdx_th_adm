package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VistaDivisionPoliticaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface VistaDivisionPoliticaRepository extends CrudRepository<VistaDivisionPoliticaEntity, Integer> {

    List<VistaDivisionPoliticaEntity> findByidDivisionPoliticaTipo(int idDivisionPoliticaTipo);
}
