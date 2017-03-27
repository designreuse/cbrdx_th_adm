package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class CargosCriterios {
    private Integer idCargoCriterio;
    private Integer idCriterio;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTipoCriterio;

    @Id
    @Column(name = "IdCargoCriterio")
    public Integer getIdCargoCriterio() {
        return idCargoCriterio;
    }

    public void setIdCargoCriterio(Integer idCargoCriterio) {
        this.idCargoCriterio = idCargoCriterio;
    }

    @Basic
    @Column(name = "IdCriterio")
    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
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

    @Basic
    @Column(name = "IdTipoCriterio")
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

        CargosCriterios that = (CargosCriterios) o;

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
