package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "ListasGeneros", schema = "crz_th", catalog = "CREZCAMOS")
public class GenerosEntity {
    private Integer idListaGenero;
    private String codigoListaGenero;
    private String nombreListaGenero;
    private Boolean indicadoHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaGenero", nullable = false)
    public Integer getIdListaGenero() {
        return idListaGenero;
    }

    public void setIdListaGenero(Integer idListaGenero) {
        this.idListaGenero = idListaGenero;
    }

    @Basic
    @Column(name = "CodigoListaGenero", nullable = true, length = 64)
    public String getCodigoListaGenero() {
        return codigoListaGenero;
    }

    public void setCodigoListaGenero(String codigoListaGenero) {
        this.codigoListaGenero = codigoListaGenero;
    }
    @Basic
    @Column(name = "NombreListaGenero", nullable = true, length = 64)
    public String getNombreListaGenero() {
        return nombreListaGenero;
    }

    public void setNombreListaGenero(String nombreListaGenero) {
        this.nombreListaGenero = nombreListaGenero;
    }
    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true, length = 64)
    public Boolean getIndicadoHabilitado() {
        return indicadoHabilitado;
    }

    public void setIndicadoHabilitado(Boolean indicadoHabilitado) {
        this.indicadoHabilitado = indicadoHabilitado;
    }
    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true, length = 64)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true, length = 64)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }





}
