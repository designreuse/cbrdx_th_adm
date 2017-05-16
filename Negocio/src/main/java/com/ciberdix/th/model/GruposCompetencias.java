package com.ciberdix.th.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class GruposCompetencias {
    private Integer idGrupoCompetencia;
    private String grupoCompetencia;
    private String descripcion;
    private BigDecimal ponderacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdGrupoCompetencia() {
        return idGrupoCompetencia;
    }

    public void setIdGrupoCompetencia(Integer idGrupoCompetencia) {
        this.idGrupoCompetencia = idGrupoCompetencia;
    }

    public String getGrupoCompetencia() {
        return grupoCompetencia;
    }

    public void setGrupoCompetencia(String grupoCompetencia) {
        this.grupoCompetencia = grupoCompetencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
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
