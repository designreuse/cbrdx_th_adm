package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/5/2017.
 */
@Entity
@Table(name = "TercerosResidencias", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosResidencias {
    private Integer idTerceroResidencia;
    private Integer idTerceroLocalizacion;
    private Integer idTipoVivienda;
    private Integer idTipoConstruccionVivienda;
    private Integer idEstrato;
    private Integer idClasesViviendas;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosResidencias() {
    }

    public TercerosResidencias(Integer idTerceroLocalizacion, Integer idTipoVivienda, Integer idTipoConstruccionVivienda, Integer idEstrato, Integer idClasesViviendas, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
        this.idTipoVivienda = idTipoVivienda;
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
        this.idEstrato = idEstrato;
        this.idClasesViviendas = idClasesViviendas;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroResidencia")
    public Integer getIdTerceroResidencia() {
        return idTerceroResidencia;
    }

    public void setIdTerceroResidencia(Integer idTerceroResidencia) {
        this.idTerceroResidencia = idTerceroResidencia;
    }

    @Basic
    @Column(name = "IdTerceroLocalizacion")
    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    @Basic
    @Column(name = "IdTipoVivienda")
    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    @Basic
    @Column(name = "IdTipoConstruccionVivienda")
    public Integer getIdTipoConstruccionVivienda() {
        return idTipoConstruccionVivienda;
    }

    public void setIdTipoConstruccionVivienda(Integer idTipoConstruccionVivienda) {
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
    }

    @Basic
    @Column(name = "IdEstrato")
    public Integer getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
    }

    @Basic
    @Column(name = "IdClasesViviendas")
    public Integer getIdClasesViviendas() {
        return idClasesViviendas;
    }

    public void setIdClasesViviendas(Integer idClasesViviendas) {
        this.idClasesViviendas = idClasesViviendas;
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

        TercerosResidencias that = (TercerosResidencias) o;

        if (idTerceroResidencia != null ? !idTerceroResidencia.equals(that.idTerceroResidencia) : that.idTerceroResidencia != null)
            return false;
        if (idTerceroLocalizacion != null ? !idTerceroLocalizacion.equals(that.idTerceroLocalizacion) : that.idTerceroLocalizacion != null)
            return false;
        if (idTipoVivienda != null ? !idTipoVivienda.equals(that.idTipoVivienda) : that.idTipoVivienda != null)
            return false;
        if (idTipoConstruccionVivienda != null ? !idTipoConstruccionVivienda.equals(that.idTipoConstruccionVivienda) : that.idTipoConstruccionVivienda != null)
            return false;
        if (idEstrato != null ? !idEstrato.equals(that.idEstrato) : that.idEstrato != null) return false;
        if (idClasesViviendas != null ? !idClasesViviendas.equals(that.idClasesViviendas) : that.idClasesViviendas != null)
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
        int result = idTerceroResidencia != null ? idTerceroResidencia.hashCode() : 0;
        result = 31 * result + (idTerceroLocalizacion != null ? idTerceroLocalizacion.hashCode() : 0);
        result = 31 * result + (idTipoVivienda != null ? idTipoVivienda.hashCode() : 0);
        result = 31 * result + (idTipoConstruccionVivienda != null ? idTipoConstruccionVivienda.hashCode() : 0);
        result = 31 * result + (idEstrato != null ? idEstrato.hashCode() : 0);
        result = 31 * result + (idClasesViviendas != null ? idClasesViviendas.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
