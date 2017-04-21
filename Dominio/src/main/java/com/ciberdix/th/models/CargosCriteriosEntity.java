package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosCriterios", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class CargosCriteriosEntity {
    private Integer idCargoCriterio;
    private Integer idCriterio;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTipoCriterio;

    @Id
    @Column(name = "IdCargoCriterio", nullable = false)
    public Integer getIdCargoCriterio() {
        return idCargoCriterio;
    }

    public void setIdCargoCriterio(Integer idCargoCriterio) {
        this.idCargoCriterio = idCargoCriterio;
    }

    @Basic
    @Column(name = "IdCriterio", nullable = false)
    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
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
    @Column(name = "IdTipoCriterio", nullable = false)
    public Integer getIdTipoCriterio() {
        return idTipoCriterio;
    }

    public void setIdTipoCriterio(Integer idTipoCriterio) {
        this.idTipoCriterio = idTipoCriterio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosCriteriosEntity that = (CargosCriteriosEntity) o;

        if (idCargoCriterio != null ? !idCargoCriterio.equals(that.idCargoCriterio) : that.idCargoCriterio != null)
            return false;
        if (idCriterio != null ? !idCriterio.equals(that.idCriterio) : that.idCriterio != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idTipoCriterio != null ? !idTipoCriterio.equals(that.idTipoCriterio) : that.idTipoCriterio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoCriterio != null ? idCargoCriterio.hashCode() : 0;
        result = 31 * result + (idCriterio != null ? idCriterio.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idTipoCriterio != null ? idTipoCriterio.hashCode() : 0);
        return result;
    }
}
