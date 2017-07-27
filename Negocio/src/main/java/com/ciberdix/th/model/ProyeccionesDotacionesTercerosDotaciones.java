package com.ciberdix.th.model;

import java.sql.Timestamp;

public class ProyeccionesDotacionesTercerosDotaciones {

    private Integer idProyeccionDotacionTerceroDotacion;
    private Integer idProyeccionDotacionTercero;
    private Integer idDotacion;
    private Integer idTalla;
    private Integer cantidadAsignada;
    private Integer cantidadEntregada;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProyeccionDotacionTerceroDotacion() {
        return idProyeccionDotacionTerceroDotacion;
    }

    public void setIdProyeccionDotacionTerceroDotacion(Integer idProyeccionDotacionTerceroDotacion) {
        this.idProyeccionDotacionTerceroDotacion = idProyeccionDotacionTerceroDotacion;
    }

    public Integer getIdProyeccionDotacionTercero() {
        return idProyeccionDotacionTercero;
    }

    public void setIdProyeccionDotacionTercero(Integer idProyeccionDotacionTercero) {
        this.idProyeccionDotacionTercero = idProyeccionDotacionTercero;
    }

    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    public Integer getCantidadAsignada() {
        return cantidadAsignada;
    }

    public void setCantidadAsignada(Integer cantidadAsignada) {
        this.cantidadAsignada = cantidadAsignada;
    }

    public Integer getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(Integer cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
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

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }
}
