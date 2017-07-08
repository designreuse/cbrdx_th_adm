package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
public class VProcesoSeleccionPruebasTecnicas {

    private Integer idProcesoSeleccionPruebaTecnica;
    private Integer idProcesoSeleccion;
    private String pruebaTecnica;
    private Integer idPruebaTecnica;
    private Boolean indicadorRealiza;
    private String nota;
    private String observacion;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProcesoSeleccionPruebaTecnica() {
        return idProcesoSeleccionPruebaTecnica;
    }

    public void setIdProcesoSeleccionPruebaTecnica(Integer idProcesoSeleccionPruebaTecnica) {
        this.idProcesoSeleccionPruebaTecnica = idProcesoSeleccionPruebaTecnica;
    }

    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    public String getPruebaTecnica() {
        return pruebaTecnica;
    }

    public void setPruebaTecnica(String pruebaTecnica) {
        this.pruebaTecnica = pruebaTecnica;
    }

    public Integer getIdPruebaTecnica() {
        return idPruebaTecnica;
    }

    public void setIdPruebaTecnica(Integer idPruebaTecnica) {
        this.idPruebaTecnica = idPruebaTecnica;
    }

    public Boolean getIndicadorRealiza() {
        return indicadorRealiza;
    }

    public void setIndicadorRealiza(Boolean indicadorRealiza) {
        this.indicadorRealiza = indicadorRealiza;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
}
