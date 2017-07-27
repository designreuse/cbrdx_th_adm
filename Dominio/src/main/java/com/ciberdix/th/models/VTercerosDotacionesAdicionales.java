package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "V_TercerosDotacionesAdicionales", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosDotacionesAdicionales {
    private Integer idTerceroDotacionAdicional;
    private String nombreTercero;
    private Long idTercero;
    private String dotacion;
    private BigDecimal costo;
    private Integer idDotacion;
    private Integer cantidadDotacion;
    private String nombreProyeccion;
    private String talla;
    private Integer idTalla;
    private Integer idProyeccionDotacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDotacionAdicional", nullable = false)
    public Integer getIdTerceroDotacionAdicional() {
        return idTerceroDotacionAdicional;
    }

    public void setIdTerceroDotacionAdicional(Integer idTerceroDotacionAdicional) {
        this.idTerceroDotacionAdicional = idTerceroDotacionAdicional;
    }

    @Basic
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
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
    @Column(name = "Dotacion", nullable = true, length = 64)
    public String getDotacion() {
        return dotacion;
    }

    public void setDotacion(String dotacion) {
        this.dotacion = dotacion;
    }

    @Basic
    @Column(name = "Costo", nullable = true, precision = 1)
    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
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
    @Column(name = "NombreProyeccion", nullable = true, length = 200)
    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
    }

    @Basic
    @Column(name = "Talla", nullable = true, length = 100)
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
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

        VTercerosDotacionesAdicionales that = (VTercerosDotacionesAdicionales) o;

        if (idTerceroDotacionAdicional != null ? !idTerceroDotacionAdicional.equals(that.idTerceroDotacionAdicional) : that.idTerceroDotacionAdicional != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (dotacion != null ? !dotacion.equals(that.dotacion) : that.dotacion != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (idDotacion != null ? !idDotacion.equals(that.idDotacion) : that.idDotacion != null) return false;
        if (cantidadDotacion != null ? !cantidadDotacion.equals(that.cantidadDotacion) : that.cantidadDotacion != null)
            return false;
        if (nombreProyeccion != null ? !nombreProyeccion.equals(that.nombreProyeccion) : that.nombreProyeccion != null)
            return false;
        if (talla != null ? !talla.equals(that.talla) : that.talla != null) return false;
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
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (dotacion != null ? dotacion.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (idDotacion != null ? idDotacion.hashCode() : 0);
        result = 31 * result + (cantidadDotacion != null ? cantidadDotacion.hashCode() : 0);
        result = 31 * result + (nombreProyeccion != null ? nombreProyeccion.hashCode() : 0);
        result = 31 * result + (talla != null ? talla.hashCode() : 0);
        result = 31 * result + (idTalla != null ? idTalla.hashCode() : 0);
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
