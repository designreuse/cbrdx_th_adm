package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 20/04/17.
 */
@Entity
@Table(name = "Usuarios", schema = "dbo", catalog = "CREZCAMOS")
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
    private String facebook;
    private String google;
    private String linkedin;
    
    public Usuarios() {
    }

    public Usuarios(String usuarioSistema, String contrasena, Boolean usuarioLdap, Date fechaInactivacion, Long idTercero, Boolean indicadorHabilitado, Integer auditoriaUsuario, String correoElectronico, String facebook, String google, String linkedin) {
        this.usuarioSistema = usuarioSistema;
        this.contrasena = contrasena;
        this.usuarioLdap = usuarioLdap;
        this.fechaInactivacion = fechaInactivacion != null ? new Date(fechaInactivacion.getTime()) : null;
        this.idTercero = idTercero;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.correoElectronico = correoElectronico;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.facebook = facebook;
        this.google = google;
        this.linkedin = linkedin;
    }

    public Usuarios(Integer idUsuario, String usuarioSistema, String contrasena, Boolean usuarioLdap, Date fechaInactivacion, Long idTercero, Boolean indicadorHabilitado, Integer auditoriaUsuario, String correoElectronico, String facebook, String google, String linkedin) {
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
        this.facebook = facebook;
        this.google = google;
        this.linkedin = linkedin;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdUsuario", nullable = false)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "UsuarioSistema", nullable = true, length = 64)
    public String getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(String usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    @Basic
    @Column(name = "Contrasena", nullable = true, length = 128)
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Basic
    @Column(name = "UsuarioLDAP", nullable = true)
    public Boolean getUsuarioLdap() {
        return usuarioLdap;
    }

    public void setUsuarioLdap(Boolean usuarioLdap) {
        this.usuarioLdap = usuarioLdap;
    }

    @Basic
    @Column(name = "FechaInactivacion", nullable = true)
    public Date getFechaInactivacion() {
        return fechaInactivacion;
    }

    public void setFechaInactivacion(Date fechaInactivacion) {
        this.fechaInactivacion = fechaInactivacion;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 64)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "Facebook", nullable = true, length = 30)
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Basic
    @Column(name = "Google", nullable = true, length = 30)
    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    @Basic
    @Column(name = "Linkedin", nullable = true, length = 30)
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuarios usuarios = (Usuarios) o;

        if (!idUsuario.equals(usuarios.idUsuario)) return false;
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
        if (!auditoriaUsuario.equals(usuarios.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(usuarios.auditoriaFecha)) return false;
        if (correoElectronico != null ? !correoElectronico.equals(usuarios.correoElectronico) : usuarios.correoElectronico != null)
            return false;
        if (facebook != null ? !facebook.equals(usuarios.facebook) : usuarios.facebook != null) return false;
        if (google != null ? !google.equals(usuarios.google) : usuarios.google != null) return false;
        return linkedin != null ? linkedin.equals(usuarios.linkedin) : usuarios.linkedin == null;
    }

    @Override
    public int hashCode() {
        int result = idUsuario.hashCode();
        result = 31 * result + (usuarioSistema != null ? usuarioSistema.hashCode() : 0);
        result = 31 * result + (contrasena != null ? contrasena.hashCode() : 0);
        result = 31 * result + (usuarioLdap != null ? usuarioLdap.hashCode() : 0);
        result = 31 * result + (fechaInactivacion != null ? fechaInactivacion.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (facebook != null ? facebook.hashCode() : 0);
        result = 31 * result + (google != null ? google.hashCode() : 0);
        result = 31 * result + (linkedin != null ? linkedin.hashCode() : 0);
        return result;
    }
}
