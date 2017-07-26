package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosDotacionesAdicionales {

    private Integer idTerceroDotacionAdicional;
    private Long idTercero;
    private Integer idDotacion;
    private Integer cantidadDotacion;
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

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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
}
