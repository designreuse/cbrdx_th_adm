package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosDotaciones", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TercerosDotacionesEntity {
    private Integer idTerceroDotacion;
    private Integer idTerceroDotacionEntrega;
    private Long idTercero;
    private Integer idCargo;
    private Integer idDotacion;
    private Integer cantidad;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDotacion", nullable = false)
    public Integer getIdTerceroDotacion() {
        return idTerceroDotacion;
    }

    public void setIdTerceroDotacion(Integer idTerceroDotacion) {
        this.idTerceroDotacion = idTerceroDotacion;
    }

    @Basic
    @Column(name = "IdTerceroDotacionEntrega", nullable = true)
    public Integer getIdTerceroDotacionEntrega() {
        return idTerceroDotacionEntrega;
    }

    public void setIdTerceroDotacionEntrega(Integer idTerceroDotacionEntrega) {
        this.idTerceroDotacionEntrega = idTerceroDotacionEntrega;
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
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
    @Column(name = "Cantidad", nullable = true)
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

        TercerosDotacionesEntity that = (TercerosDotacionesEntity) o;

        if (idTerceroDotacion != null ? !idTerceroDotacion.equals(that.idTerceroDotacion) : that.idTerceroDotacion != null)
            return false;
        if (idTerceroDotacionEntrega != null ? !idTerceroDotacionEntrega.equals(that.idTerceroDotacionEntrega) : that.idTerceroDotacionEntrega != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idDotacion != null ? !idDotacion.equals(that.idDotacion) : that.idDotacion != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDotacion != null ? idTerceroDotacion.hashCode() : 0;
        result = 31 * result + (idTerceroDotacionEntrega != null ? idTerceroDotacionEntrega.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idDotacion != null ? idDotacion.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
