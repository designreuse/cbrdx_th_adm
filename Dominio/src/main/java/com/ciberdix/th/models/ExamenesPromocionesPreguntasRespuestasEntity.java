package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "ExamenesPromocionesPreguntasRespuestas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ExamenesPromocionesPreguntasRespuestasEntity {
    private Integer idExamenPromocionPreguntaRespuesta;
    private Integer idExamenPromocionPregunta;
    private String respuesta;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdExamenPromocionPreguntaRespuesta", nullable = false)
    public Integer getIdExamenPromocionPreguntaRespuesta() {
        return idExamenPromocionPreguntaRespuesta;
    }

    public void setIdExamenPromocionPreguntaRespuesta(Integer idExamenPromocionPreguntaRespuesta) {
        this.idExamenPromocionPreguntaRespuesta = idExamenPromocionPreguntaRespuesta;
    }

    @Basic
    @Column(name = "IdExamenPromocionPregunta", nullable = false)
    public Integer getIdExamenPromocionPregunta() {
        return idExamenPromocionPregunta;
    }

    public void setIdExamenPromocionPregunta(Integer idExamenPromocionPregunta) {
        this.idExamenPromocionPregunta = idExamenPromocionPregunta;
    }

    @Basic
    @Column(name = "Respuesta", nullable = true, length = 100)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamenesPromocionesPreguntasRespuestasEntity that = (ExamenesPromocionesPreguntasRespuestasEntity) o;

        if (idExamenPromocionPreguntaRespuesta != null ? !idExamenPromocionPreguntaRespuesta.equals(that.idExamenPromocionPreguntaRespuesta) : that.idExamenPromocionPreguntaRespuesta != null)
            return false;
        if (idExamenPromocionPregunta != null ? !idExamenPromocionPregunta.equals(that.idExamenPromocionPregunta) : that.idExamenPromocionPregunta != null)
            return false;
        if (respuesta != null ? !respuesta.equals(that.respuesta) : that.respuesta != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idExamenPromocionPreguntaRespuesta != null ? idExamenPromocionPreguntaRespuesta.hashCode() : 0;
        result = 31 * result + (idExamenPromocionPregunta != null ? idExamenPromocionPregunta.hashCode() : 0);
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
