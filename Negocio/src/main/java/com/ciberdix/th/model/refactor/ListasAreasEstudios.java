package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasAreasEstudios {
    private Integer idListaAreaEstudio;
    private String codigoListaAreaEstudio;
    private String nombreListaAreaEstudio;
    private Integer ordenListaAreaEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaAreaEstudio() {
        return idListaAreaEstudio;
    }

    public void setIdListaAreaEstudio(Integer idListaAreaEstudio) {
        this.idListaAreaEstudio = idListaAreaEstudio;
    }

    public String getCodigoListaAreaEstudio() {
        return codigoListaAreaEstudio;
    }

    public void setCodigoListaAreaEstudio(String codigoListaAreaEstudio) {
        this.codigoListaAreaEstudio = codigoListaAreaEstudio;
    }

    public String getNombreListaAreaEstudio() {
        return nombreListaAreaEstudio;
    }

    public void setNombreListaAreaEstudio(String nombreListaAreaEstudio) {
        this.nombreListaAreaEstudio = nombreListaAreaEstudio;
    }

    public Integer getOrdenListaAreaEstudio() {
        return ordenListaAreaEstudio;
    }

    public void setOrdenListaAreaEstudio(Integer ordenListaAreaEstudio) {
        this.ordenListaAreaEstudio = ordenListaAreaEstudio;
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
