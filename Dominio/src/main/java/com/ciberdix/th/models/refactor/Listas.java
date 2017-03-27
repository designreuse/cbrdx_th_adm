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
public class Listas {
    private Integer idLista;
    private String codigoLista;
    private String lista;
    private Integer dependeLista;
    private Integer dependeItem;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdLista")
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "CodigoLista")
    public String getCodigoLista() {
        return codigoLista;
    }

    public void setCodigoLista(String codigoLista) {
        this.codigoLista = codigoLista;
    }

    @Basic
    @Column(name = "Lista")
    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    @Basic
    @Column(name = "DependeLista")
    public Integer getDependeLista() {
        return dependeLista;
    }

    public void setDependeLista(Integer dependeLista) {
        this.dependeLista = dependeLista;
    }

    @Basic
    @Column(name = "DependeItem")
    public Integer getDependeItem() {
        return dependeItem;
    }

    public void setDependeItem(Integer dependeItem) {
        this.dependeItem = dependeItem;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        Listas listas = (Listas) o;

        if (idLista != null ? !idLista.equals(listas.idLista) : listas.idLista != null) return false;
        if (codigoLista != null ? !codigoLista.equals(listas.codigoLista) : listas.codigoLista != null) return false;
        if (lista != null ? !lista.equals(listas.lista) : listas.lista != null) return false;
        if (dependeLista != null ? !dependeLista.equals(listas.dependeLista) : listas.dependeLista != null)
            return false;
        if (dependeItem != null ? !dependeItem.equals(listas.dependeItem) : listas.dependeItem != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(listas.indicadorHabilitado) : listas.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(listas.auditoriaUsuario) : listas.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(listas.auditoriaFecha) : listas.auditoriaFecha != null)
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
