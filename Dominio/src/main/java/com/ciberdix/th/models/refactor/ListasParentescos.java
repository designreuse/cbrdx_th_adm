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
public class ListasParentescos {
    private Integer idListaParentesco;
    private String codigoListaParentesco;
    private String nombreListaParentesco;
    private Integer ordenListaParentesco;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaParentesco")
    public Integer getIdListaParentesco() {
        return idListaParentesco;
    }

    public void setIdListaParentesco(Integer idListaParentesco) {
        this.idListaParentesco = idListaParentesco;
    }

    @Basic
    @Column(name = "CodigoListaParentesco")
    public String getCodigoListaParentesco() {
        return codigoListaParentesco;
    }

    public void setCodigoListaParentesco(String codigoListaParentesco) {
        this.codigoListaParentesco = codigoListaParentesco;
    }

    @Basic
    @Column(name = "NombreListaParentesco")
    public String getNombreListaParentesco() {
        return nombreListaParentesco;
    }

    public void setNombreListaParentesco(String nombreListaParentesco) {
        this.nombreListaParentesco = nombreListaParentesco;
    }

    @Basic
    @Column(name = "OrdenListaParentesco")
    public Integer getOrdenListaParentesco() {
        return ordenListaParentesco;
    }

    public void setOrdenListaParentesco(Integer ordenListaParentesco) {
        this.ordenListaParentesco = ordenListaParentesco;
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

        ListasParentescos that = (ListasParentescos) o;

        if (idListaParentesco != null ? !idListaParentesco.equals(that.idListaParentesco) : that.idListaParentesco != null)
            return false;
        if (codigoListaParentesco != null ? !codigoListaParentesco.equals(that.codigoListaParentesco) : that.codigoListaParentesco != null)
            return false;
        if (nombreListaParentesco != null ? !nombreListaParentesco.equals(that.nombreListaParentesco) : that.nombreListaParentesco != null)
            return false;
        if (ordenListaParentesco != null ? !ordenListaParentesco.equals(that.ordenListaParentesco) : that.ordenListaParentesco != null)
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
        int result = idListaParentesco != null ? idListaParentesco.hashCode() : 0;
        result = 31 * result + (codigoListaParentesco != null ? codigoListaParentesco.hashCode() : 0);
        result = 31 * result + (nombreListaParentesco != null ? nombreListaParentesco.hashCode() : 0);
        result = 31 * result + (ordenListaParentesco != null ? ordenListaParentesco.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
