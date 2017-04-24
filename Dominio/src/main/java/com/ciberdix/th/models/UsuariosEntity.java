package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Usuarios", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class UsuariosEntity {
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

    public UsuariosEntity(String usuarioSistema, String contrasena, Boolean usuarioLdap, Date fechaInactivacion, Long idTercero, Boolean indicadorHabilitado, Integer auditoriaUsuario, String correoElectronico) {
        this.usuarioSistema = usuarioSistema;
        this.contrasena = contrasena;
        this.usuarioLdap = usuarioLdap;
        this.fechaInactivacion = fechaInactivacion;
        this.idTercero = idTercero;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.correoElectronico = correoElectronico;
    }

    public UsuariosEntity() {
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

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 64)
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

        UsuariosEntity that = (UsuariosEntity) o;

        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (usuarioSistema != null ? !usuarioSistema.equals(that.usuarioSistema) : that.usuarioSistema != null)
            return false;
        if (contrasena != null ? !contrasena.equals(that.contrasena) : that.contrasena != null) return false;
        if (usuarioLdap != null ? !usuarioLdap.equals(that.usuarioLdap) : that.usuarioLdap != null) return false;
        if (fechaInactivacion != null ? !fechaInactivacion.equals(that.fechaInactivacion) : that.fechaInactivacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
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
