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
public class ListasTiposDirecciones {
    private Integer idListaTipoDireccion;
    private String codigoListaTipoDireccion;
    private String nombreListaTipoDireccion;
    private Integer ordenListaTipoDireccion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoDireccion")
    public Integer getIdListaTipoDireccion() {
        return idListaTipoDireccion;
    }

    public void setIdListaTipoDireccion(Integer idListaTipoDireccion) {
        this.idListaTipoDireccion = idListaTipoDireccion;
    }

    @Basic
    @Column(name = "CodigoListaTipoDireccion")
    public String getCodigoListaTipoDireccion() {
        return codigoListaTipoDireccion;
    }

    public void setCodigoListaTipoDireccion(String codigoListaTipoDireccion) {
        this.codigoListaTipoDireccion = codigoListaTipoDireccion;
    }

    @Basic
    @Column(name = "NombreListaTipoDireccion")
    public String getNombreListaTipoDireccion() {
        return nombreListaTipoDireccion;
    }

    public void setNombreListaTipoDireccion(String nombreListaTipoDireccion) {
        this.nombreListaTipoDireccion = nombreListaTipoDireccion;
    }

    @Basic
    @Column(name = "OrdenListaTipoDireccion")
    public Integer getOrdenListaTipoDireccion() {
        return ordenListaTipoDireccion;
    }

    public void setOrdenListaTipoDireccion(Integer ordenListaTipoDireccion) {
        this.ordenListaTipoDireccion = ordenListaTipoDireccion;
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

        ListasTiposDirecciones that = (ListasTiposDirecciones) o;

        if (idListaTipoDireccion != null ? !idListaTipoDireccion.equals(that.idListaTipoDireccion) : that.idListaTipoDireccion != null)
            return false;
        if (codigoListaTipoDireccion != null ? !codigoListaTipoDireccion.equals(that.codigoListaTipoDireccion) : that.codigoListaTipoDireccion != null)
            return false;
        if (nombreListaTipoDireccion != null ? !nombreListaTipoDireccion.equals(that.nombreListaTipoDireccion) : that.nombreListaTipoDireccion != null)
            return false;
        if (ordenListaTipoDireccion != null ? !ordenListaTipoDireccion.equals(that.ordenListaTipoDireccion) : that.ordenListaTipoDireccion != null)
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
        int result = idListaTipoDireccion != null ? idListaTipoDireccion.hashCode() : 0;
        result = 31 * result + (codigoListaTipoDireccion != null ? codigoListaTipoDireccion.hashCode() : 0);
        result = 31 * result + (nombreListaTipoDireccion != null ? nombreListaTipoDireccion.hashCode() : 0);
        result = 31 * result + (ordenListaTipoDireccion != null ? ordenListaTipoDireccion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
