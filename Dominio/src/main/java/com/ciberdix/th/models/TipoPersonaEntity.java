package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposPersonas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TipoPersonaEntity {
    private Integer idListaTipoPersona;
    private String codigoListaTipoPersona;
    private String nombreListaTipoPersona;
    private Integer ordenListaTipoPersona;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TipoPersonaEntity(int idListaTipoPersona, String codigoListaTipoPersona, String nombreListaTipoPersona, int ordenListaTipoPersona, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaTipoPersona = idListaTipoPersona;
        this.codigoListaTipoPersona = codigoListaTipoPersona;
        this.nombreListaTipoPersona = nombreListaTipoPersona;
        this.ordenListaTipoPersona = ordenListaTipoPersona;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoPersonaEntity() {
    }

    @Id
    @Column(name = "IdListaTipoPersona", nullable = false)
    public Integer getIdListaTipoPersona() {
        return idListaTipoPersona;
    }

    public void setIdListaTipoPersona(Integer idListaTipoPersona) {
        this.idListaTipoPersona = idListaTipoPersona;
    }

    @Basic
    @Column(name = "CodigoListaTipoPersona", nullable = false)
    public String getCodigoListaTipoPersona() {
        return codigoListaTipoPersona;
    }

    public void setCodigoListaTipoPersona(String codigoListaTipoPersona) {
        this.codigoListaTipoPersona = codigoListaTipoPersona;
    }

    @Basic
    @Column(name = "NombreListaTipoPersona", nullable = false)
    public String getNombreListaTipoPersona() {
        return nombreListaTipoPersona;
    }

    public void setNombreListaTipoPersona(String nombreListaTipoPersona) {
        this.nombreListaTipoPersona = nombreListaTipoPersona;
    }

    @Basic
    @Column(name = "OrdenListaTipoPersona", nullable = false)
    public Integer getOrdenListaTipoPersona() {
        return ordenListaTipoPersona;
    }

    public void setOrdenListaTipoPersona(Integer ordenListaTipoPersona) {
        this.ordenListaTipoPersona = ordenListaTipoPersona;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
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
        if (!(o instanceof TipoPersonaEntity)) return false;

        TipoPersonaEntity that = (TipoPersonaEntity) o;

        if (isIndicadorHabilitado() != that.isIndicadorHabilitado()) return false;
        if (getIdListaTipoPersona() != null ? !getIdListaTipoPersona().equals(that.getIdListaTipoPersona()) : that.getIdListaTipoPersona() != null)
            return false;
        if (getCodigoListaTipoPersona() != null ? !getCodigoListaTipoPersona().equals(that.getCodigoListaTipoPersona()) : that.getCodigoListaTipoPersona() != null)
            return false;
        if (getNombreListaTipoPersona() != null ? !getNombreListaTipoPersona().equals(that.getNombreListaTipoPersona()) : that.getNombreListaTipoPersona() != null)
            return false;
        if (getOrdenListaTipoPersona() != null ? !getOrdenListaTipoPersona().equals(that.getOrdenListaTipoPersona()) : that.getOrdenListaTipoPersona() != null)
            return false;
        if (getAuditoriaUsuario() != null ? !getAuditoriaUsuario().equals(that.getAuditoriaUsuario()) : that.getAuditoriaUsuario() != null)
            return false;
        return getAuditoriaFecha() != null ? getAuditoriaFecha().equals(that.getAuditoriaFecha()) : that.getAuditoriaFecha() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdListaTipoPersona() != null ? getIdListaTipoPersona().hashCode() : 0;
        result = 31 * result + (getCodigoListaTipoPersona() != null ? getCodigoListaTipoPersona().hashCode() : 0);
        result = 31 * result + (getNombreListaTipoPersona() != null ? getNombreListaTipoPersona().hashCode() : 0);
        result = 31 * result + (getOrdenListaTipoPersona() != null ? getOrdenListaTipoPersona().hashCode() : 0);
        result = 31 * result + (isIndicadorHabilitado() ? 1 : 0);
        result = 31 * result + (getAuditoriaUsuario() != null ? getAuditoriaUsuario().hashCode() : 0);
        result = 31 * result + (getAuditoriaFecha() != null ? getAuditoriaFecha().hashCode() : 0);
        return result;
    }
}
