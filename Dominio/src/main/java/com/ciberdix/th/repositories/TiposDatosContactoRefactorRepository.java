package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TiposDatosContacto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiposDatosContactoRefactorRepository extends CrudRepository<TiposDatosContacto, Integer> {

    List<TiposDatosContacto> findAllByIndicadorHabilitadoIsTrue();

}
