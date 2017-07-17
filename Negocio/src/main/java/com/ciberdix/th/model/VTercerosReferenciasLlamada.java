package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class VTercerosReferenciasLlamada {

    private Integer idTerceroReferenciaLlamada;
    private String tipoReferencia;
    private String terceroReferencia;
    private String telefonoFijo;
    private String telefonoMovil;
    private String descripcionDivisonPolitica;
    private Integer idTerceroReferencia;
    private String resultadoLlamada;
    private Integer idResultadoLlamada;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer idMaestroRespuesta;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroReferenciaLlamada() {
        return idTerceroReferenciaLlamada;
    }

    public void setIdTerceroReferenciaLlamada(Integer idTerceroReferenciaLlamada) {
        this.idTerceroReferenciaLlamada = idTerceroReferenciaLlamada;
    }

    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    public String getTerceroReferencia() {
        return terceroReferencia;
    }

    public void setTerceroReferencia(String terceroReferencia) {
        this.terceroReferencia = terceroReferencia;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
    }

    public String getResultadoLlamada() {
        return resultadoLlamada;
    }

    public void setResultadoLlamada(String resultadoLlamada) {
        this.resultadoLlamada = resultadoLlamada;
    }

    public Integer getIdResultadoLlamada() {
        return idResultadoLlamada;
    }

    public void setIdResultadoLlamada(Integer idResultadoLlamada) {
        this.idResultadoLlamada = idResultadoLlamada;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
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

    public String getDescripcionDivisonPolitica() {
        return descripcionDivisonPolitica;
    }

    public void setDescripcionDivisonPolitica(String descripcionDivisonPolitica) {
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
    }
}
