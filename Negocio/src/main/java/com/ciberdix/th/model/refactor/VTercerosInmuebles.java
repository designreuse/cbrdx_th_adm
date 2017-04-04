package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 4/04/17.
 */
public class VTercerosInmuebles {
    private Integer idTerceroInmueble;
    private Long idTercero;
    private Integer idTipoVivienda;
    private String tipoVivienda;
    private Integer idClaseVivienda;
    private String claseVivienda;
    private Integer idTipoConstruccionVivienda;
    private String tipoConstruccionVivienda;
    private Integer anioConstruccion;
    private Integer numeroPisos;
    private Integer numeroSotanos;
    private Integer idEstrato;
    private String estrato;
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

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public Integer getIdClaseVivienda() {
        return idClaseVivienda;
    }

    public void setIdClaseVivienda(Integer idClaseVivienda) {
        this.idClaseVivienda = idClaseVivienda;
    }

    public String getClaseVivienda() {
        return claseVivienda;
    }

    public void setClaseVivienda(String claseVivienda) {
        this.claseVivienda = claseVivienda;
    }

    public Integer getIdTipoConstruccionVivienda() {
        return idTipoConstruccionVivienda;
    }

    public void setIdTipoConstruccionVivienda(Integer idTipoConstruccionVivienda) {
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
    }

    public String getTipoConstruccionVivienda() {
        return tipoConstruccionVivienda;
    }

    public void setTipoConstruccionVivienda(String tipoConstruccionVivienda) {
        this.tipoConstruccionVivienda = tipoConstruccionVivienda;
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

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
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
