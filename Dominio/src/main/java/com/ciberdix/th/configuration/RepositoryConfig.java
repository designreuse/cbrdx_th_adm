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
    }
}
