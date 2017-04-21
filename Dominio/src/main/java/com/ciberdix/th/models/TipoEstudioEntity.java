package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposEstudios", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TipoEstudioEntity {
      private int idListaTipoEstudios;
    private String codigoListaTipoEstudios;
    private String nombreListaTipoEstudios;
    private int ordenListaTipoEstudios;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TipoEstudioEntity(int idListaTipoEstudios, String codigoListaTipoEstudios, String nombreListaTipoEstudios, int ordenListaTipoEstudios, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaTipoEstudios = idListaTipoEstudios;
        this.codigoListaTipoEstudios = codigoListaTipoEstudios;
        this.nombreListaTipoEstudios = nombreListaTipoEstudios;
        this.ordenListaTipoEstudios = ordenListaTipoEstudios;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoEstudioEntity() {
    }

    @Id
    @Column(name = "IdListaTipoEstudio", nullable = false)
    public int getIdListaTipoEstudios() {
        return idListaTipoEstudios;
    }

    public void setIdListaTipoEstudios(int idListaTipoEstudios) {
        this.idListaTipoEstudios = idListaTipoEstudios;
    }

    @Basic
    @Column(name = "CodigoListaTipoEstudio", nullable = false)
    public String getCodigoListaTipoEstudios() {
        return codigoListaTipoEstudios;
    }

    public void setCodigoListaTipoEstudios(String codigoListaTipoEstudios) {
        this.codigoListaTipoEstudios = codigoListaTipoEstudios;
    }

    @Basic
    @Column(name = "NombreListaTipoEstudio", nullable = false)
    public String getNombreListaTipoEstudios() {
        return nombreListaTipoEstudios;
    }

    public void setNombreListaTipoEstudios(String nombreListaTipoEstudios) {
        this.nombreListaTipoEstudios = nombreListaTipoEstudios;
    }

    @Basic
    @Column(name = "OrdenListaTipoEstudio", nullable = false)
    public int getOrdenListaTipoEstudios() {
        return ordenListaTipoEstudios;
    }

    public void setOrdenListaTipoEstudios(int ordenListaTipoEstudios) {
        this.ordenListaTipoEstudios = ordenListaTipoEstudios;
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
