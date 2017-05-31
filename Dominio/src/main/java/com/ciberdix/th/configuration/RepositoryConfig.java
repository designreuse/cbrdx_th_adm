package com.ciberdix.th.configuration;

import com.ciberdix.th.models.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        //Desde Aqui empezar a incluir los del Refactor

        config.exposeIdsFor(DivisionPolitica.class);
        config.exposeIdsFor(DivisionPoliticaAreas.class);
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
        config.exposeIdsFor(ListasTiposAfiliacion.class);
        config.exposeIdsFor(ListasTiposDocumentos.class);
        config.exposeIdsFor(ListasTiposPersonas.class);
        config.exposeIdsFor(Ocupaciones.class);
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
        config.exposeIdsFor(ListasEstadosCargos.class);
        config.exposeIdsFor(CargosCriterios.class);
        config.exposeIdsFor(Criterios.class);
        config.exposeIdsFor(CargosCompetencias.class);
        config.exposeIdsFor(Competencias.class);
        config.exposeIdsFor(GruposCompetencias.class);
        config.exposeIdsFor(Ponderaciones.class);
        config.exposeIdsFor(CargosElementos.class);
        config.exposeIdsFor(ListasTiposElementos.class);
        config.exposeIdsFor(ListasTiposCargosRelaciones.class);
        config.exposeIdsFor(CargosRelacionados.class);
        config.exposeIdsFor(VCargosElementos.class);
        config.exposeIdsFor(ListasAtributosCargos.class);
        config.exposeIdsFor(CargosPersonalidadAtributos.class);
        config.exposeIdsFor(VRiesgos.class);
        config.exposeIdsFor(EstructuraOrganizacional.class);
        config.exposeIdsFor(VEstructuraOrganizacional.class);
        config.exposeIdsFor(EstructuraFisica.class);
        config.exposeIdsFor(ListasTiposEstructuras.class);
        config.exposeIdsFor(VEstructuraFisica.class);
        config.exposeIdsFor(ListasClasificacionesSedes.class);
        config.exposeIdsFor(CentrosCostos.class);
        config.exposeIdsFor(EstructuraOrganizacionalCargos.class);
        config.exposeIdsFor(VEstructuraOrganizacionalCargos.class);
        config.exposeIdsFor(TercerosCargos.class);
        config.exposeIdsFor(ListasTiposContratos.class);
        config.exposeIdsFor(VTercerosCargos.class);
        config.exposeIdsFor(CargosOcupaciones.class);
        config.exposeIdsFor(ListasEstadosProyecciones.class);
        config.exposeIdsFor(ProyeccionesLaborales.class);
        config.exposeIdsFor(VFaltas.class);
        config.exposeIdsFor(VProyeccionLaboral.class);
        config.exposeIdsFor(Menus.class);
        config.exposeIdsFor(Roles.class);
        config.exposeIdsFor(ActividadesEconomicasTipos.class);
        config.exposeIdsFor(VProyeccionLaboralResumen.class);
        config.exposeIdsFor(Usuarios.class);
        config.exposeIdsFor(VCargosRiesgos.class);
        config.exposeIdsFor(Widgets.class);
        config.exposeIdsFor(OcupacionesTipos.class);
        config.exposeIdsFor(Funcionalidades.class);
        config.exposeIdsFor(ListasClasificaciones.class);
        config.exposeIdsFor(FuncionalidadesControles.class);
        config.exposeIdsFor(RolesFuncionalidadesControles.class);
        config.exposeIdsFor(RolesFuncionalidades.class);
        config.exposeIdsFor(VFuncionalidades.class);
        config.exposeIdsFor(VFuncionalidadesControles.class);
        config.exposeIdsFor(VUsuarios.class);
        config.exposeIdsFor(VRolesFuncionalidades.class);
        config.exposeIdsFor(VRolesFuncionalidadesControles.class);
        config.exposeIdsFor(RolesWidgets.class);
        config.exposeIdsFor(VRolesWidgets.class);
        config.exposeIdsFor(VPolicyRules.class);
        config.exposeIdsFor(Listas.class);
        config.exposeIdsFor(GruposGestion.class);
        config.exposeIdsFor(VUsuarioRolesCantidad.class);
        config.exposeIdsFor(ListasTiposDirecciones.class);
        config.exposeIdsFor(ListasTiposNomenclaturas.class);
        config.exposeIdsFor(ListasTiposNomenclaturasComplementarias.class);
        config.exposeIdsFor(UsuarioGruposGestion.class);
        config.exposeIdsFor(VUsuarioGruposGestion.class);
        config.exposeIdsFor(TercerosClases.class);
        config.exposeIdsFor(ListasClasesTerceros.class);
        config.exposeIdsFor(VOcupaciones.class);
        config.exposeIdsFor(VUsuariosWidgets.class);
        config.exposeIdsFor(ActividadesEconomicas.class);
        config.exposeIdsFor(VActividadesEconomicas.class);
        config.exposeIdsFor(VUsuarioRoles.class);
        config.exposeIdsFor(UsuarioRoles.class);
        config.exposeIdsFor(VCargosRelacionados.class);
        config.exposeIdsFor(VListasRolesProcesoCargoRolesProceso.class);
        config.exposeIdsFor(Requerimientos.class);
        config.exposeIdsFor(ListasEstadosRequerimientos.class);
        config.exposeIdsFor(ListasRequerimientosAcciones.class);
        config.exposeIdsFor(ListasTiposSolicitudes.class);
        config.exposeIdsFor(RequerimientosReferidos.class);
        config.exposeIdsFor(VRequerimientos.class);
        config.exposeIdsFor(RequerimientosAcciones.class);
        config.exposeIdsFor(VTercerosCargosAreasFisicas.class);
        config.exposeIdsFor(RequerimientosHistoricos.class);
        config.exposeIdsFor(RequerimientosCompras.class);
        config.exposeIdsFor(VRequerimientosCompras.class);
        config.exposeIdsFor(RequerimientosHistoricos.class);
        config.exposeIdsFor(VRequerimientosHistoricos.class);
        config.exposeIdsFor(RequerimientosTics.class);
        config.exposeIdsFor(VRequerimientosTics.class);
        config.exposeIdsFor(ListasTiposCompras.class);
        config.exposeIdsFor(ListasTiCs.class);
        config.exposeIdsFor(ListasRequerimientosAcciones.class);
        config.exposeIdsFor(ListasCuestionarios.class);
        config.exposeIdsFor(VRequerimientosCuestionarios.class);
        config.exposeIdsFor(RequerimientosCuestionarios.class);
        config.exposeIdsFor(DivisionPoliticaAgrupaciones.class);
        config.exposeIdsFor(ListasTiposAgrupaciones.class);
        config.exposeIdsFor(Publicaciones.class);
        config.exposeIdsFor(PublicacionesCuestionarios.class);
    }
}
