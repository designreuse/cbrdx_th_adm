package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasSubSectoresEmpresas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class SubSectorEmpresaEntity {
    private int idListaSubSectorEmpresa;
    private String codigoListaSubSectorEmpresa;
    private String nombreListaSubSectorEmpresa;
    private int ordenListaSubSectorEmpresa;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public SubSectorEmpresaEntity(int idListaSubSectorEmpresa, String codigoListaSubSectorEmpresa, String nombreListaSubSectorEmpresa, int ordenListaSubSectorEmpresa, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaSubSectorEmpresa = idListaSubSectorEmpresa;
        this.codigoListaSubSectorEmpresa = codigoListaSubSectorEmpresa;
        this.nombreListaSubSectorEmpresa = nombreListaSubSectorEmpresa;
        this.ordenListaSubSectorEmpresa = ordenListaSubSectorEmpresa;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public SubSectorEmpresaEntity() {
    }

    @Id
    @Column(name = "IdListaSubSectorEmpresa", nullable = false)
    public int getIdListaSubSectorEmpresa() {
        return idListaSubSectorEmpresa;
    }

    public void setIdListaSubSectorEmpresa(int idListaSubSectorEmpresa) {
        this.idListaSubSectorEmpresa = idListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "CodigoListaSubSectorEmpresa", nullable = false)
    public String getCodigoListaSubSectorEmpresa() {
        return codigoListaSubSectorEmpresa;
    }

    public void setCodigoListaSubSectorEmpresa(String codigoListaSubSectorEmpresa) {
        this.codigoListaSubSectorEmpresa = codigoListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "NombreListaSubSectorEmpresa", nullable = false)
    public String getNombreListaSubSectorEmpresa() {
        return nombreListaSubSectorEmpresa;
    }

    public void setNombreListaSubSectorEmpresa(String nombreListaSubSectorEmpresa) {
        this.nombreListaSubSectorEmpresa = nombreListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "OrdenListaSubSectorEmpresa", nullable = false)
    public int getOrdenListaSubSectorEmpresa() {
        return ordenListaSubSectorEmpresa;
    }

    public void setOrdenListaSubSectorEmpresa(int ordenListaSubSectorEmpresa) {
        this.ordenListaSubSectorEmpresa = ordenListaSubSectorEmpresa;
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
