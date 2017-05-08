package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VActividadesEconomicas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VActividadesEconomicasRefactorRepository extends CrudRepository<VActividadesEconomicas, Integer> {
    List<VActividadesEconomicas> findByLabelContains(String value);

    @Query("SELECT c FROM VActividadesEconomicas c WHERE "+
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
            "REPLACE(c.label,'Á','a')" +
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
            "ORDER BY c.label")
    List<VActividadesEconomicas> queryVActiviByLabel(String str);

    @Query("SELECT c FROM VActividadesEconomicas c WHERE "+
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
            "REPLACE(c.label,'Á','a')" +
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
            "ORDER BY c.label")
    List<VActividadesEconomicas> queryVActiviByLabelAll(String str);

}
