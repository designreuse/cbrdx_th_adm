package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
@Entity
@Table(name = "RelacionesListasHijos", schema = "dbo", catalog = "CREZCAMOS")
public class RelacionesListasHijos {
    private Integer idRelacionListaHijo;
    private Integer idRelacionLista;
    private Integer idItemHijo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RelacionesListasHijos() {
    }

    public RelacionesListasHijos(Integer idRelacionLista, Integer idItemHijo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRelacionLista = idRelacionLista;
        this.idItemHijo = idItemHijo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public RelacionesListasHijos(Integer idRelacionListaHijo, Integer idRelacionLista, Integer idItemHijo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRelacionListaHijo = idRelacionListaHijo;
        this.idRelacionLista = idRelacionLista;
        this.idItemHijo = idItemHijo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRelacionListaHijo", nullable = false)
    public Integer getIdRelacionListaHijo() {
        return idRelacionListaHijo;
    }

    public void setIdRelacionListaHijo(Integer idRelacionListaHijo) {
        this.idRelacionListaHijo = idRelacionListaHijo;
    }

    @Basic
    @Column(name = "IdRelacionLista", nullable = true)
    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    @Basic
    @Column(name = "IdItemHijo", nullable = true)
    public Integer getIdItemHijo() {
        return idItemHijo;
    }

    public void setIdItemHijo(Integer idItemHijo) {
        this.idItemHijo = idItemHijo;
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

        RelacionesListasHijos that = (RelacionesListasHijos) o;

        if (idRelacionListaHijo != null ? !idRelacionListaHijo.equals(that.idRelacionListaHijo) : that.idRelacionListaHijo != null)
            return false;
        if (idRelacionLista != null ? !idRelacionLista.equals(that.idRelacionLista) : that.idRelacionLista != null)
            return false;
        if (idItemHijo != null ? !idItemHijo.equals(that.idItemHijo) : that.idItemHijo != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idRelacionListaHijo != null ? idRelacionListaHijo.hashCode() : 0;
        result = 31 * result + (idRelacionLista != null ? idRelacionLista.hashCode() : 0);
        result = 31 * result + (idItemHijo != null ? idItemHijo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
