package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 9/07/2017.
 */
@Entity
@Table(name = "Respuestas", schema = "dbo", catalog = "CREZCAMOS")
public class Respuestas {
    private Integer idRespuesta;
    private Integer idCuestionarioPregunta;
    private Integer idPreguntaOpcion;
    private String respuesta;
    private Integer orden;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Respuestas() {
    }

    public Respuestas(Integer idCuestionarioPregunta, Integer idPreguntaOpcion, String respuesta, Integer orden, Integer auditoriaUsuario) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
        this.idPreguntaOpcion = idPreguntaOpcion;
        this.respuesta = respuesta;
        this.orden = orden;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Respuestas(Integer idRespuesta, Integer idCuestionarioPregunta, Integer idPreguntaOpcion, String respuesta, Integer orden, Integer auditoriaUsuario) {
        this.idRespuesta = idRespuesta;
        this.idCuestionarioPregunta = idCuestionarioPregunta;
        this.idPreguntaOpcion = idPreguntaOpcion;
        this.respuesta = respuesta;
        this.orden = orden;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
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
    @Column(name = "IdCuestionarioPregunta", nullable = true)
    public Integer getIdCuestionarioPregunta() {
        return idCuestionarioPregunta;
    }

    public void setIdCuestionarioPregunta(Integer idCuestionarioPregunta) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
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
    @Column(name = "Orden", nullable = true)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
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
        if (idCuestionarioPregunta != null ? !idCuestionarioPregunta.equals(that.idCuestionarioPregunta) : that.idCuestionarioPregunta != null)
            return false;
        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (respuesta != null ? !respuesta.equals(that.respuesta) : that.respuesta != null) return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRespuesta != null ? idRespuesta.hashCode() : 0;
        result = 31 * result + (idCuestionarioPregunta != null ? idCuestionarioPregunta.hashCode() : 0);
        result = 31 * result + (idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0);
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
