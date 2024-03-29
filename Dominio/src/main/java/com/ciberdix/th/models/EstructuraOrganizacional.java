package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 17/04/2017.
 */
@Entity
@Table(name = "EstructuraOrganizacional", schema = "dbo", catalog = "CREZCAMOS")
public class EstructuraOrganizacional {
    private Integer idEstructuraOrganizacional;
    private String codigo;
    private String nombre;
    private Integer idPadre;
    private Integer idTipoEstructura;
    private Integer idCentroCostos;
    private Integer idTipoArea;
    private Integer idTipoDocumento;
    private String numeroDocumento;
    private Integer idLocalizacion;
    private String razonSocial;
    private String telefono;
    private String celular;
    private String correoElectronico;
    private String paginaWeb;
    private Integer idLogo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idEstructuraFisica;
    private Boolean indicadorPlantaConfirmada;
    private Boolean indicadorZona;

    public EstructuraOrganizacional() {
    }

    public EstructuraOrganizacional(String codigo, String nombre, Integer idPadre, Integer idTipoEstructura, Integer idCentroCostos, Integer idTipoArea, Integer idTipoDocumento, String numeroDocumento, Integer idLocalizacion, String razonSocial, String telefono, String celular, String correoElectronico, String paginaWeb, Integer idLogo, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idEstructuraFisica, Boolean indicadorPlantaConfirmada,Boolean indicadorZona) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.idPadre = idPadre;
        this.idTipoEstructura = idTipoEstructura;
        this.idCentroCostos = idCentroCostos;
        this.idTipoArea = idTipoArea;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.idLocalizacion = idLocalizacion;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.paginaWeb = paginaWeb;
        this.idLogo = idLogo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.idEstructuraFisica = idEstructuraFisica;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorPlantaConfirmada = indicadorPlantaConfirmada;
        this.indicadorZona = indicadorZona;
    }

    public EstructuraOrganizacional(Integer idEstructuraOrganizacional, String codigo, String nombre, Integer idPadre, Integer idTipoEstructura, Integer idCentroCostos, Integer idTipoArea, Integer idTipoDocumento, String numeroDocumento, Integer idLocalizacion, String razonSocial, String telefono, String celular, String correoElectronico, String paginaWeb, Integer idLogo, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idEstructuraFisica, Boolean indicadorPlantaConfirmada, Boolean indicadorZona) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.codigo = codigo;
        this.nombre = nombre;
        this.idPadre = idPadre;
        this.idTipoEstructura = idTipoEstructura;
        this.idCentroCostos = idCentroCostos;
        this.idTipoArea = idTipoArea;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.idLocalizacion = idLocalizacion;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.paginaWeb = paginaWeb;
        this.idLogo = idLogo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idEstructuraFisica = idEstructuraFisica;
        this.indicadorPlantaConfirmada = indicadorPlantaConfirmada;
        this.indicadorZona = indicadorZona;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdEstructuraOrganizacional", nullable = false)
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 50)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Nombre", nullable = true, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "IdPadre", nullable = true)
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    @Basic
    @Column(name = "IdTipoEstructura", nullable = true)
    public Integer getIdTipoEstructura() {
        return idTipoEstructura;
    }

    public void setIdTipoEstructura(Integer idTipoEstructura) {
        this.idTipoEstructura = idTipoEstructura;
    }

    @Basic
    @Column(name = "IdCentroCostos", nullable = true)
    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    @Basic
    @Column(name = "IdTipoArea", nullable = true)
    public Integer getIdTipoArea() {
        return idTipoArea;
    }

    public void setIdTipoArea(Integer idTipoArea) {
        this.idTipoArea = idTipoArea;
    }

    @Basic
    @Column(name = "IdTipoDocumento", nullable = true)
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Basic
    @Column(name = "NumeroDocumento", nullable = true, length = 50)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "IdLocalizacion", nullable = true)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "RazonSocial", nullable = true, length = 50)
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "Telefono", nullable = true, length = 50)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Celular", nullable = true, length = 50)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 50)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "PaginaWeb", nullable = true, length = 50)
    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Basic
    @Column(name = "IdLogo", nullable = true)
    public Integer getIdLogo() {
        return idLogo;
    }

    public void setIdLogo(Integer idLogo) {
        this.idLogo = idLogo;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
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

    @Basic
    @Column(name = "IdEstructuraFisica", nullable = true)
    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    @Basic
    @Column(name = "IndicadorPlantaConfirmada", nullable = true)
    public Boolean getIndicadorPlantaConfirmada() {
        return indicadorPlantaConfirmada;
    }

    public void setIndicadorPlantaConfirmada(Boolean indicadorPlantaConfirmada) {
        this.indicadorPlantaConfirmada = indicadorPlantaConfirmada;
    }

    @Basic
    @Column(name = "IndicadorZona", nullable = true)
    public Boolean getIndicadorZona() {
        return indicadorZona;
    }

    public void setIndicadorZona(Boolean indicadorZona) {
        this.indicadorZona = indicadorZona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstructuraOrganizacional that = (EstructuraOrganizacional) o;

        if (!idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional)) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (idPadre != null ? !idPadre.equals(that.idPadre) : that.idPadre != null) return false;
        if (idTipoEstructura != null ? !idTipoEstructura.equals(that.idTipoEstructura) : that.idTipoEstructura != null)
            return false;
        if (idCentroCostos != null ? !idCentroCostos.equals(that.idCentroCostos) : that.idCentroCostos != null)
            return false;
        if (idTipoArea != null ? !idTipoArea.equals(that.idTipoArea) : that.idTipoArea != null) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (paginaWeb != null ? !paginaWeb.equals(that.paginaWeb) : that.paginaWeb != null) return false;
        if (idLogo != null ? !idLogo.equals(that.idLogo) : that.idLogo != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (!auditoriaUsuario.equals(that.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(that.auditoriaFecha)) return false;
        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
            return false;
        if (indicadorPlantaConfirmada != null ? !indicadorPlantaConfirmada.equals(that.indicadorPlantaConfirmada) : that.indicadorPlantaConfirmada != null)
            return false;
        return indicadorZona != null ? indicadorZona.equals(that.indicadorZona) : that.indicadorZona == null;
    }

    @Override
    public int hashCode() {
        int result = idEstructuraOrganizacional.hashCode();
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (idPadre != null ? idPadre.hashCode() : 0);
        result = 31 * result + (idTipoEstructura != null ? idTipoEstructura.hashCode() : 0);
        result = 31 * result + (idCentroCostos != null ? idCentroCostos.hashCode() : 0);
        result = 31 * result + (idTipoArea != null ? idTipoArea.hashCode() : 0);
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (paginaWeb != null ? paginaWeb.hashCode() : 0);
        result = 31 * result + (idLogo != null ? idLogo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0);
        result = 31 * result + (indicadorPlantaConfirmada != null ? indicadorPlantaConfirmada.hashCode() : 0);
        result = 31 * result + (indicadorZona != null ? indicadorZona.hashCode() : 0);
        return result;
    }
}
