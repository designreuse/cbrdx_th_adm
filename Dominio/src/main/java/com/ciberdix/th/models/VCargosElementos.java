package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_CargosElementos", schema = "dbo", catalog = "CREZCAMOS")
public class VCargosElementos {
    private Integer idCargoElemento;
    private Integer idCargo;
    private String cargo;
    private Integer idTipoElemento;
    private String tipoElemento;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Basic
    @Id
    @Column(name = "IdCargoElemento", nullable = false)
    public Integer getIdCargoElemento() {
        return idCargoElemento;
    }

    public void setIdCargoElemento(Integer idCargoElemento) {
        this.idCargoElemento = idCargoElemento;
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
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdTipoElemento", nullable = true)
    public Integer getIdTipoElemento() {
        return idTipoElemento;
    }

    public void setIdTipoElemento(Integer idTipoElemento) {
        this.idTipoElemento = idTipoElemento;
    }

    @Basic
    @Column(name = "TipoElemento", nullable = true, length = 100)
    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    @Basic
    @Column(name = "Descripcion", nullable = false, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        VCargosElementos that = (VCargosElementos) o;

        if (idCargoElemento != null ? !idCargoElemento.equals(that.idCargoElemento) : that.idCargoElemento != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idTipoElemento != null ? !idTipoElemento.equals(that.idTipoElemento) : that.idTipoElemento != null)
            return false;
        if (tipoElemento != null ? !tipoElemento.equals(that.tipoElemento) : that.tipoElemento != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoElemento != null ? idCargoElemento.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idTipoElemento != null ? idTipoElemento.hashCode() : 0);
        result = 31 * result + (tipoElemento != null ? tipoElemento.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
