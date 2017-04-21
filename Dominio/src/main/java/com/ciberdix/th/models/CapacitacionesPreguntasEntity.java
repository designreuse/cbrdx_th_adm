package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CapacitacionesPreguntas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class CapacitacionesPreguntasEntity {
    private Integer idCapacitacionPregunta;
    private Integer idCapacitacionGrupoPregunta;
    private String pregunta;
    private Integer idTipoPregunta;
    private Boolean indicadorObligatorio;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCapacitacionPregunta", nullable = false)
    public Integer getIdCapacitacionPregunta() {
        return idCapacitacionPregunta;
    }

    public void setIdCapacitacionPregunta(Integer idCapacitacionPregunta) {
        this.idCapacitacionPregunta = idCapacitacionPregunta;
    }

    @Basic
    @Column(name = "IdCapacitacionGrupoPregunta", nullable = true)
    public Integer getIdCapacitacionGrupoPregunta() {
        return idCapacitacionGrupoPregunta;
    }

    public void setIdCapacitacionGrupoPregunta(Integer idCapacitacionGrupoPregunta) {
        this.idCapacitacionGrupoPregunta = idCapacitacionGrupoPregunta;
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

        CapacitacionesPreguntasEntity that = (CapacitacionesPreguntasEntity) o;

        if (idCapacitacionPregunta != null ? !idCapacitacionPregunta.equals(that.idCapacitacionPregunta) : that.idCapacitacionPregunta != null)
            return false;
        if (idCapacitacionGrupoPregunta != null ? !idCapacitacionGrupoPregunta.equals(that.idCapacitacionGrupoPregunta) : that.idCapacitacionGrupoPregunta != null)
            return false;
        if (pregunta != null ? !pregunta.equals(that.pregunta) : that.pregunta != null) return false;
        if (idTipoPregunta != null ? !idTipoPregunta.equals(that.idTipoPregunta) : that.idTipoPregunta != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCapacitacionPregunta != null ? idCapacitacionPregunta.hashCode() : 0;
        result = 31 * result + (idCapacitacionGrupoPregunta != null ? idCapacitacionGrupoPregunta.hashCode() : 0);
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
        result = 31 * result + (idTipoPregunta != null ? idTipoPregunta.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
