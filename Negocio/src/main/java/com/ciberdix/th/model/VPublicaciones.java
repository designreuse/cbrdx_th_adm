package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 2/06/2017.
 */
public class VPublicaciones {

    private Integer idPublicacion;
    private Integer idRequerimiento;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorSalario;
    private Boolean indicadorBonificacion;
    private String nivelEducacion;
    private Integer idNivelEducacion;
    private String tipoTrabajo;
    private Integer idTipoTrabajo;
    private String descripcionGeneral;
    private String lugarTrabajo;
    private String competenciasLaborales;
    private Boolean indicadorObservacion;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;
    private Boolean indicadorPublicacion;
    private String formaReclutamiento;
    private Integer idFormaReclutamiento;

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
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

    public Boolean getIndicadorSalario() {
        return indicadorSalario;
    }

    public void setIndicadorSalario(Boolean indicadorSalario) {
        this.indicadorSalario = indicadorSalario;
    }

    public Boolean getIndicadorBonificacion() {
        return indicadorBonificacion;
    }

    public void setIndicadorBonificacion(Boolean indicadorBonificacion) {
        this.indicadorBonificacion = indicadorBonificacion;
    }

    public String getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public Integer getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(Integer idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getCompetenciasLaborales() {
        return competenciasLaborales;
    }

    public void setCompetenciasLaborales(String competenciasLaborales) {
        this.competenciasLaborales = competenciasLaborales;
    }

    public Boolean getIndicadorObservacion() {
        return indicadorObservacion;
    }

    public void setIndicadorObservacion(Boolean indicadorObservacion) {
        this.indicadorObservacion = indicadorObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Boolean getIndicadorPublicacion() {
        return indicadorPublicacion;
    }

    public void setIndicadorPublicacion(Boolean indicadorPublicacion) {
        this.indicadorPublicacion = indicadorPublicacion;
    }

    public String getFormaReclutamiento() {
        return formaReclutamiento;
    }

    public void setFormaReclutamiento(String formaReclutamiento) {
        this.formaReclutamiento = formaReclutamiento;
    }

    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
    }
}
