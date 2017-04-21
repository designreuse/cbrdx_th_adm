package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "ExamenesPromocionesPreguntas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ExamenesPromocionesPreguntasEntity {
    private Integer idExamenPromocionPregunta;
    private Integer idExamenPromocion;
    private String pregunta;
    private Integer idTipoPregunta;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdExamenPromocionPregunta", nullable = false)
    public Integer getIdExamenPromocionPregunta() {
        return idExamenPromocionPregunta;
    }

    public void setIdExamenPromocionPregunta(Integer idExamenPromocionPregunta) {
        this.idExamenPromocionPregunta = idExamenPromocionPregunta;
    }

    @Basic
    @Column(name = "IdExamenPromocion", nullable = true)
    public Integer getIdExamenPromocion() {
        return idExamenPromocion;
    }

    public void setIdExamenPromocion(Integer idExamenPromocion) {
        this.idExamenPromocion = idExamenPromocion;
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
    @Column(name = "IdTipoPregunta", nullable = true)
    public Integer getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(Integer idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
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

        ExamenesPromocionesPreguntasEntity that = (ExamenesPromocionesPreguntasEntity) o;

        if (idExamenPromocionPregunta != null ? !idExamenPromocionPregunta.equals(that.idExamenPromocionPregunta) : that.idExamenPromocionPregunta != null)
            return false;
        if (idExamenPromocion != null ? !idExamenPromocion.equals(that.idExamenPromocion) : that.idExamenPromocion != null)
            return false;
        if (pregunta != null ? !pregunta.equals(that.pregunta) : that.pregunta != null) return false;
        if (idTipoPregunta != null ? !idTipoPregunta.equals(that.idTipoPregunta) : that.idTipoPregunta != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
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
        int result = idExamenPromocionPregunta != null ? idExamenPromocionPregunta.hashCode() : 0;
        result = 31 * result + (idExamenPromocion != null ? idExamenPromocion.hashCode() : 0);
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
        result = 31 * result + (idTipoPregunta != null ? idTipoPregunta.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
