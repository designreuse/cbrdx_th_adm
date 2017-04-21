package com.ciberdix.th.models;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
 @Entity
@Table(name = "ListasParentescos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class RelacionEntity {
   private int idListaParentescos;
    private String codigoListaParentescos;
    private String nombreListaParentescos;
    private int ordenListaParentescos;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RelacionEntity() {
    }

    public RelacionEntity(int idListaParentescos, String codigoListaParentescos, String nombreListaParentescos, int ordenListaParentescos, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaParentescos = idListaParentescos;
        this.codigoListaParentescos = codigoListaParentescos;
        this.nombreListaParentescos = nombreListaParentescos;
        this.ordenListaParentescos = ordenListaParentescos;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaParentesco", nullable = false)
    public int getIdListaParentescos() {
        return idListaParentescos;
    }

    public void setIdListaParentescos(int idListaParentescos) {
        this.idListaParentescos = idListaParentescos;
    }

    @Basic
    @Column(name = "CodigoListaParentesco", nullable = false)
    public String getCodigoListaParentescos() {
        return codigoListaParentescos;
    }

    public void setCodigoListaParentescos(String codigoListaParentescos) {
        this.codigoListaParentescos = codigoListaParentescos;
    }

    @Basic
    @Column(name = "NombreListaParentesco", nullable = false)
    public String getNombreListaParentescos() {
        return nombreListaParentescos;
    }

    public void setNombreListaParentescos(String nombreListaParentescos) {
        this.nombreListaParentescos = nombreListaParentescos;
    }

    @Basic
    @Column(name = "OrdenListaParentesco", nullable = false)
    public int getOrdenListaParentescos() {
        return ordenListaParentescos;
    }

    public void setOrdenListaParentescos(int ordenListaParentescos) {
        this.ordenListaParentescos = ordenListaParentescos;
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
