package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosFactoresRiesgos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class CargosFactoresRiesgosEntity {
    private Integer idCargoFactorRiesgo;
    private Integer idCargo;
    private Integer idFactor;
    private Integer idPeriodicidad;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoFactorRiesgo", nullable = false)
    public Integer getIdCargoFactorRiesgo() {
        return idCargoFactorRiesgo;
    }

    public void setIdCargoFactorRiesgo(Integer idCargoFactorRiesgo) {
        this.idCargoFactorRiesgo = idCargoFactorRiesgo;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdFactor", nullable = true)
    public Integer getIdFactor() {
        return idFactor;
    }

    public void setIdFactor(Integer idFactor) {
        this.idFactor = idFactor;
    }

    @Basic
    @Column(name = "IdPeriodicidad", nullable = true)
    public Integer getIdPeriodicidad() {
        return idPeriodicidad;
    }

    public void setIdPeriodicidad(Integer idPeriodicidad) {
        this.idPeriodicidad = idPeriodicidad;
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

        CargosFactoresRiesgosEntity that = (CargosFactoresRiesgosEntity) o;

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
