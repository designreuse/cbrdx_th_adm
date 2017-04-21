package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Requerimientos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class RequerimientosEntity {
    private Integer idRequerimiento;
    private Long idSolicitante;
    private String motivo;
    private Integer idCargo;
    private Integer idFormaContratacion;
    private Integer idTipoContratacion;
    private Integer cantidadVacantes;
    private Integer cantidadConvocados;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idResponsableSeleccion;
    private Integer idFormaRecluta;

    @Id
    @Column(name = "IdRequerimiento", nullable = false)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "IdSolicitante", nullable = true)
    public Long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Basic
    @Column(name = "Motivo", nullable = true, length = 200)
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
    @Column(name = "IdFormaContratacion", nullable = true)
    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    @Basic
    @Column(name = "IdTipoContratacion", nullable = true)
    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    @Basic
    @Column(name = "CantidadVacantes", nullable = true)
    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    @Basic
    @Column(name = "CantidadConvocados", nullable = true)
    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
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
    @Column(name = "IdResponsableSeleccion", nullable = true)
    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    @Basic
    @Column(name = "IdFormaRecluta", nullable = true)
    public Integer getIdFormaRecluta() {
        return idFormaRecluta;
    }

    public void setIdFormaRecluta(Integer idFormaRecluta) {
        this.idFormaRecluta = idFormaRecluta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosEntity that = (RequerimientosEntity) o;

        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idSolicitante != null ? !idSolicitante.equals(that.idSolicitante) : that.idSolicitante != null)
            return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idFormaContratacion != null ? !idFormaContratacion.equals(that.idFormaContratacion) : that.idFormaContratacion != null)
            return false;
        if (idTipoContratacion != null ? !idTipoContratacion.equals(that.idTipoContratacion) : that.idTipoContratacion != null)
            return false;
        if (cantidadVacantes != null ? !cantidadVacantes.equals(that.cantidadVacantes) : that.cantidadVacantes != null)
            return false;
        if (cantidadConvocados != null ? !cantidadConvocados.equals(that.cantidadConvocados) : that.cantidadConvocados != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idResponsableSeleccion != null ? !idResponsableSeleccion.equals(that.idResponsableSeleccion) : that.idResponsableSeleccion != null)
            return false;
        if (idFormaRecluta != null ? !idFormaRecluta.equals(that.idFormaRecluta) : that.idFormaRecluta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimiento != null ? idRequerimiento.hashCode() : 0;
        result = 31 * result + (idSolicitante != null ? idSolicitante.hashCode() : 0);
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idFormaContratacion != null ? idFormaContratacion.hashCode() : 0);
        result = 31 * result + (idTipoContratacion != null ? idTipoContratacion.hashCode() : 0);
        result = 31 * result + (cantidadVacantes != null ? cantidadVacantes.hashCode() : 0);
        result = 31 * result + (cantidadConvocados != null ? cantidadConvocados.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idResponsableSeleccion != null ? idResponsableSeleccion.hashCode() : 0);
        result = 31 * result + (idFormaRecluta != null ? idFormaRecluta.hashCode() : 0);
        return result;
    }
}
