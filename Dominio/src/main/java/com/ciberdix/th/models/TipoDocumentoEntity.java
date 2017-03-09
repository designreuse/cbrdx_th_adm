package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposDocumentos", schema = "crz_th", catalog = "CREZCAMOS")
public class TipoDocumentoEntity {
    private int idListaTipoDocumentos;
    private String codigoListaTipoDocumentos;
    private String nombreListaTipoDocumentos;
    private int ordenListaTipoDocumentos;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
	
	public TipoDocumentoEntity(int idListaTipoDocumentos, String codigoListaTipoDocumentos, String nombreListaTipoDocumentos, int ordenListaTipoDocumentos, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idListaTipoDocumentos = idListaTipoDocumentos;
        this.codigoListaTipoDocumentos = codigoListaTipoDocumentos;
        this.nombreListaTipoDocumentos = nombreListaTipoDocumentos;
        this.ordenListaTipoDocumentos = ordenListaTipoDocumentos;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoDocumentoEntity() {
    }
	
	@Id
    @Column(name = "IdListaTipoDocumento", nullable = false)
    public int getIdListaTipoDocumentos() {
        return idListaTipoDocumentos;
    }

    public void setIdListaTipoDocumentos(int idListaTipoDocumentos) {
        this.idListaTipoDocumentos = idListaTipoDocumentos;
    }

    @Basic
    @Column(name = "CodigoListaTipoDocumento", nullable = false)
    public String getCodigoListaTipoDocumentos() {
        return codigoListaTipoDocumentos;
    }

    public void setCodigoListaTipoDocumentos(String codigoListaTipoDocumentos) {
        this.codigoListaTipoDocumentos = codigoListaTipoDocumentos;
    }

    @Basic
    @Column(name = "NombreListaTipoDocumento", nullable = false)
    public String getNombreListaTipoDocumentos() {
        return nombreListaTipoDocumentos;
    }

    public void setNombreListaTipoDocumentos(String nombreListaTipoDocumentos) {
        this.nombreListaTipoDocumentos = nombreListaTipoDocumentos;
    }

    @Basic
    @Column(name = "OrdenListaTipoDocumento", nullable = false)
    public int getOrdenListaTipoDocumentos() {
        return ordenListaTipoDocumentos;
    }

    public void setOrdenListaTipoDocumentos(int ordenListaTipoDocumentos) {
        this.ordenListaTipoDocumentos = ordenListaTipoDocumentos;
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
