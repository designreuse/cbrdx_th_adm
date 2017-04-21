package com.ciberdix.th.models;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasAreasEstudios", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class AreaEstudioEntity {
    private int idListaAreaEstudio;
    private String codigoListaAreaEstudio;
    private String nombreListaAreaEstudio;
    private int ordenListaAreaEstudio;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public AreaEstudioEntity() {
    }

    public AreaEstudioEntity(int idListaAreaEstudio, String codigoListaAreaEstudio, String nombreListaAreaEstudio, int ordenListaAreaEstudio, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaAreaEstudio = idListaAreaEstudio;
        this.codigoListaAreaEstudio = codigoListaAreaEstudio;
        this.nombreListaAreaEstudio = nombreListaAreaEstudio;
        this.ordenListaAreaEstudio = ordenListaAreaEstudio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaAreaEstudio", nullable = false)
    public int getIdListaAreaEstudio() {
        return idListaAreaEstudio;
    }

    public void setIdListaAreaEstudio(int idListaAreaEstudio) {
        this.idListaAreaEstudio = idListaAreaEstudio;
    }

    @Basic
    @Column(name = "CodigoListaAreaEstudio", nullable = false)
    public String getCodigoListaAreaEstudio() {
        return codigoListaAreaEstudio;
    }

    public void setCodigoListaAreaEstudio(String codigoListaAreaEstudio) {
        this.codigoListaAreaEstudio = codigoListaAreaEstudio;
    }

    @Basic
    @Column(name = "NombreListaAreaEstudio", nullable = false)
    public String getNombreListaAreaEstudio() {
        return nombreListaAreaEstudio;
    }

    public void setNombreListaAreaEstudio(String nombreListaAreaEstudio) {
        this.nombreListaAreaEstudio = nombreListaAreaEstudio;
    }

    @Basic
    @Column(name = "OrdenListaAreaEstudio", nullable = false)
    public int getOrdenListaAreaEstudio() {
        return ordenListaAreaEstudio;
    }

    public void setOrdenListaAreaEstudio(int ordenListaAreaEstudio) {
        this.ordenListaAreaEstudio = ordenListaAreaEstudio;
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
