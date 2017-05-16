package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 15/05/2017.
 */
@Entity
@Table(name = "Requerimientos", schema = "crz_th", catalog = "CREZCAMOS")
public class Requerimientos {
    private Integer idRequerimiento;
    private Long idSolicitante;
    private String justificacion;
    private Integer idCargo;
    private Integer idFormaContratacion;
    private Integer idTipoContratacion;
    private Integer cantidadVacantes;
    private Integer cantidadConvocados;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idResponsableSeleccion;
    private Integer idFormaReclutamiento;
    private Integer idEstructuraOrganizacional;
    private Integer idZona;
    private Integer idEstructuraFisica;
    private Date fechaSolicitud;
    private Boolean indicadorAutorizacion;
    private Boolean indicadorAumentoPlazas;
    private Integer idJefe;
    private Integer idCategoria;
    private Integer idTipoSolicitud;
    private Date fechaInicio;
    private Date fechaFin;

    public Requerimientos() {
    }

    public Requerimientos(Long idSolicitante, String justificacion, Integer idCargo, Integer idFormaContratacion, Integer idTipoContratacion, Integer cantidadVacantes, Integer cantidadConvocados, Integer idEstado, Integer auditoriaUsuario, Integer idResponsableSeleccion, Integer idFormaReclutamiento, Integer idEstructuraOrganizacional, Integer idZona, Integer idEstructuraFisica, Date fechaSolicitud, Boolean indicadorAutorizacion, Boolean indicadorAumentoPlazas, Integer idJefe, Integer idCategoria, Integer idTipoSolicitud, Date fechaInicio, Date fechaFin) {
        this.idSolicitante = idSolicitante;
        this.justificacion = justificacion;
        this.idCargo = idCargo;
        this.idFormaContratacion = idFormaContratacion;
        this.idTipoContratacion = idTipoContratacion;
        this.cantidadVacantes = cantidadVacantes;
        this.cantidadConvocados = cantidadConvocados;
        this.idEstado = idEstado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idResponsableSeleccion = idResponsableSeleccion;
        this.idFormaReclutamiento = idFormaReclutamiento;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idZona = idZona;
        this.idEstructuraFisica = idEstructuraFisica;
        this.fechaSolicitud = fechaSolicitud != null ? new Date(fechaSolicitud.getTime()) : null;
        this.indicadorAutorizacion = indicadorAutorizacion;
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
        this.idJefe = idJefe;
        this.idCategoria = idCategoria;
        this.idTipoSolicitud = idTipoSolicitud;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
    }

    public Requerimientos(Integer idRequerimiento, Long idSolicitante, String justificacion, Integer idCargo, Integer idFormaContratacion, Integer idTipoContratacion, Integer cantidadVacantes, Integer cantidadConvocados, Integer idEstado, Integer auditoriaUsuario, Integer idResponsableSeleccion, Integer idFormaReclutamiento, Integer idEstructuraOrganizacional, Integer idZona, Integer idEstructuraFisica, Date fechaSolicitud, Boolean indicadorAutorizacion, Boolean indicadorAumentoPlazas, Integer idJefe, Integer idCategoria, Integer idTipoSolicitud, Date fechaInicio, Date fechaFin) {
        this.idRequerimiento = idRequerimiento;
        this.idSolicitante = idSolicitante;
        this.justificacion = justificacion;
        this.idCargo = idCargo;
        this.idFormaContratacion = idFormaContratacion;
        this.idTipoContratacion = idTipoContratacion;
        this.cantidadVacantes = cantidadVacantes;
        this.cantidadConvocados = cantidadConvocados;
        this.idEstado = idEstado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idResponsableSeleccion = idResponsableSeleccion;
        this.idFormaReclutamiento = idFormaReclutamiento;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idZona = idZona;
        this.idEstructuraFisica = idEstructuraFisica;
        this.fechaSolicitud = fechaSolicitud != null ? new Date(fechaSolicitud.getTime()) : null;
        this.indicadorAutorizacion = indicadorAutorizacion;
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
        this.idJefe = idJefe;
        this.idCategoria = idCategoria;
        this.idTipoSolicitud = idTipoSolicitud;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimiento")
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "IdSolicitante")
    public Long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Basic
    @Column(name = "Justificacion")
    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
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
    @Column(name = "IdFormaContratacion")
    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    @Basic
    @Column(name = "IdTipoContratacion")
    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    @Basic
    @Column(name = "CantidadVacantes")
    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    @Basic
    @Column(name = "CantidadConvocados")
    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

