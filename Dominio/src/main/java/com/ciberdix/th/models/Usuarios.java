package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 20/04/17.
 */
@Entity
@Table(name = "Usuarios", schema = "crz_th", catalog = "CREZCAMOS")
public class Usuarios {
    private Integer idUsuario;
    private String usuarioSistema;
    private String contrasena;
    private Boolean usuarioLdap;
    private Date fechaInactivacion;
    private Long idTercero;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String correoElectronico;

    public Usuarios() {
    }

    public Usuarios(String usuarioSistema, String contrasena, Boolean usuarioLdap, Date fechaInactivacion, Long idTercero, Boolean indicadorHabilitado, Integer auditoriaUsuario, String correoElectronico) {
        this.usuarioSistema = usuarioSistema;
        this.contrasena = contrasena;
        this.usuarioLdap = usuarioLdap;
        this.fechaInactivacion = fechaInactivacion != null ? new Date(fechaInactivacion.getTime()) : null;
        this.idTercero = idTercero;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.correoElectronico = correoElectronico;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Usuarios(Integer idUsuario, String usuarioSistema, String contrasena, Boolean usuarioLdap, Date fechaInactivacion, Long idTercero, Boolean indicadorHabilitado, Integer auditoriaUsuario, String correoElectronico) {
        this.idUsuario = idUsuario;
        this.usuarioSistema = usuarioSistema;
        this.contrasena = contrasena;
        this.usuarioLdap = usuarioLdap;
        this.fechaInactivacion = fechaInactivacion != null ? new Date(fechaInactivacion.getTime()) : null;
        this.idTercero = idTercero;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.correoElectronico = correoElectronico;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "UsuarioSistema")
    public String getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(String usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    @Basic
    @Column(name = "Contrasena")
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Basic
    @Column(name = "UsuarioLDAP")
    public Boolean getUsuarioLdap() {
        return usuarioLdap;
    }

    public void setUsuarioLdap(Boolean usuarioLdap) {
        this.usuarioLdap = usuarioLdap;
    }

    @Basic
    @Column(name = "FechaInactivacion")
    public Date getFechaInactivacion() {
        return fechaInactivacion;
    }

    public void setFechaInactivacion(Date fechaInactivacion) {
        this.fechaInactivacion = fechaInactivacion;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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

    @Basic
    @Column(name = "CorreoElectronico")
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuarios usuarios = (Usuarios) o;

        if (idUsuario != null ? !idUsuario.equals(usuarios.idUsuario) : usuarios.idUsuario != null) return false;
        if (usuarioSistema != null ? !usuarioSistema.equals(usuarios.usuarioSistema) : usuarios.usuarioSistema != null)
            return false;
        if (contrasena != null ? !contrasena.equals(usuarios.contrasena) : usuarios.contrasena != null) return false;
        if (usuarioLdap != null ? !usuarioLdap.equals(usuarios.usuarioLdap) : usuarios.usuarioLdap != null)
            return false;
        if (fechaInactivacion != null ? !fechaInactivacion.equals(usuarios.fechaInactivacion) : usuarios.fechaInactivacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(usuarios.idTercero) : usuarios.idTercero != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(usuarios.indicadorHabilitado) : usuarios.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(usuarios.auditoriaUsuario) : usuarios.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(usuarios.auditoriaFecha) : usuarios.auditoriaFecha != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(usuarios.correoElectronico) : usuarios.correoElectronico != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario != null ? idUsuario.hashCode() : 0;
        result = 31 * result + (usuarioSistema != null ? usuarioSistema.hashCode() : 0);
        result = 31 * result + (contrasena != null ? contrasena.hashCode() : 0);
        result = 31 * result + (usuarioLdap != null ? usuarioLdap.hashCode() : 0);
        result = 31 * result + (fechaInactivacion != null ? fechaInactivacion.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        return result;
    }
}
