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
public class ListasIntensidades {
    private Integer idListaIntensidad;
    private String codigoListaIntensidad;
    private String nombreListaIntensidad;
    private Integer ordenListaIntensidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaIntensidad")
    public Integer getIdListaIntensidad() {
        return idListaIntensidad;
    }

    public void setIdListaIntensidad(Integer idListaIntensidad) {
        this.idListaIntensidad = idListaIntensidad;
    }

    @Basic
    @Column(name = "CodigoListaIntensidad")
    public String getCodigoListaIntensidad() {
        return codigoListaIntensidad;
    }

    public void setCodigoListaIntensidad(String codigoListaIntensidad) {
        this.codigoListaIntensidad = codigoListaIntensidad;
    }

    @Basic
    @Column(name = "NombreListaIntensidad")
    public String getNombreListaIntensidad() {
        return nombreListaIntensidad;
    }

    public void setNombreListaIntensidad(String nombreListaIntensidad) {
        this.nombreListaIntensidad = nombreListaIntensidad;
    }

    @Basic
    @Column(name = "OrdenListaIntensidad")
    public Integer getOrdenListaIntensidad() {
        return ordenListaIntensidad;
    }

    public void setOrdenListaIntensidad(Integer ordenListaIntensidad) {
        this.ordenListaIntensidad = ordenListaIntensidad;
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

        ListasIntensidades that = (ListasIntensidades) o;

        if (idListaIntensidad != null ? !idListaIntensidad.equals(that.idListaIntensidad) : that.idListaIntensidad != null)
            return false;
        if (codigoListaIntensidad != null ? !codigoListaIntensidad.equals(that.codigoListaIntensidad) : that.codigoListaIntensidad != null)
            return false;
        if (nombreListaIntensidad != null ? !nombreListaIntensidad.equals(that.nombreListaIntensidad) : that.nombreListaIntensidad != null)
            return false;
        if (ordenListaIntensidad != null ? !ordenListaIntensidad.equals(that.ordenListaIntensidad) : that.ordenListaIntensidad != null)
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
        int result = idListaIntensidad != null ? idListaIntensidad.hashCode() : 0;
        result = 31 * result + (codigoListaIntensidad != null ? codigoListaIntensidad.hashCode() : 0);
        result = 31 * result + (nombreListaIntensidad != null ? nombreListaIntensidad.hashCode() : 0);
        result = 31 * result + (ordenListaIntensidad != null ? ordenListaIntensidad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
