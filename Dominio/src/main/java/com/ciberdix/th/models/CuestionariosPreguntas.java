package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 9/07/2017.
 */
@Entity
@Table(name = "CuestionariosPreguntas", schema = "dbo", catalog = "CREZCAMOS")
public class CuestionariosPreguntas {
    private Integer idCuestionarioPregunta;
    private Integer idCuestionario;
    private String codigoPregunta;
    private String pregunta;
    private Integer idTipoPregunta;
    private Boolean indicadorDepende;
    private Integer idDependePregunta;
    private Integer idDependeRespuesta;
    private String secuencia;
    private Boolean indicadorFiltrante;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CuestionariosPreguntas() {
    }

    public CuestionariosPreguntas(Integer idCuestionario, String codigoPregunta, String pregunta, Integer idTipoPregunta, Boolean indicadorDepende, Integer idDependePregunta, Integer idDependeRespuesta, String secuencia, Boolean indicadorFiltrante, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idCuestionario = idCuestionario;
        this.codigoPregunta = codigoPregunta;
        this.pregunta = pregunta;
        this.idTipoPregunta = idTipoPregunta;
        this.indicadorDepende = indicadorDepende;
        this.idDependePregunta = idDependePregunta;
        this.idDependeRespuesta = idDependeRespuesta;
        this.secuencia = secuencia;
        this.indicadorFiltrante = indicadorFiltrante;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CuestionariosPreguntas(Integer idCuestionarioPregunta, Integer idCuestionario, String codigoPregunta, String pregunta, Integer idTipoPregunta, Boolean indicadorDepende, Integer idDependePregunta, Integer idDependeRespuesta, String secuencia, Boolean indicadorFiltrante, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
        this.idCuestionario = idCuestionario;
        this.codigoPregunta = codigoPregunta;
        this.pregunta = pregunta;
        this.idTipoPregunta = idTipoPregunta;
        this.indicadorDepende = indicadorDepende;
        this.idDependePregunta = idDependePregunta;
        this.idDependeRespuesta = idDependeRespuesta;
        this.secuencia = secuencia;
        this.indicadorFiltrante = indicadorFiltrante;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCuestionarioPregunta", nullable = false)
    public Integer getIdCuestionarioPregunta() {
        return idCuestionarioPregunta;
    }

    public void setIdCuestionarioPregunta(Integer idCuestionarioPregunta) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
    }

    @Basic
    @Column(name = "IdCuestionario", nullable = true)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
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
    @Column(name = "Pregunta", nullable = true, length = 500)
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Basic
    @Column(name = "IdTipoPregunta", nullable = true)
    public Integer getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(Integer idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    @Basic
    @Column(name = "IndicadorDepende", nullable = true)
    public Boolean getIndicadorDepende() {
        return indicadorDepende;
    }

    public void setIndicadorDepende(Boolean indicadorDepende) {
        this.indicadorDepende = indicadorDepende;
    }

    @Basic
    @Column(name = "IdDependePregunta", nullable = true)
    public Integer getIdDependePregunta() {
        return idDependePregunta;
    }

    public void setIdDependePregunta(Integer idDependePregunta) {
        this.idDependePregunta = idDependePregunta;
    }

    @Basic
    @Column(name = "IdDependeRespuesta", nullable = true)
    public Integer getIdDependeRespuesta() {
        return idDependeRespuesta;
    }

    public void setIdDependeRespuesta(Integer idDependeRespuesta) {
        this.idDependeRespuesta = idDependeRespuesta;
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
    @Column(name = "IndicadorFiltrante", nullable = true)
    public Boolean getIndicadorFiltrante() {
        return indicadorFiltrante;
    }

    public void setIndicadorFiltrante(Boolean indicadorFiltrante) {
        this.indicadorFiltrante = indicadorFiltrante;
    }

    @Basic
    @Column(name = "IndicadorObligatorio", nullable = true)
    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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

        CuestionariosPreguntas that = (CuestionariosPreguntas) o;

        if (idCuestionarioPregunta != null ? !idCuestionarioPregunta.equals(that.idCuestionarioPregunta) : that.idCuestionarioPregunta != null)
            return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (codigoPregunta != null ? !codigoPregunta.equals(that.codigoPregunta) : that.codigoPregunta != null)
            return false;
        if (pregunta != null ? !pregunta.equals(that.pregunta) : that.pregunta != null) return false;
        if (idTipoPregunta != null ? !idTipoPregunta.equals(that.idTipoPregunta) : that.idTipoPregunta != null)
            return false;
        if (indicadorDepende != null ? !indicadorDepende.equals(that.indicadorDepende) : that.indicadorDepende != null)
            return false;
        if (idDependePregunta != null ? !idDependePregunta.equals(that.idDependePregunta) : that.idDependePregunta != null)
            return false;
        if (idDependeRespuesta != null ? !idDependeRespuesta.equals(that.idDependeRespuesta) : that.idDependeRespuesta != null)
            return false;
        if (secuencia != null ? !secuencia.equals(that.secuencia) : that.secuencia != null) return false;
        if (indicadorFiltrante != null ? !indicadorFiltrante.equals(that.indicadorFiltrante) : that.indicadorFiltrante != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idCuestionarioPregunta != null ? idCuestionarioPregunta.hashCode() : 0;
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (codigoPregunta != null ? codigoPregunta.hashCode() : 0);
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
        result = 31 * result + (idTipoPregunta != null ? idTipoPregunta.hashCode() : 0);
        result = 31 * result + (indicadorDepende != null ? indicadorDepende.hashCode() : 0);
        result = 31 * result + (idDependePregunta != null ? idDependePregunta.hashCode() : 0);
        result = 31 * result + (idDependeRespuesta != null ? idDependeRespuesta.hashCode() : 0);
        result = 31 * result + (secuencia != null ? secuencia.hashCode() : 0);
        result = 31 * result + (indicadorFiltrante != null ? indicadorFiltrante.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
