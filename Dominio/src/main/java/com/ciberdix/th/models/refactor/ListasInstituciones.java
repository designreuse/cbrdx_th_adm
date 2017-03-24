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
public class ListasInstituciones {
    private Integer idListaInstitucion;
    private String codigoListaInstitucion;
    private String nombreListaInstitucion;
    private Integer ordenListaInstitucion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaInstitucion")
    public Integer getIdListaInstitucion() {
        return idListaInstitucion;
    }

    public void setIdListaInstitucion(Integer idListaInstitucion) {
        this.idListaInstitucion = idListaInstitucion;
    }

    @Basic
    @Column(name = "CodigoListaInstitucion")
    public String getCodigoListaInstitucion() {
        return codigoListaInstitucion;
    }

    public void setCodigoListaInstitucion(String codigoListaInstitucion) {
        this.codigoListaInstitucion = codigoListaInstitucion;
    }

    @Basic
    @Column(name = "NombreListaInstitucion")
    public String getNombreListaInstitucion() {
        return nombreListaInstitucion;
    }

    public void setNombreListaInstitucion(String nombreListaInstitucion) {
        this.nombreListaInstitucion = nombreListaInstitucion;
    }

    @Basic
    @Column(name = "OrdenListaInstitucion")
    public Integer getOrdenListaInstitucion() {
        return ordenListaInstitucion;
    }

    public void setOrdenListaInstitucion(Integer ordenListaInstitucion) {
        this.ordenListaInstitucion = ordenListaInstitucion;
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

        ListasInstituciones that = (ListasInstituciones) o;

        if (idListaInstitucion != null ? !idListaInstitucion.equals(that.idListaInstitucion) : that.idListaInstitucion != null)
            return false;
        if (codigoListaInstitucion != null ? !codigoListaInstitucion.equals(that.codigoListaInstitucion) : that.codigoListaInstitucion != null)
            return false;
        if (nombreListaInstitucion != null ? !nombreListaInstitucion.equals(that.nombreListaInstitucion) : that.nombreListaInstitucion != null)
            return false;
        if (ordenListaInstitucion != null ? !ordenListaInstitucion.equals(that.ordenListaInstitucion) : that.ordenListaInstitucion != null)
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
        int result = idListaInstitucion != null ? idListaInstitucion.hashCode() : 0;
        result = 31 * result + (codigoListaInstitucion != null ? codigoListaInstitucion.hashCode() : 0);
        result = 31 * result + (nombreListaInstitucion != null ? nombreListaInstitucion.hashCode() : 0);
        result = 31 * result + (ordenListaInstitucion != null ? ordenListaInstitucion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
