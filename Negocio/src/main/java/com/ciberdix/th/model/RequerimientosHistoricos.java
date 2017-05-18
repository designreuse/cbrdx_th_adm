package com.ciberdix.th.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 15/05/2017.
 */
public class RequerimientosHistoricos {

    private Integer idRequerimientoHistorico;
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

    public RequerimientosHistoricos() {
    }

    public RequerimientosHistoricos(Requerimientos req) {
        this.idRequerimiento = req.idRequerimiento;
        this.idSolicitante = req.idSolicitante;
        this.justificacion = req.justificacion;
        this.idCargo = req.idCargo;
        this.idFormaContratacion = req.idFormaContratacion;
        this.idTipoContratacion = req.idTipoContratacion;
        this.cantidadVacantes = req.cantidadVacantes;
        this.cantidadConvocados = req.cantidadConvocados;
        this.idEstado = req.idEstado;
        this.auditoriaUsuario = req.auditoriaUsuario;
        this.auditoriaFecha = req.auditoriaFecha;
        this.idResponsableSeleccion = req.idResponsableSeleccion;
        this.idFormaReclutamiento = req.idFormaReclutamiento;
        this.idEstructuraOrganizacional = req.idEstructuraOrganizacional;
        this.idZona = req.idZona;
        this.idEstructuraFisica = req.idEstructuraFisica;
        this.fechaSolicitud = req.fechaSolicitud;
        this.indicadorAutorizacion = req.indicadorAutorizacion;
        this.indicadorAumentoPlazas = req.indicadorAumentoPlazas;
        this.idJefe = req.idJefe;
        this.idCategoria = req.idCategoria;
        this.idTipoSolicitud = req.idTipoSolicitud;
        this.fechaInicio = req.fechaInicio;
        this.fechaFin = req.fechaFin;
    }

    public Integer getIdRequerimientoHistorico() {
        return idRequerimientoHistorico;
    }

    public void setIdRequerimientoHistorico(Integer idRequerimientoHistorico) {
        this.idRequerimientoHistorico = idRequerimientoHistorico;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
    }

    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Boolean getIndicadorAutorizacion() {
        return indicadorAutorizacion;
    }

    public void setIndicadorAutorizacion(Boolean indicadorAutorizacion) {
        this.indicadorAutorizacion = indicadorAutorizacion;
    }

    public Boolean getIndicadorAumentoPlazas() {
        return indicadorAumentoPlazas;
    }

    public void setIndicadorAumentoPlazas(Boolean indicadorAumentoPlazas) {
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
    }

    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
