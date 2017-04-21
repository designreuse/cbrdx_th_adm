package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "V_TercerosFamiliares", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VTercerosFamiliaresEntity {
    private Integer idTerceroFamiliar;
    private Long idTercero;
    private Long idFamiliar;
    private Integer idTipoDocumento;
    private String nombreListaTipoDocumento;
    private String numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String correoElectronico;
    private String telefonoFijo;
    private String telefonoCelular;
    private String direccion;
    private Integer idConvivencia;
    private Integer idParentezco;
    private String nombreListaParentezco;
    private Boolean indicadorHabilitado;

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @Column(name = "IdTerceroFamiliar")
    public Integer getIdTerceroFamiliar() {
        return idTerceroFamiliar;
    }

    public void setIdTerceroFamiliar(int idTerceroFamiliar) {
        this.idTerceroFamiliar = idTerceroFamiliar;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdFamiliar")
    public Long getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(long idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    @Basic
    @Column(name = "IdTipoDocumento")
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
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
    @Column(name = "NumeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "FechaNacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "CorreoElectronico")
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "TelefonoFijo")
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "TelefonoCelular")
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    @Basic
    @Column(name = "Direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "IdConvivencia")
    public int getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(int idConvivencia) {
        this.idConvivencia = idConvivencia;
    }

    @Basic
    @Column(name = "IdParentesco")
    public int getIdParentezco() {
        return idParentezco;
    }

    public void setIdParentezco(int idParentezco) {
        this.idParentezco = idParentezco;
    }

    @Basic
    @Column(name = "NombreListaParentesco")
    public String getNombreListaParentezco() {
        return nombreListaParentezco;
    }

    public void setNombreListaParentezco(String nombreListaParentezco) {
        this.nombreListaParentezco = nombreListaParentezco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosFamiliaresEntity that = (VTercerosFamiliaresEntity) o;

        if (idTerceroFamiliar != that.idTerceroFamiliar) return false;
        if (idTercero != that.idTercero) return false;
        if (idFamiliar != that.idFamiliar) return false;
        if (idConvivencia != that.idConvivencia) return false;
        if (idParentezco != that.idParentezco) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (nombreListaTipoDocumento != null ? !nombreListaTipoDocumento.equals(that.nombreListaTipoDocumento) : that.nombreListaTipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null)
            return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(that.fechaNacimiento) : that.fechaNacimiento != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(that.telefonoCelular) : that.telefonoCelular != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (nombreListaParentezco != null ? !nombreListaParentezco.equals(that.nombreListaParentezco) : that.nombreListaParentezco != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroFamiliar;
        result = 31 * result + (int) (idTercero ^ (idTercero >>> 32));
        result = 31 * result + (int) (idFamiliar ^ (idFamiliar >>> 32));
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (nombreListaTipoDocumento != null ? nombreListaTipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + idConvivencia;
        result = 31 * result + idParentezco;
        result = 31 * result + (nombreListaParentezco != null ? nombreListaParentezco.hashCode() : 0);
        return result;
    }
}