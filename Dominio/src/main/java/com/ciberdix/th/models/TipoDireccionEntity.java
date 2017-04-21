package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposDirecciones", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TipoDireccionEntity {
    private Integer value;
    private String codigoListaTipoDirecciones;
    private String label;
    private Integer ordenListaTipoDirecciones;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TipoDireccionEntity(Integer idListaTipoDirecciones, String codigoListaTipoDirecciones, String nombreListaTipoDirecciones, Integer ordenListaTipoDirecciones, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.value = idListaTipoDirecciones;
        this.codigoListaTipoDirecciones = codigoListaTipoDirecciones;
        this.label = nombreListaTipoDirecciones;
        this.ordenListaTipoDirecciones = ordenListaTipoDirecciones;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoDireccionEntity() {
    }

    @Id
    @Column(name = "IdListaTipoDireccion", nullable = false)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer idListaTipoDirecciones) {
        this.value = idListaTipoDirecciones;
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

    public void setLabel(String nombreListaTipoDirecciones) {
        this.label = nombreListaTipoDirecciones;
    }

    @Basic
    @Column(name = "OrdenListaTipoDireccion", nullable = false)
    public Integer getOrdenListaTipoDirecciones() {
        return ordenListaTipoDirecciones;
    }

    public void setOrdenListaTipoDirecciones(Integer ordenListaTipoDirecciones) {
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
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
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
