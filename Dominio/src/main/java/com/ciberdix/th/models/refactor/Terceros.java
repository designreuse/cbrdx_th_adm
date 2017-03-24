package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Terceros {
    private Long idTercero;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String imagen;
    private Integer idTipoDocumento;
    private String numeroDocumento;
    private Date fechaDocumento;
    private Integer idCiudadExpDocumento;
    private Date fechaNacimiento;
    private Integer idCiudadNacimiento;
    private Integer idGenero;
    private Integer idEstadoCivil;
    private Integer idFactorRh;
    private String factorRh;
    private Integer nroHijos;
    private Integer idLateralidad;
    private Integer idTipoVivienda;
    private Integer estrato;
    private Integer tallaCamisa;
    private Integer tallaPantalon;
    private Integer tallaCalzado;
    private String correoElectronico;
    private Date fechaCreacion;
    private Integer idTipoPersona;
    private String razonSocial;
    private Double talla;
    private Double peso;
    private Double imc;
    private Integer idProfesion;
    private Integer idNivelEducacion;
    private Integer idVehiculo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String telefonoFijo;
    private String telefonoCelular;

    @Id
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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
    @Column(name = "Imagen")
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    @Column(name = "NumeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "FechaDocumento")
    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    @Basic
    @Column(name = "IdCiudadExpDocumento")
    public Integer getIdCiudadExpDocumento() {
        return idCiudadExpDocumento;
    }

    public void setIdCiudadExpDocumento(Integer idCiudadExpDocumento) {
        this.idCiudadExpDocumento = idCiudadExpDocumento;
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
    @Column(name = "IdCiudadNacimiento")
    public Integer getIdCiudadNacimiento() {
        return idCiudadNacimiento;
    }

    public void setIdCiudadNacimiento(Integer idCiudadNacimiento) {
        this.idCiudadNacimiento = idCiudadNacimiento;
    }

    @Basic
    @Column(name = "IdGenero")
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    @Basic
    @Column(name = "IdEstadoCivil")
    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    @Basic
    @Column(name = "IdFactorRh")
    public Integer getIdFactorRh() {
        return idFactorRh;
    }

    public void setIdFactorRh(Integer idFactorRh) {
        this.idFactorRh = idFactorRh;
    }

    @Basic
    @Column(name = "FactorRh")
    public String getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }

    @Basic
    @Column(name = "NroHijos")
    public Integer getNroHijos() {
        return nroHijos;
    }

    public void setNroHijos(Integer nroHijos) {
        this.nroHijos = nroHijos;
    }

    @Basic
    @Column(name = "IdLateralidad")
    public Integer getIdLateralidad() {
        return idLateralidad;
    }

    public void setIdLateralidad(Integer idLateralidad) {
        this.idLateralidad = idLateralidad;
    }

    @Basic
    @Column(name = "IdTipoVivienda")
    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    @Basic
    @Column(name = "Estrato")
    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    @Basic
    @Column(name = "TallaCamisa")
    public Integer getTallaCamisa() {
        return tallaCamisa;
    }

    public void setTallaCamisa(Integer tallaCamisa) {
        this.tallaCamisa = tallaCamisa;
    }

    @Basic
    @Column(name = "TallaPantalon")
    public Integer getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(Integer tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
    }

    @Basic
    @Column(name = "TallaCalzado")
    public Integer getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(Integer tallaCalzado) {
        this.tallaCalzado = tallaCalzado;
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
    @Column(name = "FechaCreacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "IdTipoPersona")
    public Integer getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    @Basic
    @Column(name = "RazonSocial")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "Talla")
    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    @Basic
    @Column(name = "Peso")
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Basic
    @Column(name = "IMC")
    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    @Basic
    @Column(name = "IdProfesion")
    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    @Basic
    @Column(name = "IdNivelEducacion")
    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    @Basic
    @Column(name = "IdVehiculo")
    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Terceros terceros = (Terceros) o;

        if (idTercero != null ? !idTercero.equals(terceros.idTercero) : terceros.idTercero != null) return false;
        if (primerNombre != null ? !primerNombre.equals(terceros.primerNombre) : terceros.primerNombre != null)
            return false;
        if (segundoNombre != null ? !segundoNombre.equals(terceros.segundoNombre) : terceros.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(terceros.primerApellido) : terceros.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(terceros.segundoApellido) : terceros.segundoApellido != null)
            return false;
        if (imagen != null ? !imagen.equals(terceros.imagen) : terceros.imagen != null) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(terceros.idTipoDocumento) : terceros.idTipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(terceros.numeroDocumento) : terceros.numeroDocumento != null)
            return false;
        if (fechaDocumento != null ? !fechaDocumento.equals(terceros.fechaDocumento) : terceros.fechaDocumento != null)
            return false;
        if (idCiudadExpDocumento != null ? !idCiudadExpDocumento.equals(terceros.idCiudadExpDocumento) : terceros.idCiudadExpDocumento != null)
            return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(terceros.fechaNacimiento) : terceros.fechaNacimiento != null)
            return false;
        if (idCiudadNacimiento != null ? !idCiudadNacimiento.equals(terceros.idCiudadNacimiento) : terceros.idCiudadNacimiento != null)
            return false;
        if (idGenero != null ? !idGenero.equals(terceros.idGenero) : terceros.idGenero != null) return false;
        if (idEstadoCivil != null ? !idEstadoCivil.equals(terceros.idEstadoCivil) : terceros.idEstadoCivil != null)
            return false;
        if (idFactorRh != null ? !idFactorRh.equals(terceros.idFactorRh) : terceros.idFactorRh != null) return false;
        if (factorRh != null ? !factorRh.equals(terceros.factorRh) : terceros.factorRh != null) return false;
        if (nroHijos != null ? !nroHijos.equals(terceros.nroHijos) : terceros.nroHijos != null) return false;
        if (idLateralidad != null ? !idLateralidad.equals(terceros.idLateralidad) : terceros.idLateralidad != null)
            return false;
        if (idTipoVivienda != null ? !idTipoVivienda.equals(terceros.idTipoVivienda) : terceros.idTipoVivienda != null)
            return false;
        if (estrato != null ? !estrato.equals(terceros.estrato) : terceros.estrato != null) return false;
        if (tallaCamisa != null ? !tallaCamisa.equals(terceros.tallaCamisa) : terceros.tallaCamisa != null)
            return false;
        if (tallaPantalon != null ? !tallaPantalon.equals(terceros.tallaPantalon) : terceros.tallaPantalon != null)
            return false;
        if (tallaCalzado != null ? !tallaCalzado.equals(terceros.tallaCalzado) : terceros.tallaCalzado != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(terceros.correoElectronico) : terceros.correoElectronico != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(terceros.fechaCreacion) : terceros.fechaCreacion != null)
            return false;
        if (idTipoPersona != null ? !idTipoPersona.equals(terceros.idTipoPersona) : terceros.idTipoPersona != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(terceros.razonSocial) : terceros.razonSocial != null)
            return false;
        if (talla != null ? !talla.equals(terceros.talla) : terceros.talla != null) return false;
        if (peso != null ? !peso.equals(terceros.peso) : terceros.peso != null) return false;
        if (imc != null ? !imc.equals(terceros.imc) : terceros.imc != null) return false;
        if (idProfesion != null ? !idProfesion.equals(terceros.idProfesion) : terceros.idProfesion != null)
            return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(terceros.idNivelEducacion) : terceros.idNivelEducacion != null)
            return false;
        if (idVehiculo != null ? !idVehiculo.equals(terceros.idVehiculo) : terceros.idVehiculo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(terceros.auditoriaUsuario) : terceros.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(terceros.auditoriaFecha) : terceros.auditoriaFecha != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(terceros.telefonoFijo) : terceros.telefonoFijo != null)
            return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(terceros.telefonoCelular) : terceros.telefonoCelular != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTercero != null ? idTercero.hashCode() : 0;
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (imagen != null ? imagen.hashCode() : 0);
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (fechaDocumento != null ? fechaDocumento.hashCode() : 0);
        result = 31 * result + (idCiudadExpDocumento != null ? idCiudadExpDocumento.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (idCiudadNacimiento != null ? idCiudadNacimiento.hashCode() : 0);
        result = 31 * result + (idGenero != null ? idGenero.hashCode() : 0);
        result = 31 * result + (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
        result = 31 * result + (idFactorRh != null ? idFactorRh.hashCode() : 0);
        result = 31 * result + (factorRh != null ? factorRh.hashCode() : 0);
        result = 31 * result + (nroHijos != null ? nroHijos.hashCode() : 0);
        result = 31 * result + (idLateralidad != null ? idLateralidad.hashCode() : 0);
        result = 31 * result + (idTipoVivienda != null ? idTipoVivienda.hashCode() : 0);
        result = 31 * result + (estrato != null ? estrato.hashCode() : 0);
        result = 31 * result + (tallaCamisa != null ? tallaCamisa.hashCode() : 0);
        result = 31 * result + (tallaPantalon != null ? tallaPantalon.hashCode() : 0);
        result = 31 * result + (tallaCalzado != null ? tallaCalzado.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (idTipoPersona != null ? idTipoPersona.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (talla != null ? talla.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (imc != null ? imc.hashCode() : 0);
        result = 31 * result + (idProfesion != null ? idProfesion.hashCode() : 0);
        result = 31 * result + (idNivelEducacion != null ? idNivelEducacion.hashCode() : 0);
        result = 31 * result + (idVehiculo != null ? idVehiculo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        return result;
    }
}
