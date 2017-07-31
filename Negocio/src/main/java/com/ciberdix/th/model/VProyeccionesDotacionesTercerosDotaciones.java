package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VProyeccionesDotacionesTercerosDotaciones {

    private Integer idProyeccionDotacionTerceroDotacion;
    private Integer idProyeccionDotacionTercero;
    private String dotacion;
    private Integer idDotacion;
    private Integer cantidadAsignada;
    private Integer cantidadEntregada;
    private String talla;
    private Integer idTalla;
    private Boolean indicadorSatisfecho;
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

    public String getDotacion() {
        return dotacion;
    }

    public void setDotacion(String dotacion) {
        this.dotacion = dotacion;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public Boolean getIndicadorSatisfecho() {
        return indicadorSatisfecho;
    }

    public void setIndicadorSatisfecho(Boolean indicadorSatisfecho) {
        this.indicadorSatisfecho = indicadorSatisfecho;
    }
}
