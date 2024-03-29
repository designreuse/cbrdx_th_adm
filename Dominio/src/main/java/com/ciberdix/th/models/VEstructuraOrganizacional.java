package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_EstructuraOrganizacional", schema = "dbo", catalog = "CREZCAMOS")
public class VEstructuraOrganizacional {
    private Integer idEstructuraOrganizacional;
    private String codigo;
    private String nombre;
    private Integer idPadre;
    private Integer idTipoEstructura;
    private String tipoEstructura;
    private Integer idCentroCostos;
    private String centroCostos;
    private Integer idTipoArea;
    private String tipoArea;
    private Integer idEstructuraFisica;
    private String estructuraFisica;
    private Integer idTipoDocumento;
    private String tipoDocumento;
    private String numeroDocumento;
    private Integer idLocalizacion;
    private String localizacion;
    private String razonSocial;
    private String telefono;
    private String celular;
    private String correoElectronico;
    private String paginaWeb;
    private Integer idLogo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorPlantaConfirmada;
    private Boolean indicadorZona;

    @Basic
    @Id
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
    @Column(name = "TipoEstructura", nullable = true, length = 100)
    public String getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
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
    @Column(name = "CentroCostos", nullable = true, length = 30)
    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
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
    @Column(name = "TipoArea", nullable = true, length = 40)
    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
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
    @Column(name = "EstructuraFisica", nullable = true, length = 50)
    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
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
    @Column(name = "TipoDocumento", nullable = true, length = 100)
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
    @Column(name = "Localizacion", nullable = true, length = 512)
    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
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

        VEstructuraOrganizacional that = (VEstructuraOrganizacional) o;

        if (!idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional)) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (idPadre != null ? !idPadre.equals(that.idPadre) : that.idPadre != null) return false;
        if (idTipoEstructura != null ? !idTipoEstructura.equals(that.idTipoEstructura) : that.idTipoEstructura != null)
            return false;
        if (tipoEstructura != null ? !tipoEstructura.equals(that.tipoEstructura) : that.tipoEstructura != null)
            return false;
        if (idCentroCostos != null ? !idCentroCostos.equals(that.idCentroCostos) : that.idCentroCostos != null)
            return false;
        if (centroCostos != null ? !centroCostos.equals(that.centroCostos) : that.centroCostos != null) return false;
        if (idTipoArea != null ? !idTipoArea.equals(that.idTipoArea) : that.idTipoArea != null) return false;
        if (tipoArea != null ? !tipoArea.equals(that.tipoArea) : that.tipoArea != null) return false;
        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
            return false;
        if (estructuraFisica != null ? !estructuraFisica.equals(that.estructuraFisica) : that.estructuraFisica != null)
            return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (localizacion != null ? !localizacion.equals(that.localizacion) : that.localizacion != null) return false;
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
        result = 31 * result + (tipoEstructura != null ? tipoEstructura.hashCode() : 0);
        result = 31 * result + (idCentroCostos != null ? idCentroCostos.hashCode() : 0);
        result = 31 * result + (centroCostos != null ? centroCostos.hashCode() : 0);
        result = 31 * result + (idTipoArea != null ? idTipoArea.hashCode() : 0);
        result = 31 * result + (tipoArea != null ? tipoArea.hashCode() : 0);
        result = 31 * result + (idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0);
        result = 31 * result + (estructuraFisica != null ? estructuraFisica.hashCode() : 0);
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (localizacion != null ? localizacion.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (paginaWeb != null ? paginaWeb.hashCode() : 0);
        result = 31 * result + (idLogo != null ? idLogo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (indicadorPlantaConfirmada != null ? indicadorPlantaConfirmada.hashCode() : 0);
        result = 31 * result + (indicadorZona != null ? indicadorZona.hashCode() : 0);
        return result;
    }
}
