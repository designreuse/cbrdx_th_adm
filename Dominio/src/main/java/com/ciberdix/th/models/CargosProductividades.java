package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
@Entity
@Table(name = "CargosProductividades", schema = "dbo", catalog = "CREZCAMOS")
public class CargosProductividades {
    private Integer idCargoProductividad;
    private Integer idCargo;
    private Integer idProductividad;
    private Integer idProductividadIq;
    private Integer idProductividadAptitud;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CargosProductividades() {
    }

    public CargosProductividades(Integer idCargo, Integer idProductividad, Integer idProductividadIq, Integer idProductividadAptitud, Integer auditoriaUsuario) {
        this.idCargo = idCargo;
        this.idProductividad = idProductividad;
        this.idProductividadIq = idProductividadIq;
        this.idProductividadAptitud = idProductividadAptitud;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CargosProductividades(Integer idCargoProductividad, Integer idCargo, Integer idProductividad, Integer idProductividadIq, Integer idProductividadAptitud, Integer auditoriaUsuario) {
        this.idCargoProductividad = idCargoProductividad;
        this.idCargo = idCargo;
        this.idProductividad = idProductividad;
        this.idProductividadIq = idProductividadIq;
        this.idProductividadAptitud = idProductividadAptitud;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoProductividad", nullable = false)
    public Integer getIdCargoProductividad() {
        return idCargoProductividad;
    }

    public void setIdCargoProductividad(Integer idCargoProductividad) {
        this.idCargoProductividad = idCargoProductividad;
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
    @Column(name = "IdProductividad", nullable = true)
    public Integer getIdProductividad() {
        return idProductividad;
    }

    public void setIdProductividad(Integer idProductividad) {
        this.idProductividad = idProductividad;
    }

    @Basic
    @Column(name = "IdProductividadIQ", nullable = true)
    public Integer getIdProductividadIq() {
        return idProductividadIq;
    }

    public void setIdProductividadIq(Integer idProductividadIq) {
        this.idProductividadIq = idProductividadIq;
    }

    @Basic
    @Column(name = "IdProductividadAptitud", nullable = true)
    public Integer getIdProductividadAptitud() {
        return idProductividadAptitud;
    }

    public void setIdProductividadAptitud(Integer idProductividadAptitud) {
        this.idProductividadAptitud = idProductividadAptitud;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        CargosProductividades that = (CargosProductividades) o;

        if (idCargoProductividad != null ? !idCargoProductividad.equals(that.idCargoProductividad) : that.idCargoProductividad != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idProductividad != null ? !idProductividad.equals(that.idProductividad) : that.idProductividad != null)
            return false;
        if (idProductividadIq != null ? !idProductividadIq.equals(that.idProductividadIq) : that.idProductividadIq != null)
            return false;
        if (idProductividadAptitud != null ? !idProductividadAptitud.equals(that.idProductividadAptitud) : that.idProductividadAptitud != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoProductividad != null ? idCargoProductividad.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idProductividad != null ? idProductividad.hashCode() : 0);
        result = 31 * result + (idProductividadIq != null ? idProductividadIq.hashCode() : 0);
        result = 31 * result + (idProductividadAptitud != null ? idProductividadAptitud.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
