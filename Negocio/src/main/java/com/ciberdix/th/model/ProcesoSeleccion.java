package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/06/2017.
 */
public class ProcesoSeleccion {

    private Integer idProcesoSeleccion;
    private Integer idProcesoPaso;
    private Integer idEstadoDiligenciado;
    private Integer idResponsable;
    private Long idTercero;
    private Integer idPublicacion;
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

    public Integer getIdEstadoDiligenciado() {
        return idEstadoDiligenciado;
    }

    public void setIdEstadoDiligenciado(Integer idEstadoDiligenciado) {
        this.idEstadoDiligenciado = idEstadoDiligenciado;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
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
