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
public class TercerosExamenes {
    private Integer idTerceroExamen;
    private Long idTercero;
    private Integer idCargo;
    private Integer idProveedor;
    private Integer idProveedorServicio;
    private Timestamp fechaProgramada;
    private String observacion;
    private Boolean indicadorNovedad;
    private Integer idDiagnosticoCie;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idEstado;

    @Id
    @Column(name = "IdTerceroExamen", nullable = false)
    public Integer getIdTerceroExamen() {
        return idTerceroExamen;
    }

    public void setIdTerceroExamen(Integer idTerceroExamen) {
        this.idTerceroExamen = idTerceroExamen;
    }

    @Basic
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdCargo", nullable = false)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdProveedor", nullable = false)
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Basic
    @Column(name = "IdProveedorServicio", nullable = false)
    public Integer getIdProveedorServicio() {
        return idProveedorServicio;
    }

    public void setIdProveedorServicio(Integer idProveedorServicio) {
        this.idProveedorServicio = idProveedorServicio;
    }

    @Basic
    @Column(name = "FechaProgramada", nullable = false)
    public Timestamp getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Timestamp fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 100)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "IndicadorNovedad", nullable = true)
    public Boolean getIndicadorNovedad() {
        return indicadorNovedad;
    }

    public void setIndicadorNovedad(Boolean indicadorNovedad) {
        this.indicadorNovedad = indicadorNovedad;
    }

    @Basic
    @Column(name = "IdDiagnosticoCIE", nullable = true)
    public Integer getIdDiagnosticoCie() {
        return idDiagnosticoCie;
    }

    public void setIdDiagnosticoCie(Integer idDiagnosticoCie) {
        this.idDiagnosticoCie = idDiagnosticoCie;
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
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosExamenes that = (TercerosExamenes) o;

        if (idTerceroExamen != null ? !idTerceroExamen.equals(that.idTerceroExamen) : that.idTerceroExamen != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (idProveedorServicio != null ? !idProveedorServicio.equals(that.idProveedorServicio) : that.idProveedorServicio != null)
            return false;
        if (fechaProgramada != null ? !fechaProgramada.equals(that.fechaProgramada) : that.fechaProgramada != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (indicadorNovedad != null ? !indicadorNovedad.equals(that.indicadorNovedad) : that.indicadorNovedad != null)
            return false;
        if (idDiagnosticoCie != null ? !idDiagnosticoCie.equals(that.idDiagnosticoCie) : that.idDiagnosticoCie != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroExamen != null ? idTerceroExamen.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (idProveedorServicio != null ? idProveedorServicio.hashCode() : 0);
        result = 31 * result + (fechaProgramada != null ? fechaProgramada.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (indicadorNovedad != null ? indicadorNovedad.hashCode() : 0);
        result = 31 * result + (idDiagnosticoCie != null ? idDiagnosticoCie.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        return result;
    }
}
