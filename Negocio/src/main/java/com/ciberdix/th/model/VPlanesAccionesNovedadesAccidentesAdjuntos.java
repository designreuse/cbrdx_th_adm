package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VPlanesAccionesNovedadesAccidentesAdjuntos {

    private Integer idPlanAccionNovedadAccidenteAdjunto;
    private Integer idPlanAccionNovedadAccidente;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Boolean indicadorRespuesta;
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

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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

    public Boolean getIndicadorRespuesta() {
        return indicadorRespuesta;
    }

    public void setIndicadorRespuesta(Boolean indicadorRespuesta) {
        this.indicadorRespuesta = indicadorRespuesta;
    }
}
