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
public class RequerimientosReferidos {
    private Integer idRequerimientoReferido;
    private Integer idRequerimiento;
    private String nombre;
    private Integer telefono;
    private String mail;
    private Timestamp fechaReferencia;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRequerimientoReferido")
    public Integer getIdRequerimientoReferido() {
        return idRequerimientoReferido;
    }

    public void setIdRequerimientoReferido(Integer idRequerimientoReferido) {
        this.idRequerimientoReferido = idRequerimientoReferido;
    }

    @Basic
    @Column(name = "IdRequerimiento")
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Telefono")
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "FechaReferencia")
    public Timestamp getFechaReferencia() {
        return fechaReferencia;
    }

    public void setFechaReferencia(Timestamp fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

        RequerimientosReferidos that = (RequerimientosReferidos) o;

        if (idRequerimientoReferido != null ? !idRequerimientoReferido.equals(that.idRequerimientoReferido) : that.idRequerimientoReferido != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
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
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (fechaReferencia != null ? fechaReferencia.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
