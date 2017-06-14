package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 13/06/2017.
 */
public class TercerosCentralesRiesgos {

    private Integer idTerceroCentralRiesgo;
    private Long idTercero;
    private Integer idCentralRiesgo;
    private String adjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorReportado;
    private Boolean indicadorAprobado;

    public Integer getIdTerceroCentralRiesgo() {
        return idTerceroCentralRiesgo;
    }

    public void setIdTerceroCentralRiesgo(Integer idTerceroCentralRiesgo) {
        this.idTerceroCentralRiesgo = idTerceroCentralRiesgo;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
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

    public Boolean getIndicadorReportado() {
        return indicadorReportado;
    }

    public void setIndicadorReportado(Boolean indicadorReportado) {
        this.indicadorReportado = indicadorReportado;
    }

    public Boolean getindicadorAprobado() {
        return indicadorAprobado;
    }

    public void setindicadorAprobado(Boolean indicadorAprobado) {
        this.indicadorAprobado = indicadorAprobado;
    }
}
