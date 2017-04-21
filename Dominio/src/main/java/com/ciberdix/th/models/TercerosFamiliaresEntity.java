package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "TercerosFamiliares", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TercerosFamiliaresEntity {

    private int idTercerosFamiliar;
    private int idTerceros;
    private int idFamiliar;
    private int idParentezco;
    private int idConvivencia;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosFamiliaresEntity(int idTerceros, int idFamiliar, int idParentezco, int idConvivencia, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTerceros = idTerceros;
        this.idFamiliar = idFamiliar;
        this.idParentezco = idParentezco;
        this.idConvivencia = idConvivencia;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TercerosFamiliaresEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTerceroFamiliar", nullable = false)
    public int getIdTercerosFamiliar() {
        return idTercerosFamiliar;
    }


    public void setIdTercerosFamiliar(int idTercerosFamiliar) {
        this.idTercerosFamiliar = idTercerosFamiliar;
    }
    @Basic
    @Column(name = "IdTercero", nullable = true)
    public int getIdTerceros() {
        return idTerceros;
    }

    public void setIdTerceros(int idTerceros) {
        this.idTerceros = idTerceros;
    }
    @Basic
    @Column(name = "IdFamiliar", nullable = true)
    public int getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
    }
    @Basic
    @Column(name = "IdParentesco", nullable = true)
    public int getIdParentezco() {
        return idParentezco;
    }

    public void setIdParentezco(int idParentezco) {
        this.idParentezco = idParentezco;
    }
    @Basic
    @Column(name = "IdConvivencia", nullable = true)
    public int getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(int idConvivencia) {
        this.idConvivencia = idConvivencia;
    }
    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }
    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
