package com.ciberdix.th.model;

import java.sql.Timestamp;

public class PlanesAccionesNovedadesAccidentesAdjuntos {

    private Integer idPlanAccionNovedadAccidenteAdjunto;
    private Integer idPlanAccionNovedadAccidente;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdPlanAccionNovedadAccidenteAdjunto() {
        return idPlanAccionNovedadAccidenteAdjunto;
    }

    public void setIdPlanAccionNovedadAccidenteAdjunto(Integer idPlanAccionNovedadAccidenteAdjunto) {
        this.idPlanAccionNovedadAccidenteAdjunto = idPlanAccionNovedadAccidenteAdjunto;
    }

    public Integer getIdPlanAccionNovedadAccidente() {
        return idPlanAccionNovedadAccidente;
    }

    public void setIdPlanAccionNovedadAccidente(Integer idPlanAccionNovedadAccidente) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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
