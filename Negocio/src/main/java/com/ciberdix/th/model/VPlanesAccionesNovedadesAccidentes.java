package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Date;

public class VPlanesAccionesNovedadesAccidentes {

    private Integer idPlanAccionNovedadAccidente;
    private Integer idNovedadAccidente;
    private String estadoPlanAccion;
    private Integer idEstadoPlanAccion;
    private String actividad;
    private String nombreResponsable;
    private Long idResponsable;
    private Date fechaLimite;
    private String nombreEncargado;
    private Long idEncargado;
    private Date fechaVerificacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdPlanAccionNovedadAccidente() {
        return idPlanAccionNovedadAccidente;
    }

    public void setIdPlanAccionNovedadAccidente(Integer idPlanAccionNovedadAccidente) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
    }

    public Integer getIdNovedadAccidente() {
        return idNovedadAccidente;
    }

    public void setIdNovedadAccidente(Integer idNovedadAccidente) {
        this.idNovedadAccidente = idNovedadAccidente;
    }

    public String getEstadoPlanAccion() {
        return estadoPlanAccion;
    }

    public void setEstadoPlanAccion(String estadoPlanAccion) {
        this.estadoPlanAccion = estadoPlanAccion;
    }

    public Integer getIdEstadoPlanAccion() {
        return idEstadoPlanAccion;
    }

    public void setIdEstadoPlanAccion(Integer idEstadoPlanAccion) {
        this.idEstadoPlanAccion = idEstadoPlanAccion;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public Long getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Long idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public Long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(Long idEncargado) {
        this.idEncargado = idEncargado;
    }

    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
}
