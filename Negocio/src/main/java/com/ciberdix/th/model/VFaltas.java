package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VFaltas {
    private Integer idFalta;
    private String falta;
    private Integer idTipoFalta;
    private String tipoFalta;
    private String accion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdFalta() {
        return idFalta;
    }

    public void setIdFalta(Integer idFalta) {
        this.idFalta = idFalta;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public Integer getIdTipoFalta() {
        return idTipoFalta;
    }

    public void setIdTipoFalta(Integer idTipoFalta) {
        this.idTipoFalta = idTipoFalta;
    }

    public String getTipoFalta() {
        return tipoFalta;
    }

    public void setTipoFalta(String tipoFalta) {
        this.tipoFalta = tipoFalta;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
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
