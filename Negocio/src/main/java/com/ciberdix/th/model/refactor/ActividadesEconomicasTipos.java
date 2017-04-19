package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by faaguirre on 3/28/2017.
 */
public class ActividadesEconomicasTipos {
    private Integer idActividadEconomicaTipo;
    private Integer codigoActividadTipo;
    private String descripcionActividadTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdActividadEconomicaTipo() {
        return idActividadEconomicaTipo;
    }

    public void setIdActividadEconomicaTipo(Integer idActividadEconomicaTipo) {
        this.idActividadEconomicaTipo = idActividadEconomicaTipo;
    }

    public Integer getCodigoActividadTipo() {
        return codigoActividadTipo;
    }

    public void setCodigoActividadTipo(Integer codigoActividadTipo) {
        this.codigoActividadTipo = codigoActividadTipo;
    }

    public String getDescripcionActividadTipo() {
        return descripcionActividadTipo;
    }

    public void setDescripcionActividadTipo(String descripcionActividadTipo) {
        this.descripcionActividadTipo = descripcionActividadTipo;
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
