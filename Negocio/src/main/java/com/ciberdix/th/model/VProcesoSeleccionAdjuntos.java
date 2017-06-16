package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 16/06/2017.
 */
public class VProcesoSeleccionAdjuntos {

    private Integer idProcesoSeleccionAdjunto;
    private Integer idProcesoPaso;
    private Integer idTerceroPublicacion;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProcesoSeleccionAdjunto() {
        return idProcesoSeleccionAdjunto;
    }

    public void setIdProcesoSeleccionAdjunto(Integer idProcesoSeleccionAdjunto) {
        this.idProcesoSeleccionAdjunto = idProcesoSeleccionAdjunto;
    }

    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    public Integer getIdTerceroPublicacion() {
        return idTerceroPublicacion;
    }

    public void setIdTerceroPublicacion(Integer idTerceroPublicacion) {
        this.idTerceroPublicacion = idTerceroPublicacion;
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
