package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposDirecciones", schema = "crz_th", catalog = "CREZCAMOS")
public class TipoDireccionEntity {
    private int value;
    private String codigoListaTipoDirecciones;
    private String label;
    private int ordenListaTipoDirecciones;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TipoDireccionEntity(int value, String codigoListaTipoDirecciones, String label, int ordenListaTipoDirecciones, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.value = value;
        this.codigoListaTipoDirecciones = codigoListaTipoDirecciones;
        this.label = label;
        this.ordenListaTipoDirecciones = ordenListaTipoDirecciones;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoDireccionEntity() {
    }

    @Id
    @Column(name = "IdListaTipoDireccion", nullable = false)
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "CodigoListaTipoDireccion", nullable = false)
    public String getCodigoListaTipoDirecciones() {
        return codigoListaTipoDirecciones;
    }

    public void setCodigoListaTipoDirecciones(String codigoListaTipoDirecciones) {
        this.codigoListaTipoDirecciones = codigoListaTipoDirecciones;
    }

    @Basic
    @Column(name = "NombreListaTipoDireccion", nullable = false)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "OrdenListaTipoDireccion", nullable = false)
    public int getOrdenListaTipoDirecciones() {
        return ordenListaTipoDirecciones;
    }

    public void setOrdenListaTipoDirecciones(int ordenListaTipoDirecciones) {
        this.ordenListaTipoDirecciones = ordenListaTipoDirecciones;
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
