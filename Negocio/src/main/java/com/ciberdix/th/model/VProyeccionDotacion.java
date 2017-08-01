package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Date;

public class VProyeccionDotacion {

    private Integer idProyeccionDotacion;
    private String nombreProyeccion;
    private String grupoDotacion;
    private Integer idGrupoDotacion;
    private Boolean indicadorAdicional;
    private Boolean indicadorNoAreas;
    private Integer cantidadProyeccion;
    private Integer cantidadMeses;
    private String periodo;
    private Boolean indicadorHabilitado;
    private String nombreTercero;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Date fechaSolicitud;
    private String estado;

    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
    }

    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
    }

    public String getGrupoDotacion() {
        return grupoDotacion;
    }

    public void setGrupoDotacion(String grupoDotacion) {
        this.grupoDotacion = grupoDotacion;
    }

    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
    }

    public Boolean getIndicadorAdicional() {
        return indicadorAdicional;
    }

    public void setIndicadorAdicional(Boolean indicadorAdicional) {
        this.indicadorAdicional = indicadorAdicional;
    }

    public Boolean getIndicadorNoAreas() {
        return indicadorNoAreas;
    }

    public void setIndicadorNoAreas(Boolean indicadorNoAreas) {
        this.indicadorNoAreas = indicadorNoAreas;
    }

    public Integer getCantidadProyeccion() {
        return cantidadProyeccion;
    }

    public void setCantidadProyeccion(Integer cantidadProyeccion) {
        this.cantidadProyeccion = cantidadProyeccion;
    }

    public Integer getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(Integer cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
