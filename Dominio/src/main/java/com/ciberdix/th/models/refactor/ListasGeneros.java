package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import javax.persistence.Table;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "ListasGeneros", schema = "crz_th", catalog = "CREZCAMOS")
public class ListasGeneros {
    private Integer idListaGenero;
    private String codigoListaGenero;
    private String nombreListaGenero;
    private Integer ordenListaGenero;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaGenero")
    public Integer getIdListaGenero() {
        return idListaGenero;
    }

    public void setIdListaGenero(Integer idListaGenero) {
        this.idListaGenero = idListaGenero;
    }

    @Basic
    @Column(name = "CodigoListaGenero")
    public String getCodigoListaGenero() {
        return codigoListaGenero;
    }

    public void setCodigoListaGenero(String codigoListaGenero) {
        this.codigoListaGenero = codigoListaGenero;
    }

    @Basic
    @Column(name = "NombreListaGenero")
    public String getNombreListaGenero() {
        return nombreListaGenero;
    }

    public void setNombreListaGenero(String nombreListaGenero) {
        this.nombreListaGenero = nombreListaGenero;
    }

    @Basic
    @Column(name = "OrdenListaGenero")
    public Integer getOrdenListaGenero() {
        return ordenListaGenero;
    }

    public void setOrdenListaGenero(Integer ordenListaGenero) {
        this.ordenListaGenero = ordenListaGenero;
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

        ListasGeneros that = (ListasGeneros) o;

        if (idListaGenero != null ? !idListaGenero.equals(that.idListaGenero) : that.idListaGenero != null)
            return false;
        if (codigoListaGenero != null ? !codigoListaGenero.equals(that.codigoListaGenero) : that.codigoListaGenero != null)
            return false;
        if (nombreListaGenero != null ? !nombreListaGenero.equals(that.nombreListaGenero) : that.nombreListaGenero != null)
            return false;
        if (ordenListaGenero != null ? !ordenListaGenero.equals(that.ordenListaGenero) : that.ordenListaGenero != null)
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
        int result = idListaGenero != null ? idListaGenero.hashCode() : 0;
        result = 31 * result + (codigoListaGenero != null ? codigoListaGenero.hashCode() : 0);
        result = 31 * result + (nombreListaGenero != null ? nombreListaGenero.hashCode() : 0);
        result = 31 * result + (ordenListaGenero != null ? ordenListaGenero.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
