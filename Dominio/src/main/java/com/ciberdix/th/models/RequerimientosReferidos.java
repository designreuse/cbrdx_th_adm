package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 16/05/2017.
 */
@Entity
@Table(name = "RequerimientosReferidos", schema = "dbo", catalog = "CREZCAMOS")
public class RequerimientosReferidos {
    private Integer idRequerimientoReferido;
    private Integer idRequerimiento;
    private String nombre;
    private String telefono;
    private String correoElectronico;
    private Date fechaReferencia;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    public RequerimientosReferidos() {
    }

    public RequerimientosReferidos(Integer idRequerimiento, String nombre, String telefono, String correoElectronico, Date fechaReferencia, Integer idEstado, Integer auditoriaUsuario) {
        this.idRequerimiento = idRequerimiento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaReferencia = fechaReferencia != null ? new Date(fechaReferencia.getTime()) : null;
        this.idEstado = idEstado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public RequerimientosReferidos(Integer idRequerimientoReferido, Integer idRequerimiento, String nombre, String telefono, String correoElectronico, Date fechaReferencia, Integer idEstado, Integer auditoriaUsuario) {
        this.idRequerimientoReferido = idRequerimientoReferido;
        this.idRequerimiento = idRequerimiento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaReferencia = fechaReferencia != null ? new Date(fechaReferencia.getTime()) : null;
        this.idEstado = idEstado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimientoReferido", nullable = false)
    public Integer getIdRequerimientoReferido() {
        return idRequerimientoReferido;
    }

    public void setIdRequerimientoReferido(Integer idRequerimientoReferido) {
        this.idRequerimientoReferido = idRequerimientoReferido;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = true)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "Nombre", nullable = true, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Telefono", nullable = true, length = 100)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 50)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "FechaReferencia", nullable = true)
    public Date getFechaReferencia() {
        return fechaReferencia;
    }

    public void setFechaReferencia(Date fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

        RequerimientosReferidos that = (RequerimientosReferidos) o;

        if (idRequerimientoReferido != null ? !idRequerimientoReferido.equals(that.idRequerimientoReferido) : that.idRequerimientoReferido != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (fechaReferencia != null ? !fechaReferencia.equals(that.fechaReferencia) : that.fechaReferencia != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoReferido != null ? idRequerimientoReferido.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (fechaReferencia != null ? fechaReferencia.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
