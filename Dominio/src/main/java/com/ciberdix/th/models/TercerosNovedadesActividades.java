package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosNovedadesActividades", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosNovedadesActividades {
    private Integer idTerceroNovedadActividad;
    private Integer idTerceroNovedad;
    private Timestamp fechaCreacion;
    private Integer idEstadoNovedad;
    private String actividadRealizada;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosNovedadesActividades() {
    }

    public TercerosNovedadesActividades(Integer idTerceroNovedad, Integer idEstadoNovedad, String actividadRealizada, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroNovedad = idTerceroNovedad;
        this.idEstadoNovedad = idEstadoNovedad;
        this.fechaCreacion = new Timestamp(System.currentTimeMillis());
        this.actividadRealizada = actividadRealizada;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosNovedadesActividades(Integer idTerceroNovedadActividad, Integer idTerceroNovedad, Timestamp fechaCreacion, Integer idEstadoNovedad, String actividadRealizada, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroNovedadActividad = idTerceroNovedadActividad;
        this.idTerceroNovedad = idTerceroNovedad;
        this.fechaCreacion = fechaCreacion;
        this.idEstadoNovedad = idEstadoNovedad;
        this.actividadRealizada = actividadRealizada;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroNovedadActividad", nullable = false)
    public Integer getIdTerceroNovedadActividad() {
        return idTerceroNovedadActividad;
    }

    public void setIdTerceroNovedadActividad(Integer idTerceroNovedadActividad) {
        this.idTerceroNovedadActividad = idTerceroNovedadActividad;
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

        TercerosNovedadesActividades that = (TercerosNovedadesActividades) o;

        if (idTerceroNovedadActividad != null ? !idTerceroNovedadActividad.equals(that.idTerceroNovedadActividad) : that.idTerceroNovedadActividad != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
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
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (idEstadoNovedad != null ? idEstadoNovedad.hashCode() : 0);
        result = 31 * result + (actividadRealizada != null ? actividadRealizada.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
