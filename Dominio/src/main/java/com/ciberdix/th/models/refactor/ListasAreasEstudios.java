package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "ListasAreasEstudios", schema = "crz_th", catalog = "CREZCAMOS")
public class ListasAreasEstudios {
    private Integer idListaAreaEstudio;
    private String codigoListaAreaEstudio;
    private String nombreListaAreaEstudio;
    private Integer ordenListaAreaEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ListasAreasEstudios() {
    }

    public ListasAreasEstudios(Integer idListaAreaEstudio, String codigoListaAreaEstudio, String nombreListaAreaEstudio, Integer ordenListaAreaEstudio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idListaAreaEstudio = idListaAreaEstudio;
        this.codigoListaAreaEstudio = codigoListaAreaEstudio;
        this.nombreListaAreaEstudio = nombreListaAreaEstudio;
        this.ordenListaAreaEstudio = ordenListaAreaEstudio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdListaAreaEstudio")
    public Integer getIdListaAreaEstudio() {
        return idListaAreaEstudio;
    }

    public void setIdListaAreaEstudio(Integer idListaAreaEstudio) {
        this.idListaAreaEstudio = idListaAreaEstudio;
    }

    @Basic
    @Column(name = "CodigoListaAreaEstudio")
    public String getCodigoListaAreaEstudio() {
        return codigoListaAreaEstudio;
    }

    public void setCodigoListaAreaEstudio(String codigoListaAreaEstudio) {
        this.codigoListaAreaEstudio = codigoListaAreaEstudio;
    }

    @Basic
    @Column(name = "NombreListaAreaEstudio")
    public String getNombreListaAreaEstudio() {
        return nombreListaAreaEstudio;
    }

    public void setNombreListaAreaEstudio(String nombreListaAreaEstudio) {
        this.nombreListaAreaEstudio = nombreListaAreaEstudio;
    }

    @Basic
    @Column(name = "OrdenListaAreaEstudio")
    public Integer getOrdenListaAreaEstudio() {
        return ordenListaAreaEstudio;
    }

    public void setOrdenListaAreaEstudio(Integer ordenListaAreaEstudio) {
        this.ordenListaAreaEstudio = ordenListaAreaEstudio;
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

        ListasAreasEstudios that = (ListasAreasEstudios) o;

        if (idListaAreaEstudio != null ? !idListaAreaEstudio.equals(that.idListaAreaEstudio) : that.idListaAreaEstudio != null)
            return false;
        if (codigoListaAreaEstudio != null ? !codigoListaAreaEstudio.equals(that.codigoListaAreaEstudio) : that.codigoListaAreaEstudio != null)
            return false;
        if (nombreListaAreaEstudio != null ? !nombreListaAreaEstudio.equals(that.nombreListaAreaEstudio) : that.nombreListaAreaEstudio != null)
            return false;
        if (ordenListaAreaEstudio != null ? !ordenListaAreaEstudio.equals(that.ordenListaAreaEstudio) : that.ordenListaAreaEstudio != null)
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
        int result = idListaAreaEstudio != null ? idListaAreaEstudio.hashCode() : 0;
        result = 31 * result + (codigoListaAreaEstudio != null ? codigoListaAreaEstudio.hashCode() : 0);
        result = 31 * result + (nombreListaAreaEstudio != null ? nombreListaAreaEstudio.hashCode() : 0);
        result = 31 * result + (ordenListaAreaEstudio != null ? ordenListaAreaEstudio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
