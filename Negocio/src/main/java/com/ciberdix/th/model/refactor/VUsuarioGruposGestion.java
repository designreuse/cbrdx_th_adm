package com.ciberdix.th.model.refactor;

import java.sql.Date;

/**
 * Created by felip on 21/04/2017.
 */
public class VUsuarioGruposGestion {
    private Integer idUsuarioGrupoGestion;
    private Integer idUsuario;
    private String grupoGestion;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;

    public Integer getIdUsuarioGrupoGestion() {
        return idUsuarioGrupoGestion;
    }

    public void setIdUsuarioGrupoGestion(Integer idUsuarioGrupoGestion) {
        this.idUsuarioGrupoGestion = idUsuarioGrupoGestion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getGrupoGestion() {
        return grupoGestion;
    }

    public void setGrupoGestion(String grupoGestion) {
        this.grupoGestion = grupoGestion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
