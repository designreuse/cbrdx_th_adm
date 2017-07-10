package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "DocumentosTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class DocumentosTerceros {
    private Integer idDocumentoTercero;
    private Integer idClasificacionDocumento;
    private String nombre;
    private String codigoInstitucional;
    private String descripcion;
    private Boolean indicadorAdjunto;
    private Boolean indicadorDescarga;
    private Integer idAdjunto;
    private Boolean indicadorContratacion;
    private Integer vigencia;
    private Boolean indicadorAplica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public DocumentosTerceros() {
    }

    public DocumentosTerceros(Integer idClasificacionDocumento, String nombre, String codigoInstitucional, String descripcion, Boolean indicadorAdjunto, Boolean indicadorDescarga, Integer idAdjunto, Boolean indicadorContratacion, Integer vigencia, Boolean indicadorAplica, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idClasificacionDocumento = idClasificacionDocumento;
        this.nombre = nombre;
        this.codigoInstitucional = codigoInstitucional;
        this.descripcion = descripcion;
        this.indicadorAdjunto = indicadorAdjunto;
        this.indicadorDescarga = indicadorDescarga;
        this.idAdjunto = idAdjunto;
        this.indicadorContratacion = indicadorContratacion;
        this.vigencia = vigencia;
        this.indicadorAplica = indicadorAplica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public DocumentosTerceros(Integer idDocumentoTercero, Integer idClasificacionDocumento, String nombre, String codigoInstitucional, String descripcion, Boolean indicadorAdjunto, Boolean indicadorDescarga, Integer idAdjunto, Boolean indicadorContratacion, Integer vigencia, Boolean indicadorAplica, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idDocumentoTercero = idDocumentoTercero;
        this.idClasificacionDocumento = idClasificacionDocumento;
        this.nombre = nombre;
        this.codigoInstitucional = codigoInstitucional;
        this.descripcion = descripcion;
        this.indicadorAdjunto = indicadorAdjunto;
        this.indicadorDescarga = indicadorDescarga;
        this.idAdjunto = idAdjunto;
        this.indicadorContratacion = indicadorContratacion;
        this.vigencia = vigencia;
        this.indicadorAplica = indicadorAplica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdDocumentoTercero", nullable = false)
    public Integer getIdDocumentoTercero() {
        return idDocumentoTercero;
    }

    public void setIdDocumentoTercero(Integer idDocumentoTercero) {
        this.idDocumentoTercero = idDocumentoTercero;
    }

    @Basic
    @Column(name = "IdClasificacionDocumento", nullable = true)
    public Integer getIdClasificacionDocumento() {
        return idClasificacionDocumento;
    }

    public void setIdClasificacionDocumento(Integer idClasificacionDocumento) {
        this.idClasificacionDocumento = idClasificacionDocumento;
    }

    @Basic
    @Column(name = "Nombre", nullable = true, length = 200)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "CodigoInstitucional", nullable = true, length = 100)
    public String getCodigoInstitucional() {
        return codigoInstitucional;
    }

    public void setCodigoInstitucional(String codigoInstitucional) {
        this.codigoInstitucional = codigoInstitucional;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IndicadorAdjunto", nullable = true)
    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
    }

    @Basic
    @Column(name = "IndicadorDescarga", nullable = true)
    public Boolean getIndicadorDescarga() {
        return indicadorDescarga;
    }

    public void setIndicadorDescarga(Boolean indicadorDescarga) {
        this.indicadorDescarga = indicadorDescarga;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorContratacion", nullable = true)
    public Boolean getIndicadorContratacion() {
        return indicadorContratacion;
    }

    public void setIndicadorContratacion(Boolean indicadorContratacion) {
        this.indicadorContratacion = indicadorContratacion;
    }

    @Basic
    @Column(name = "Vigencia", nullable = true)
    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    @Basic
    @Column(name = "IndicadorAplica", nullable = true)
    public Boolean getIndicadorAplica() {
        return indicadorAplica;
    }

    public void setIndicadorAplica(Boolean indicadorAplica) {
        this.indicadorAplica = indicadorAplica;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentosTerceros that = (DocumentosTerceros) o;

        if (idDocumentoTercero != null ? !idDocumentoTercero.equals(that.idDocumentoTercero) : that.idDocumentoTercero != null)
            return false;
        if (idClasificacionDocumento != null ? !idClasificacionDocumento.equals(that.idClasificacionDocumento) : that.idClasificacionDocumento != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (codigoInstitucional != null ? !codigoInstitucional.equals(that.codigoInstitucional) : that.codigoInstitucional != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorAdjunto != null ? !indicadorAdjunto.equals(that.indicadorAdjunto) : that.indicadorAdjunto != null)
            return false;
        if (indicadorDescarga != null ? !indicadorDescarga.equals(that.indicadorDescarga) : that.indicadorDescarga != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorContratacion != null ? !indicadorContratacion.equals(that.indicadorContratacion) : that.indicadorContratacion != null)
            return false;
        if (vigencia != null ? !vigencia.equals(that.vigencia) : that.vigencia != null) return false;
        if (indicadorAplica != null ? !indicadorAplica.equals(that.indicadorAplica) : that.indicadorAplica != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDocumentoTercero != null ? idDocumentoTercero.hashCode() : 0;
        result = 31 * result + (idClasificacionDocumento != null ? idClasificacionDocumento.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (codigoInstitucional != null ? codigoInstitucional.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorAdjunto != null ? indicadorAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorDescarga != null ? indicadorDescarga.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorContratacion != null ? indicadorContratacion.hashCode() : 0);
        result = 31 * result + (vigencia != null ? vigencia.hashCode() : 0);
        result = 31 * result + (indicadorAplica != null ? indicadorAplica.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
