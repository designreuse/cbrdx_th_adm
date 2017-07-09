package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class DocumentosTerceros {

    private Integer idDocumentoTercero;
    private Integer idClasificacionDocumento;
    private String nombre;
    private String codigoInstitucional;
    private String descripcion;
    private Boolean indicadorAdjunto;
    private Boolean indicadorDescarga;
    private Integer idAdjunto;
    private Boolean indicadorContratacion;
    private Integer vigencia;
    private Boolean indicadorAplica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdDocumentoTercero() {
        return idDocumentoTercero;
    }

    public void setIdDocumentoTercero(Integer idDocumentoTercero) {
        this.idDocumentoTercero = idDocumentoTercero;
    }

    public Integer getIdClasificacionDocumento() {
        return idClasificacionDocumento;
    }

    public void setIdClasificacionDocumento(Integer idClasificacionDocumento) {
        this.idClasificacionDocumento = idClasificacionDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoInstitucional() {
        return codigoInstitucional;
    }

    public void setCodigoInstitucional(String codigoInstitucional) {
        this.codigoInstitucional = codigoInstitucional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
    }

    public Boolean getIndicadorDescarga() {
        return indicadorDescarga;
    }

    public void setIndicadorDescarga(Boolean indicadorDescarga) {
        this.indicadorDescarga = indicadorDescarga;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    public Boolean getIndicadorContratacion() {
        return indicadorContratacion;
    }

    public void setIndicadorContratacion(Boolean indicadorContratacion) {
        this.indicadorContratacion = indicadorContratacion;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public Boolean getIndicadorAplica() {
        return indicadorAplica;
    }

    public void setIndicadorAplica(Boolean indicadorAplica) {
        this.indicadorAplica = indicadorAplica;
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
