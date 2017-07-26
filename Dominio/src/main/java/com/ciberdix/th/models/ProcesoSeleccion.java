package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 14/07/2017.
 */
@Entity
@Table(name = "ProcesoSeleccion", schema = "dbo", catalog = "CREZCAMOS")
public class ProcesoSeleccion {
    private Integer idProcesoSeleccion;
    private Integer idProcesoPaso;
    private Integer idEstadoDiligenciado;
    private Integer idResponsable;
    private Integer idTerceroPublicacion;
    private String observacion;
    private Timestamp fechaCita;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idDesicionProcesoSeleccion;
    private String detalleCorreo;

    public ProcesoSeleccion() {
    }

    public ProcesoSeleccion(Integer idProcesoPaso, Integer idEstadoDiligenciado, Integer idResponsable, Integer idTerceroPublicacion, String observacion, Timestamp fechaCita, Integer auditoriaUsuario, Integer idDesicionProcesoSeleccion, String detalleCorreo) {
        this.idProcesoPaso = idProcesoPaso;
        this.idEstadoDiligenciado = idEstadoDiligenciado;
        this.idResponsable = idResponsable;
        this.idTerceroPublicacion = idTerceroPublicacion;
        this.observacion = observacion;
        this.fechaCita = fechaCita;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idDesicionProcesoSeleccion = idDesicionProcesoSeleccion;
        this.detalleCorreo = detalleCorreo;
    }

    public ProcesoSeleccion(Integer idProcesoSeleccion, Integer idProcesoPaso, Integer idEstadoDiligenciado, Integer idResponsable, Integer idTerceroPublicacion, String observacion, Timestamp fechaCita, Integer auditoriaUsuario, Integer idDesicionProcesoSeleccion, String detalleCorreo) {
        this.idProcesoSeleccion = idProcesoSeleccion;
        this.idProcesoPaso = idProcesoPaso;
        this.idEstadoDiligenciado = idEstadoDiligenciado;
        this.idResponsable = idResponsable;
        this.idTerceroPublicacion = idTerceroPublicacion;
        this.observacion = observacion;
        this.fechaCita = fechaCita;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idDesicionProcesoSeleccion = idDesicionProcesoSeleccion;
        this.detalleCorreo = detalleCorreo;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProcesoSeleccion", nullable = false)
    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    @Basic
    @Column(name = "IdProcesoPaso", nullable = true)
    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    @Basic
    @Column(name = "IdEstadoDiligenciado", nullable = true)
    public Integer getIdEstadoDiligenciado() {
        return idEstadoDiligenciado;
    }

    public void setIdEstadoDiligenciado(Integer idEstadoDiligenciado) {
        this.idEstadoDiligenciado = idEstadoDiligenciado;
    }

    @Basic
    @Column(name = "IdResponsable", nullable = true)
    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Basic
    @Column(name = "IdTerceroPublicacion", nullable = true)
    public Integer getIdTerceroPublicacion() {
        return idTerceroPublicacion;
    }

    public void setIdTerceroPublicacion(Integer idTerceroPublicacion) {
        this.idTerceroPublicacion = idTerceroPublicacion;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 500)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "FechaCita", nullable = true)
    public Timestamp getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Timestamp fechaCita) {
        this.fechaCita = fechaCita;
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
    @Column(name = "IdDesicionProcesoSeleccion", nullable = true)
    public Integer getIdDesicionProcesoSeleccion() {
        return idDesicionProcesoSeleccion;
    }

    public void setIdDesicionProcesoSeleccion(Integer idDesicionProcesoSeleccion) {
        this.idDesicionProcesoSeleccion = idDesicionProcesoSeleccion;
    }

    @Basic
    @Column(name = "DetalleCorreo", nullable = true, length = 500)
    public String getDetalleCorreo() {
        return detalleCorreo;
    }

    public void setDetalleCorreo(String detalleCorreo) {
        this.detalleCorreo = detalleCorreo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcesoSeleccion that = (ProcesoSeleccion) o;

        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (idProcesoPaso != null ? !idProcesoPaso.equals(that.idProcesoPaso) : that.idProcesoPaso != null)
            return false;
        if (idEstadoDiligenciado != null ? !idEstadoDiligenciado.equals(that.idEstadoDiligenciado) : that.idEstadoDiligenciado != null)
            return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (idTerceroPublicacion != null ? !idTerceroPublicacion.equals(that.idTerceroPublicacion) : that.idTerceroPublicacion != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (fechaCita != null ? !fechaCita.equals(that.fechaCita) : that.fechaCita != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idDesicionProcesoSeleccion != null ? !idDesicionProcesoSeleccion.equals(that.idDesicionProcesoSeleccion) : that.idDesicionProcesoSeleccion != null)
            return false;
        if (detalleCorreo != null ? !detalleCorreo.equals(that.detalleCorreo) : that.detalleCorreo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProcesoSeleccion != null ? idProcesoSeleccion.hashCode() : 0;
        result = 31 * result + (idProcesoPaso != null ? idProcesoPaso.hashCode() : 0);
        result = 31 * result + (idEstadoDiligenciado != null ? idEstadoDiligenciado.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (idTerceroPublicacion != null ? idTerceroPublicacion.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (fechaCita != null ? fechaCita.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idDesicionProcesoSeleccion != null ? idDesicionProcesoSeleccion.hashCode() : 0);
        result = 31 * result + (detalleCorreo != null ? detalleCorreo.hashCode() : 0);
        return result;
    }
}
