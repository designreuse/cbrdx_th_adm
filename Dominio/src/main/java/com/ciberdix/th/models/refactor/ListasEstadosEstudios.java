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
public class ListasEstadosEstudios {
    private Integer idListaEstadoEstudio;
    private String codigoListaEstadoEstudio;
    private String nombreListaEstadoEstudio;
    private Integer ordenListaEstadoEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaEstadoEstudio")
    public Integer getIdListaEstadoEstudio() {
        return idListaEstadoEstudio;
    }

    public void setIdListaEstadoEstudio(Integer idListaEstadoEstudio) {
        this.idListaEstadoEstudio = idListaEstadoEstudio;
    }

    @Basic
    @Column(name = "CodigoListaEstadoEstudio")
    public String getCodigoListaEstadoEstudio() {
        return codigoListaEstadoEstudio;
    }

    public void setCodigoListaEstadoEstudio(String codigoListaEstadoEstudio) {
        this.codigoListaEstadoEstudio = codigoListaEstadoEstudio;
    }

    @Basic
    @Column(name = "NombreListaEstadoEstudio")
    public String getNombreListaEstadoEstudio() {
        return nombreListaEstadoEstudio;
    }

    public void setNombreListaEstadoEstudio(String nombreListaEstadoEstudio) {
        this.nombreListaEstadoEstudio = nombreListaEstadoEstudio;
    }

    @Basic
    @Column(name = "OrdenListaEstadoEstudio")
    public Integer getOrdenListaEstadoEstudio() {
        return ordenListaEstadoEstudio;
    }

    public void setOrdenListaEstadoEstudio(Integer ordenListaEstadoEstudio) {
        this.ordenListaEstadoEstudio = ordenListaEstadoEstudio;
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

        ListasEstadosEstudios that = (ListasEstadosEstudios) o;

        if (idListaEstadoEstudio != null ? !idListaEstadoEstudio.equals(that.idListaEstadoEstudio) : that.idListaEstadoEstudio != null)
            return false;
        if (codigoListaEstadoEstudio != null ? !codigoListaEstadoEstudio.equals(that.codigoListaEstadoEstudio) : that.codigoListaEstadoEstudio != null)
            return false;
        if (nombreListaEstadoEstudio != null ? !nombreListaEstadoEstudio.equals(that.nombreListaEstadoEstudio) : that.nombreListaEstadoEstudio != null)
            return false;
        if (ordenListaEstadoEstudio != null ? !ordenListaEstadoEstudio.equals(that.ordenListaEstadoEstudio) : that.ordenListaEstadoEstudio != null)
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
        int result = idListaEstadoEstudio != null ? idListaEstadoEstudio.hashCode() : 0;
        result = 31 * result + (codigoListaEstadoEstudio != null ? codigoListaEstadoEstudio.hashCode() : 0);
        result = 31 * result + (nombreListaEstadoEstudio != null ? nombreListaEstadoEstudio.hashCode() : 0);
        result = 31 * result + (ordenListaEstadoEstudio != null ? ordenListaEstadoEstudio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
