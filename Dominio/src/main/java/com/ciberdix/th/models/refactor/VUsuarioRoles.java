package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_UsuarioRoles", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VUsuarioRoles {
    private Integer idUsuarioRol;
    private Integer idUsuario;
    private String rol;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdUsuarioRol")
    public Integer getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(Integer idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
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
    @Column(name = "Rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "FechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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

        VUsuarioRoles that = (VUsuarioRoles) o;

        if (idUsuarioRol != null ? !idUsuarioRol.equals(that.idUsuarioRol) : that.idUsuarioRol != null) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuarioRol != null ? idUsuarioRol.hashCode() : 0;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
