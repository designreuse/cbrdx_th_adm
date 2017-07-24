package com.ciberdix.th.repositories;

import com.ciberdix.th.models.LocalizacionesNomenclaturas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocalizacionesNomenclaturasRefactorRepository  extends CrudRepository<LocalizacionesNomenclaturas, Integer> {

    List<LocalizacionesNomenclaturas> findAllByIndicadorHabilitadoIsTrue();

    List<LocalizacionesNomenclaturas> findAllByIdLocalizacion(Integer id);

    List<LocalizacionesNomenclaturas> findAllByIdTipoNomenclaturaComplementaria(Integer id);

}
