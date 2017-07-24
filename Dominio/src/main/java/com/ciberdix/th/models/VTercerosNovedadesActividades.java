package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_TercerosNovedadesActividades", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosNovedadesActividades {
    private Integer idTerceroNovedadActividad;
    private String tipoNovedad;
    private Integer idTipoNovedad;
    private String novedad;
    private Timestamp fechaSolicitudNovedad;
    private String nombreTercero;
    private Integer idTerceroNovedad;
    private Timestamp fechaCreacion;
    private String estadoNovedad;
    private Integer idEstadoNovedad;
    private String actividadRealizada;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroNovedadActividad", nullable = false)
    public Integer getIdTerceroNovedadActividad() {
        return idTerceroNovedadActividad;
    }

    public void setIdTerceroNovedadActividad(Integer idTerceroNovedadActividad) {
        this.idTerceroNovedadActividad = idTerceroNovedadActividad;
    }

    @Basic
    @Column(name = "TipoNovedad", nullable = true, length = 100)
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    @Basic
    @Column(name = "IdTipoNovedad", nullable = true)
    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    @Basic
    @Column(name = "Novedad", nullable = true, length = 100)
    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    @Basic
    @Column(name = "FechaSolicitudNovedad", nullable = true)
    public Timestamp getFechaSolicitudNovedad() {
        return fechaSolicitudNovedad;
    }

    public void setFechaSolicitudNovedad(Timestamp fechaSolicitudNovedad) {
        this.fechaSolicitudNovedad = fechaSolicitudNovedad;
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
    @Column(name = "IdTerceroNovedad", nullable = true)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "FechaCreacion", nullable = true)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "EstadoNovedad", nullable = true, length = 100)
    public String getEstadoNovedad() {
        return estadoNovedad;
    }

    public void setEstadoNovedad(String estadoNovedad) {
        this.estadoNovedad = estadoNovedad;
    }

    @Basic
    @Column(name = "IdEstadoNovedad", nullable = true)
    public Integer getIdEstadoNovedad() {
        return idEstadoNovedad;
    }

    public void setIdEstadoNovedad(Integer idEstadoNovedad) {
        this.idEstadoNovedad = idEstadoNovedad;
    }

    @Basic
    @Column(name = "ActividadRealizada", nullable = true, length = 500)
    public String getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(String actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
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

        VTercerosNovedadesActividades that = (VTercerosNovedadesActividades) o;

        if (idTerceroNovedadActividad != null ? !idTerceroNovedadActividad.equals(that.idTerceroNovedadActividad) : that.idTerceroNovedadActividad != null)
            return false;
        if (tipoNovedad != null ? !tipoNovedad.equals(that.tipoNovedad) : that.tipoNovedad != null) return false;
        if (idTipoNovedad != null ? !idTipoNovedad.equals(that.idTipoNovedad) : that.idTipoNovedad != null)
            return false;
        if (novedad != null ? !novedad.equals(that.novedad) : that.novedad != null) return false;
        if (fechaSolicitudNovedad != null ? !fechaSolicitudNovedad.equals(that.fechaSolicitudNovedad) : that.fechaSolicitudNovedad != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (estadoNovedad != null ? !estadoNovedad.equals(that.estadoNovedad) : that.estadoNovedad != null)
            return false;
        if (idEstadoNovedad != null ? !idEstadoNovedad.equals(that.idEstadoNovedad) : that.idEstadoNovedad != null)
            return false;
        if (actividadRealizada != null ? !actividadRealizada.equals(that.actividadRealizada) : that.actividadRealizada != null)
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
        int result = idTerceroNovedadActividad != null ? idTerceroNovedadActividad.hashCode() : 0;
        result = 31 * result + (tipoNovedad != null ? tipoNovedad.hashCode() : 0);
        result = 31 * result + (idTipoNovedad != null ? idTipoNovedad.hashCode() : 0);
        result = 31 * result + (novedad != null ? novedad.hashCode() : 0);
        result = 31 * result + (fechaSolicitudNovedad != null ? fechaSolicitudNovedad.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (estadoNovedad != null ? estadoNovedad.hashCode() : 0);
        result = 31 * result + (idEstadoNovedad != null ? idEstadoNovedad.hashCode() : 0);
        result = 31 * result + (actividadRealizada != null ? actividadRealizada.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
