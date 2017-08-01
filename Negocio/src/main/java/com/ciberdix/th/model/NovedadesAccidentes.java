package com.ciberdix.th.model;

import java.sql.Timestamp;

public class NovedadesAccidentes {

    private Integer idNovedadAccidente;
    private Integer idTerceroNovedad;
    private Integer idEstadoAccidente;
    private Boolean indicadorActividades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdNovedadAccidente() {
        return idNovedadAccidente;
    }

    public void setIdNovedadAccidente(Integer idNovedadAccidente) {
        this.idNovedadAccidente = idNovedadAccidente;
    }

    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    public Integer getIdEstadoAccidente() {
        return idEstadoAccidente;
    }

    public void setIdEstadoAccidente(Integer idEstadoAccidente) {
        this.idEstadoAccidente = idEstadoAccidente;
    }

    public Boolean getIndicadorActividades() {
        return indicadorActividades;
    }

    public void setIndicadorActividades(Boolean indicadorActividades) {
        this.indicadorActividades = indicadorActividades;
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
