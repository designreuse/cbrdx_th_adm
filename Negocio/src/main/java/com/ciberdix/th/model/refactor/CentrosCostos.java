package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 18/04/17.
 */
public class CentrosCostos {
    private Integer idCentroCostos;
    private String centroCostos;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigoCentroCostos;

    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
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

    public String getCodigoCentroCostos() {
        return codigoCentroCostos;
    }

    public void setCodigoCentroCostos(String codigoCentroCostos) {
        this.codigoCentroCostos = codigoCentroCostos;
    }
}
