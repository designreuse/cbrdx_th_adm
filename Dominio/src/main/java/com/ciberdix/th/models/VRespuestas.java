package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 11/07/2017.
 */
@Entity
@Table(name = "V_Respuestas", schema = "dbo", catalog = "CREZCAMOS")
public class VRespuestas {
    private Integer idRespuesta;
    private String codigoPregunta;
    private String pregunta;
    private String tipoPregunta;
    private String secuencia;
    private Integer idCuestionarioPregunta;
    private String codigoOpcion;
    private String opcion;
    private Integer orden;
    private Integer idPreguntaOpcion;
    private String respuesta;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idMaestroRespuesta;

    @Id
    @Column(name = "IdRespuesta", nullable = false)
    public Integer getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Integer idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Basic
    @Column(name = "CodigoPregunta", nullable = true, length = 50)
    public String getCodigoPregunta() {
        return codigoPregunta;
    }

    public void setCodigoPregunta(String codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    @Basic
    @Column(name = "Pregunta", nullable = true, length = 100)
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Basic
    @Column(name = "TipoPregunta", nullable = true, length = 100)
    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    @Basic
    @Column(name = "Secuencia", nullable = true, length = 10)
    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    @Basic
    @Column(name = "IdCuestionarioPregunta", nullable = true)
    public Integer getIdCuestionarioPregunta() {
        return idCuestionarioPregunta;
    }

    public void setIdCuestionarioPregunta(Integer idCuestionarioPregunta) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
    }

    @Basic
    @Column(name = "CodigoOpcion", nullable = true, length = 50)
    public String getCodigoOpcion() {
        return codigoOpcion;
    }

    public void setCodigoOpcion(String codigoOpcion) {
        this.codigoOpcion = codigoOpcion;
    }

    @Basic
    @Column(name = "Opcion", nullable = true, length = 200)
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
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
    @Column(name = "IdPreguntaOpcion", nullable = true)
    public Integer getIdPreguntaOpcion() {
        return idPreguntaOpcion;
    }

    public void setIdPreguntaOpcion(Integer idPreguntaOpcion) {
        this.idPreguntaOpcion = idPreguntaOpcion;
    }

    @Basic
    @Column(name = "Respuesta", nullable = true, length = 200)
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
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

    @Basic
    @Column(name = "IdMaestroRespuesta", nullable = true)
    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VRespuestas that = (VRespuestas) o;

        if (idRespuesta != null ? !idRespuesta.equals(that.idRespuesta) : that.idRespuesta != null) return false;
        if (codigoPregunta != null ? !codigoPregunta.equals(that.codigoPregunta) : that.codigoPregunta != null)
            return false;
        if (pregunta != null ? !pregunta.equals(that.pregunta) : that.pregunta != null) return false;
        if (tipoPregunta != null ? !tipoPregunta.equals(that.tipoPregunta) : that.tipoPregunta != null) return false;
        if (secuencia != null ? !secuencia.equals(that.secuencia) : that.secuencia != null) return false;
        if (idCuestionarioPregunta != null ? !idCuestionarioPregunta.equals(that.idCuestionarioPregunta) : that.idCuestionarioPregunta != null)
            return false;
        if (codigoOpcion != null ? !codigoOpcion.equals(that.codigoOpcion) : that.codigoOpcion != null) return false;
        if (opcion != null ? !opcion.equals(that.opcion) : that.opcion != null) return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (respuesta != null ? !respuesta.equals(that.respuesta) : that.respuesta != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRespuesta != null ? idRespuesta.hashCode() : 0;
        result = 31 * result + (codigoPregunta != null ? codigoPregunta.hashCode() : 0);
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
        result = 31 * result + (tipoPregunta != null ? tipoPregunta.hashCode() : 0);
        result = 31 * result + (secuencia != null ? secuencia.hashCode() : 0);
        result = 31 * result + (idCuestionarioPregunta != null ? idCuestionarioPregunta.hashCode() : 0);
        result = 31 * result + (codigoOpcion != null ? codigoOpcion.hashCode() : 0);
        result = 31 * result + (opcion != null ? opcion.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0);
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0);
        return result;
    }
}
