package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Dotaciones {
    private Integer idDotacion;
    private Integer idGrupoDotacion;
    private String dotacion;
    private String descripcion;
    private BigDecimal costo;
    private String detalleProveedor;
    private Integer idCicloEntrega;
    private Integer idTipoTalla;
    private Integer cantidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdDotacion", nullable = false)
    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    @Basic
    @Column(name = "IdGrupoDotacion", nullable = true)
    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
    }

    @Basic
    @Column(name = "Dotacion", nullable = true, length = 64)
    public String getDotacion() {
        return dotacion;
    }

    public void setDotacion(String dotacion) {
        this.dotacion = dotacion;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 200)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "Costo", nullable = true, precision = 1)
    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Basic
    @Column(name = "DetalleProveedor", nullable = true, length = 200)
    public String getDetalleProveedor() {
        return detalleProveedor;
    }

    public void setDetalleProveedor(String detalleProveedor) {
        this.detalleProveedor = detalleProveedor;
    }

    @Basic
    @Column(name = "IdCicloEntrega", nullable = true)
    public Integer getIdCicloEntrega() {
        return idCicloEntrega;
    }

    public void setIdCicloEntrega(Integer idCicloEntrega) {
        this.idCicloEntrega = idCicloEntrega;
    }

    @Basic
    @Column(name = "IdTipoTalla", nullable = true)
    public Integer getIdTipoTalla() {
        return idTipoTalla;
    }

    public void setIdTipoTalla(Integer idTipoTalla) {
        this.idTipoTalla = idTipoTalla;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        Dotaciones that = (Dotaciones) o;

        if (idDotacion != null ? !idDotacion.equals(that.idDotacion) : that.idDotacion != null) return false;
        if (idGrupoDotacion != null ? !idGrupoDotacion.equals(that.idGrupoDotacion) : that.idGrupoDotacion != null)
            return false;
        if (dotacion != null ? !dotacion.equals(that.dotacion) : that.dotacion != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (detalleProveedor != null ? !detalleProveedor.equals(that.detalleProveedor) : that.detalleProveedor != null)
            return false;
        if (idCicloEntrega != null ? !idCicloEntrega.equals(that.idCicloEntrega) : that.idCicloEntrega != null)
            return false;
        if (idTipoTalla != null ? !idTipoTalla.equals(that.idTipoTalla) : that.idTipoTalla != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDotacion != null ? idDotacion.hashCode() : 0;
        result = 31 * result + (idGrupoDotacion != null ? idGrupoDotacion.hashCode() : 0);
        result = 31 * result + (dotacion != null ? dotacion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (detalleProveedor != null ? detalleProveedor.hashCode() : 0);
        result = 31 * result + (idCicloEntrega != null ? idCicloEntrega.hashCode() : 0);
        result = 31 * result + (idTipoTalla != null ? idTipoTalla.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
