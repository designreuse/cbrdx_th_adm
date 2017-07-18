package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VNovedadesCampos {

    private Integer idNovedadCampo;
    private String novedad;
    private Integer idNovedad;
    private String campoNovedad;
    private Integer idCampoNovedad;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdNovedadCampo() {
        return idNovedadCampo;
    }

    public void setIdNovedadCampo(Integer idNovedadCampo) {
        this.idNovedadCampo = idNovedadCampo;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getCampoNovedad() {
        return campoNovedad;
    }

    public void setCampoNovedad(String campoNovedad) {
        this.campoNovedad = campoNovedad;
    }

    public Integer getIdCampoNovedad() {
        return idCampoNovedad;
    }

    public void setIdCampoNovedad(Integer idCampoNovedad) {
        this.idCampoNovedad = idCampoNovedad;
    }

    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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
