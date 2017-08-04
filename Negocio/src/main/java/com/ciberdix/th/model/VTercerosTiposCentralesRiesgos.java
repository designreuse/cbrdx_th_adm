package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VTercerosTiposCentralesRiesgos {

    private Integer idTerceroTipoCentralRiesgos;
    private String terceroTipo;
    private Integer idTerceroTipo;
    private String centralRiesgo;
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

    public String getTerceroTipo() {
        return terceroTipo;
    }

    public void setTerceroTipo(String terceroTipo) {
        this.terceroTipo = terceroTipo;
    }

    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    public String getCentralRiesgo() {
        return centralRiesgo;
    }

    public void setCentralRiesgo(String centralRiesgo) {
        this.centralRiesgo = centralRiesgo;
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
