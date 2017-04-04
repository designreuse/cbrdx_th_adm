package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class TercerosInmuebles {
    private Integer idTerceroInmueble;
    private Long idTercero;
    private Integer idTipoVivienda;
    private Integer idClaseVivienda;
    private Integer idTipoConstruccionVivienda;
    private Integer anioConstruccion;
    private Integer numeroPisos;
    private Integer numeroSotanos;
    private Integer idEstrato;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdTerceroInmueble() {
        return idTerceroInmueble;
    }

    public void setIdTerceroInmueble(Integer idTerceroInmueble) {
        this.idTerceroInmueble = idTerceroInmueble;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    public Integer getIdClaseVivienda() {
        return idClaseVivienda;
    }

    public void setIdClaseVivienda(Integer idClaseVivienda) {
        this.idClaseVivienda = idClaseVivienda;
    }

    public Integer getIdTipoConstruccionVivienda() {
        return idTipoConstruccionVivienda;
    }

    public void setIdTipoConstruccionVivienda(Integer idTipoConstruccionVivienda) {
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
    }

    public Integer getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(Integer anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroSotanos() {
        return numeroSotanos;
    }

    public void setNumeroSotanos(Integer numeroSotanos) {
        this.numeroSotanos = numeroSotanos;
    }

    public Integer getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
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
