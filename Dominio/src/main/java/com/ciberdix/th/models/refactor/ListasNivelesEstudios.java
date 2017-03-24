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
public class ListasNivelesEstudios {
    private Integer idListaNivelEstudio;
    private String codigoListaNivelEstudio;
    private String nombreListaNivelEstudio;
    private Integer ordenListaNivelEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaNivelEstudio")
    public Integer getIdListaNivelEstudio() {
        return idListaNivelEstudio;
    }

    public void setIdListaNivelEstudio(Integer idListaNivelEstudio) {
        this.idListaNivelEstudio = idListaNivelEstudio;
    }

    @Basic
    @Column(name = "CodigoListaNivelEstudio")
    public String getCodigoListaNivelEstudio() {
        return codigoListaNivelEstudio;
    }

    public void setCodigoListaNivelEstudio(String codigoListaNivelEstudio) {
        this.codigoListaNivelEstudio = codigoListaNivelEstudio;
    }

    @Basic
    @Column(name = "NombreListaNivelEstudio")
    public String getNombreListaNivelEstudio() {
        return nombreListaNivelEstudio;
    }

    public void setNombreListaNivelEstudio(String nombreListaNivelEstudio) {
        this.nombreListaNivelEstudio = nombreListaNivelEstudio;
    }

    @Basic
    @Column(name = "OrdenListaNivelEstudio")
    public Integer getOrdenListaNivelEstudio() {
        return ordenListaNivelEstudio;
    }

    public void setOrdenListaNivelEstudio(Integer ordenListaNivelEstudio) {
        this.ordenListaNivelEstudio = ordenListaNivelEstudio;
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

        ListasNivelesEstudios that = (ListasNivelesEstudios) o;

        if (idListaNivelEstudio != null ? !idListaNivelEstudio.equals(that.idListaNivelEstudio) : that.idListaNivelEstudio != null)
            return false;
        if (codigoListaNivelEstudio != null ? !codigoListaNivelEstudio.equals(that.codigoListaNivelEstudio) : that.codigoListaNivelEstudio != null)
            return false;
        if (nombreListaNivelEstudio != null ? !nombreListaNivelEstudio.equals(that.nombreListaNivelEstudio) : that.nombreListaNivelEstudio != null)
            return false;
        if (ordenListaNivelEstudio != null ? !ordenListaNivelEstudio.equals(that.ordenListaNivelEstudio) : that.ordenListaNivelEstudio != null)
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
        int result = idListaNivelEstudio != null ? idListaNivelEstudio.hashCode() : 0;
        result = 31 * result + (codigoListaNivelEstudio != null ? codigoListaNivelEstudio.hashCode() : 0);
        result = 31 * result + (nombreListaNivelEstudio != null ? nombreListaNivelEstudio.hashCode() : 0);
        result = 31 * result + (ordenListaNivelEstudio != null ? ordenListaNivelEstudio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
