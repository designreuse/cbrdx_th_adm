package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosDotacionesAdicionales", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosDotacionesAdicionales {
    private Integer idTerceroDotacionAdicional;
    private Long idTercero;
    private Integer idDotacion;
    private Integer cantidadDotacion;
    private Integer idTalla;
    private Integer idProyeccionDotacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosDotacionesAdicionales() {
    }

    public TercerosDotacionesAdicionales(Long idTercero, Integer idDotacion, Integer cantidadDotacion, Integer idTalla, Integer idProyeccionDotacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTercero = idTercero;
        this.idDotacion = idDotacion;
        this.cantidadDotacion = cantidadDotacion;
        this.idTalla = idTalla;
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosDotacionesAdicionales(Integer idTerceroDotacionAdicional, Long idTercero, Integer idDotacion, Integer cantidadDotacion, Integer idTalla, Integer idProyeccionDotacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroDotacionAdicional = idTerceroDotacionAdicional;
        this.idTercero = idTercero;
        this.idDotacion = idDotacion;
        this.cantidadDotacion = cantidadDotacion;
        this.idTalla = idTalla;
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroDotacionAdicional", nullable = false)
    public Integer getIdTerceroDotacionAdicional() {
        return idTerceroDotacionAdicional;
    }

    public void setIdTerceroDotacionAdicional(Integer idTerceroDotacionAdicional) {
        this.idTerceroDotacionAdicional = idTerceroDotacionAdicional;
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
    @Column(name = "IdDotacion", nullable = true)
    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    @Basic
    @Column(name = "CantidadDotacion", nullable = true)
    public Integer getCantidadDotacion() {
        return cantidadDotacion;
    }

    public void setCantidadDotacion(Integer cantidadDotacion) {
        this.cantidadDotacion = cantidadDotacion;
    }

    @Basic
    @Column(name = "IdTalla", nullable = true)
    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    @Basic
    @Column(name = "IdProyeccionDotacion", nullable = true)
    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosDotacionesAdicionales that = (TercerosDotacionesAdicionales) o;

        if (idTerceroDotacionAdicional != null ? !idTerceroDotacionAdicional.equals(that.idTerceroDotacionAdicional) : that.idTerceroDotacionAdicional != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idDotacion != null ? !idDotacion.equals(that.idDotacion) : that.idDotacion != null) return false;
        if (cantidadDotacion != null ? !cantidadDotacion.equals(that.cantidadDotacion) : that.cantidadDotacion != null)
            return false;
        if (idTalla != null ? !idTalla.equals(that.idTalla) : that.idTalla != null) return false;
        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDotacionAdicional != null ? idTerceroDotacionAdicional.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idDotacion != null ? idDotacion.hashCode() : 0);
        result = 31 * result + (cantidadDotacion != null ? cantidadDotacion.hashCode() : 0);
        result = 31 * result + (idTalla != null ? idTalla.hashCode() : 0);
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
