package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposReferencias", schema = "crz_th", catalog = "CREZCAMOS")
public class TipoReferenciaEntity {
      private int idListaTipoReferencias;
    private String codigoListaTipoReferencias;
    private String nombreListaTipoReferencias;
    private int ordenListaTipoReferencias;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TipoReferenciaEntity(int idListaTipoReferencias, String codigoListaTipoReferencias, String nombreListaTipoReferencias, int ordenListaTipoReferencias, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaTipoReferencias = idListaTipoReferencias;
        this.codigoListaTipoReferencias = codigoListaTipoReferencias;
        this.nombreListaTipoReferencias = nombreListaTipoReferencias;
        this.ordenListaTipoReferencias = ordenListaTipoReferencias;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoReferenciaEntity() {
    }

    @Id
    @Column(name = "IdListaTipoReferencia", nullable = false)
    public int getIdListaTipoReferencias() {
        return idListaTipoReferencias;
    }

    public void setIdListaTipoReferencias(int idListaTipoReferencias) {
        this.idListaTipoReferencias = idListaTipoReferencias;
    }

    @Basic
    @Column(name = "CodigoListaTipoReferencia", nullable = false)
    public String getCodigoListaTipoReferencias() {
        return codigoListaTipoReferencias;
    }

    public void setCodigoListaTipoReferencias(String codigoListaTipoReferencias) {
        this.codigoListaTipoReferencias = codigoListaTipoReferencias;
    }

    @Basic
    @Column(name = "NombreListaTipoReferencia", nullable = false)
    public String getNombreListaTipoReferencias() {
        return nombreListaTipoReferencias;
    }

    public void setNombreListaTipoReferencias(String nombreListaTipoReferencias) {
        this.nombreListaTipoReferencias = nombreListaTipoReferencias;
    }

    @Basic
    @Column(name = "OrdenListaTipoReferencia", nullable = false)
    public int getOrdenListaTipoReferencias() {
        return ordenListaTipoReferencias;
    }

    public void setOrdenListaTipoReferencias(int ordenListaTipoReferencias) {
        this.ordenListaTipoReferencias = ordenListaTipoReferencias;
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
