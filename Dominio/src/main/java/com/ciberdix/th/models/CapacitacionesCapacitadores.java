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
public class CapacitacionesCapacitadores {
    private Integer idCapacitacionCapacitador;
    private Integer idCapacitacion;
    private Long idCapacitador;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCapacitacionCapacitador")
    public Integer getIdCapacitacionCapacitador() {
        return idCapacitacionCapacitador;
    }

    public void setIdCapacitacionCapacitador(Integer idCapacitacionCapacitador) {
        this.idCapacitacionCapacitador = idCapacitacionCapacitador;
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
    @Column(name = "IdCapacitador")
    public Long getIdCapacitador() {
        return idCapacitador;
    }

    public void setIdCapacitador(Long idCapacitador) {
        this.idCapacitador = idCapacitador;
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

        CapacitacionesCapacitadores that = (CapacitacionesCapacitadores) o;

        if (idCapacitacionCapacitador != null ? !idCapacitacionCapacitador.equals(that.idCapacitacionCapacitador) : that.idCapacitacionCapacitador != null)
            return false;
        if (idCapacitacion != null ? !idCapacitacion.equals(that.idCapacitacion) : that.idCapacitacion != null)
            return false;
        if (idCapacitador != null ? !idCapacitador.equals(that.idCapacitador) : that.idCapacitador != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCapacitacionCapacitador != null ? idCapacitacionCapacitador.hashCode() : 0;
        result = 31 * result + (idCapacitacion != null ? idCapacitacion.hashCode() : 0);
        result = 31 * result + (idCapacitador != null ? idCapacitador.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
