package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Categorias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface CategoriasRefactorRepository extends CrudRepository<Categorias, Integer> {
    List<Categorias> findByIndicadorHabilitadoIsTrue();
}
