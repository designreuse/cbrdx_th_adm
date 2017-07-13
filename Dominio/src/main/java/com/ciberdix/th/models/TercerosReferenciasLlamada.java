package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 13/07/2017.
 */
@Entity
@Table(name = "TercerosReferenciasLlamada", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosReferenciasLlamada {
    private Integer idTerceroReferenciaLlamada;
    private Integer idTerceroReferencia;
    private Integer idResultadoLlamada;
    private Integer idAdjunto;
    private Integer idMaestroRespuesta;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosReferenciasLlamada() {
    }

    public TercerosReferenciasLlamada(Integer idTerceroReferencia, Integer idResultadoLlamada, Integer idAdjunto, Integer idMaestroRespuesta, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroReferencia = idTerceroReferencia;
        this.idResultadoLlamada = idResultadoLlamada;
        this.idAdjunto = idAdjunto;
        this.idMaestroRespuesta = idMaestroRespuesta;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosReferenciasLlamada(Integer idTerceroReferenciaLlamada, Integer idTerceroReferencia, Integer idResultadoLlamada, Integer idAdjunto, Integer idMaestroRespuesta, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroReferenciaLlamada = idTerceroReferenciaLlamada;
        this.idTerceroReferencia = idTerceroReferencia;
        this.idResultadoLlamada = idResultadoLlamada;
        this.idAdjunto = idAdjunto;
        this.idMaestroRespuesta = idMaestroRespuesta;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroReferenciaLlamada", nullable = false)
    public Integer getIdTerceroReferenciaLlamada() {
        return idTerceroReferenciaLlamada;
    }

    public void setIdTerceroReferenciaLlamada(Integer idTerceroReferenciaLlamada) {
        this.idTerceroReferenciaLlamada = idTerceroReferenciaLlamada;
    }

    @Basic
    @Column(name = "IdTerceroReferencia", nullable = true)
    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
    }

    @Basic
    @Column(name = "IdResultadoLlamada", nullable = true)
    public Integer getIdResultadoLlamada() {
        return idResultadoLlamada;
    }

    public void setIdResultadoLlamada(Integer idResultadoLlamada) {
        this.idResultadoLlamada = idResultadoLlamada;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IdMaestroRespuesta", nullable = true)
    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosReferenciasLlamada that = (TercerosReferenciasLlamada) o;

        if (idTerceroReferenciaLlamada != null ? !idTerceroReferenciaLlamada.equals(that.idTerceroReferenciaLlamada) : that.idTerceroReferenciaLlamada != null)
            return false;
        if (idTerceroReferencia != null ? !idTerceroReferencia.equals(that.idTerceroReferencia) : that.idTerceroReferencia != null)
            return false;
        if (idResultadoLlamada != null ? !idResultadoLlamada.equals(that.idResultadoLlamada) : that.idResultadoLlamada != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroReferenciaLlamada != null ? idTerceroReferenciaLlamada.hashCode() : 0;
        result = 31 * result + (idTerceroReferencia != null ? idTerceroReferencia.hashCode() : 0);
        result = 31 * result + (idResultadoLlamada != null ? idResultadoLlamada.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
