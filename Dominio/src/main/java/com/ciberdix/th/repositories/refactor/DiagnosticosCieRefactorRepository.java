package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.DiagnosticosCie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
public interface DiagnosticosCieRefactorRepository extends CrudRepository<DiagnosticosCie, Integer>{
    @Query("SELECT d FROM DiagnosticosCie d WHERE d.codigo like concat('%', ?1, '%') OR d.descripcion like concat('%', ?1, '%') ")
    List<DiagnosticosCie> queryAllDiagnosticosCie(String query);
}
