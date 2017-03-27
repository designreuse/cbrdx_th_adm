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
public class CargosResponsabilidades {
    private Integer idCargoResponsabilidad;
    private Integer idResponsabilidad;
    private Integer idCargo;
    private Integer idPeriodicidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoResponsabilidad")
    public Integer getIdCargoResponsabilidad() {
        return idCargoResponsabilidad;
    }

    public void setIdCargoResponsabilidad(Integer idCargoResponsabilidad) {
        this.idCargoResponsabilidad = idCargoResponsabilidad;
    }

    @Basic
    @Column(name = "IdResponsabilidad")
    public Integer getIdResponsabilidad() {
        return idResponsabilidad;
    }

    public void setIdResponsabilidad(Integer idResponsabilidad) {
        this.idResponsabilidad = idResponsabilidad;
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
    @Column(name = "IdPeriodicidad")
    public Integer getIdPeriodicidad() {
        return idPeriodicidad;
    }

    public void setIdPeriodicidad(Integer idPeriodicidad) {
        this.idPeriodicidad = idPeriodicidad;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        CargosResponsabilidades that = (CargosResponsabilidades) o;

        if (idCargoResponsabilidad != null ? !idCargoResponsabilidad.equals(that.idCargoResponsabilidad) : that.idCargoResponsabilidad != null)
            return false;
        if (idResponsabilidad != null ? !idResponsabilidad.equals(that.idResponsabilidad) : that.idResponsabilidad != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idPeriodicidad != null ? !idPeriodicidad.equals(that.idPeriodicidad) : that.idPeriodicidad != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoResponsabilidad != null ? idCargoResponsabilidad.hashCode() : 0;
        result = 31 * result + (idResponsabilidad != null ? idResponsabilidad.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idPeriodicidad != null ? idPeriodicidad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
