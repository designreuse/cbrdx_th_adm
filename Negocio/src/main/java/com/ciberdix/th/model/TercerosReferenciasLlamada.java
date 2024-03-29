package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class TercerosReferenciasLlamada {

    private Integer idTerceroReferenciaLlamada;
    private Integer idTerceroReferencia;
    private Integer idResultadoLlamada;
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

    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
    }

    public Integer getIdResultadoLlamada() {
        return idResultadoLlamada;
    }

    public void setIdResultadoLlamada(Integer idResultadoLlamada) {
        this.idResultadoLlamada = idResultadoLlamada;
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
}
