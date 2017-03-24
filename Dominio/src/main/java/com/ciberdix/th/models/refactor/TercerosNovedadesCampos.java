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
public class TercerosNovedadesCampos {
    private Integer idTerceroNovedadCampo;
    private Integer idTerceroNovedad;
    private Integer idTipoNovedadCampo;
    private String valor;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroNovedadCampo")
    public Integer getIdTerceroNovedadCampo() {
        return idTerceroNovedadCampo;
    }

    public void setIdTerceroNovedadCampo(Integer idTerceroNovedadCampo) {
        this.idTerceroNovedadCampo = idTerceroNovedadCampo;
    }

    @Basic
    @Column(name = "IdTerceroNovedad")
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "IdTipoNovedadCampo")
    public Integer getIdTipoNovedadCampo() {
        return idTipoNovedadCampo;
    }

    public void setIdTipoNovedadCampo(Integer idTipoNovedadCampo) {
        this.idTipoNovedadCampo = idTipoNovedadCampo;
    }

    @Basic
    @Column(name = "Valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "IdAdjunto")
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

        TercerosNovedadesCampos that = (TercerosNovedadesCampos) o;

        if (idTerceroNovedadCampo != null ? !idTerceroNovedadCampo.equals(that.idTerceroNovedadCampo) : that.idTerceroNovedadCampo != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (idTipoNovedadCampo != null ? !idTipoNovedadCampo.equals(that.idTipoNovedadCampo) : that.idTipoNovedadCampo != null)
            return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroNovedadCampo != null ? idTerceroNovedadCampo.hashCode() : 0;
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (idTipoNovedadCampo != null ? idTipoNovedadCampo.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
