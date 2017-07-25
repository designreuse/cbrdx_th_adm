package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "ProyeccionesDotacionesTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class ProyeccionesDotacionesTerceros {
    private Integer idProyeccionDotacionTerceros;
    private Integer idProyeccionDotacion;
    private Long idTercero;
    private Integer idEstado;
    private Date fechaEntrega;
    private String comentario;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProyeccionesDotacionesTerceros() {
    }

    public ProyeccionesDotacionesTerceros(Integer idProyeccionDotacion, Long idTercero, Integer idEstado, Date fechaEntrega, String comentario, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.idTercero = idTercero;
        this.idEstado = idEstado;
        this.fechaEntrega = fechaEntrega != null ? new Date(fechaEntrega.getTime()) : null;
        this.comentario = comentario;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProyeccionesDotacionesTerceros(Integer idProyeccionDotacionTerceros, Integer idProyeccionDotacion, Long idTercero, Integer idEstado, Date fechaEntrega, String comentario, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacionTerceros = idProyeccionDotacionTerceros;
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.idTercero = idTercero;
        this.idEstado = idEstado;
        this.fechaEntrega = fechaEntrega != null ? new Date(fechaEntrega.getTime()) : null;
        this.comentario = comentario;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProyeccionDotacionTerceros", nullable = false)
    public Integer getIdProyeccionDotacionTerceros() {
        return idProyeccionDotacionTerceros;
    }

    public void setIdProyeccionDotacionTerceros(Integer idProyeccionDotacionTerceros) {
        this.idProyeccionDotacionTerceros = idProyeccionDotacionTerceros;
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
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "FechaEntrega", nullable = true)
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Basic
    @Column(name = "Comentario", nullable = true, length = 500)
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

        ProyeccionesDotacionesTerceros that = (ProyeccionesDotacionesTerceros) o;

        if (idProyeccionDotacionTerceros != null ? !idProyeccionDotacionTerceros.equals(that.idProyeccionDotacionTerceros) : that.idProyeccionDotacionTerceros != null)
            return false;
        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(that.fechaEntrega) : that.fechaEntrega != null) return false;
        if (comentario != null ? !comentario.equals(that.comentario) : that.comentario != null) return false;
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
        int result = idProyeccionDotacionTerceros != null ? idProyeccionDotacionTerceros.hashCode() : 0;
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (comentario != null ? comentario.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
