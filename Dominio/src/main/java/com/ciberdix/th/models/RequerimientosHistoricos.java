package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 19/05/2017.
 */
@Entity
@Table(name = "RequerimientosHistoricos", schema = "crz_th", catalog = "CREZCAMOS")
public class RequerimientosHistoricos {
    private Integer idRequerimientoHistorico;
    private Integer idRequerimiento;
    private Integer idSolicitante;
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
    private Long idJefe;
    private Integer idCategoria;
    private Integer idTipoSolicitud;
    private Date fechaInicio;
    private Date fechaFin;
    private String nombreCargo;
    private String funcionCargo;

    public RequerimientosHistoricos() {
    }

    public RequerimientosHistoricos(Integer idRequerimiento, Integer idSolicitante, String justificacion, Integer idCargo, Integer idFormaContratacion, Integer idTipoContratacion, Integer cantidadVacantes, Integer cantidadConvocados, Integer idEstado, Integer auditoriaUsuario, Integer idResponsableSeleccion, Integer idFormaReclutamiento, Integer idEstructuraOrganizacional, Integer idZona, Integer idEstructuraFisica, Date fechaSolicitud, Boolean indicadorAutorizacion, Boolean indicadorAumentoPlazas, Long idJefe, Integer idCategoria, Integer idTipoSolicitud, Date fechaInicio, Date fechaFin, String nombreCargo, String funcionCargo) {
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
        this.nombreCargo = nombreCargo;
        this.funcionCargo = funcionCargo;
    }

    public RequerimientosHistoricos(Integer idRequerimientoHistorico, Integer idRequerimiento, Integer idSolicitante, String justificacion, Integer idCargo, Integer idFormaContratacion, Integer idTipoContratacion, Integer cantidadVacantes, Integer cantidadConvocados, Integer idEstado, Integer auditoriaUsuario, Integer idResponsableSeleccion, Integer idFormaReclutamiento, Integer idEstructuraOrganizacional, Integer idZona, Integer idEstructuraFisica, Date fechaSolicitud, Boolean indicadorAutorizacion, Boolean indicadorAumentoPlazas, Long idJefe, Integer idCategoria, Integer idTipoSolicitud, Date fechaInicio, Date fechaFin, String nombreCargo, String funcionCargo) {
        this.idRequerimientoHistorico = idRequerimientoHistorico;
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
        this.nombreCargo = nombreCargo;
        this.funcionCargo = funcionCargo;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimientoHistorico", nullable = false)
    public Integer getIdRequerimientoHistorico() {
        return idRequerimientoHistorico;
    }

    public void setIdRequerimientoHistorico(Integer idRequerimientoHistorico) {
        this.idRequerimientoHistorico = idRequerimientoHistorico;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = true)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "IdSolicitante", nullable = true)
    public Integer getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Basic
    @Column(name = "Justificacion", nullable = true, length = 200)
    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdFormaContratacion", nullable = true)
    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    @Basic
    @Column(name = "IdTipoContratacion", nullable = true)
    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    @Basic
    @Column(name = "CantidadVacantes", nullable = true)
    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    @Basic
    @Column(name = "CantidadConvocados", nullable = true)
    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "IdResponsableSeleccion", nullable = true)
    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    @Basic
    @Column(name = "IdFormaReclutamiento", nullable = true)
    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional", nullable = true)
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "IdZona", nullable = true)
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "IdEstructuraFisica", nullable = true)
    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    @Basic
    @Column(name = "FechaSolicitud", nullable = true)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Basic
    @Column(name = "IndicadorAutorizacion", nullable = true)
    public Boolean getIndicadorAutorizacion() {
        return indicadorAutorizacion;
    }

    public void setIndicadorAutorizacion(Boolean indicadorAutorizacion) {
        this.indicadorAutorizacion = indicadorAutorizacion;
    }

    @Basic
    @Column(name = "IndicadorAumentoPlazas", nullable = true)
    public Boolean getIndicadorAumentoPlazas() {
        return indicadorAumentoPlazas;
    }

    public void setIndicadorAumentoPlazas(Boolean indicadorAumentoPlazas) {
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
    }

    @Basic
    @Column(name = "IdJefe", nullable = true)
    public Long getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Long idJefe) {
        this.idJefe = idJefe;
    }

    @Basic
    @Column(name = "IdCategoria", nullable = true)
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "IdTipoSolicitud", nullable = true)
    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "NombreCargo", nullable = true, length = 100)
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    @Basic
    @Column(name = "FuncionCargo", nullable = true, length = 500)
    public String getFuncionCargo() {
        return funcionCargo;
    }

    public void setFuncionCargo(String funcionCargo) {
        this.funcionCargo = funcionCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosHistoricos that = (RequerimientosHistoricos) o;

        if (idRequerimientoHistorico != null ? !idRequerimientoHistorico.equals(that.idRequerimientoHistorico) : that.idRequerimientoHistorico != null)
            return false;
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
        if (nombreCargo != null ? !nombreCargo.equals(that.nombreCargo) : that.nombreCargo != null) return false;
        if (funcionCargo != null ? !funcionCargo.equals(that.funcionCargo) : that.funcionCargo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoHistorico != null ? idRequerimientoHistorico.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
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
        result = 31 * result + (nombreCargo != null ? nombreCargo.hashCode() : 0);
        result = 31 * result + (funcionCargo != null ? funcionCargo.hashCode() : 0);
        return result;
    }
}
