package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasEstadosEstudios {
    private Integer idListaEstadoEstudio;
    private String codigoListaEstadoEstudio;
    private String nombreListaEstadoEstudio;
    private Integer ordenListaEstadoEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaEstadoEstudio() {
        return idListaEstadoEstudio;
    }

    public void setIdListaEstadoEstudio(Integer idListaEstadoEstudio) {
        this.idListaEstadoEstudio = idListaEstadoEstudio;
    }

    public String getCodigoListaEstadoEstudio() {
        return codigoListaEstadoEstudio;
    }

    public void setCodigoListaEstadoEstudio(String codigoListaEstadoEstudio) {
        this.codigoListaEstadoEstudio = codigoListaEstadoEstudio;
    }

    public String getNombreListaEstadoEstudio() {
        return nombreListaEstadoEstudio;
    }

    public void setNombreListaEstadoEstudio(String nombreListaEstadoEstudio) {
        this.nombreListaEstadoEstudio = nombreListaEstadoEstudio;
    }

    public Integer getOrdenListaEstadoEstudio() {
        return ordenListaEstadoEstudio;
    }

    public void setOrdenListaEstadoEstudio(Integer ordenListaEstadoEstudio) {
        this.ordenListaEstadoEstudio = ordenListaEstadoEstudio;
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
