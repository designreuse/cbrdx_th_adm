package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposNomenclaturasComplementarias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposNomenclaturasComplementariasRefactorRepository extends CrudRepository<ListasTiposNomenclaturasComplementarias, Integer> {
    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrue();

    ListasTiposNomenclaturasComplementarias findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
