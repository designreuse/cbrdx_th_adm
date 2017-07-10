package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 10/07/2017.
 */
public class MaestrosRespuestas {

    private Integer idMaestroRespuesta;
    private Integer idUsuario;
    private Integer idCuestionario;
    private Integer idPreguntaEnCurso;
    private Boolean indicadorFinalizado;
    private Boolean indicadorAprobado;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    public Integer getIdPreguntaEnCurso() {
        return idPreguntaEnCurso;
    }

    public void setIdPreguntaEnCurso(Integer idPreguntaEnCurso) {
        this.idPreguntaEnCurso = idPreguntaEnCurso;
    }

    public Boolean getIndicadorFinalizado() {
        return indicadorFinalizado;
    }

    public void setIndicadorFinalizado(Boolean indicadorFinalizado) {
        this.indicadorFinalizado = indicadorFinalizado;
    }

    public Boolean getIndicadorAprobado() {
        return indicadorAprobado;
    }

    public void setIndicadorAprobado(Boolean indicadorAprobado) {
        this.indicadorAprobado = indicadorAprobado;
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
