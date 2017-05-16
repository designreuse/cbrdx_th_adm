package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosResidencias;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface TercerosResidenciasRefactorRepository extends CrudRepository<TercerosResidencias, Integer> {

    @Transactional
    @Modifying
    @Query("update TercerosResidencias set indicadorHabilitado = 0 where idTerceroLocalizacion in (select idTerceroLocalizacion from TercerosLocalizaciones where idTercero in (select idTercero from TercerosLocalizaciones where idTerceroLocalizacion = ?1))")
    void updateChecks(Integer id);

    TercerosResidencias findByIdTerceroLocalizacion(Integer idTerceroLocalizacion);
}
