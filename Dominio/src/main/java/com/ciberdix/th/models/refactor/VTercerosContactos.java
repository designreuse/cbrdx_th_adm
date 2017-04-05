package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 5/04/17.
 */
@Entity
@Table(name = "V_TercerosContactos", schema = "crz_th", catalog = "CREZCAMOS")
public class VTercerosContactos {
    private Integer idListaParentezco;
    private String codigoListaParentesco;
    private String nombreListaParentesco;
    private Integer idTerceroContacto;
    private Long idTercero;
    private String contacto;
    private String telefono;
    private String celular;
    private Integer idListaParentesco;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaParentezco")
    public Integer getIdListaParentezco() {
        return idListaParentezco;
    }

    public void setIdListaParentezco(Integer idListaParentezco) {
        this.idListaParentezco = idListaParentezco;
    }

    @Basic
    @Column(name = "CodigoListaParentesco")
    public String getCodigoListaParentesco() {
        return codigoListaParentesco;
    }

    public void setCodigoListaParentesco(String codigoListaParentesco) {
        this.codigoListaParentesco = codigoListaParentesco;
    }

    @Basic
    @Column(name = "NombreListaParentesco")
    public String getNombreListaParentesco() {
        return nombreListaParentesco;
    }

    public void setNombreListaParentesco(String nombreListaParentesco) {
        this.nombreListaParentesco = nombreListaParentesco;
    }

    @Basic
    @Column(name = "IdTerceroContacto")
    public Integer getIdTerceroContacto() {
        return idTerceroContacto;
    }

    public void setIdTerceroContacto(Integer idTerceroContacto) {
        this.idTerceroContacto = idTerceroContacto;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "Contacto")
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Basic
    @Column(name = "Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "IdListaParentesco")
    public Integer getIdListaParentesco() {
        return idListaParentesco;
    }

    public void setIdListaParentesco(Integer idListaParentesco) {
        this.idListaParentesco = idListaParentesco;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
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

        VTercerosContactos that = (VTercerosContactos) o;

        if (idListaParentezco != null ? !idListaParentezco.equals(that.idListaParentezco) : that.idListaParentezco != null)
            return false;
        if (codigoListaParentesco != null ? !codigoListaParentesco.equals(that.codigoListaParentesco) : that.codigoListaParentesco != null)
            return false;
        if (nombreListaParentesco != null ? !nombreListaParentesco.equals(that.nombreListaParentesco) : that.nombreListaParentesco != null)
            return false;
        if (idTerceroContacto != null ? !idTerceroContacto.equals(that.idTerceroContacto) : that.idTerceroContacto != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (contacto != null ? !contacto.equals(that.contacto) : that.contacto != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (idListaParentesco != null ? !idListaParentesco.equals(that.idListaParentesco) : that.idListaParentesco != null)
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
        int result = idListaParentezco != null ? idListaParentezco.hashCode() : 0;
        result = 31 * result + (codigoListaParentesco != null ? codigoListaParentesco.hashCode() : 0);
        result = 31 * result + (nombreListaParentesco != null ? nombreListaParentesco.hashCode() : 0);
        result = 31 * result + (idTerceroContacto != null ? idTerceroContacto.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (idListaParentesco != null ? idListaParentesco.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
