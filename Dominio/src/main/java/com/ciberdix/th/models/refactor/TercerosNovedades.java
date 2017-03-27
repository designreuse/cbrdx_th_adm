package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosNovedades {
    private Integer idTerceroNovedad;
    private Integer idTipoNovedad;
    private String descripcion;
    private Timestamp fechaDesde;
    private Timestamp fechaHasta;
    private Integer idEstado;
    private String observacionEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroNovedad")
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "IdTipoNovedad")
    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "FechaDesde")
    public Timestamp getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Timestamp fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    @Basic
    @Column(name = "FechaHasta")
    public Timestamp getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Timestamp fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "ObservacionEstado")
    public String getObservacionEstado() {
        return observacionEstado;
    }

    public void setObservacionEstado(String observacionEstado) {
        this.observacionEstado = observacionEstado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        TercerosNovedades that = (TercerosNovedades) o;

        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (idTipoNovedad != null ? !idTipoNovedad.equals(that.idTipoNovedad) : that.idTipoNovedad != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaDesde != null ? !fechaDesde.equals(that.fechaDesde) : that.fechaDesde != null) return false;
        if (fechaHasta != null ? !fechaHasta.equals(that.fechaHasta) : that.fechaHasta != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (observacionEstado != null ? !observacionEstado.equals(that.observacionEstado) : that.observacionEstado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0;
        result = 31 * result + (idTipoNovedad != null ? idTipoNovedad.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechaDesde != null ? fechaDesde.hashCode() : 0);
        result = 31 * result + (fechaHasta != null ? fechaHasta.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (observacionEstado != null ? observacionEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
