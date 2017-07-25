package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_ProyeccionDotacion", schema = "dbo", catalog = "CREZCAMOS")
public class VProyeccionDotacion {
    private Integer idProyeccionDotacion;
    private String nombreProyeccion;
    private String grupoDotacion;
    private Integer idGrupoDotacion;
    private Boolean indicadorAdicional;
    private Boolean indicadorNoAreas;
    private Integer cantidadProyeccion;
    private Integer cantidadMeses;
    private String periodo;
    private Boolean indicadorHabilitado;
    private String nombreTercero;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Date fechaSolicitud;

    @Id
    @Column(name = "IdProyeccionDotacion", nullable = false)
    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
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
    @Column(name = "GrupoDotacion", nullable = true, length = 50)
    public String getGrupoDotacion() {
        return grupoDotacion;
    }

    public void setGrupoDotacion(String grupoDotacion) {
        this.grupoDotacion = grupoDotacion;
    }

    @Basic
    @Column(name = "IdGrupoDotacion", nullable = true)
    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
    }

    @Basic
    @Column(name = "IndicadorAdicional", nullable = true)
    public Boolean getIndicadorAdicional() {
        return indicadorAdicional;
    }

    public void setIndicadorAdicional(Boolean indicadorAdicional) {
        this.indicadorAdicional = indicadorAdicional;
    }

    @Basic
    @Column(name = "IndicadorNoAreas", nullable = true)
    public Boolean getIndicadorNoAreas() {
        return indicadorNoAreas;
    }

    public void setIndicadorNoAreas(Boolean indicadorNoAreas) {
        this.indicadorNoAreas = indicadorNoAreas;
    }

    @Basic
    @Column(name = "CantidadProyeccion", nullable = true)
    public Integer getCantidadProyeccion() {
        return cantidadProyeccion;
    }

    public void setCantidadProyeccion(Integer cantidadProyeccion) {
        this.cantidadProyeccion = cantidadProyeccion;
    }

    @Basic
    @Column(name = "CantidadMeses", nullable = true)
    public Integer getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(Integer cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    @Basic
    @Column(name = "Periodo", nullable = false, length = 81)
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
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
    @Column(name = "FechaSolicitud", nullable = true)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VProyeccionDotacion that = (VProyeccionDotacion) o;

        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (nombreProyeccion != null ? !nombreProyeccion.equals(that.nombreProyeccion) : that.nombreProyeccion != null)
            return false;
        if (grupoDotacion != null ? !grupoDotacion.equals(that.grupoDotacion) : that.grupoDotacion != null)
            return false;
        if (idGrupoDotacion != null ? !idGrupoDotacion.equals(that.idGrupoDotacion) : that.idGrupoDotacion != null)
            return false;
        if (indicadorAdicional != null ? !indicadorAdicional.equals(that.indicadorAdicional) : that.indicadorAdicional != null)
            return false;
        if (indicadorNoAreas != null ? !indicadorNoAreas.equals(that.indicadorNoAreas) : that.indicadorNoAreas != null)
            return false;
        if (cantidadProyeccion != null ? !cantidadProyeccion.equals(that.cantidadProyeccion) : that.cantidadProyeccion != null)
            return false;
        if (cantidadMeses != null ? !cantidadMeses.equals(that.cantidadMeses) : that.cantidadMeses != null)
            return false;
        if (periodo != null ? !periodo.equals(that.periodo) : that.periodo != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (fechaSolicitud != null ? !fechaSolicitud.equals(that.fechaSolicitud) : that.fechaSolicitud != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0;
        result = 31 * result + (nombreProyeccion != null ? nombreProyeccion.hashCode() : 0);
        result = 31 * result + (grupoDotacion != null ? grupoDotacion.hashCode() : 0);
        result = 31 * result + (idGrupoDotacion != null ? idGrupoDotacion.hashCode() : 0);
        result = 31 * result + (indicadorAdicional != null ? indicadorAdicional.hashCode() : 0);
        result = 31 * result + (indicadorNoAreas != null ? indicadorNoAreas.hashCode() : 0);
        result = 31 * result + (cantidadProyeccion != null ? cantidadProyeccion.hashCode() : 0);
        result = 31 * result + (cantidadMeses != null ? cantidadMeses.hashCode() : 0);
        result = 31 * result + (periodo != null ? periodo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (fechaSolicitud != null ? fechaSolicitud.hashCode() : 0);
        return result;
    }
}
