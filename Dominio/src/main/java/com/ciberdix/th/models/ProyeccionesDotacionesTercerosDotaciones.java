package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ProyeccionesDotacionesTercerosDotaciones", schema = "dbo", catalog = "CREZCAMOS")
public class ProyeccionesDotacionesTercerosDotaciones {
    private Integer idProyeccionDotacionTerceroDotacion;
    private Integer idProyeccionDotacionTercero;
    private Integer idDotacion;
    private Integer idTalla;
    private Integer cantidadAsignada;
    private Integer cantidadEntregada;
    private Boolean indicadorSatisfecho;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProyeccionesDotacionesTercerosDotaciones() {
    }

    public ProyeccionesDotacionesTercerosDotaciones(Integer idProyeccionDotacionTercero, Integer idDotacion, Integer idTalla, Integer cantidadAsignada, Integer cantidadEntregada, Boolean indicadorSatisfecho, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacionTercero = idProyeccionDotacionTercero;
        this.idDotacion = idDotacion;
        this.idTalla = idTalla;
        this.cantidadAsignada = cantidadAsignada;
        this.cantidadEntregada = cantidadEntregada;
        this.indicadorSatisfecho = indicadorSatisfecho;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProyeccionesDotacionesTercerosDotaciones(Integer idProyeccionDotacionTerceroDotacion, Integer idProyeccionDotacionTercero, Integer idDotacion, Integer idTalla, Integer cantidadAsignada, Integer cantidadEntregada, Boolean indicadorSatisfecho, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacionTerceroDotacion = idProyeccionDotacionTerceroDotacion;
        this.idProyeccionDotacionTercero = idProyeccionDotacionTercero;
        this.idDotacion = idDotacion;
        this.idTalla = idTalla;
        this.cantidadAsignada = cantidadAsignada;
        this.cantidadEntregada = cantidadEntregada;
        this.indicadorSatisfecho = indicadorSatisfecho;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProyeccionDotacionTerceroDotacion", nullable = false)
    public Integer getIdProyeccionDotacionTerceroDotacion() {
        return idProyeccionDotacionTerceroDotacion;
    }

    public void setIdProyeccionDotacionTerceroDotacion(Integer idProyeccionDotacionTerceroDotacion) {
        this.idProyeccionDotacionTerceroDotacion = idProyeccionDotacionTerceroDotacion;
    }

    @Basic
    @Column(name = "IdProyeccionDotacionTercero", nullable = true)
    public Integer getIdProyeccionDotacionTercero() {
        return idProyeccionDotacionTercero;
    }

    public void setIdProyeccionDotacionTercero(Integer idProyeccionDotacionTercero) {
        this.idProyeccionDotacionTercero = idProyeccionDotacionTercero;
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
    @Column(name = "IdTalla", nullable = true)
    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    @Basic
    @Column(name = "CantidadAsignada", nullable = true)
    public Integer getCantidadAsignada() {
        return cantidadAsignada;
    }

    public void setCantidadAsignada(Integer cantidadAsignada) {
        this.cantidadAsignada = cantidadAsignada;
    }

    @Basic
    @Column(name = "CantidadEntregada", nullable = true)
    public Integer getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(Integer cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    @Basic
    @Column(name = "IndicadorSatisfecho", nullable = true)
    public Boolean getIndicadorSatisfecho() {
        return indicadorSatisfecho;
    }

    public void setIndicadorSatisfecho(Boolean indicadorSatisfecho) {
        this.indicadorSatisfecho = indicadorSatisfecho;
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

        ProyeccionesDotacionesTercerosDotaciones that = (ProyeccionesDotacionesTercerosDotaciones) o;

        if (idProyeccionDotacionTerceroDotacion != null ? !idProyeccionDotacionTerceroDotacion.equals(that.idProyeccionDotacionTerceroDotacion) : that.idProyeccionDotacionTerceroDotacion != null)
            return false;
        if (idProyeccionDotacionTercero != null ? !idProyeccionDotacionTercero.equals(that.idProyeccionDotacionTercero) : that.idProyeccionDotacionTercero != null)
            return false;
        if (idDotacion != null ? !idDotacion.equals(that.idDotacion) : that.idDotacion != null) return false;
        if (idTalla != null ? !idTalla.equals(that.idTalla) : that.idTalla != null) return false;
        if (cantidadAsignada != null ? !cantidadAsignada.equals(that.cantidadAsignada) : that.cantidadAsignada != null)
            return false;
        if (cantidadEntregada != null ? !cantidadEntregada.equals(that.cantidadEntregada) : that.cantidadEntregada != null)
            return false;
        if (indicadorSatisfecho != null ? !indicadorSatisfecho.equals(that.indicadorSatisfecho) : that.indicadorSatisfecho != null)
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
        int result = idProyeccionDotacionTerceroDotacion != null ? idProyeccionDotacionTerceroDotacion.hashCode() : 0;
        result = 31 * result + (idProyeccionDotacionTercero != null ? idProyeccionDotacionTercero.hashCode() : 0);
        result = 31 * result + (idDotacion != null ? idDotacion.hashCode() : 0);
        result = 31 * result + (idTalla != null ? idTalla.hashCode() : 0);
        result = 31 * result + (cantidadAsignada != null ? cantidadAsignada.hashCode() : 0);
        result = 31 * result + (cantidadEntregada != null ? cantidadEntregada.hashCode() : 0);
        result = 31 * result + (indicadorSatisfecho != null ? indicadorSatisfecho.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
