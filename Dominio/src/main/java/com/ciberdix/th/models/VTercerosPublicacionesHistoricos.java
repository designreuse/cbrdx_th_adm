package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Danny on 11/07/2017.
 */
@Entity
@Table(name = "V_TercerosPublicaciones_Historicos", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosPublicacionesHistoricos {
    private Long idTerceroPublicacionHistorico;
    private Long idTercero;
    private String cargo;
    private Date fechaInicio;
    private String estado;
    private String responsableSeleccion;
    private String codigo;

    @Id
    @Column(name = "IdTerceroPublicacionHistorico", nullable = true)
    public Long getIdTerceroPublicacionHistorico() {
        return idTerceroPublicacionHistorico;
    }

    public void setIdTerceroPublicacionHistorico(Long idTerceroPublicacionHistorico) {
        this.idTerceroPublicacionHistorico = idTerceroPublicacionHistorico;
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
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "Estado", nullable = true, length = 100)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "ResponsableSeleccion", nullable = true, length = 259)
    public String getResponsableSeleccion() {
        return responsableSeleccion;
    }

    public void setResponsableSeleccion(String responsableSeleccion) {
        this.responsableSeleccion = responsableSeleccion;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 20)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosPublicacionesHistoricos that = (VTercerosPublicacionesHistoricos) o;

        if (idTerceroPublicacionHistorico != null ? !idTerceroPublicacionHistorico.equals(that.idTerceroPublicacionHistorico) : that.idTerceroPublicacionHistorico != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (responsableSeleccion != null ? !responsableSeleccion.equals(that.responsableSeleccion) : that.responsableSeleccion != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroPublicacionHistorico != null ? idTerceroPublicacionHistorico.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (responsableSeleccion != null ? responsableSeleccion.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        return result;
    }
}
