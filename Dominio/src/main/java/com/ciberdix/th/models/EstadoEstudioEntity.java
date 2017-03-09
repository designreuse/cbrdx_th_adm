package com.ciberdix.th.models;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasEstadosEstudios", schema = "crz_th", catalog = "CREZCAMOS")
public class EstadoEstudioEntity {
    private int idListaEstadoEstudio;
    private String codigoListaEstadoEstudio;
    private String nombreListaEstadoEstudio;
    private int ordenListaEstadoEstudio;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public EstadoEstudioEntity() {
    }

    public EstadoEstudioEntity(int idListaEstadoEstudio, String codigoListaEstadoEstudio, String nombreListaEstadoEstudio, int ordenListaEstadoEstudio, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaEstadoEstudio = idListaEstadoEstudio;
        this.codigoListaEstadoEstudio = codigoListaEstadoEstudio;
        this.nombreListaEstadoEstudio = nombreListaEstadoEstudio;
        this.ordenListaEstadoEstudio = ordenListaEstadoEstudio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaEstadoEstudio", nullable = false)
    public int getIdListaEstadoEstudio() {
        return idListaEstadoEstudio;
    }

    public void setIdListaEstadoEstudio(int idListaEstadoEstudio) {
        this.idListaEstadoEstudio = idListaEstadoEstudio;
    }

    @Basic
    @Column(name = "CodigoListaEstadoEstudio", nullable = false)
    public String getCodigoListaEstadoEstudio() {
        return codigoListaEstadoEstudio;
    }

    public void setCodigoListaEstadoEstudio(String codigoListaEstadoEstudio) {
        this.codigoListaEstadoEstudio = codigoListaEstadoEstudio;
    }

    @Basic
    @Column(name = "NombreListaEstadoEstudio", nullable = false)
    public String getNombreListaEstadoEstudio() {
        return nombreListaEstadoEstudio;
    }

    public void setNombreListaEstadoEstudio(String nombreListaEstadoEstudio) {
        this.nombreListaEstadoEstudio = nombreListaEstadoEstudio;
    }

    @Basic
    @Column(name = "OrdenListaEstadoEstudio", nullable = false)
    public int getOrdenListaEstadoEstudio() {
        return ordenListaEstadoEstudio;
    }

    public void setOrdenListaEstadoEstudio(int ordenListaEstadoEstudio) {
        this.ordenListaEstadoEstudio = ordenListaEstadoEstudio;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
