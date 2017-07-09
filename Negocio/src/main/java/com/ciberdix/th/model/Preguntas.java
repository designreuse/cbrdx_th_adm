package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class Preguntas {

    private Integer idPregunta;
    private Integer idCuestionario;
    private String codigoPregunta;
    private String pregunta;
    private Integer idTipoPregunta;
    private Boolean indicadorDepende;
    private Integer idDependePregunta;
    private Integer idDependeRespuesta;
    private Integer secuencia;
    private Boolean indicadorHabilitado;
    private Boolean indicadorObligatorio;
    private Boolean indicadorFiltrante;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    public String getCodigoPregunta() {
        return codigoPregunta;
    }

    public void setCodigoPregunta(String codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(Integer idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    public Boolean getIndicadorDepende() {
        return indicadorDepende;
    }

    public void setIndicadorDepende(Boolean indicadorDepende) {
        this.indicadorDepende = indicadorDepende;
    }

    public Integer getIdDependePregunta() {
        return idDependePregunta;
    }

    public void setIdDependePregunta(Integer idDependePregunta) {
        this.idDependePregunta = idDependePregunta;
    }

    public Integer getIdDependeRespuesta() {
        return idDependeRespuesta;
    }

    public void setIdDependeRespuesta(Integer idDependeRespuesta) {
        this.idDependeRespuesta = idDependeRespuesta;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
    }

    public Boolean getIndicadorFiltrante() {
        return indicadorFiltrante;
    }

    public void setIndicadorFiltrante(Boolean indicadorFiltrante) {
        this.indicadorFiltrante = indicadorFiltrante;
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
