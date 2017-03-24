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
public class ListasTiposEstudios {
    private Integer idListaTipoEstudio;
    private String codigoListaTipoEstudio;
    private String nombreListaTipoEstudio;
    private Integer ordenListaTipoEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoEstudio")
    public Integer getIdListaTipoEstudio() {
        return idListaTipoEstudio;
    }

    public void setIdListaTipoEstudio(Integer idListaTipoEstudio) {
        this.idListaTipoEstudio = idListaTipoEstudio;
    }

    @Basic
    @Column(name = "CodigoListaTipoEstudio")
    public String getCodigoListaTipoEstudio() {
        return codigoListaTipoEstudio;
    }

    public void setCodigoListaTipoEstudio(String codigoListaTipoEstudio) {
        this.codigoListaTipoEstudio = codigoListaTipoEstudio;
    }

    @Basic
    @Column(name = "NombreListaTipoEstudio")
    public String getNombreListaTipoEstudio() {
        return nombreListaTipoEstudio;
    }

    public void setNombreListaTipoEstudio(String nombreListaTipoEstudio) {
        this.nombreListaTipoEstudio = nombreListaTipoEstudio;
    }

    @Basic
    @Column(name = "OrdenListaTipoEstudio")
    public Integer getOrdenListaTipoEstudio() {
        return ordenListaTipoEstudio;
    }

    public void setOrdenListaTipoEstudio(Integer ordenListaTipoEstudio) {
        this.ordenListaTipoEstudio = ordenListaTipoEstudio;
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

        ListasTiposEstudios that = (ListasTiposEstudios) o;

        if (idListaTipoEstudio != null ? !idListaTipoEstudio.equals(that.idListaTipoEstudio) : that.idListaTipoEstudio != null)
            return false;
        if (codigoListaTipoEstudio != null ? !codigoListaTipoEstudio.equals(that.codigoListaTipoEstudio) : that.codigoListaTipoEstudio != null)
            return false;
        if (nombreListaTipoEstudio != null ? !nombreListaTipoEstudio.equals(that.nombreListaTipoEstudio) : that.nombreListaTipoEstudio != null)
            return false;
        if (ordenListaTipoEstudio != null ? !ordenListaTipoEstudio.equals(that.ordenListaTipoEstudio) : that.ordenListaTipoEstudio != null)
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
        int result = idListaTipoEstudio != null ? idListaTipoEstudio.hashCode() : 0;
        result = 31 * result + (codigoListaTipoEstudio != null ? codigoListaTipoEstudio.hashCode() : 0);
        result = 31 * result + (nombreListaTipoEstudio != null ? nombreListaTipoEstudio.hashCode() : 0);
        result = 31 * result + (ordenListaTipoEstudio != null ? ordenListaTipoEstudio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
