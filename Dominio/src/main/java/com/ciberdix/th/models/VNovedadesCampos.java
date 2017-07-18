package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_NovedadesCampos", schema = "dbo", catalog = "CREZCAMOS")
public class VNovedadesCampos {
    private Integer idNovedadCampo;
    private String novedad;
    private Integer idNovedad;
    private String codigoCampoNovedad;
    private String campoNovedad;
    private Integer idCampoNovedad;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdNovedadCampo", nullable = false)
    public Integer getIdNovedadCampo() {
        return idNovedadCampo;
    }

    public void setIdNovedadCampo(Integer idNovedadCampo) {
        this.idNovedadCampo = idNovedadCampo;
    }

    @Basic
    @Column(name = "Novedad", nullable = true, length = 100)
    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    @Basic
    @Column(name = "IdNovedad", nullable = true)
    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    @Basic
    @Column(name = "CodigoCampoNovedad", nullable = true, length = 10)
    public String getCodigoCampoNovedad() {
        return codigoCampoNovedad;
    }

    public void setCodigoCampoNovedad(String codigoCampoNovedad) {
        this.codigoCampoNovedad = codigoCampoNovedad;
    }

    @Basic
    @Column(name = "CampoNovedad", nullable = true, length = 100)
    public String getCampoNovedad() {
        return campoNovedad;
    }

    public void setCampoNovedad(String campoNovedad) {
        this.campoNovedad = campoNovedad;
    }

    @Basic
    @Column(name = "IdCampoNovedad", nullable = true)
    public Integer getIdCampoNovedad() {
        return idCampoNovedad;
    }

    public void setIdCampoNovedad(Integer idCampoNovedad) {
        this.idCampoNovedad = idCampoNovedad;
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

        VNovedadesCampos that = (VNovedadesCampos) o;

        if (idNovedadCampo != null ? !idNovedadCampo.equals(that.idNovedadCampo) : that.idNovedadCampo != null)
            return false;
        if (novedad != null ? !novedad.equals(that.novedad) : that.novedad != null) return false;
        if (idNovedad != null ? !idNovedad.equals(that.idNovedad) : that.idNovedad != null) return false;
        if (codigoCampoNovedad != null ? !codigoCampoNovedad.equals(that.codigoCampoNovedad) : that.codigoCampoNovedad != null)
            return false;
        if (campoNovedad != null ? !campoNovedad.equals(that.campoNovedad) : that.campoNovedad != null) return false;
        if (idCampoNovedad != null ? !idCampoNovedad.equals(that.idCampoNovedad) : that.idCampoNovedad != null)
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
        int result = idNovedadCampo != null ? idNovedadCampo.hashCode() : 0;
        result = 31 * result + (novedad != null ? novedad.hashCode() : 0);
        result = 31 * result + (idNovedad != null ? idNovedad.hashCode() : 0);
        result = 31 * result + (codigoCampoNovedad != null ? codigoCampoNovedad.hashCode() : 0);
        result = 31 * result + (campoNovedad != null ? campoNovedad.hashCode() : 0);
        result = 31 * result + (idCampoNovedad != null ? idCampoNovedad.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
