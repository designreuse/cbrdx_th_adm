package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Roles", schema = "dbo", catalog = "CREZCAMOS")
public class Roles {
    private Integer idRol;
    private String rol;
    private Boolean indicadorHabilitado;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigoRol;
    private Date fechaInicio;
    private Date fechaFin;

    public Roles() {
    }

    public Roles(String rol, Boolean indicadorHabilitado, String descripcion, Integer auditoriaUsuario, String codigoRol, Date fechaInicio, Date fechaFin) {
        this.rol = rol;
        this.indicadorHabilitado = indicadorHabilitado;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.codigoRol = codigoRol;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Roles(Integer idRol, String rol, Boolean indicadorHabilitado, String descripcion, Integer auditoriaUsuario, String codigoRol, Date fechaInicio, Date fechaFin) {
        this.idRol = idRol;
        this.rol = rol;
        this.indicadorHabilitado = indicadorHabilitado;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.codigoRol = codigoRol;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRol")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    @Column(name = "CodigoRol")
    public String getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roles roles = (Roles) o;

        if (idRol != null ? !idRol.equals(roles.idRol) : roles.idRol != null) return false;
        if (rol != null ? !rol.equals(roles.rol) : roles.rol != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(roles.indicadorHabilitado) : roles.indicadorHabilitado != null)
            return false;
        if (descripcion != null ? !descripcion.equals(roles.descripcion) : roles.descripcion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(roles.auditoriaUsuario) : roles.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(roles.auditoriaFecha) : roles.auditoriaFecha != null)
            return false;
        if (codigoRol != null ? !codigoRol.equals(roles.codigoRol) : roles.codigoRol != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(roles.fechaInicio) : roles.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(roles.fechaFin) : roles.fechaFin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRol != null ? idRol.hashCode() : 0;
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (codigoRol != null ? codigoRol.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        return result;
    }
}
