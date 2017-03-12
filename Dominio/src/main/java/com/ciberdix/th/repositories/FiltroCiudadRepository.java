package com.ciberdix.th.repositories;

import com.ciberdix.th.models.DivPoliticaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 2/03/2017.
 */
public interface FiltroCiudadRepository extends CrudRepository<DivPoliticaEntity, Integer> {
    /*@Query("SELECT idDivisionPolitica,DescripcionDivisionPolitica FROM DivisionPolitica dp left join book.authors a "
            + "WHERE lower(dp.idDivisionPolitica) LIKE lower(concat('%',:id,'%')) "
            + "AND lower(dp.DescripcionDivisionPolitica) LIKE lower(concat('%',:description,'%'))")
    List<DivPoliticaEntity> findCiudadByCriteria(@Param("id") String idDivisionPolitica,
                                                 @Param("description") String descripcionDivisionPolitica);*/

    List<DivPoliticaEntity> findByIdDivisionPoliticaTipoAndDescripcionDivisionPoliticaStartingWith(int idDivisionPoliticaTipo, String descripcionDivisionPolitica);

}
