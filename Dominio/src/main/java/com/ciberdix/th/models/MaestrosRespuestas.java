package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 10/07/2017.
 */
@Entity
@Table(name = "MaestrosRespuestas", schema = "dbo", catalog = "CREZCAMOS")
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

    public MaestrosRespuestas() {
    }

    public MaestrosRespuestas(Integer idUsuario, Integer idCuestionario, Integer idPreguntaEnCurso, Boolean indicadorFinalizado, Boolean indicadorAprobado, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idUsuario = idUsuario;
        this.idCuestionario = idCuestionario;
        this.idPreguntaEnCurso = idPreguntaEnCurso;
        this.indicadorFinalizado = indicadorFinalizado;
        this.indicadorAprobado = indicadorAprobado;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public MaestrosRespuestas(Integer idMaestroRespuesta, Integer idUsuario, Integer idCuestionario, Integer idPreguntaEnCurso, Boolean indicadorFinalizado, Boolean indicadorAprobado, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idMaestroRespuesta = idMaestroRespuesta;
        this.idUsuario = idUsuario;
        this.idCuestionario = idCuestionario;
        this.idPreguntaEnCurso = idPreguntaEnCurso;
        this.indicadorFinalizado = indicadorFinalizado;
        this.indicadorAprobado = indicadorAprobado;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdMaestroRespuesta", nullable = false)
    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    @Basic
    @Column(name = "IdUsuario", nullable = true)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
    @Column(name = "IdPreguntaEnCurso", nullable = true)
    public Integer getIdPreguntaEnCurso() {
        return idPreguntaEnCurso;
    }

    public void setIdPreguntaEnCurso(Integer idPreguntaEnCurso) {
        this.idPreguntaEnCurso = idPreguntaEnCurso;
    }

    @Basic
    @Column(name = "IndicadorFinalizado", nullable = true)
    public Boolean getIndicadorFinalizado() {
        return indicadorFinalizado;
    }

    public void setIndicadorFinalizado(Boolean indicadorFinalizado) {
        this.indicadorFinalizado = indicadorFinalizado;
    }

    @Basic
    @Column(name = "IndicadorAprobado", nullable = true)
    public Boolean getIndicadorAprobado() {
        return indicadorAprobado;
    }

    public void setIndicadorAprobado(Boolean indicadorAprobado) {
        this.indicadorAprobado = indicadorAprobado;
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

        MaestrosRespuestas that = (MaestrosRespuestas) o;

        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (idPreguntaEnCurso != null ? !idPreguntaEnCurso.equals(that.idPreguntaEnCurso) : that.idPreguntaEnCurso != null)
            return false;
        if (indicadorFinalizado != null ? !indicadorFinalizado.equals(that.indicadorFinalizado) : that.indicadorFinalizado != null)
            return false;
        if (indicadorAprobado != null ? !indicadorAprobado.equals(that.indicadorAprobado) : that.indicadorAprobado != null)
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
        int result = idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (idPreguntaEnCurso != null ? idPreguntaEnCurso.hashCode() : 0);
        result = 31 * result + (indicadorFinalizado != null ? indicadorFinalizado.hashCode() : 0);
        result = 31 * result + (indicadorAprobado != null ? indicadorAprobado.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
