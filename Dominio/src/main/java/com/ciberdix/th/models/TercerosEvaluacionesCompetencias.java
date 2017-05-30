package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosEvaluacionesCompetencias {
    private Integer idTerceroEvaluacionCompetencia;
    private Integer idTerceroEvaluacion;
    private Integer idCargoCompetencia;
    private Integer idCalificacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroEvaluacionCompetencia", nullable = false)
    public Integer getIdTerceroEvaluacionCompetencia() {
        return idTerceroEvaluacionCompetencia;
    }

    public void setIdTerceroEvaluacionCompetencia(Integer idTerceroEvaluacionCompetencia) {
        this.idTerceroEvaluacionCompetencia = idTerceroEvaluacionCompetencia;
    }

    @Basic
    @Column(name = "IdTerceroEvaluacion", nullable = false)
    public Integer getIdTerceroEvaluacion() {
        return idTerceroEvaluacion;
    }

    public void setIdTerceroEvaluacion(Integer idTerceroEvaluacion) {
        this.idTerceroEvaluacion = idTerceroEvaluacion;
    }

    @Basic
    @Column(name = "IdCargoCompetencia", nullable = false)
    public Integer getIdCargoCompetencia() {
        return idCargoCompetencia;
    }

    public void setIdCargoCompetencia(Integer idCargoCompetencia) {
        this.idCargoCompetencia = idCargoCompetencia;
    }

    @Basic
    @Column(name = "IdCalificacion", nullable = true)
    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
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

        TercerosEvaluacionesCompetencias that = (TercerosEvaluacionesCompetencias) o;

        if (idTerceroEvaluacionCompetencia != null ? !idTerceroEvaluacionCompetencia.equals(that.idTerceroEvaluacionCompetencia) : that.idTerceroEvaluacionCompetencia != null)
            return false;
        if (idTerceroEvaluacion != null ? !idTerceroEvaluacion.equals(that.idTerceroEvaluacion) : that.idTerceroEvaluacion != null)
            return false;
        if (idCargoCompetencia != null ? !idCargoCompetencia.equals(that.idCargoCompetencia) : that.idCargoCompetencia != null)
            return false;
        if (idCalificacion != null ? !idCalificacion.equals(that.idCalificacion) : that.idCalificacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroEvaluacionCompetencia != null ? idTerceroEvaluacionCompetencia.hashCode() : 0;
        result = 31 * result + (idTerceroEvaluacion != null ? idTerceroEvaluacion.hashCode() : 0);
        result = 31 * result + (idCargoCompetencia != null ? idCargoCompetencia.hashCode() : 0);
        result = 31 * result + (idCalificacion != null ? idCalificacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
