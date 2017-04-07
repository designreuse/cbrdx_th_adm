package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosProductividades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface CargosProductividadesRefactorRepository extends CrudRepository<CargosProductividades, Integer> {
    CargosProductividades findByIdCargo(Integer idCargo);
}
