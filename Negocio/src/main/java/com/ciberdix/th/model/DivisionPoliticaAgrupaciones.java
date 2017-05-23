package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Aguirre on 23/05/2017.
 */
public class DivisionPoliticaAgrupaciones {
    private Long idDivisionPoliticaAgrupacion;
    private Integer idDivisionPolitica;
    private Integer idDivisionPoliticaArea;
    private String agrupacion;
    private Integer idTipoAgrupacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Long getIdDivisionPoliticaAgrupacion() {
        return idDivisionPoliticaAgrupacion;
    }

    public void setIdDivisionPoliticaAgrupacion(Long idDivisionPoliticaAgrupacion) {
        this.idDivisionPoliticaAgrupacion = idDivisionPoliticaAgrupacion;
    }

    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public Integer getIdTipoAgrupacion() {
        return idTipoAgrupacion;
    }

    public void setIdTipoAgrupacion(Integer idTipoAgrupacion) {
        this.idTipoAgrupacion = idTipoAgrupacion;
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
