package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TiposNovedadesCampos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TiposNovedadesCamposEntity {
    private Integer idTipoNovedadCampo;
    private String tipoNovedadCampo;
    private Integer idTipoNovedad;
    private Integer idTipoCampo;
    private Boolean indicadorRequerido;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTipoNovedadCampo", nullable = false)
    public Integer getIdTipoNovedadCampo() {
        return idTipoNovedadCampo;
    }

    public void setIdTipoNovedadCampo(Integer idTipoNovedadCampo) {
        this.idTipoNovedadCampo = idTipoNovedadCampo;
    }

    @Basic
    @Column(name = "TipoNovedadCampo", nullable = false, length = 100)
    public String getTipoNovedadCampo() {
        return tipoNovedadCampo;
    }

    public void setTipoNovedadCampo(String tipoNovedadCampo) {
        this.tipoNovedadCampo = tipoNovedadCampo;
    }

    @Basic
    @Column(name = "IdTipoNovedad", nullable = false)
    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    @Basic
    @Column(name = "IdTipoCampo", nullable = false)
    public Integer getIdTipoCampo() {
        return idTipoCampo;
    }

    public void setIdTipoCampo(Integer idTipoCampo) {
        this.idTipoCampo = idTipoCampo;
    }

    @Basic
    @Column(name = "IndicadorRequerido", nullable = true)
    public Boolean getIndicadorRequerido() {
        return indicadorRequerido;
    }

    public void setIndicadorRequerido(Boolean indicadorRequerido) {
        this.indicadorRequerido = indicadorRequerido;
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

        TiposNovedadesCamposEntity that = (TiposNovedadesCamposEntity) o;

        if (idTipoNovedadCampo != null ? !idTipoNovedadCampo.equals(that.idTipoNovedadCampo) : that.idTipoNovedadCampo != null)
            return false;
        if (tipoNovedadCampo != null ? !tipoNovedadCampo.equals(that.tipoNovedadCampo) : that.tipoNovedadCampo != null)
            return false;
        if (idTipoNovedad != null ? !idTipoNovedad.equals(that.idTipoNovedad) : that.idTipoNovedad != null)
            return false;
        if (idTipoCampo != null ? !idTipoCampo.equals(that.idTipoCampo) : that.idTipoCampo != null) return false;
        if (indicadorRequerido != null ? !indicadorRequerido.equals(that.indicadorRequerido) : that.indicadorRequerido != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoNovedadCampo != null ? idTipoNovedadCampo.hashCode() : 0;
        result = 31 * result + (tipoNovedadCampo != null ? tipoNovedadCampo.hashCode() : 0);
        result = 31 * result + (idTipoNovedad != null ? idTipoNovedad.hashCode() : 0);
        result = 31 * result + (idTipoCampo != null ? idTipoCampo.hashCode() : 0);
        result = 31 * result + (indicadorRequerido != null ? indicadorRequerido.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
