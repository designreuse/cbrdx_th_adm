package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_TercerosFamiliares", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosFamiliares {
    private Integer idTerceroFamiliar;
    private Long idTercero;
    private Long idFamiliar;
    private Integer idTipoDocumento;
    private String tipoDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String correoElectronico;
    private String numeroDocumento;
    private Integer idConvivencia;
    private Integer idParentesco;
    private String parentesco;
    private String telefonoFijo;
    private String telefonoCelular;
    private Boolean indicadorHabilitado;
    private Integer idLocalizacion;
    private String direccion;
    private Integer idTipoDireccion;
    private Integer idDivisionPolitica;
    private Timestamp auditoriaFecha;

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Id
    @Column(name = "IdTerceroFamiliar", nullable = false)
    public Integer getIdTerceroFamiliar() {
        return idTerceroFamiliar;
    }

    public void setIdTerceroFamiliar(Integer idTerceroFamiliar) {
        this.idTerceroFamiliar = idTerceroFamiliar;
    }

    @Basic
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdFamiliar", nullable = false)
    public Long getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(Long idFamiliar) {
        this.idFamiliar = idFamiliar;
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
    @Column(name = "PrimerNombre", nullable = true, length = 64)
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "SegundoNombre", nullable = true, length = 64)
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "PrimerApellido", nullable = true, length = 64)
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoApellido", nullable = true, length = 64)
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "FechaNacimiento", nullable = false)
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 128)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "NumeroDocumento", nullable = true, length = 13)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "IdConvivencia", nullable = false)
    public Integer getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(Integer idConvivencia) {
        this.idConvivencia = idConvivencia;
    }

    @Basic
    @Column(name = "IdParentesco", nullable = false)
    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    @Basic
    @Column(name = "Parentesco", nullable = true, length = 100)
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Basic
    @Column(name = "TelefonoFijo", nullable = true, length = 25)
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "TelefonoCelular", nullable = true, length = 15)
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
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
    @Column(name = "IdLocalizacion", nullable = true)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "Direccion", nullable = true, length = 512)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "IdTipoDireccion", nullable = true)
    public Integer getIdTipoDireccion() {
        return idTipoDireccion;
    }

    public void setIdTipoDireccion(Integer idTipoDireccion) {
        this.idTipoDireccion = idTipoDireccion;
    }

    @Basic
    @Column(name = "IdDivisionPolitica", nullable = true)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
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

        VTercerosFamiliares that = (VTercerosFamiliares) o;

        if (idTerceroFamiliar != null ? !idTerceroFamiliar.equals(that.idTerceroFamiliar) : that.idTerceroFamiliar != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idFamiliar != null ? !idFamiliar.equals(that.idFamiliar) : that.idFamiliar != null) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
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
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (idConvivencia != null ? !idConvivencia.equals(that.idConvivencia) : that.idConvivencia != null)
            return false;
        if (idParentesco != null ? !idParentesco.equals(that.idParentesco) : that.idParentesco != null) return false;
        if (parentesco != null ? !parentesco.equals(that.parentesco) : that.parentesco != null) return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(that.telefonoCelular) : that.telefonoCelular != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (idTipoDireccion != null ? !idTipoDireccion.equals(that.idTipoDireccion) : that.idTipoDireccion != null)
            return false;
        if (idDivisionPolitica != null ? !idDivisionPolitica.equals(that.idDivisionPolitica) : that.idDivisionPolitica != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroFamiliar != null ? idTerceroFamiliar.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idFamiliar != null ? idFamiliar.hashCode() : 0);
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (idConvivencia != null ? idConvivencia.hashCode() : 0);
        result = 31 * result + (idParentesco != null ? idParentesco.hashCode() : 0);
        result = 31 * result + (parentesco != null ? parentesco.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (idTipoDireccion != null ? idTipoDireccion.hashCode() : 0);
        result = 31 * result + (idDivisionPolitica != null ? idDivisionPolitica.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
