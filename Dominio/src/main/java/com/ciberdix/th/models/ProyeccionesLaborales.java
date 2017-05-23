package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@NamedStoredProcedureQuery(name = "GenProy", procedureName = "crz_th.GenerarProyeccion", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Usuario", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "Output", type = Integer.class)})
@Table(name = "ProyeccionesLaborales", schema = "crz_th", catalog = "CREZCAMOS")
public class ProyeccionesLaborales {
    private Integer idProyecccionLaboral;
    private Integer idEstructuraOrganizacional;
    private Integer idCargo;
    private Integer plazasActuales;
    private Integer plazasProyectadas;
    private Double costoActual;
    private Double costoProyectado;
    private Integer idEstadoProyeccion;
    private Integer idUsuarioProyecta;
    private Integer idUsuarioAprueba;
    private Integer anio;
    private String observacion;
    private String observacionAprobacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProyeccionesLaborales() {
    }

    public ProyeccionesLaborales(Integer idEstructuraOrganizacional, Integer idCargo, Integer plazasActuales, Integer plazasProyectadas, Double costoActual, Double costoProyectado, Integer idEstadoProyeccion, Integer idUsuarioProyecta, Integer idUsuarioAprueba, Integer anio, String observacion, String observacionAprobacion, Integer auditoriaUsuario) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idCargo = idCargo;
        this.plazasActuales = plazasActuales;
        this.plazasProyectadas = plazasProyectadas;
        this.costoActual = costoActual;
        this.costoProyectado = costoProyectado;
        this.idEstadoProyeccion = idEstadoProyeccion;
        this.idUsuarioProyecta = idUsuarioProyecta;
        this.idUsuarioAprueba = idUsuarioAprueba;
        this.anio = anio;
        this.observacion = observacion;
        this.observacionAprobacion = observacionAprobacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProyeccionesLaborales(Integer idProyecccionLaboral, Integer idEstructuraOrganizacional, Integer idCargo, Integer plazasActuales, Integer plazasProyectadas, Double costoActual, Double costoProyectado, Integer idEstadoProyeccion, Integer idUsuarioProyecta, Integer idUsuarioAprueba, Integer anio, String observacion, String observacionAprobacion, Integer auditoriaUsuario) {
        this.idProyecccionLaboral = idProyecccionLaboral;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idCargo = idCargo;
        this.plazasActuales = plazasActuales;
        this.plazasProyectadas = plazasProyectadas;
        this.costoActual = costoActual;
        this.costoProyectado = costoProyectado;
        this.idEstadoProyeccion = idEstadoProyeccion;
        this.idUsuarioProyecta = idUsuarioProyecta;
        this.idUsuarioAprueba = idUsuarioAprueba;
        this.anio = anio;
        this.observacion = observacion;
        this.observacionAprobacion = observacionAprobacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProyecccionLaboral")
    public Integer getIdProyecccionLaboral() {
        return idProyecccionLaboral;
    }

    public void setIdProyecccionLaboral(Integer idProyecccionLaboral) {
        this.idProyecccionLaboral = idProyecccionLaboral;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional")
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "PlazasActuales")
    public Integer getPlazasActuales() {
        return plazasActuales;
    }

    public void setPlazasActuales(Integer plazasActuales) {
        this.plazasActuales = plazasActuales;
    }

    @Basic
    @Column(name = "PlazasProyectadas")
    public Integer getPlazasProyectadas() {
        return plazasProyectadas;
    }

    public void setPlazasProyectadas(Integer plazasProyectadas) {
        this.plazasProyectadas = plazasProyectadas;
    }

    @Basic
    @Column(name = "CostoActual")
    public Double getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(Double costoActual) {
        this.costoActual = costoActual;
    }

    @Basic
    @Column(name = "CostoProyectado")
    public Double getCostoProyectado() {
        return costoProyectado;
    }

    public void setCostoProyectado(Double costoProyectado) {
        this.costoProyectado = costoProyectado;
    }

    @Basic
    @Column(name = "IdEstadoProyeccion")
    public Integer getIdEstadoProyeccion() {
        return idEstadoProyeccion;
    }

    public void setIdEstadoProyeccion(Integer idEstadoProyeccion) {
        this.idEstadoProyeccion = idEstadoProyeccion;
    }

    @Basic
    @Column(name = "IdUsuarioProyecta")
    public Integer getIdUsuarioProyecta() {
        return idUsuarioProyecta;
    }

    public void setIdUsuarioProyecta(Integer idUsuarioProyecta) {
        this.idUsuarioProyecta = idUsuarioProyecta;
    }

    @Basic
    @Column(name = "IdUsuarioAprueba")
    public Integer getIdUsuarioAprueba() {
        return idUsuarioAprueba;
    }

    public void setIdUsuarioAprueba(Integer idUsuarioAprueba) {
        this.idUsuarioAprueba = idUsuarioAprueba;
    }

    @Basic
    @Column(name = "Año")
    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer año) {
        this.anio = año;
    }

    @Basic
    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "ObservacionAprobacion")
    public String getObservacionAprobacion() {
        return observacionAprobacion;
    }

    public void setObservacionAprobacion(String observacionAprobacion) {
        this.observacionAprobacion = observacionAprobacion;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProyeccionesLaborales that = (ProyeccionesLaborales) o;

        if (idProyecccionLaboral != null ? !idProyecccionLaboral.equals(that.idProyecccionLaboral) : that.idProyecccionLaboral != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (plazasActuales != null ? !plazasActuales.equals(that.plazasActuales) : that.plazasActuales != null)
            return false;
        if (plazasProyectadas != null ? !plazasProyectadas.equals(that.plazasProyectadas) : that.plazasProyectadas != null)
            return false;
        if (costoActual != null ? !costoActual.equals(that.costoActual) : that.costoActual != null) return false;
        if (costoProyectado != null ? !costoProyectado.equals(that.costoProyectado) : that.costoProyectado != null)
            return false;
        if (idEstadoProyeccion != null ? !idEstadoProyeccion.equals(that.idEstadoProyeccion) : that.idEstadoProyeccion != null)
            return false;
        if (idUsuarioProyecta != null ? !idUsuarioProyecta.equals(that.idUsuarioProyecta) : that.idUsuarioProyecta != null)
            return false;
        if (idUsuarioAprueba != null ? !idUsuarioAprueba.equals(that.idUsuarioAprueba) : that.idUsuarioAprueba != null)
            return false;
        if (anio != null ? !anio.equals(that.anio) : that.anio != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (observacionAprobacion != null ? !observacionAprobacion.equals(that.observacionAprobacion) : that.observacionAprobacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyecccionLaboral != null ? idProyecccionLaboral.hashCode() : 0;
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (plazasActuales != null ? plazasActuales.hashCode() : 0);
        result = 31 * result + (plazasProyectadas != null ? plazasProyectadas.hashCode() : 0);
        result = 31 * result + (costoActual != null ? costoActual.hashCode() : 0);
        result = 31 * result + (costoProyectado != null ? costoProyectado.hashCode() : 0);
        result = 31 * result + (idEstadoProyeccion != null ? idEstadoProyeccion.hashCode() : 0);
        result = 31 * result + (idUsuarioProyecta != null ? idUsuarioProyecta.hashCode() : 0);
        result = 31 * result + (idUsuarioAprueba != null ? idUsuarioAprueba.hashCode() : 0);
        result = 31 * result + (anio != null ? anio.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (observacionAprobacion != null ? observacionAprobacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
