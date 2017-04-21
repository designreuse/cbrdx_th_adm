package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "ListasEstadosCiviles", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class EstadoCivilEntity {
    private Integer idListaEstadoCivil;
    private String codigoListaEstadoCivil;
    private String nombreListaEstadoCivil;
    private Boolean indicadoHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaEstadoCivil", nullable = false)
    public Integer getIdListaEstadoCivil() {
        return idListaEstadoCivil;
    }

    public void setIdListaEstadoCivil(Integer idListaEstadoCivil) {
        this.idListaEstadoCivil = idListaEstadoCivil;
    }
    @Basic
    @Column(name = "CodigoListaEstadoCivil", nullable = true, length = 64)
    public String getCodigoListaEstadoCivil() {
        return codigoListaEstadoCivil;
    }

    public void setCodigoListaEstadoCivil(String codigoListaEstadoCivil) {
        this.codigoListaEstadoCivil = codigoListaEstadoCivil;
    }

    @Basic
    @Column(name = "NombreListaEstadoCivil", nullable = true, length = 64)
    public String getNombreListaEstadoCivil() {
        return nombreListaEstadoCivil;
    }

    public void setNombreListaEstadoCivil(String nombreListaEstadoCivil) {
        this.nombreListaEstadoCivil = nombreListaEstadoCivil;
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