    @Basic
    @Column(name = "IdResponsableSeleccion")
    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    @Basic
    @Column(name = "IdFormaReclutamiento")
    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
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
    @Column(name = "IdZona")
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "IdEstructuraFisica")
    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    @Basic
    @Column(name = "FechaSolicitud")
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Basic
    @Column(name = "IndicadorAutorizacion")
    public Boolean getIndicadorAutorizacion() {
        return indicadorAutorizacion;
    }

    public void setIndicadorAutorizacion(Boolean indicadorAutorizacion) {
        this.indicadorAutorizacion = indicadorAutorizacion;
    }

    @Basic
    @Column(name = "IndicadorAumentoPlazas")
    public Boolean getIndicadorAumentoPlazas() {
        return indicadorAumentoPlazas;
    }

    public void setIndicadorAumentoPlazas(Boolean indicadorAumentoPlazas) {
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
    }

    @Basic
    @Column(name = "IdJefe")
    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    @Basic
    @Column(name = "IdCategoria")
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "IdTipoSolicitud")
    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    @Basic
    @Column(name = "FechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Requerimientos that = (Requerimientos) o;

        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idSolicitante != null ? !idSolicitante.equals(that.idSolicitante) : that.idSolicitante != null)
            return false;
        if (justificacion != null ? !justificacion.equals(that.justificacion) : that.justificacion != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idFormaContratacion != null ? !idFormaContratacion.equals(that.idFormaContratacion) : that.idFormaContratacion != null)
            return false;
        if (idTipoContratacion != null ? !idTipoContratacion.equals(that.idTipoContratacion) : that.idTipoContratacion != null)
            return false;
        if (cantidadVacantes != null ? !cantidadVacantes.equals(that.cantidadVacantes) : that.cantidadVacantes != null)
            return false;
        if (cantidadConvocados != null ? !cantidadConvocados.equals(that.cantidadConvocados) : that.cantidadConvocados != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idResponsableSeleccion != null ? !idResponsableSeleccion.equals(that.idResponsableSeleccion) : that.idResponsableSeleccion != null)
            return false;
        if (idFormaReclutamiento != null ? !idFormaReclutamiento.equals(that.idFormaReclutamiento) : that.idFormaReclutamiento != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
            return false;
        if (fechaSolicitud != null ? !fechaSolicitud.equals(that.fechaSolicitud) : that.fechaSolicitud != null)
            return false;
        if (indicadorAutorizacion != null ? !indicadorAutorizacion.equals(that.indicadorAutorizacion) : that.indicadorAutorizacion != null)
            return false;
        if (indicadorAumentoPlazas != null ? !indicadorAumentoPlazas.equals(that.indicadorAumentoPlazas) : that.indicadorAumentoPlazas != null)
            return false;
        if (idJefe != null ? !idJefe.equals(that.idJefe) : that.idJefe != null) return false;
        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (idTipoSolicitud != null ? !idTipoSolicitud.equals(that.idTipoSolicitud) : that.idTipoSolicitud != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimiento != null ? idRequerimiento.hashCode() : 0;
        result = 31 * result + (idSolicitante != null ? idSolicitante.hashCode() : 0);
        result = 31 * result + (justificacion != null ? justificacion.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idFormaContratacion != null ? idFormaContratacion.hashCode() : 0);
        result = 31 * result + (idTipoContratacion != null ? idTipoContratacion.hashCode() : 0);
        result = 31 * result + (cantidadVacantes != null ? cantidadVacantes.hashCode() : 0);
        result = 31 * result + (cantidadConvocados != null ? cantidadConvocados.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idResponsableSeleccion != null ? idResponsableSeleccion.hashCode() : 0);
        result = 31 * result + (idFormaReclutamiento != null ? idFormaReclutamiento.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idZona != null ? idZona.hashCode() : 0);
        result = 31 * result + (idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0);
        result = 31 * result + (fechaSolicitud != null ? fechaSolicitud.hashCode() : 0);
        result = 31 * result + (indicadorAutorizacion != null ? indicadorAutorizacion.hashCode() : 0);
        result = 31 * result + (indicadorAumentoPlazas != null ? indicadorAumentoPlazas.hashCode() : 0);
        result = 31 * result + (idJefe != null ? idJefe.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (idTipoSolicitud != null ? idTipoSolicitud.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        return result;
    }
}
