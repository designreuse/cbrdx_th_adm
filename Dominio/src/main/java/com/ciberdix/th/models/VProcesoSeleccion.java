package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 11/07/2017.
 */
@Entity
@Table(name = "V_ProcesoSeleccion", schema = "dbo", catalog = "CREZCAMOS")
public class VProcesoSeleccion {
    private Integer idProcesoSeleccion;
    private String procesoPaso;
    private Integer idProcesoPaso;
    private String estadoDiligenciado;
    private Integer idEstadoDiligenciado;
    private String nombreResponsable;
    private Integer idResponsable;
    private String nombreTercero;
    private Integer idTerceroPublicacion;
    private String observacion;
    private Date fechaCita;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String decisionProcesoSeleccion;
    private Integer idDesicionProcesoSeleccion;
    private String detalleCorreo;

    @Id
    @Column(name = "IdProcesoSeleccion", nullable = false)
    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    @Basic
    @Column(name = "ProcesoPaso", nullable = true, length = 50)
    public String getProcesoPaso() {
        return procesoPaso;
    }

    public void setProcesoPaso(String procesoPaso) {
        this.procesoPaso = procesoPaso;
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
    @Column(name = "EstadoDiligenciado", nullable = true, length = 100)
    public String getEstadoDiligenciado() {
        return estadoDiligenciado;
    }

    public void setEstadoDiligenciado(String estadoDiligenciado) {
        this.estadoDiligenciado = estadoDiligenciado;
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
    @Column(name = "NombreResponsable", nullable = false, length = 259)
    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
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
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
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
    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
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
    @Column(name = "DecisionProcesoSeleccion", nullable = true, length = 100)
    public String getDecisionProcesoSeleccion() {
        return decisionProcesoSeleccion;
    }

    public void setDecisionProcesoSeleccion(String decisionProcesoSeleccion) {
        this.decisionProcesoSeleccion = decisionProcesoSeleccion;
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

        VProcesoSeleccion that = (VProcesoSeleccion) o;

        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (procesoPaso != null ? !procesoPaso.equals(that.procesoPaso) : that.procesoPaso != null) return false;
        if (idProcesoPaso != null ? !idProcesoPaso.equals(that.idProcesoPaso) : that.idProcesoPaso != null)
            return false;
        if (estadoDiligenciado != null ? !estadoDiligenciado.equals(that.estadoDiligenciado) : that.estadoDiligenciado != null)
            return false;
        if (idEstadoDiligenciado != null ? !idEstadoDiligenciado.equals(that.idEstadoDiligenciado) : that.idEstadoDiligenciado != null)
            return false;
        if (nombreResponsable != null ? !nombreResponsable.equals(that.nombreResponsable) : that.nombreResponsable != null)
            return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (idTerceroPublicacion != null ? !idTerceroPublicacion.equals(that.idTerceroPublicacion) : that.idTerceroPublicacion != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (fechaCita != null ? !fechaCita.equals(that.fechaCita) : that.fechaCita != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (decisionProcesoSeleccion != null ? !decisionProcesoSeleccion.equals(that.decisionProcesoSeleccion) : that.decisionProcesoSeleccion != null)
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
        result = 31 * result + (procesoPaso != null ? procesoPaso.hashCode() : 0);
        result = 31 * result + (idProcesoPaso != null ? idProcesoPaso.hashCode() : 0);
        result = 31 * result + (estadoDiligenciado != null ? estadoDiligenciado.hashCode() : 0);
        result = 31 * result + (idEstadoDiligenciado != null ? idEstadoDiligenciado.hashCode() : 0);
        result = 31 * result + (nombreResponsable != null ? nombreResponsable.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (idTerceroPublicacion != null ? idTerceroPublicacion.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (fechaCita != null ? fechaCita.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (decisionProcesoSeleccion != null ? decisionProcesoSeleccion.hashCode() : 0);
        result = 31 * result + (idDesicionProcesoSeleccion != null ? idDesicionProcesoSeleccion.hashCode() : 0);
        result = 31 * result + (detalleCorreo != null ? detalleCorreo.hashCode() : 0);
        return result;
    }
}
