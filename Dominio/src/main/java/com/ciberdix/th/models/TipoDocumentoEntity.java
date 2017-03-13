package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposDocumentos", schema = "crz_th", catalog = "CREZCAMOS")
public class TipoDocumentoEntity {
    private Integer value;
    private String codigoListaTipoDocumentos;
    private String label;
    private Integer ordenListaTipoDocumentos;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
	
	public TipoDocumentoEntity(Integer idListaTipoDocumentos, String codigoListaTipoDocumentos, String nombreListaTipoDocumentos, Integer ordenListaTipoDocumentos, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.value = idListaTipoDocumentos;
        this.codigoListaTipoDocumentos = codigoListaTipoDocumentos;
        this.label = nombreListaTipoDocumentos;
        this.ordenListaTipoDocumentos = ordenListaTipoDocumentos;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TipoDocumentoEntity() {
    }
	
	@Id
    @Column(name = "IdListaTipoDocumento", nullable = false)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "OrdenListaTipoDocumento", nullable = false)
    public Integer getOrdenListaTipoDocumentos() {
        return ordenListaTipoDocumentos;
    }

    public void setOrdenListaTipoDocumentos(Integer ordenListaTipoDocumentos) {
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
