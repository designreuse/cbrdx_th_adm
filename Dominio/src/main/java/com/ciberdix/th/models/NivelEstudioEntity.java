package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasNivelesEstudios", schema = "crz_th", catalog = "CREZCAMOS")
public class NivelEstudioEntity {
    private Integer idListaNivelEstudio;
    private String codigoListaNivelEstudio;
    private String nombreListaNivelEstudio;
    private Integer ordenListaNivelEstudio;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public NivelEstudioEntity() {
    }

    public NivelEstudioEntity(Integer idListaNivelEstudio, String codigoListaNivelEstudio, String nombreListaNivelEstudio, Integer ordenListaNivelEstudio, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaNivelEstudio = idListaNivelEstudio;
        this.codigoListaNivelEstudio = codigoListaNivelEstudio;
        this.nombreListaNivelEstudio = nombreListaNivelEstudio;
        this.ordenListaNivelEstudio = ordenListaNivelEstudio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaNivelEstudio", nullable = false)
    public Integer getIdListaNivelEstudio() {
        return idListaNivelEstudio;
    }

    public void setIdListaNivelEstudio(Integer idListaNivelEstudio) {
        this.idListaNivelEstudio = idListaNivelEstudio;
    }

    @Basic
    @Column(name = "CodigoListaNivelEstudio", nullable = false)
    public String getCodigoListaNivelEstudio() {
        return codigoListaNivelEstudio;
    }

    public void setCodigoListaNivelEstudio(String codigoListaNivelEstudio) {
        this.codigoListaNivelEstudio = codigoListaNivelEstudio;
    }

    @Basic
    @Column(name = "NombreListaNivelEstudio", nullable = false)
    public String getNombreListaNivelEstudio() {
        return nombreListaNivelEstudio;
    }

    public void setNombreListaNivelEstudio(String nombreListaNivelEstudio) {
        this.nombreListaNivelEstudio = nombreListaNivelEstudio;
    }

    @Basic
    @Column(name = "OrdenListaNivelEstudio", nullable = false)
    public Integer getOrdenListaNivelEstudio() {
        return ordenListaNivelEstudio;
    }

    public void setOrdenListaNivelEstudio(Integer ordenListaNivelEstudio) {
        this.ordenListaNivelEstudio = ordenListaNivelEstudio;
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
