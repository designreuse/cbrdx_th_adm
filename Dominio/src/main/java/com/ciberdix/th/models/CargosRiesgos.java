package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
@Entity
@Table(name = "CargosRiesgos", schema = "dbo", catalog = "CREZCAMOS")
public class CargosRiesgos {
    private Integer idCargoRiesgo;
    private Integer idCargo;
    private Integer idRiesgo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public CargosRiesgos() {
    }

    public CargosRiesgos(Integer idCargo, Integer idRiesgo, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idCargo = idCargo;
        this.idRiesgo = idRiesgo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public CargosRiesgos(Integer idCargoRiesgo, Integer idCargo, Integer idRiesgo, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idCargoRiesgo = idCargoRiesgo;
        this.idCargo = idCargo;
        this.idRiesgo = idRiesgo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoRiesgo", nullable = false)
    public Integer getIdCargoRiesgo() {
        return idCargoRiesgo;
    }

    public void setIdCargoRiesgo(Integer idCargoRiesgo) {
        this.idCargoRiesgo = idCargoRiesgo;
    }

    @Basic
    @Column(name = "IdCargo", nullable = false)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdRiesgo", nullable = false)
    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
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

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosRiesgos that = (CargosRiesgos) o;

        if (idCargoRiesgo != null ? !idCargoRiesgo.equals(that.idCargoRiesgo) : that.idCargoRiesgo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idRiesgo != null ? !idRiesgo.equals(that.idRiesgo) : that.idRiesgo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRiesgo != null ? idCargoRiesgo.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idRiesgo != null ? idRiesgo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
