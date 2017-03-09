package com.ciberdix.th.models;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposNomenclaturasComplementarias", schema = "crz_th", catalog = "CREZCAMOS")
public class ComplementariaNomenclaturaEntity {
    private int idListaTipoNomenclaturaComplementaria;
    private String codigoListaTipoNomenclaturaComplementaria;
    private String nombreListaTipoNomenclaturaComplementaria;
    private int ordenListaTipoNomenclaturaComplementaria;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ComplementariaNomenclaturaEntity() {
    }

    public ComplementariaNomenclaturaEntity(int idListaTipoNomenclaturaComplementaria, String codigoListaTipoNomenclaturaComplementaria, String nombreListaTipoNomenclaturaComplementaria, int ordenListaTipoNomenclaturaComplementaria, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaTipoNomenclaturaComplementaria = idListaTipoNomenclaturaComplementaria;
        this.codigoListaTipoNomenclaturaComplementaria = codigoListaTipoNomenclaturaComplementaria;
        this.nombreListaTipoNomenclaturaComplementaria = nombreListaTipoNomenclaturaComplementaria;
        this.ordenListaTipoNomenclaturaComplementaria = ordenListaTipoNomenclaturaComplementaria;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @Column(name = "IdListaTipoNomenclaturaComplementaria", nullable = false)
    public int getIdListaTipoNomenclaturaComplementaria() {
        return idListaTipoNomenclaturaComplementaria;
    }

    public void setIdListaTipoNomenclaturaComplementaria(int idListaTipoNomenclaturaComplementaria) {
        this.idListaTipoNomenclaturaComplementaria = idListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "CodigoListaTipoNomenclaturaComplementaria", nullable = false)
    public String getCodigoListaTipoNomenclaturaComplementaria() {
        return codigoListaTipoNomenclaturaComplementaria;
    }

    public void setCodigoListaTipoNomenclaturaComplementaria(String codigoListaTipoNomenclaturaComplementaria) {
        this.codigoListaTipoNomenclaturaComplementaria = codigoListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "NombreListaTipoNomenclaturaComplementaria", nullable = false)
    public String getNombreListaTipoNomenclaturaComplementaria() {
        return nombreListaTipoNomenclaturaComplementaria;
    }

    public void setNombreListaTipoNomenclaturaComplementaria(String nombreListaTipoNomenclaturaComplementaria) {
        this.nombreListaTipoNomenclaturaComplementaria = nombreListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "OrdenListaTipoNomenclaturaComplementaria", nullable = false)
    public int getOrdenListaTipoNomenclaturaComplementaria() {
        return ordenListaTipoNomenclaturaComplementaria;
    }

    public void setOrdenListaTipoNomenclaturaComplementaria(int ordenListaTipoNomenclaturaComplementaria) {
        this.ordenListaTipoNomenclaturaComplementaria = ordenListaTipoNomenclaturaComplementaria;
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
