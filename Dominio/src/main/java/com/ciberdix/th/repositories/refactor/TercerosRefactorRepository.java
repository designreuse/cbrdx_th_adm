package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Terceros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TercerosRefactorRepository extends CrudRepository<Terceros, Long> {

    @Query("SELECT t FROM Terceros t WHERE t.numeroDocumento=?1 AND t.idTipoDocumento=?2")
    Terceros queryTercero(String cedula, Integer id);
}
