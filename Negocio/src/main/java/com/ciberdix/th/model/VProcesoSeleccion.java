package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Danny on 8/06/2017.
 */
public class VProcesoSeleccion {

    private Integer idProcesoSeleccion;
    private Integer idProcesoPaso;
    private String estadoDiligenciado;
    private Integer idEstadoDiligenciado;
    private String nombreResponsable;
    private Integer idResponsable;
    private String nombreTercero;
    private Integer idTerceroPublicacion;
    private Boolean indicadorContProceso;
    private String observacion;
    private Date fechaCita;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorNoAplica;

    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    public String getEstadoDiligenciado() {
        return estadoDiligenciado;
    }

    public void setEstadoDiligenciado(String estadoDiligenciado) {
        this.estadoDiligenciado = estadoDiligenciado;
    }

    public Integer getIdEstadoDiligenciado() {
        return idEstadoDiligenciado;
    }

    public void setIdEstadoDiligenciado(Integer idEstadoDiligenciado) {
        this.idEstadoDiligenciado = idEstadoDiligenciado;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public Integer getIdTerceroPublicacion() {
        return idTerceroPublicacion;
    }

    public void setIdTerceroPublicacion(Integer idTerceroPublicacion) {
        this.idTerceroPublicacion = idTerceroPublicacion;
    }

    public Boolean getIndicadorContProceso() {
        return indicadorContProceso;
    }

    public void setIndicadorContProceso(Boolean indicadorContProceso) {
        this.indicadorContProceso = indicadorContProceso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
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

    public Boolean getIndicadorNoAplica() {
        return indicadorNoAplica;
    }

    public void setIndicadorNoAplica(Boolean indicadorNoAplica) {
        this.indicadorNoAplica = indicadorNoAplica;
    }
}
