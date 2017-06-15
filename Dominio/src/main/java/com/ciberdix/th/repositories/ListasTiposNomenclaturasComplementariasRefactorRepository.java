package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposNomenclaturasComplementarias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposNomenclaturasComplementariasRefactorRepository extends CrudRepository<ListasTiposNomenclaturasComplementarias, Integer> {
    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposNomenclaturasComplementarias findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposNomenclaturasComplementarias> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
