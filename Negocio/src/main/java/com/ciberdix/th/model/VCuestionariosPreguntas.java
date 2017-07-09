package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 9/07/2017.
 */
public class VCuestionariosPreguntas {

    private Integer idCuestionarioPregunta;
    private String cuestionario;
    private Integer idCuestionario;
    private String codigoPregunta;
    private String pregunta;
    private String tipoPregunta;
    private Integer idTipoPregunta;
    private Boolean indicadorDepende;
    private String codigoDependePregunta;
    private String dependePregunta;
    private Integer idDependePregunta;
    private String codigoOpcionRespuesta;
    private String dependeRespuesta;
    private Integer idDependeRespuesta;
    private String secuencia;
    private Boolean indicadorFiltrante;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCuestionarioPregunta() {
        return idCuestionarioPregunta;
    }

    public void setIdCuestionarioPregunta(Integer idCuestionarioPregunta) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
    }

    public String getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(String cuestionario) {
        this.cuestionario = cuestionario;
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

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
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

    public String getCodigoDependePregunta() {
        return codigoDependePregunta;
    }

    public void setCodigoDependePregunta(String codigoDependePregunta) {
        this.codigoDependePregunta = codigoDependePregunta;
    }

    public String getDependePregunta() {
        return dependePregunta;
    }

    public void setDependePregunta(String dependePregunta) {
        this.dependePregunta = dependePregunta;
    }

    public Integer getIdDependePregunta() {
        return idDependePregunta;
    }

    public void setIdDependePregunta(Integer idDependePregunta) {
        this.idDependePregunta = idDependePregunta;
    }

    public String getCodigoOpcionRespuesta() {
        return codigoOpcionRespuesta;
    }

    public void setCodigoOpcionRespuesta(String codigoOpcionRespuesta) {
        this.codigoOpcionRespuesta = codigoOpcionRespuesta;
    }

    public String getDependeRespuesta() {
        return dependeRespuesta;
    }

    public void setDependeRespuesta(String dependeRespuesta) {
        this.dependeRespuesta = dependeRespuesta;
    }

    public Integer getIdDependeRespuesta() {
        return idDependeRespuesta;
    }

    public void setIdDependeRespuesta(Integer idDependeRespuesta) {
        this.idDependeRespuesta = idDependeRespuesta;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public Boolean getIndicadorFiltrante() {
        return indicadorFiltrante;
    }

    public void setIndicadorFiltrante(Boolean indicadorFiltrante) {
        this.indicadorFiltrante = indicadorFiltrante;
    }

    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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
