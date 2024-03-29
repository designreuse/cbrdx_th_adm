package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/5/2017.
 */
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

    public Integer getIdTerceroResidencia() {
        return idTerceroResidencia;
    }

    public void setIdTerceroResidencia(Integer idTerceroResidencia) {
        this.idTerceroResidencia = idTerceroResidencia;
    }

    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    public Integer getIdTipoConstruccionVivienda() {
        return idTipoConstruccionVivienda;
    }

    public void setIdTipoConstruccionVivienda(Integer idTipoConstruccionVivienda) {
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
    }

    public Integer getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
    }

    public Integer getIdClasesViviendas() {
        return idClasesViviendas;
    }

    public void setIdClasesViviendas(Integer idClasesViviendas) {
        this.idClasesViviendas = idClasesViviendas;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
