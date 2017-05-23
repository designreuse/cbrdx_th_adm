package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
@Entity
@Table(name = "CargosEstadosObservaciones", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosEstadosObservaciones {
    private Integer idCargoEstadoObservacion;
    private Integer idCargo;
    private Integer idEstadoCargo;
    private String observacion;
    private Integer idUsuario;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CargosEstadosObservaciones() {
    }

    public CargosEstadosObservaciones(Integer idCargo, Integer idEstadoCargo, String observacion, Integer idUsuario, Integer auditoriaUsuario) {
        this.idCargo = idCargo;
        this.idEstadoCargo = idEstadoCargo;
        this.observacion = observacion;
        this.idUsuario = idUsuario;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CargosEstadosObservaciones(Integer idCargoEstadoObservacion, Integer idCargo, Integer idEstadoCargo, String observacion, Integer idUsuario, Integer auditoriaUsuario) {
        this.idCargoEstadoObservacion = idCargoEstadoObservacion;
        this.idCargo = idCargo;
        this.idEstadoCargo = idEstadoCargo;
        this.observacion = observacion;
        this.idUsuario = idUsuario;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoEstadoObservacion")
    public Integer getIdCargoEstadoObservacion() {
        return idCargoEstadoObservacion;
    }

    public void setIdCargoEstadoObservacion(Integer idCargoEstadoObservacion) {
        this.idCargoEstadoObservacion = idCargoEstadoObservacion;
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
    @Column(name = "IdEstadoCargo")
    public Integer getIdEstadoCargo() {
        return idEstadoCargo;
    }

    public void setIdEstadoCargo(Integer idEstadoCargo) {
        this.idEstadoCargo = idEstadoCargo;
    }

    @Basic
    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

        CargosEstadosObservaciones that = (CargosEstadosObservaciones) o;

        if (idCargoEstadoObservacion != null ? !idCargoEstadoObservacion.equals(that.idCargoEstadoObservacion) : that.idCargoEstadoObservacion != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idEstadoCargo != null ? !idEstadoCargo.equals(that.idEstadoCargo) : that.idEstadoCargo != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoEstadoObservacion != null ? idCargoEstadoObservacion.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idEstadoCargo != null ? idEstadoCargo.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
