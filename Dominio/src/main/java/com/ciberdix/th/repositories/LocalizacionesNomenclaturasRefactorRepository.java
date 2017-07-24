package com.ciberdix.th.repositories;

import com.ciberdix.th.models.LocalizacionesNomenclaturas;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LocalizacionesNomenclaturasRefactorRepository  extends CrudRepository<LocalizacionesNomenclaturas, Integer> {

    List<LocalizacionesNomenclaturas> findAllByIndicadorHabilitadoIsTrue();

    List<LocalizacionesNomenclaturas> findAllByIdLocalizacion(Integer id);

    List<LocalizacionesNomenclaturas> findAllByIdTipoNomenclaturaComplementaria(Integer id);

    @Transactional
    @Modifying
    @Query("UPDATE LocalizacionesNomenclaturas LN SET LN.indicadorHabilitado = 0 WHERE LN.idLocalizacion = ?1")
    void disabled(Integer idLocalizacion);

}
