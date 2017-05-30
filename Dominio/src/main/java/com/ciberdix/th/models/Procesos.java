package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Procesos {
    private Integer idProceso;
    private Integer orden;
    private Integer idEstado;
    private Integer idAccion;
    private String descripcionAccion;
    private Boolean indicadorActividad;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdProceso", nullable = false)
    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    @Basic
    @Column(name = "Orden", nullable = false)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
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
    @Column(name = "IdAccion", nullable = true)
    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    @Basic
    @Column(name = "DescripcionAccion", nullable = true, length = 100)
    public String getDescripcionAccion() {
        return descripcionAccion;
    }

    public void setDescripcionAccion(String descripcionAccion) {
        this.descripcionAccion = descripcionAccion;
    }

    @Basic
    @Column(name = "IndicadorActividad", nullable = true)
    public Boolean getIndicadorActividad() {
        return indicadorActividad;
    }

    public void setIndicadorActividad(Boolean indicadorActividad) {
        this.indicadorActividad = indicadorActividad;
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

        Procesos procesos = (Procesos) o;

        if (idProceso != null ? !idProceso.equals(procesos.idProceso) : procesos.idProceso != null) return false;
        if (orden != null ? !orden.equals(procesos.orden) : procesos.orden != null) return false;
        if (idEstado != null ? !idEstado.equals(procesos.idEstado) : procesos.idEstado != null) return false;
        if (idAccion != null ? !idAccion.equals(procesos.idAccion) : procesos.idAccion != null) return false;
        if (descripcionAccion != null ? !descripcionAccion.equals(procesos.descripcionAccion) : procesos.descripcionAccion != null)
            return false;
        if (indicadorActividad != null ? !indicadorActividad.equals(procesos.indicadorActividad) : procesos.indicadorActividad != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(procesos.auditoriaUsuario) : procesos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(procesos.auditoriaFecha) : procesos.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProceso != null ? idProceso.hashCode() : 0;
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (idAccion != null ? idAccion.hashCode() : 0);
        result = 31 * result + (descripcionAccion != null ? descripcionAccion.hashCode() : 0);
        result = 31 * result + (indicadorActividad != null ? indicadorActividad.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
