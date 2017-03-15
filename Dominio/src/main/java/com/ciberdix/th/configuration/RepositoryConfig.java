package com.ciberdix.th.configuration;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.TercerosFamiliaresEntity;
import com.ciberdix.th.models.*;
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
        config.exposeIdsFor(DivPoliticaEntity.class);
    }
}
