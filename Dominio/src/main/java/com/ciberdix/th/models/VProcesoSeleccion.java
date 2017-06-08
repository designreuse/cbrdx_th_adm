package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/06/2017.
 */
@Entity
@Table(name = "V_ProcesoSeleccion", schema = "dbo", catalog = "CREZCAMOS")
public class VProcesoSeleccion {
    private Integer idProcesoSeleccion;
    private Integer idProcesoPaso;
    private String estadoDiligenciado;
    private Integer idEstadoDiligenciado;
    private String adjunto;
    private Integer idAdjunto;
    private String nombreResponsable;
    private Integer idResponsable;
    private String nombreTercero;
    private Long idTercero;
    private Integer idPublicacion;
    private Boolean indicadorContProceso;
    private String observacion;
    private Date fechaCita;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
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
    @Column(name = "Adjunto", nullable = true, length = 100)
    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdPublicacion", nullable = true)
    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    @Basic
    @Column(name = "IndicadorContProceso", nullable = true)
    public Boolean getIndicadorContProceso() {
        return indicadorContProceso;
    }

    public void setIndicadorContProceso(Boolean indicadorContProceso) {
        this.indicadorContProceso = indicadorContProceso;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VProcesoSeleccion that = (VProcesoSeleccion) o;

        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (idProcesoPaso != null ? !idProcesoPaso.equals(that.idProcesoPaso) : that.idProcesoPaso != null)
            return false;
        if (estadoDiligenciado != null ? !estadoDiligenciado.equals(that.estadoDiligenciado) : that.estadoDiligenciado != null)
            return false;
        if (idEstadoDiligenciado != null ? !idEstadoDiligenciado.equals(that.idEstadoDiligenciado) : that.idEstadoDiligenciado != null)
            return false;
        if (adjunto != null ? !adjunto.equals(that.adjunto) : that.adjunto != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (nombreResponsable != null ? !nombreResponsable.equals(that.nombreResponsable) : that.nombreResponsable != null)
            return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idPublicacion != null ? !idPublicacion.equals(that.idPublicacion) : that.idPublicacion != null)
            return false;
        if (indicadorContProceso != null ? !indicadorContProceso.equals(that.indicadorContProceso) : that.indicadorContProceso != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (fechaCita != null ? !fechaCita.equals(that.fechaCita) : that.fechaCita != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProcesoSeleccion != null ? idProcesoSeleccion.hashCode() : 0;
        result = 31 * result + (idProcesoPaso != null ? idProcesoPaso.hashCode() : 0);
        result = 31 * result + (estadoDiligenciado != null ? estadoDiligenciado.hashCode() : 0);
        result = 31 * result + (idEstadoDiligenciado != null ? idEstadoDiligenciado.hashCode() : 0);
        result = 31 * result + (adjunto != null ? adjunto.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (nombreResponsable != null ? nombreResponsable.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idPublicacion != null ? idPublicacion.hashCode() : 0);
        result = 31 * result + (indicadorContProceso != null ? indicadorContProceso.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (fechaCita != null ? fechaCita.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
