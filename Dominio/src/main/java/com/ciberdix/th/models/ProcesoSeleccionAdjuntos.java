package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 14/06/2017.
 */
@Entity
@Table(name = "ProcesoSeleccionAdjuntos", schema = "dbo", catalog = "CREZCAMOS")
public class ProcesoSeleccionAdjuntos {
    private Integer idProcesoSeleccionAdjunto;
    private Integer idProcesoPaso;
    private Integer idTerceroPublicacion;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProcesoSeleccionAdjuntos() {
    }

    public ProcesoSeleccionAdjuntos(Integer idProcesoPaso, Integer idTerceroPublicacion, Integer idAdjunto, Integer auditoriaUsuario) {
        this.idProcesoPaso = idProcesoPaso;
        this.idTerceroPublicacion = idTerceroPublicacion;
        this.idAdjunto = idAdjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProcesoSeleccionAdjuntos(Integer idProcesoSeleccionAdjunto, Integer idProcesoPaso, Integer idTerceroPublicacion, Integer idAdjunto, Integer auditoriaUsuario) {
        this.idProcesoSeleccionAdjunto = idProcesoSeleccionAdjunto;
        this.idProcesoPaso = idProcesoPaso;
        this.idTerceroPublicacion = idTerceroPublicacion;
        this.idAdjunto = idAdjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProcesoSeleccionAdjunto", nullable = false)
    public Integer getIdProcesoSeleccionAdjunto() {
        return idProcesoSeleccionAdjunto;
    }

    public void setIdProcesoSeleccionAdjunto(Integer idProcesoSeleccionAdjunto) {
        this.idProcesoSeleccionAdjunto = idProcesoSeleccionAdjunto;
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
    @Column(name = "IdTerceroPublicacion", nullable = true)
    public Integer getIdTerceroPublicacion() {
        return idTerceroPublicacion;
    }

    public void setIdTerceroPublicacion(Integer idTerceroPublicacion) {
        this.idTerceroPublicacion = idTerceroPublicacion;
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

        ProcesoSeleccionAdjuntos that = (ProcesoSeleccionAdjuntos) o;

        if (idProcesoSeleccionAdjunto != null ? !idProcesoSeleccionAdjunto.equals(that.idProcesoSeleccionAdjunto) : that.idProcesoSeleccionAdjunto != null)
            return false;
        if (idProcesoPaso != null ? !idProcesoPaso.equals(that.idProcesoPaso) : that.idProcesoPaso != null)
            return false;
        if (idTerceroPublicacion != null ? !idTerceroPublicacion.equals(that.idTerceroPublicacion) : that.idTerceroPublicacion != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProcesoSeleccionAdjunto != null ? idProcesoSeleccionAdjunto.hashCode() : 0;
        result = 31 * result + (idProcesoPaso != null ? idProcesoPaso.hashCode() : 0);
        result = 31 * result + (idTerceroPublicacion != null ? idTerceroPublicacion.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
