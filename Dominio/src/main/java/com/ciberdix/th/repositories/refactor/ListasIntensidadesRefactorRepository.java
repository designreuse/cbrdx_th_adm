package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasIntensidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasIntensidadesRefactorRepository extends CrudRepository<ListasIntensidades, Integer> {
    List<ListasIntensidades> findByIndicadorHabilitadoIsTrue();
}
