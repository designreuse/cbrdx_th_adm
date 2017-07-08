package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "V_TercerosDocumentosTercero", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosDocumentosTercero {
    private Integer idTerceroDocumentoTercero;
    private Long idTercero;
    private String nombreDocumentoTercero;
    private Integer idDocumentoTercero;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDocumentoTercero", nullable = false)
    public Integer getIdTerceroDocumentoTercero() {
        return idTerceroDocumentoTercero;
    }

    public void setIdTerceroDocumentoTercero(Integer idTerceroDocumentoTercero) {
        this.idTerceroDocumentoTercero = idTerceroDocumentoTercero;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "NombreDocumentoTercero", nullable = true, length = 200)
    public String getNombreDocumentoTercero() {
        return nombreDocumentoTercero;
    }

    public void setNombreDocumentoTercero(String nombreDocumentoTercero) {
        this.nombreDocumentoTercero = nombreDocumentoTercero;
    }

    @Basic
    @Column(name = "IdDocumentoTercero", nullable = true)
    public Integer getIdDocumentoTercero() {
        return idDocumentoTercero;
    }

    public void setIdDocumentoTercero(Integer idDocumentoTercero) {
        this.idDocumentoTercero = idDocumentoTercero;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
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

        VTercerosDocumentosTercero that = (VTercerosDocumentosTercero) o;

        if (idTerceroDocumentoTercero != null ? !idTerceroDocumentoTercero.equals(that.idTerceroDocumentoTercero) : that.idTerceroDocumentoTercero != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (nombreDocumentoTercero != null ? !nombreDocumentoTercero.equals(that.nombreDocumentoTercero) : that.nombreDocumentoTercero != null)
            return false;
        if (idDocumentoTercero != null ? !idDocumentoTercero.equals(that.idDocumentoTercero) : that.idDocumentoTercero != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
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
        int result = idTerceroDocumentoTercero != null ? idTerceroDocumentoTercero.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (nombreDocumentoTercero != null ? nombreDocumentoTercero.hashCode() : 0);
        result = 31 * result + (idDocumentoTercero != null ? idDocumentoTercero.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
