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
public class ListasEstadosCiviles {
    private Integer idListaEstadoCivil;
    private String codigoListaEstadoCivil;
    private String nombreListaEstadoCivil;
    private Integer ordenListaEstadoCivil;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaEstadoCivil")
    public Integer getIdListaEstadoCivil() {
        return idListaEstadoCivil;
    }

    public void setIdListaEstadoCivil(Integer idListaEstadoCivil) {
        this.idListaEstadoCivil = idListaEstadoCivil;
    }

    @Basic
    @Column(name = "CodigoListaEstadoCivil")
    public String getCodigoListaEstadoCivil() {
        return codigoListaEstadoCivil;
    }

    public void setCodigoListaEstadoCivil(String codigoListaEstadoCivil) {
        this.codigoListaEstadoCivil = codigoListaEstadoCivil;
    }

    @Basic
    @Column(name = "NombreListaEstadoCivil")
    public String getNombreListaEstadoCivil() {
        return nombreListaEstadoCivil;
    }

    public void setNombreListaEstadoCivil(String nombreListaEstadoCivil) {
        this.nombreListaEstadoCivil = nombreListaEstadoCivil;
    }

    @Basic
    @Column(name = "OrdenListaEstadoCivil")
    public Integer getOrdenListaEstadoCivil() {
        return ordenListaEstadoCivil;
    }

    public void setOrdenListaEstadoCivil(Integer ordenListaEstadoCivil) {
        this.ordenListaEstadoCivil = ordenListaEstadoCivil;
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

        ListasEstadosCiviles that = (ListasEstadosCiviles) o;

        if (idListaEstadoCivil != null ? !idListaEstadoCivil.equals(that.idListaEstadoCivil) : that.idListaEstadoCivil != null)
            return false;
        if (codigoListaEstadoCivil != null ? !codigoListaEstadoCivil.equals(that.codigoListaEstadoCivil) : that.codigoListaEstadoCivil != null)
            return false;
        if (nombreListaEstadoCivil != null ? !nombreListaEstadoCivil.equals(that.nombreListaEstadoCivil) : that.nombreListaEstadoCivil != null)
            return false;
        if (ordenListaEstadoCivil != null ? !ordenListaEstadoCivil.equals(that.ordenListaEstadoCivil) : that.ordenListaEstadoCivil != null)
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
        int result = idListaEstadoCivil != null ? idListaEstadoCivil.hashCode() : 0;
        result = 31 * result + (codigoListaEstadoCivil != null ? codigoListaEstadoCivil.hashCode() : 0);
        result = 31 * result + (nombreListaEstadoCivil != null ? nombreListaEstadoCivil.hashCode() : 0);
        result = 31 * result + (ordenListaEstadoCivil != null ? ordenListaEstadoCivil.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
