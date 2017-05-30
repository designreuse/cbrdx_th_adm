package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 18/05/2017.
 */
@Entity
@Table(name = "RequerimientosCompras", schema = "dbo", catalog = "CREZCAMOS")
public class RequerimientosCompras {
    private Integer idRequerimientoCompra;
    private Integer idRequerimiento;
    private Integer idCompra;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public RequerimientosCompras() {
    }

    public RequerimientosCompras(Integer idRequerimiento, Integer idCompra, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idRequerimiento = idRequerimiento;
        this.idCompra = idCompra;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public RequerimientosCompras(Integer idRequerimientoCompra, Integer idRequerimiento, Integer idCompra, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idRequerimientoCompra = idRequerimientoCompra;
        this.idRequerimiento = idRequerimiento;
        this.idCompra = idCompra;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimientoCompra", nullable = false)
    public Integer getIdRequerimientoCompra() {
        return idRequerimientoCompra;
    }

    public void setIdRequerimientoCompra(Integer idRequerimientoCompra) {
        this.idRequerimientoCompra = idRequerimientoCompra;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = false)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "IdCompra", nullable = true)
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosCompras that = (RequerimientosCompras) o;

        if (idRequerimientoCompra != null ? !idRequerimientoCompra.equals(that.idRequerimientoCompra) : that.idRequerimientoCompra != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idCompra != null ? !idCompra.equals(that.idCompra) : that.idCompra != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoCompra != null ? idRequerimientoCompra.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (idCompra != null ? idCompra.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
