package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosRelacionados", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class CargosRelacionadosEntity {
    private Integer idCargoRelacionado;
    private Integer idTipoRelacion;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoRelacionado", nullable = false)
    public Integer getIdCargoRelacionado() {
        return idCargoRelacionado;
    }

    public void setIdCargoRelacionado(Integer idCargoRelacionado) {
        this.idCargoRelacionado = idCargoRelacionado;
    }

    @Basic
    @Column(name = "IdTipoRelacion", nullable = false)
    public Integer getIdTipoRelacion() {
        return idTipoRelacion;
    }

    public void setIdTipoRelacion(Integer idTipoRelacion) {
        this.idTipoRelacion = idTipoRelacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosRelacionadosEntity that = (CargosRelacionadosEntity) o;

        if (idCargoRelacionado != null ? !idCargoRelacionado.equals(that.idCargoRelacionado) : that.idCargoRelacionado != null)
            return false;
        if (idTipoRelacion != null ? !idTipoRelacion.equals(that.idTipoRelacion) : that.idTipoRelacion != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRelacionado != null ? idCargoRelacionado.hashCode() : 0;
        result = 31 * result + (idTipoRelacion != null ? idTipoRelacion.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
