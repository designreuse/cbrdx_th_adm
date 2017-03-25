package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasTiposReferencias {
    private Integer idListaTipoReferencia;
    private String codigoListaTipoReferencia;
    private String nombreListaTipoReferencia;
    private Integer ordenListaTipoReferencia;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaTipoReferencia() {
        return idListaTipoReferencia;
    }

    public void setIdListaTipoReferencia(Integer idListaTipoReferencia) {
        this.idListaTipoReferencia = idListaTipoReferencia;
    }

    public String getCodigoListaTipoReferencia() {
        return codigoListaTipoReferencia;
    }

    public void setCodigoListaTipoReferencia(String codigoListaTipoReferencia) {
        this.codigoListaTipoReferencia = codigoListaTipoReferencia;
    }

    public String getNombreListaTipoReferencia() {
        return nombreListaTipoReferencia;
    }

    public void setNombreListaTipoReferencia(String nombreListaTipoReferencia) {
        this.nombreListaTipoReferencia = nombreListaTipoReferencia;
    }

    public Integer getOrdenListaTipoReferencia() {
        return ordenListaTipoReferencia;
    }

    public void setOrdenListaTipoReferencia(Integer ordenListaTipoReferencia) {
        this.ordenListaTipoReferencia = ordenListaTipoReferencia;
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
