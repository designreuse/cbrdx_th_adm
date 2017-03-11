package com.ciberdix.th.model;

import java.sql.Timestamp;

public class Listas {
    private Integer idLista;
    private String codigoLista;
    private String lista;
    private Integer dependeLista;
    private Integer dependeItem;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public String getCodigoLista() {
        return codigoLista;
    }

    public void setCodigoLista(String codigoLista) {
        this.codigoLista = codigoLista;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public Integer getDependeLista() {
        return dependeLista;
    }

    public void setDependeLista(Integer dependeLista) {
        this.dependeLista = dependeLista;
    }

    public Integer getDependeItem() {
        return dependeItem;
    }

    public void setDependeItem(Integer dependeItem) {
        this.dependeItem = dependeItem;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

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

        Listas that = (Listas) o;

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
