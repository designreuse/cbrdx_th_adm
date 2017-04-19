package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VActividadesEconomicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VActividadesEconomicasRefactorRepository extends CrudRepository<VActividadesEconomicas, Integer> {
    List<VActividadesEconomicas> findByLabelContains(String value);
}
