package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Danny on 8/06/2017.
 */
public class VProcesoSeleccion {

    private Integer idProcesoSeleccion;
    private String procesoPaso;
    private Integer idProcesoPaso;
    private String estadoDiligenciado;
    private Integer idEstadoDiligenciado;
    private String nombreResponsable;
    private Integer idResponsable;
    private String nombreTercero;
    private Integer idTerceroPublicacion;
    private String observacion;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp fechaCita;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String decisionProcesoSeleccion;
    private Integer idDesicionProcesoSeleccion;
    private String detalleCorreo;

    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    public String getProcesoPaso() {
        return procesoPaso;
    }

    public void setProcesoPaso(String procesoPaso) {
        this.procesoPaso = procesoPaso;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Timestamp getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Timestamp fechaCita) {
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

    public String getDecisionProcesoSeleccion() {
        return decisionProcesoSeleccion;
    }

    public void setDecisionProcesoSeleccion(String decisionProcesoSeleccion) {
        this.decisionProcesoSeleccion = decisionProcesoSeleccion;
    }

    public Integer getIdDesicionProcesoSeleccion() {
        return idDesicionProcesoSeleccion;
    }

    public void setIdDesicionProcesoSeleccion(Integer idDesicionProcesoSeleccion) {
        this.idDesicionProcesoSeleccion = idDesicionProcesoSeleccion;
    }

    public String getDetalleCorreo() {
        return detalleCorreo;
    }

    public void setDetalleCorreo(String detalleCorreo) {
        this.detalleCorreo = detalleCorreo;
    }
}
