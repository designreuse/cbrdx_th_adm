package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosTiposCentralesRiesgos {

    private Integer idTerceroTipoCentralRiesgos;
    private Integer idTerceroTipo;
    private Integer idCentralRiesgo;
    private Boolean indicadorRequiere;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroTipoCentralRiesgos() {
        return idTerceroTipoCentralRiesgos;
    }

    public void setIdTerceroTipoCentralRiesgos(Integer idTerceroTipoCentralRiesgos) {
        this.idTerceroTipoCentralRiesgos = idTerceroTipoCentralRiesgos;
    }

    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
    }

    public Boolean getIndicadorRequiere() {
        return indicadorRequiere;
    }

    public void setIndicadorRequiere(Boolean indicadorRequiere) {
        this.indicadorRequiere = indicadorRequiere;
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
