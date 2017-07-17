package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class VTercerosDocumentosTercero {

    private Integer idTerceroDocumentoTercero;
    private Long idTercero;
    private String nombreDocumentoTercero;
    private String descripcion;
    private Integer idDocumentoTercero;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroDocumentoTercero() {
        return idTerceroDocumentoTercero;
    }

    public void setIdTerceroDocumentoTercero(Integer idTerceroDocumentoTercero) {
        this.idTerceroDocumentoTercero = idTerceroDocumentoTercero;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getNombreDocumentoTercero() {
        return nombreDocumentoTercero;
    }

    public void setNombreDocumentoTercero(String nombreDocumentoTercero) {
        this.nombreDocumentoTercero = nombreDocumentoTercero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdDocumentoTercero() {
        return idDocumentoTercero;
    }

    public void setIdDocumentoTercero(Integer idDocumentoTercero) {
        this.idDocumentoTercero = idDocumentoTercero;
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
}
