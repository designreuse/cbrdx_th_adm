package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VOcupaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface VOcupacionesRefactorRepository extends CrudRepository<VOcupaciones, Integer> {

    @Query("SELECT O FROM VOcupaciones O WHERE " +
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
            "REPLACE(O.label,'Á','a')" +
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
            ") "+ " LIKE CONCAT('%',?1,'%')")
    List<VOcupaciones> queryByLabelContains(String value);

}
