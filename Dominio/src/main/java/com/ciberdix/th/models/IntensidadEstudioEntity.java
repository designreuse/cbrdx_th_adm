package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasIntensidades", schema = "crz_th", catalog = "CREZCAMOS")
public class IntensidadEstudioEntity {

    private int idListaIntensidad;
    private String codigoListaIntensidad;
    private String nombreListaIntensidad;
    private int ordenListaIntensidad;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public IntensidadEstudioEntity() {
    }

    public IntensidadEstudioEntity(int idListaIntensidad, String codigoListaIntensidad, String nombreListaIntensidad, int ordenListaIntensidad, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaIntensidad = idListaIntensidad;
        this.codigoListaIntensidad = codigoListaIntensidad;
        this.nombreListaIntensidad = nombreListaIntensidad;
        this.ordenListaIntensidad = ordenListaIntensidad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaIntensidad", nullable = false)
    public int getIdListaIntensidad() {
        return idListaIntensidad;
    }

    public void setIdListaIntensidad(int idListaIntensidad) {
        this.idListaIntensidad = idListaIntensidad;
    }

    @Basic
    @Column(name = "CodigoListaIntensidad", nullable = false)
    public String getCodigoListaIntensidad() {
        return codigoListaIntensidad;
    }

    public void setCodigoListaIntensidad(String codigoListaIntensidad) {
        this.codigoListaIntensidad = codigoListaIntensidad;
    }

    @Basic
    @Column(name = "NombreListaIntensidad", nullable = false)
    public String getNombreListaIntensidad() {
        return nombreListaIntensidad;
    }

    public void setNombreListaIntensidad(String nombreListaIntensidad) {
        this.nombreListaIntensidad = nombreListaIntensidad;
    }

    @Basic
    @Column(name = "OrdenListaIntensidad", nullable = false)
    public int getOrdenListaIntensidad() {
        return ordenListaIntensidad;
    }

    public void setOrdenListaIntensidad(int ordenListaIntensidad) {
        this.ordenListaIntensidad = ordenListaIntensidad;
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
