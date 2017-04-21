package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Listas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ListasEntity {
    private Integer idLista;
    private String codigoLista;
    private String lista;
    private Integer dependeLista;
    private Integer dependeItem;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdLista", nullable = false)
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "CodigoLista", nullable = true, length = 10)
    public String getCodigoLista() {
        return codigoLista;
    }

    public void setCodigoLista(String codigoLista) {
        this.codigoLista = codigoLista;
    }

    @Basic
    @Column(name = "Lista", nullable = true, length = 40)
    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    @Basic
    @Column(name = "DependeLista", nullable = true)
    public Integer getDependeLista() {
        return dependeLista;
    }

    public void setDependeLista(Integer dependeLista) {
        this.dependeLista = dependeLista;
    }

    @Basic
    @Column(name = "DependeItem", nullable = true)
    public Integer getDependeItem() {
        return dependeItem;
    }

    public void setDependeItem(Integer dependeItem) {
        this.dependeItem = dependeItem;
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

        ListasEntity that = (ListasEntity) o;

        if (idLista != null ? !idLista.equals(that.idLista) : that.idLista != null) return false;
        if (codigoLista != null ? !codigoLista.equals(that.codigoLista) : that.codigoLista != null) return false;
        if (lista != null ? !lista.equals(that.lista) : that.lista != null) return false;
        if (dependeLista != null ? !dependeLista.equals(that.dependeLista) : that.dependeLista != null) return false;
        if (dependeItem != null ? !dependeItem.equals(that.dependeItem) : that.dependeItem != null) return false;
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
        int result = idLista != null ? idLista.hashCode() : 0;
        result = 31 * result + (codigoLista != null ? codigoLista.hashCode() : 0);
        result = 31 * result + (lista != null ? lista.hashCode() : 0);
        result = 31 * result + (dependeLista != null ? dependeLista.hashCode() : 0);
        result = 31 * result + (dependeItem != null ? dependeItem.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
