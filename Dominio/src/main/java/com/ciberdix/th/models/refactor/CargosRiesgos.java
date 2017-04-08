package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 7/04/17.
 */
@Entity
@Table(name = "CargosRiesgos", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosRiesgos {
    private Integer idCargoRiesgo;
    private Integer idCargo;
    private Integer idRiesgo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CargosRiesgos() {
    }

    public CargosRiesgos(Integer idCargo, Integer idRiesgo, Integer auditoriaUsuario) {
        this.idCargo = idCargo;
        this.idRiesgo = idRiesgo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoRiesgo")
    public Integer getIdCargoRiesgo() {
        return idCargoRiesgo;
    }

    public void setIdCargoRiesgo(Integer idCargoRiesgo) {
        this.idCargoRiesgo = idCargoRiesgo;
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
    @Column(name = "IdRiesgo")
    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
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

        CargosRiesgos that = (CargosRiesgos) o;

        if (idCargoRiesgo != null ? !idCargoRiesgo.equals(that.idCargoRiesgo) : that.idCargoRiesgo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idRiesgo != null ? !idRiesgo.equals(that.idRiesgo) : that.idRiesgo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idCargoRiesgo != null ? idCargoRiesgo.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idRiesgo != null ? idRiesgo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
