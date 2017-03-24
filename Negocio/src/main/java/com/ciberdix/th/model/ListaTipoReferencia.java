package com.ciberdix.th.model;

import java.sql.Timestamp;

public class ListaTipoReferencia {
    private int idListaTipoReferencias;
    private String codigoListaTipoReferencias;
    private String nombreListaTipoReferencias;
    private int ordenListaTipoReferencias;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public int getIdListaTipoReferencias() {
        return idListaTipoReferencias;
    }

    public void setIdListaTipoReferencias(int idListaTipoReferencias) {
        this.idListaTipoReferencias = idListaTipoReferencias;
    }

    public String getCodigoListaTipoReferencias() {
        return codigoListaTipoReferencias;
    }

    public void setCodigoListaTipoReferencias(String codigoListaTipoReferencias) {
        this.codigoListaTipoReferencias = codigoListaTipoReferencias;
    }

    public String getNombreListaTipoReferencias() {
        return nombreListaTipoReferencias;
    }

    public void setNombreListaTipoReferencias(String nombreListaTipoReferencias) {
        this.nombreListaTipoReferencias = nombreListaTipoReferencias;
    }

    public int getOrdenListaTipoReferencias() {
        return ordenListaTipoReferencias;
    }

    public void setOrdenListaTipoReferencias(int ordenListaTipoReferencias) {
        this.ordenListaTipoReferencias = ordenListaTipoReferencias;
    }

    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
