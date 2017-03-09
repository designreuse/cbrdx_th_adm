package com.ciberdix.th.configuration;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.TipoDireccionEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(EstructuraAreasEntity.class);
        config.exposeIdsFor(TipoDireccionEntity.class);
    }
}
