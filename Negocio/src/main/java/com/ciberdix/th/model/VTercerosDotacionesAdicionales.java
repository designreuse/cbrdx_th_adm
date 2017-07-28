package com.ciberdix.th.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class VTercerosDotacionesAdicionales {

    private Integer idTerceroDotacionAdicional;
    private String nombreTercero;
    private Long idTercero;
    private String dotacion;
    private BigDecimal costo;
    private Integer idDotacion;
    private Integer cantidadDotacion;
    private String nombreProyeccion;
    private String talla;
    private Integer idTalla;
    private Integer idProyeccionDotacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroDotacionAdicional() {
        return idTerceroDotacionAdicional;
    }

    public void setIdTerceroDotacionAdicional(Integer idTerceroDotacionAdicional) {
        this.idTerceroDotacionAdicional = idTerceroDotacionAdicional;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getDotacion() {
        return dotacion;
    }

    public void setDotacion(String dotacion) {
        this.dotacion = dotacion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    public Integer getCantidadDotacion() {
        return cantidadDotacion;
    }

    public void setCantidadDotacion(Integer cantidadDotacion) {
        this.cantidadDotacion = cantidadDotacion;
    }

    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
    }

    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
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
}
