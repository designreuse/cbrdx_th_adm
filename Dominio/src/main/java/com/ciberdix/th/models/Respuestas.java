package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "Respuestas", schema = "dbo", catalog = "CREZCAMOS")
public class Respuestas {
    private Integer idRespuesta;
    private Integer idPregunta;
    private String codigoRespuesta;
    private String respuesta;
    private Integer orden;
    private Boolean indicadorCorrecto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Respuestas() {
    }

    public Respuestas(Integer idPregunta, String codigoRespuesta, String respuesta, Integer orden, Boolean indicadorCorrecto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPregunta = idPregunta;
        this.codigoRespuesta = codigoRespuesta;
        this.respuesta = respuesta;
        this.orden = orden;
        this.indicadorCorrecto = indicadorCorrecto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Respuestas(Integer idRespuesta, Integer idPregunta, String codigoRespuesta, String respuesta, Integer orden, Boolean indicadorCorrecto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.codigoRespuesta = codigoRespuesta;
        this.respuesta = respuesta;
        this.orden = orden;
        this.indicadorCorrecto = indicadorCorrecto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRespuesta", nullable = false)
    public Integer getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Integer idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Basic
    @Column(name = "IdPregunta", nullable = true)
    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    @Basic
    @Column(name = "CodigoRespuesta", nullable = true, length = 50)
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    @Basic
    @Column(name = "Respuesta", nullable = true, length = 500)
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Basic
    @Column(name = "Orden", nullable = true)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "IndicadorCorrecto", nullable = true)
    public Boolean getIndicadorCorrecto() {
        return indicadorCorrecto;
    }

    public void setIndicadorCorrecto(Boolean indicadorCorrecto) {
        this.indicadorCorrecto = indicadorCorrecto;
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

        Respuestas that = (Respuestas) o;

        if (idRespuesta != null ? !idRespuesta.equals(that.idRespuesta) : that.idRespuesta != null) return false;
        if (idPregunta != null ? !idPregunta.equals(that.idPregunta) : that.idPregunta != null) return false;
        if (codigoRespuesta != null ? !codigoRespuesta.equals(that.codigoRespuesta) : that.codigoRespuesta != null)
            return false;
        if (respuesta != null ? !respuesta.equals(that.respuesta) : that.respuesta != null) return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
        if (indicadorCorrecto != null ? !indicadorCorrecto.equals(that.indicadorCorrecto) : that.indicadorCorrecto != null)
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
        int result = idRespuesta != null ? idRespuesta.hashCode() : 0;
        result = 31 * result + (idPregunta != null ? idPregunta.hashCode() : 0);
        result = 31 * result + (codigoRespuesta != null ? codigoRespuesta.hashCode() : 0);
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (indicadorCorrecto != null ? indicadorCorrecto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
