package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRefactorRepository extends CrudRepository<VCargos, Integer> {
    List<VCargos> findByIndicadorHabilitadoIsTrue();

    @Query ("SELECT vc FROM VCargos vc ORDER BY vc.cargo")
    List<VCargos> queryOrderByCargo();

    List<VCargos> findByCargoContains(String query);

    @Query("SELECT c FROM VCargos c WHERE "+
    "lower(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(c.cargo,'Á','a')" +
            ",'À','a')" +
            ",'Â','a')" +
            ",'Ã','a')" +
            ",'Ä','a')" +
            ",'Å','a')" +
            ",'á','a')" +
            ",'à','a')" +
            ",'â','a')" +
            ",'ã','a')" +
            ",'ä','a')" +
            ",'å','a')" +
            ",'É','e')" +
            ",'È','e')" +
            ",'Ê','e')" +
            ",'Ë','e')" +
            ",'é','e')" +
            ",'è','e')" +
            ",'ê','e')" +
            ",'ë','e')" +
            ",'Í','i')" +
            ",'Ì','i')" +
            ",'Î','i')" +
            ",'Ï','i')" +
            ",'í','i')" +
            ",'ì','i')" +
            ",'î','i')" +
            ",'ï','i')" +
            ",'Ó','o')" +
            ",'Ò','o')" +
            ",'Ô','o')" +
            ",'Õ','o')" +
            ",'Ö','o')" +
            ",'ó','o')" +
            ",'ò','o')" +
            ",'ô','o')" +
            ",'õ','o')" +
            ",'ö','o')" +
            ",'Ú','u')" +
            ",'Ù','u')" +
            ",'Û','u')" +
            ",'Ü','u')" +
            ",'ú','u')" +
            ",'ù','u')" +
            ",'û','u')" +
            ",'ü','u')" +
            ",'ñ','n')" +
            ",'Ñ','n')" +
            ",'ÿ','y')" +
            ") "+
    "LIKE ?1 || '%'" +
    "ORDER BY c.cargo")
    List<VCargos> queryVCargosByCargo(String str);

    @Query("SELECT c FROM VCargos c WHERE "+
            "lower(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(" +
            "REPLACE(c.cargo,'Á','a')" +
            ",'À','a')" +
            ",'Â','a')" +
            ",'Ã','a')" +
            ",'Ä','a')" +
            ",'Å','a')" +
            ",'á','a')" +
            ",'à','a')" +
            ",'â','a')" +
            ",'ã','a')" +
            ",'ä','a')" +
            ",'å','a')" +
            ",'É','e')" +
            ",'È','e')" +
            ",'Ê','e')" +
            ",'Ë','e')" +
            ",'é','e')" +
            ",'è','e')" +
            ",'ê','e')" +
            ",'ë','e')" +
            ",'Í','i')" +
            ",'Ì','i')" +
            ",'Î','i')" +
            ",'Ï','i')" +
            ",'í','i')" +
            ",'ì','i')" +
            ",'î','i')" +
            ",'ï','i')" +
            ",'Ó','o')" +
            ",'Ò','o')" +
            ",'Ô','o')" +
            ",'Õ','o')" +
            ",'Ö','o')" +
            ",'ó','o')" +
            ",'ò','o')" +
            ",'ô','o')" +
            ",'õ','o')" +
            ",'ö','o')" +
            ",'Ú','u')" +
            ",'Ù','u')" +
            ",'Û','u')" +
            ",'Ü','u')" +
            ",'ú','u')" +
            ",'ù','u')" +
            ",'û','u')" +
            ",'ü','u')" +
            ",'ñ','n')" +
            ",'Ñ','n')" +
            ",'ÿ','y')" +
            ") "+
            "LIKE '%' || ?1 || '%'" +
            "ORDER BY c.cargo")
    List<VCargos> queryVCargosByCargoAll(String str);
}
