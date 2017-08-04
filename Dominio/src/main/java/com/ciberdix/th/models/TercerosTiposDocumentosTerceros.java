package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosTiposDocumentosTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosTiposDocumentosTerceros {
    private Integer idTerceroTipoDocumentoTercero;
    private Integer idTerceroTipo;
    private Integer idDocumentoTercero;
    private Boolean indicadorRequiere;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosTiposDocumentosTerceros() {
    }

    public TercerosTiposDocumentosTerceros(Integer idTerceroTipo, Integer idDocumentoTercero, Boolean indicadorRequiere, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroTipo = idTerceroTipo;
        this.idDocumentoTercero = idDocumentoTercero;
        this.indicadorRequiere = indicadorRequiere;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosTiposDocumentosTerceros(Integer idTerceroTipoDocumentoTercero, Integer idTerceroTipo, Integer idDocumentoTercero, Boolean indicadorRequiere, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroTipoDocumentoTercero = idTerceroTipoDocumentoTercero;
        this.idTerceroTipo = idTerceroTipo;
        this.idDocumentoTercero = idDocumentoTercero;
        this.indicadorRequiere = indicadorRequiere;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroTipoDocumentoTercero", nullable = false)
    public Integer getIdTerceroTipoDocumentoTercero() {
        return idTerceroTipoDocumentoTercero;
    }

    public void setIdTerceroTipoDocumentoTercero(Integer idTerceroTipoDocumentoTercero) {
        this.idTerceroTipoDocumentoTercero = idTerceroTipoDocumentoTercero;
    }

    @Basic
    @Column(name = "IdTerceroTipo", nullable = true)
    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
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
    @Column(name = "IndicadorRequiere", nullable = true)
    public Boolean getIndicadorRequiere() {
        return indicadorRequiere;
    }

    public void setIndicadorRequiere(Boolean indicadorRequiere) {
        this.indicadorRequiere = indicadorRequiere;
    }

    @Basic
    @Column(name = "IndicadorObligatorio", nullable = true)
    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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

        TercerosTiposDocumentosTerceros that = (TercerosTiposDocumentosTerceros) o;

        if (idTerceroTipoDocumentoTercero != null ? !idTerceroTipoDocumentoTercero.equals(that.idTerceroTipoDocumentoTercero) : that.idTerceroTipoDocumentoTercero != null)
            return false;
        if (idTerceroTipo != null ? !idTerceroTipo.equals(that.idTerceroTipo) : that.idTerceroTipo != null)
            return false;
        if (idDocumentoTercero != null ? !idDocumentoTercero.equals(that.idDocumentoTercero) : that.idDocumentoTercero != null)
            return false;
        if (indicadorRequiere != null ? !indicadorRequiere.equals(that.indicadorRequiere) : that.indicadorRequiere != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
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
        int result = idTerceroTipoDocumentoTercero != null ? idTerceroTipoDocumentoTercero.hashCode() : 0;
        result = 31 * result + (idTerceroTipo != null ? idTerceroTipo.hashCode() : 0);
        result = 31 * result + (idDocumentoTercero != null ? idDocumentoTercero.hashCode() : 0);
        result = 31 * result + (indicadorRequiere != null ? indicadorRequiere.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
