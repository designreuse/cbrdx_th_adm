package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TiposNovedades {
    private Integer idTipoNovedad;
    private String tipoNovedad;
    private Integer idPerfil;
    private Boolean indicadorHabilitado;
    private Boolean indicadorCorreo;
    private Boolean indicadorAusentismo;
    private Boolean indicadorAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer indicadorAdaptacionLaboral;

    @Id
    @Column(name = "IdTipoNovedad")
    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    @Basic
    @Column(name = "TipoNovedad")
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    @Basic
    @Column(name = "IdPerfil")
    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
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
    @Column(name = "IndicadorCorreo")
    public Boolean getIndicadorCorreo() {
        return indicadorCorreo;
    }

    public void setIndicadorCorreo(Boolean indicadorCorreo) {
        this.indicadorCorreo = indicadorCorreo;
    }

    @Basic
    @Column(name = "IndicadorAusentismo")
    public Boolean getIndicadorAusentismo() {
        return indicadorAusentismo;
    }

    public void setIndicadorAusentismo(Boolean indicadorAusentismo) {
        this.indicadorAusentismo = indicadorAusentismo;
    }

    @Basic
    @Column(name = "IndicadorAdjunto")
    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
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

    @Basic
    @Column(name = "IndicadorAdaptacionLaboral")
    public Integer getIndicadorAdaptacionLaboral() {
        return indicadorAdaptacionLaboral;
    }

    public void setIndicadorAdaptacionLaboral(Integer indicadorAdaptacionLaboral) {
        this.indicadorAdaptacionLaboral = indicadorAdaptacionLaboral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TiposNovedades that = (TiposNovedades) o;

        if (idTipoNovedad != null ? !idTipoNovedad.equals(that.idTipoNovedad) : that.idTipoNovedad != null)
            return false;
        if (tipoNovedad != null ? !tipoNovedad.equals(that.tipoNovedad) : that.tipoNovedad != null) return false;
        if (idPerfil != null ? !idPerfil.equals(that.idPerfil) : that.idPerfil != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorCorreo != null ? !indicadorCorreo.equals(that.indicadorCorreo) : that.indicadorCorreo != null)
            return false;
        if (indicadorAusentismo != null ? !indicadorAusentismo.equals(that.indicadorAusentismo) : that.indicadorAusentismo != null)
            return false;
        if (indicadorAdjunto != null ? !indicadorAdjunto.equals(that.indicadorAdjunto) : that.indicadorAdjunto != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorAdaptacionLaboral != null ? !indicadorAdaptacionLaboral.equals(that.indicadorAdaptacionLaboral) : that.indicadorAdaptacionLaboral != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoNovedad != null ? idTipoNovedad.hashCode() : 0;
        result = 31 * result + (tipoNovedad != null ? tipoNovedad.hashCode() : 0);
        result = 31 * result + (idPerfil != null ? idPerfil.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorCorreo != null ? indicadorCorreo.hashCode() : 0);
        result = 31 * result + (indicadorAusentismo != null ? indicadorAusentismo.hashCode() : 0);
        result = 31 * result + (indicadorAdjunto != null ? indicadorAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorAdaptacionLaboral != null ? indicadorAdaptacionLaboral.hashCode() : 0);
        return result;
    }
}
