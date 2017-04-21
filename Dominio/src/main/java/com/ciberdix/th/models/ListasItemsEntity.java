package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "ListasItems", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ListasItemsEntity {
    private Integer idListaItem;
    private Integer idLista;
    private String codigoItem;
    private String item;
    private String descripcion;
    private Boolean indicadorPredeterminado;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaItem", nullable = false)
    public Integer getIdListaItem() {
        return idListaItem;
    }

    public void setIdListaItem(Integer idListaItem) {
        this.idListaItem = idListaItem;
    }

    @Basic
    @Column(name = "IdLista", nullable = true)
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "CodigoItem", nullable = true, length = 10)
    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    @Basic
    @Column(name = "Item", nullable = true, length = 30)
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 50)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IndicadorPredeterminado", nullable = true)
    public Boolean getIndicadorPredeterminado() {
        return indicadorPredeterminado;
    }

    public void setIndicadorPredeterminado(Boolean indicadorPredeterminado) {
        this.indicadorPredeterminado = indicadorPredeterminado;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        ListasItemsEntity that = (ListasItemsEntity) o;

        if (idListaItem != null ? !idListaItem.equals(that.idListaItem) : that.idListaItem != null) return false;
        if (idLista != null ? !idLista.equals(that.idLista) : that.idLista != null) return false;
        if (codigoItem != null ? !codigoItem.equals(that.codigoItem) : that.codigoItem != null) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorPredeterminado != null ? !indicadorPredeterminado.equals(that.indicadorPredeterminado) : that.indicadorPredeterminado != null)
            return false;
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
        int result = idListaItem != null ? idListaItem.hashCode() : 0;
        result = 31 * result + (idLista != null ? idLista.hashCode() : 0);
        result = 31 * result + (codigoItem != null ? codigoItem.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorPredeterminado != null ? indicadorPredeterminado.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
