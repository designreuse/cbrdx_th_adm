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
        config.exposeIdsFor(DivisionPoliticaAreas.class);
        config.exposeIdsFor(DivisionPoliticaComunas.class);
        config.exposeIdsFor(DivisionPoliticaLocalidades.class);
        config.exposeIdsFor(DivisionPoliticaResguardos.class);
        config.exposeIdsFor(DivisionPoliticaTipos.class);
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
        config.exposeIdsFor(ListasLateralidades.class);
        config.exposeIdsFor(VConstantes.class);
        config.exposeIdsFor(ListasTallas.class);
        config.exposeIdsFor(VTercerosDatosClinicos.class);
        config.exposeIdsFor(TercerosDatosClinicos.class);
        config.exposeIdsFor(VTercerosInmuebles.class);
        config.exposeIdsFor(VTercerosVehiculos.class);
        config.exposeIdsFor(DiagnosticosCie.class);
        config.exposeIdsFor(ListasTiposConstruccionViviendas.class);
        config.exposeIdsFor(ListasEstratos.class);
        config.exposeIdsFor(ListasClasesViviendas.class);
        config.exposeIdsFor(ListasTiposViviendas.class);
        config.exposeIdsFor(VTercerosContactos.class);
        config.exposeIdsFor(TercerosContactos.class);
        config.exposeIdsFor(TercerosInmuebles.class);
        config.exposeIdsFor(TercerosVehiculos.class);
        config.exposeIdsFor(VTercerosVehiculos.class);
        config.exposeIdsFor(ListasTiposVehiculos.class);
        config.exposeIdsFor(ListasMarcasVehiculos.class);
        config.exposeIdsFor(ListasTiposServiciosVehiculos.class);
        config.exposeIdsFor(TercerosResidencias.class);
        config.exposeIdsFor(Faltas.class);
        config.exposeIdsFor(ListasTiposFaltas.class);
        config.exposeIdsFor(ListasEstadosFaltas.class);
        config.exposeIdsFor(Cargos.class);
        config.exposeIdsFor(VCargos.class);
        config.exposeIdsFor(Productividades.class);
        config.exposeIdsFor(CargosProductividades.class);
        config.exposeIdsFor(EstructuraAreas.class);
        config.exposeIdsFor(Categorias.class);
        config.exposeIdsFor(CargosRiesgos.class);
        config.exposeIdsFor(Riesgos.class);
        config.exposeIdsFor(RiesgosSubTipos.class);
        config.exposeIdsFor(RiesgosTipos.class);
        config.exposeIdsFor(CargosEstadosObservaciones.class);
        config.exposeIdsFor(CargosResponsabilidades.class);
        config.exposeIdsFor(VCargosResponsabilidades.class);
        config.exposeIdsFor(Responsabilidades.class);
        config.exposeIdsFor(CargosExamenes.class);
        config.exposeIdsFor(ListasExamenes.class);
        config.exposeIdsFor(VCargosExamenes.class);
        config.exposeIdsFor(VCargosRolesProcesos.class);
        config.exposeIdsFor(CargosRolesProcesos.class);
        config.exposeIdsFor(ListasRolesProceso.class);
    }
}
