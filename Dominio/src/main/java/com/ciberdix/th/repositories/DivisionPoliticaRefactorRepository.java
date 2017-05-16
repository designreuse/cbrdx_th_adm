package com.ciberdix.th.repositories;

import com.ciberdix.th.models.DivisionPolitica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface DivisionPoliticaRefactorRepository extends CrudRepository<DivisionPolitica, Integer> {
    List<DivisionPolitica> findByIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre);
}
