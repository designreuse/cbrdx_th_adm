package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasSectoresEmpresas", schema = "crz_th", catalog = "CREZCAMOS")
public class SectorEmpresaEntity {
     private int idListaSectorEmpresa;
    private String codigoListaSectorEmpresa;
    private String nombreListaSectorEmpresa;
    private int ordenListaSectorEmpresa;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public SectorEmpresaEntity(int idListaSectorEmpresa, String codigoListaSectorEmpresa, String nombreListaSectorEmpresa, int ordenListaSectorEmpresa, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaSectorEmpresa = idListaSectorEmpresa;
        this.codigoListaSectorEmpresa = codigoListaSectorEmpresa;
        this.nombreListaSectorEmpresa = nombreListaSectorEmpresa;
        this.ordenListaSectorEmpresa = ordenListaSectorEmpresa;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public SectorEmpresaEntity() {
    }

    @Id
    @Column(name = "IdListaSectorEmpresa", nullable = false)
    public int getIdListaSectorEmpresa() {
        return idListaSectorEmpresa;
    }

    public void setIdListaSectorEmpresa(int idListaSectorEmpresa) {
        this.idListaSectorEmpresa = idListaSectorEmpresa;
    }

    @Basic
    @Column(name = "CodigoListaSectorEmpresa", nullable = false)
    public String getCodigoListaSectorEmpresa() {
        return codigoListaSectorEmpresa;
    }

    public void setCodigoListaSectorEmpresa(String codigoListaSectorEmpresa) {
        this.codigoListaSectorEmpresa = codigoListaSectorEmpresa;
    }

    @Basic
    @Column(name = "NombreListaSectorEmpresa", nullable = false)
    public String getNombreListaSectorEmpresa() {
        return nombreListaSectorEmpresa;
    }

    public void setNombreListaSectorEmpresa(String nombreListaSectorEmpresa) {
        this.nombreListaSectorEmpresa = nombreListaSectorEmpresa;
    }

    @Basic
    @Column(name = "OrdenListaSectorEmpresa", nullable = false)
    public int getOrdenListaSectorEmpresa() {
        return ordenListaSectorEmpresa;
    }

    public void setOrdenListaSectorEmpresa(int ordenListaSectorEmpresa) {
        this.ordenListaSectorEmpresa = ordenListaSectorEmpresa;
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
