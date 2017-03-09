package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasInstituciones", schema = "crz_th", catalog = "CREZCAMOS")
public class InstitutoEntity {
    private int idListaInstitucion;
    private String codigoListaInstitucion;
    private String nombreListaInstitucion;
    private int ordenListaInstitucion;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public InstitutoEntity() {
    }

    public InstitutoEntity(int idListaInstitucion, String codigoListaInstitucion, String nombreListaInstitucion, int ordenListaInstitucion, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaInstitucion = idListaInstitucion;
        this.codigoListaInstitucion = codigoListaInstitucion;
        this.nombreListaInstitucion = nombreListaInstitucion;
        this.ordenListaInstitucion = ordenListaInstitucion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaInstitucion", nullable = false)
    public int getIdListaInstitucion() {
        return idListaInstitucion;
    }

    public void setIdListaInstitucion(int idListaInstitucion) {
        this.idListaInstitucion = idListaInstitucion;
    }

    @Basic
    @Column(name = "CodigoListaInstitucion", nullable = false)
    public String getCodigoListaInstitucion() {
        return codigoListaInstitucion;
    }

    public void setCodigoListaInstitucion(String codigoListaInstitucion) {
        this.codigoListaInstitucion = codigoListaInstitucion;
    }

    @Basic
    @Column(name = "NombreListaInstitucion", nullable = false)
    public String getNombreListaInstitucion() {
        return nombreListaInstitucion;
    }

    public void setNombreListaInstitucion(String nombreListaInstitucion) {
        this.nombreListaInstitucion = nombreListaInstitucion;
    }

    @Basic
    @Column(name = "OrdenListaInstitucion", nullable = false)
    public int getOrdenListaInstitucion() {
        return ordenListaInstitucion;
    }

    public void setOrdenListaInstitucion(int ordenListaInstitucion) {
        this.ordenListaInstitucion = ordenListaInstitucion;
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
