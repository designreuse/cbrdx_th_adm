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
public class CapacitacionesCompetencias {
    private Integer idCapacitacionCompetencia;
    private Integer idCapacitacion;
    private Integer idCompetencia;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCapacitacionCompetencia")
    public Integer getIdCapacitacionCompetencia() {
        return idCapacitacionCompetencia;
    }

    public void setIdCapacitacionCompetencia(Integer idCapacitacionCompetencia) {
        this.idCapacitacionCompetencia = idCapacitacionCompetencia;
    }

    @Basic
    @Column(name = "IdCapacitacion")
    public Integer getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Integer idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    @Basic
    @Column(name = "IdCompetencia")
    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        CapacitacionesCompetencias that = (CapacitacionesCompetencias) o;

        if (idCapacitacionCompetencia != null ? !idCapacitacionCompetencia.equals(that.idCapacitacionCompetencia) : that.idCapacitacionCompetencia != null)
            return false;
        if (idCapacitacion != null ? !idCapacitacion.equals(that.idCapacitacion) : that.idCapacitacion != null)
            return false;
        if (idCompetencia != null ? !idCompetencia.equals(that.idCompetencia) : that.idCompetencia != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCapacitacionCompetencia != null ? idCapacitacionCompetencia.hashCode() : 0;
        result = 31 * result + (idCapacitacion != null ? idCapacitacion.hashCode() : 0);
        result = 31 * result + (idCompetencia != null ? idCompetencia.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
