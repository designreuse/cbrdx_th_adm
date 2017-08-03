package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 21/06/2017.
 */
@Entity
@Table(name = "V_RelacionesListas", schema = "dbo", catalog = "CREZCAMOS")
public class VRelacionesListas {
    private Integer idRelacionLista;
    private String listaPadre;
    private Integer idListaPadre;
    private String listaHijo;
    private Integer idListaHijo;
    private Integer idItemPadre;
    private String nombreRelacion;
    private String codigo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRelacionLista", nullable = false)
    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    @Basic
    @Column(name = "ListaPadre", nullable = true, length = 100)
    public String getListaPadre() {
        return listaPadre;
    }

    public void setListaPadre(String listaPadre) {
        this.listaPadre = listaPadre;
    }

    @Basic
    @Column(name = "IdListaPadre", nullable = true)
    public Integer getIdListaPadre() {
        return idListaPadre;
    }

    public void setIdListaPadre(Integer idListaPadre) {
        this.idListaPadre = idListaPadre;
    }

    @Basic
    @Column(name = "ListaHijo", nullable = true, length = 100)
    public String getListaHijo() {
        return listaHijo;
    }

    public void setListaHijo(String listaHijo) {
        this.listaHijo = listaHijo;
    }

    @Basic
    @Column(name = "IdListaHijo", nullable = true)
    public Integer getIdListaHijo() {
        return idListaHijo;
    }

    public void setIdListaHijo(Integer idListaHijo) {
        this.idListaHijo = idListaHijo;
    }

    @Basic
    @Column(name = "IdItemPadre", nullable = true)
    public Integer getIdItemPadre() {
        return idItemPadre;
    }

    public void setIdItemPadre(Integer idItemPadre) {
        this.idItemPadre = idItemPadre;
    }

    @Basic
    @Column(name = "NombreRelacion", nullable = true, length = 50)
    public String getNombreRelacion() {
        return nombreRelacion;
    }

    public void setNombreRelacion(String nombreRelacion) {
        this.nombreRelacion = nombreRelacion;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 50)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

        VRelacionesListas that = (VRelacionesListas) o;

        if (idRelacionLista != null ? !idRelacionLista.equals(that.idRelacionLista) : that.idRelacionLista != null)
            return false;
        if (listaPadre != null ? !listaPadre.equals(that.listaPadre) : that.listaPadre != null) return false;
        if (idListaPadre != null ? !idListaPadre.equals(that.idListaPadre) : that.idListaPadre != null) return false;
        if (listaHijo != null ? !listaHijo.equals(that.listaHijo) : that.listaHijo != null) return false;
        if (idListaHijo != null ? !idListaHijo.equals(that.idListaHijo) : that.idListaHijo != null) return false;
        if (idItemPadre != null ? !idItemPadre.equals(that.idItemPadre) : that.idItemPadre != null) return false;
        if (nombreRelacion != null ? !nombreRelacion.equals(that.nombreRelacion) : that.nombreRelacion != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idRelacionLista != null ? idRelacionLista.hashCode() : 0;
        result = 31 * result + (listaPadre != null ? listaPadre.hashCode() : 0);
        result = 31 * result + (idListaPadre != null ? idListaPadre.hashCode() : 0);
        result = 31 * result + (listaHijo != null ? listaHijo.hashCode() : 0);
        result = 31 * result + (idListaHijo != null ? idListaHijo.hashCode() : 0);
        result = 31 * result + (idItemPadre != null ? idItemPadre.hashCode() : 0);
        result = 31 * result + (nombreRelacion != null ? nombreRelacion.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
