package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VCargos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRefactorRepository extends CrudRepository<VCargos, Integer> {
    List<VCargos> findByIndicadorHabilitadoIsTrue();

    List<VCargos> findByCargoContains(String query);

    @Query("SELECT c FROM VCargos c WHERE "+
    "SOUNDEX(lower(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(c.cargo,'á','a'),'Á','a'),'é','e'),'É','e'),'í','i'),'Í','i'),'ó','o'),'Ó','o'),'ú','u'),'Ú','u'),'ñ','n'),'Ñ','n'))) "+
    "LIKE '%' || ?1 || '%'")
    List<VCargos> queryVCargosByCargo(String str);
}
