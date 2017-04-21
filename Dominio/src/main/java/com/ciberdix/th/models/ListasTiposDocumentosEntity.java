package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by TracesMaker on 12/03/2017.
 */
@Entity
@Table(name = "ListasTiposDocumentos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ListasTiposDocumentosEntity {
    private int idListaTipoDocumento;
    private String codigoListaTipoDocumento;
    private String nombreListaTipoDocumento;
    private int ordenListaTipoDocumento;
    private boolean indicadorHabilitado;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoDocumento")
    public int getIdListaTipoDocumento() {
        return idListaTipoDocumento;
    }

    public void setIdListaTipoDocumento(int idListaTipoDocumento) {
        this.idListaTipoDocumento = idListaTipoDocumento;
    }

    @Basic
    @Column(name = "CodigoListaTipoDocumento")
    public String getCodigoListaTipoDocumento() {
        return codigoListaTipoDocumento;
    }

    public void setCodigoListaTipoDocumento(String codigoListaTipoDocumento) {
        this.codigoListaTipoDocumento = codigoListaTipoDocumento;
    }

    @Basic
    @Column(name = "NombreListaTipoDocumento")
    public String getNombreListaTipoDocumento() {
        return nombreListaTipoDocumento;
    }

    public void setNombreListaTipoDocumento(String nombreListaTipoDocumento) {
        this.nombreListaTipoDocumento = nombreListaTipoDocumento;
    }

    @Basic
    @Column(name = "OrdenListaTipoDocumento")
    public int getOrdenListaTipoDocumento() {
        return ordenListaTipoDocumento;
    }

    public void setOrdenListaTipoDocumento(int ordenListaTipoDocumento) {
        this.ordenListaTipoDocumento = ordenListaTipoDocumento;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListasTiposDocumentosEntity that = (ListasTiposDocumentosEntity) o;

        if (idListaTipoDocumento != that.idListaTipoDocumento) return false;
        if (ordenListaTipoDocumento != that.ordenListaTipoDocumento) return false;
        if (indicadorHabilitado != that.indicadorHabilitado) return false;
        if (codigoListaTipoDocumento != null ? !codigoListaTipoDocumento.equals(that.codigoListaTipoDocumento) : that.codigoListaTipoDocumento != null)
            return false;
        if (nombreListaTipoDocumento != null ? !nombreListaTipoDocumento.equals(that.nombreListaTipoDocumento) : that.nombreListaTipoDocumento != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idListaTipoDocumento;
        result = 31 * result + (codigoListaTipoDocumento != null ? codigoListaTipoDocumento.hashCode() : 0);
        result = 31 * result + (nombreListaTipoDocumento != null ? nombreListaTipoDocumento.hashCode() : 0);
        result = 31 * result + ordenListaTipoDocumento;
        result = 31 * result + (indicadorHabilitado ? 1 : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
