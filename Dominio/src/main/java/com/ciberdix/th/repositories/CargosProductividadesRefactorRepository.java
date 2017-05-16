package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CargosProductividades;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface CargosProductividadesRefactorRepository extends CrudRepository<CargosProductividades, Integer> {
    CargosProductividades findByIdCargo(Integer idCargo);
}
