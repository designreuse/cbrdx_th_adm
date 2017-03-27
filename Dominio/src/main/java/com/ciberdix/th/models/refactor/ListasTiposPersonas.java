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
@Table(name = "ListasTiposPersonas", schema = "crz_th", catalog = "CREZCAMOS")
public class ListasTiposPersonas {
    private Integer idListaTipoPersona;
    private String codigoListaTipoPersona;
    private String nombreListaTipoPersona;
    private Integer ordenListaTipoPersona;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoPersona")
    public Integer getIdListaTipoPersona() {
        return idListaTipoPersona;
    }

    public void setIdListaTipoPersona(Integer idListaTipoPersona) {
        this.idListaTipoPersona = idListaTipoPersona;
    }

    @Basic
    @Column(name = "CodigoListaTipoPersona")
    public String getCodigoListaTipoPersona() {
        return codigoListaTipoPersona;
    }

    public void setCodigoListaTipoPersona(String codigoListaTipoPersona) {
        this.codigoListaTipoPersona = codigoListaTipoPersona;
    }

    @Basic
    @Column(name = "NombreListaTipoPersona")
    public String getNombreListaTipoPersona() {
        return nombreListaTipoPersona;
    }

    public void setNombreListaTipoPersona(String nombreListaTipoPersona) {
        this.nombreListaTipoPersona = nombreListaTipoPersona;
    }

    @Basic
    @Column(name = "OrdenListaTipoPersona")
    public Integer getOrdenListaTipoPersona() {
        return ordenListaTipoPersona;
    }

    public void setOrdenListaTipoPersona(Integer ordenListaTipoPersona) {
        this.ordenListaTipoPersona = ordenListaTipoPersona;
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

        ListasTiposPersonas that = (ListasTiposPersonas) o;

        if (idListaTipoPersona != null ? !idListaTipoPersona.equals(that.idListaTipoPersona) : that.idListaTipoPersona != null)
            return false;
        if (codigoListaTipoPersona != null ? !codigoListaTipoPersona.equals(that.codigoListaTipoPersona) : that.codigoListaTipoPersona != null)
            return false;
        if (nombreListaTipoPersona != null ? !nombreListaTipoPersona.equals(that.nombreListaTipoPersona) : that.nombreListaTipoPersona != null)
            return false;
        if (ordenListaTipoPersona != null ? !ordenListaTipoPersona.equals(that.ordenListaTipoPersona) : that.ordenListaTipoPersona != null)
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
        int result = idListaTipoPersona != null ? idListaTipoPersona.hashCode() : 0;
        result = 31 * result + (codigoListaTipoPersona != null ? codigoListaTipoPersona.hashCode() : 0);
        result = 31 * result + (nombreListaTipoPersona != null ? nombreListaTipoPersona.hashCode() : 0);
        result = 31 * result + (ordenListaTipoPersona != null ? ordenListaTipoPersona.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
