package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasParentescos {
    private Integer idListaParentesco;
    private String codigoListaParentesco;
    private String nombreListaParentesco;
    private Integer ordenListaParentesco;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaParentesco() {
        return idListaParentesco;
    }

    public void setIdListaParentesco(Integer idListaParentesco) {
        this.idListaParentesco = idListaParentesco;
    }

    public String getCodigoListaParentesco() {
        return codigoListaParentesco;
    }

    public void setCodigoListaParentesco(String codigoListaParentesco) {
        this.codigoListaParentesco = codigoListaParentesco;
    }

    public String getNombreListaParentesco() {
        return nombreListaParentesco;
    }

    public void setNombreListaParentesco(String nombreListaParentesco) {
        this.nombreListaParentesco = nombreListaParentesco;
    }

    public Integer getOrdenListaParentesco() {
        return ordenListaParentesco;
    }

    public void setOrdenListaParentesco(Integer ordenListaParentesco) {
        this.ordenListaParentesco = ordenListaParentesco;
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
