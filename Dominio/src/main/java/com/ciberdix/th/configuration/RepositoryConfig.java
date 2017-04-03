package com.ciberdix.th.configuration;

import com.ciberdix.th.models.*;
import com.ciberdix.th.models.refactor.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(EstructuraAreasEntity.class);
        config.exposeIdsFor(TipoDireccionEntity.class);
        config.exposeIdsFor(TercerosFamiliaresEntity.class);
        config.exposeIdsFor(LocalizacionesEntity.class);
        config.exposeIdsFor(TercerosLocalizacionesEntity.class);
        config.exposeIdsFor(TipoDocumentoEntity.class);
        config.exposeIdsFor(ListasParentescosEntity.class);
        config.exposeIdsFor(TercerosEntity.class);
        config.exposeIdsFor(PrincipalNomenclaturaEntity.class);
        config.exposeIdsFor(ComplementariaNomenclaturaEntity.class);
        config.exposeIdsFor(VistaDivisionPoliticaEntity.class);
        config.exposeIdsFor(VTercerosFamiliaresEntity.class);
        config.exposeIdsFor(VTercerosReferenciasEntity.class);
        config.exposeIdsFor(DivPoliticaEntity.class);
        config.exposeIdsFor(TercerosReferenciasEntity.class);
        config.exposeIdsFor(TipoReferenciaEntity.class);

        //Desde Aqui empezar a incluir los del Refactor

        config.exposeIdsFor(DivisionPolitica.class);
        config.exposeIdsFor(VDivisionPoliticaRec.class);
        config.exposeIdsFor(ListasTiposReferencias.class);
        config.exposeIdsFor(Localizaciones.class);
        config.exposeIdsFor(TercerosReferencias.class);
        config.exposeIdsFor(VTercerosReferencias.class);
        config.exposeIdsFor(Terceros.class);
        config.exposeIdsFor(ListasEstadosCiviles.class);
        config.exposeIdsFor(ListasFactoresRh.class);
        config.exposeIdsFor(ListasGeneros.class);
        config.exposeIdsFor(ListasNivelesEstudios.class);
        config.exposeIdsFor(ListasSectoresEmpresas.class);
        config.exposeIdsFor(ListasTiposAfiliacion.class);
        config.exposeIdsFor(ListasTiposDocumentos.class);
        config.exposeIdsFor(ListasTiposPersonas.class);
        config.exposeIdsFor(Ocupaciones.class);
        config.exposeIdsFor(ListasSectoresEmpresas.class);
        config.exposeIdsFor(ListasTiposAfiliacion.class);
        config.exposeIdsFor(ListasTiposDocumentos.class);
        config.exposeIdsFor(ListasTiposPersonas.class);
        config.exposeIdsFor(ListasInstituciones.class);
        config.exposeIdsFor(TercerosEstudiosFormales.class);
        config.exposeIdsFor(ListasAreasEstudios.class);
        config.exposeIdsFor(ListasEstadosEstudios.class);
        config.exposeIdsFor(VDivisionPolitica.class);
        config.exposeIdsFor(ActividadesEconomicas.class);
        config.exposeIdsFor(ListasEstadosJuridicos.class);
        config.exposeIdsFor(ListasTiposOcupaciones.class);
        config.exposeIdsFor(ListasCoberturasSalud.class);
        config.exposeIdsFor(VTerceros.class);
        config.exposeIdsFor(VLocalizaciones.class);
        config.exposeIdsFor(VTercerosEstudiosFormales.class);
        config.exposeIdsFor(VTercerosEstudiosNoFormales.class);
        config.exposeIdsFor(TercerosEstudiosNoFormales.class);
        config.exposeIdsFor(TercerosExperienciasLaborales.class);
        config.exposeIdsFor(VTercerosExperienciasLaborales.class);
        config.exposeIdsFor(TercerosLocalizaciones.class);
        config.exposeIdsFor(ListasNivelesCargos.class);
        config.exposeIdsFor(ListasTiposEstudios.class);
        config.exposeIdsFor(ListasIntensidades.class);
        config.exposeIdsFor(ListasTiposTerceros.class);
        config.exposeIdsFor(ListasParentescos.class);
        config.exposeIdsFor(TercerosFamiliares.class);
        config.exposeIdsFor(VTercerosFamiliares.class);
        config.exposeIdsFor(Constantes.class);
        config.exposeIdsFor(ListasTiposDatos.class);
    }
}
