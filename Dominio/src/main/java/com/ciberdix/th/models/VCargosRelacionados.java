package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 4/05/2017.
 */
@Entity
@Table(name = "V_CargosRelacionados", schema = "crz_th", catalog = "CREZCAMOS")
public class VCargosRelacionados {
    private int idCargoRelacionado;
    private int idTipoRelacion;
    private int idCargo;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String cargo;
    private Integer idCargoRelacion;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdCargoRelacionado")
    public int getIdCargoRelacionado() {
        return idCargoRelacionado;
    }

    public void setIdCargoRelacionado(int idCargoRelacionado) {
        this.idCargoRelacionado = idCargoRelacionado;
    }

    @Basic
    @Column(name = "IdTipoRelacion")
    public int getIdTipoRelacion() {
        return idTipoRelacion;
    }

    public void setIdTipoRelacion(int idTipoRelacion) {
        this.idTipoRelacion = idTipoRelacion;
    }

    @Basic
    @Column(name = "IdCargo")
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
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
    @Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdCargoRelacion")
    public Integer getIdCargoRelacion() {
        return idCargoRelacion;
    }

    public void setIdCargoRelacion(Integer idCargoRelacion) {
        this.idCargoRelacion = idCargoRelacion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
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

        VCargosRelacionados that = (VCargosRelacionados) o;

        if (idCargoRelacionado != that.idCargoRelacionado) return false;
        if (idTipoRelacion != that.idTipoRelacion) return false;
        if (idCargo != that.idCargo) return false;
        if (auditoriaUsuario != that.auditoriaUsuario) return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idCargoRelacion != null ? !idCargoRelacion.equals(that.idCargoRelacion) : that.idCargoRelacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRelacionado;
        result = 31 * result + idTipoRelacion;
        result = 31 * result + idCargo;
        result = 31 * result + auditoriaUsuario;
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idCargoRelacion != null ? idCargoRelacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
