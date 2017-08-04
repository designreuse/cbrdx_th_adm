package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VTercerosTiposDocumentosTerceros {

    private Integer idTerceroTipoDocumentoTercero;
    private Integer idTerceroTipo;
    private String documentoTercero;
    private Integer idDocumentoTercero;
    private Boolean indicadorRequiere;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroTipoDocumentoTercero() {
        return idTerceroTipoDocumentoTercero;
    }

    public void setIdTerceroTipoDocumentoTercero(Integer idTerceroTipoDocumentoTercero) {
        this.idTerceroTipoDocumentoTercero = idTerceroTipoDocumentoTercero;
    }

    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    public String getDocumentoTercero() {
        return documentoTercero;
    }

    public void setDocumentoTercero(String documentoTercero) {
        this.documentoTercero = documentoTercero;
    }

    public Integer getIdDocumentoTercero() {
        return idDocumentoTercero;
    }

    public void setIdDocumentoTercero(Integer idDocumentoTercero) {
        this.idDocumentoTercero = idDocumentoTercero;
    }

    public Boolean getIndicadorRequiere() {
        return indicadorRequiere;
    }

    public void setIndicadorRequiere(Boolean indicadorRequiere) {
        this.indicadorRequiere = indicadorRequiere;
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
