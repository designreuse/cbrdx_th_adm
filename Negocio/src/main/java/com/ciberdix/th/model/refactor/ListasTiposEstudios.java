package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasTiposEstudios {
    private Integer idListaTipoEstudio;
    private String codigoListaTipoEstudio;
    private String nombreListaTipoEstudio;
    private Integer ordenListaTipoEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaTipoEstudio() {
        return idListaTipoEstudio;
    }

    public void setIdListaTipoEstudio(Integer idListaTipoEstudio) {
        this.idListaTipoEstudio = idListaTipoEstudio;
    }

    public String getCodigoListaTipoEstudio() {
        return codigoListaTipoEstudio;
    }

    public void setCodigoListaTipoEstudio(String codigoListaTipoEstudio) {
        this.codigoListaTipoEstudio = codigoListaTipoEstudio;
    }

    public String getNombreListaTipoEstudio() {
        return nombreListaTipoEstudio;
    }

    public void setNombreListaTipoEstudio(String nombreListaTipoEstudio) {
        this.nombreListaTipoEstudio = nombreListaTipoEstudio;
    }

    public Integer getOrdenListaTipoEstudio() {
        return ordenListaTipoEstudio;
    }

    public void setOrdenListaTipoEstudio(Integer ordenListaTipoEstudio) {
        this.ordenListaTipoEstudio = ordenListaTipoEstudio;
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
