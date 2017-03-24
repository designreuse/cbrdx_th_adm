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
public class ListasTiposReferencias {
    private Integer idListaTipoReferencia;
    private String codigoListaTipoReferencia;
    private String nombreListaTipoReferencia;
    private Integer ordenListaTipoReferencia;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoReferencia")
    public Integer getIdListaTipoReferencia() {
        return idListaTipoReferencia;
    }

    public void setIdListaTipoReferencia(Integer idListaTipoReferencia) {
        this.idListaTipoReferencia = idListaTipoReferencia;
    }

    @Basic
    @Column(name = "CodigoListaTipoReferencia")
    public String getCodigoListaTipoReferencia() {
        return codigoListaTipoReferencia;
    }

    public void setCodigoListaTipoReferencia(String codigoListaTipoReferencia) {
        this.codigoListaTipoReferencia = codigoListaTipoReferencia;
    }

    @Basic
    @Column(name = "NombreListaTipoReferencia")
    public String getNombreListaTipoReferencia() {
        return nombreListaTipoReferencia;
    }

    public void setNombreListaTipoReferencia(String nombreListaTipoReferencia) {
        this.nombreListaTipoReferencia = nombreListaTipoReferencia;
    }

    @Basic
    @Column(name = "OrdenListaTipoReferencia")
    public Integer getOrdenListaTipoReferencia() {
        return ordenListaTipoReferencia;
    }

    public void setOrdenListaTipoReferencia(Integer ordenListaTipoReferencia) {
        this.ordenListaTipoReferencia = ordenListaTipoReferencia;
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

        ListasTiposReferencias that = (ListasTiposReferencias) o;

        if (idListaTipoReferencia != null ? !idListaTipoReferencia.equals(that.idListaTipoReferencia) : that.idListaTipoReferencia != null)
            return false;
        if (codigoListaTipoReferencia != null ? !codigoListaTipoReferencia.equals(that.codigoListaTipoReferencia) : that.codigoListaTipoReferencia != null)
            return false;
        if (nombreListaTipoReferencia != null ? !nombreListaTipoReferencia.equals(that.nombreListaTipoReferencia) : that.nombreListaTipoReferencia != null)
            return false;
        if (ordenListaTipoReferencia != null ? !ordenListaTipoReferencia.equals(that.ordenListaTipoReferencia) : that.ordenListaTipoReferencia != null)
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
        int result = idListaTipoReferencia != null ? idListaTipoReferencia.hashCode() : 0;
        result = 31 * result + (codigoListaTipoReferencia != null ? codigoListaTipoReferencia.hashCode() : 0);
        result = 31 * result + (nombreListaTipoReferencia != null ? nombreListaTipoReferencia.hashCode() : 0);
        result = 31 * result + (ordenListaTipoReferencia != null ? ordenListaTipoReferencia.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
