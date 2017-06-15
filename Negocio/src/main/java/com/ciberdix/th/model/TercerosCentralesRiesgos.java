package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 13/06/2017.
 */
public class TercerosCentralesRiesgos {

    private Integer idTerceroCentralRiesgo;
    private Long idTercero;
    private Integer idCentralRiesgo;
    private Integer idAdjunto;
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

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

    public Boolean getIndicadorAprobado() {
        return indicadorAprobado;
    }

    public void setIndicadorAprobado(Boolean indicadorAprobado) {
        this.indicadorAprobado = indicadorAprobado;
    }
}
