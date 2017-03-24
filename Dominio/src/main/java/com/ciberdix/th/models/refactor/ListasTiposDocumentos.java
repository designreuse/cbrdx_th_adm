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
public class ListasTiposDocumentos {
    private Integer idListaTipoDocumento;
    private String codigoListaTipoDocumento;
    private String nombreListaTipoDocumento;
    private Integer ordenListaTipoDocumento;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoDocumento")
    public Integer getIdListaTipoDocumento() {
        return idListaTipoDocumento;
    }

    public void setIdListaTipoDocumento(Integer idListaTipoDocumento) {
        this.idListaTipoDocumento = idListaTipoDocumento;
    }

    @Basic
    @Column(name = "CodigoListaTipoDocumento")
    public String getCodigoListaTipoDocumento() {
        return codigoListaTipoDocumento;
    }

    public void setCodigoListaTipoDocumento(String codigoListaTipoDocumento) {
        this.codigoListaTipoDocumento = codigoListaTipoDocumento;
    }

    @Basic
    @Column(name = "NombreListaTipoDocumento")
    public String getNombreListaTipoDocumento() {
        return nombreListaTipoDocumento;
    }

    public void setNombreListaTipoDocumento(String nombreListaTipoDocumento) {
        this.nombreListaTipoDocumento = nombreListaTipoDocumento;
    }

    @Basic
    @Column(name = "OrdenListaTipoDocumento")
    public Integer getOrdenListaTipoDocumento() {
        return ordenListaTipoDocumento;
    }

    public void setOrdenListaTipoDocumento(Integer ordenListaTipoDocumento) {
        this.ordenListaTipoDocumento = ordenListaTipoDocumento;
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

        ListasTiposDocumentos that = (ListasTiposDocumentos) o;

        if (idListaTipoDocumento != null ? !idListaTipoDocumento.equals(that.idListaTipoDocumento) : that.idListaTipoDocumento != null)
            return false;
        if (codigoListaTipoDocumento != null ? !codigoListaTipoDocumento.equals(that.codigoListaTipoDocumento) : that.codigoListaTipoDocumento != null)
            return false;
        if (nombreListaTipoDocumento != null ? !nombreListaTipoDocumento.equals(that.nombreListaTipoDocumento) : that.nombreListaTipoDocumento != null)
            return false;
        if (ordenListaTipoDocumento != null ? !ordenListaTipoDocumento.equals(that.ordenListaTipoDocumento) : that.ordenListaTipoDocumento != null)
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
        int result = idListaTipoDocumento != null ? idListaTipoDocumento.hashCode() : 0;
        result = 31 * result + (codigoListaTipoDocumento != null ? codigoListaTipoDocumento.hashCode() : 0);
        result = 31 * result + (nombreListaTipoDocumento != null ? nombreListaTipoDocumento.hashCode() : 0);
        result = 31 * result + (ordenListaTipoDocumento != null ? ordenListaTipoDocumento.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
