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
public class CargosFactoresRiesgos {
    private Integer idCargoFactorRiesgo;
    private Integer idCargo;
    private Integer idFactor;
    private Integer idPeriodicidad;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoFactorRiesgo")
    public Integer getIdCargoFactorRiesgo() {
        return idCargoFactorRiesgo;
    }

    public void setIdCargoFactorRiesgo(Integer idCargoFactorRiesgo) {
        this.idCargoFactorRiesgo = idCargoFactorRiesgo;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdFactor")
    public Integer getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(Integer idFactor) {
        this.idFactor = idFactor;
    }

    @Basic
    @Column(name = "IdPeriodicidad")
    public Integer getIdPeriodicidad() {
        return idPeriodicidad;
    }

    public void setIdPeriodicidad(Integer idPeriodicidad) {
        this.idPeriodicidad = idPeriodicidad;
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

        CargosFactoresRiesgos that = (CargosFactoresRiesgos) o;

        if (idCargoFactorRiesgo != null ? !idCargoFactorRiesgo.equals(that.idCargoFactorRiesgo) : that.idCargoFactorRiesgo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idFactor != null ? !idFactor.equals(that.idFactor) : that.idFactor != null) return false;
        if (idPeriodicidad != null ? !idPeriodicidad.equals(that.idPeriodicidad) : that.idPeriodicidad != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoFactorRiesgo != null ? idCargoFactorRiesgo.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idFactor != null ? idFactor.hashCode() : 0);
        result = 31 * result + (idPeriodicidad != null ? idPeriodicidad.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
