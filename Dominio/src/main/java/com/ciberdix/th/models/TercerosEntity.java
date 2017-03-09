package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Terceros", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosEntity {
    private Integer idTercero;
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

    @Id
    @Column(name = "IdTercero", nullable = false)
    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
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
    @Column(name = "Imagen", nullable = true, length = 64)
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    @Column(name = "NumeroDocumento", nullable = true, length = 13)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "FechaDocumento", nullable = false)
    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    @Basic
    @Column(name = "IdCiudadExpDocumento", nullable = false)
    public Integer getIdCiudadExpDocumento() {
        return idCiudadExpDocumento;
    }

    public void setIdCiudadExpDocumento(Integer idCiudadExpDocumento) {
        this.idCiudadExpDocumento = idCiudadExpDocumento;
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
    @Column(name = "IdCiudadNacimiento", nullable = false)
    public Integer getIdCiudadNacimiento() {
        return idCiudadNacimiento;
    }

    public void setIdCiudadNacimiento(Integer idCiudadNacimiento) {
        this.idCiudadNacimiento = idCiudadNacimiento;
    }

    @Basic
    @Column(name = "IdGenero", nullable = true)
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    @Basic
    @Column(name = "IdEstadoCivil", nullable = true)
    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    @Basic
    @Column(name = "IdFactorRh", nullable = true)
    public Integer getIdFactorRh() {
        return idFactorRh;
    }

    public void setIdFactorRh(Integer idFactorRh) {
        this.idFactorRh = idFactorRh;
    }

    @Basic
    @Column(name = "FactorRh", nullable = true, length = 1)
    public String getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }

    @Basic
    @Column(name = "NroHijos", nullable = true)
    public Integer getNroHijos() {
        return nroHijos;
    }

    public void setNroHijos(Integer nroHijos) {
        this.nroHijos = nroHijos;
    }

    @Basic
    @Column(name = "IdLateralidad", nullable = true)
    public Integer getIdLateralidad() {
        return idLateralidad;
    }

    public void setIdLateralidad(Integer idLateralidad) {
        this.idLateralidad = idLateralidad;
    }

    @Basic
    @Column(name = "IdTipoVivienda", nullable = true)
    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    @Basic
    @Column(name = "Estrato", nullable = true)
    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    @Basic
    @Column(name = "TallaCamisa", nullable = true)
    public Integer getTallaCamisa() {
        return tallaCamisa;
    }

    public void setTallaCamisa(Integer tallaCamisa) {
        this.tallaCamisa = tallaCamisa;
    }

    @Basic
    @Column(name = "TallaPantalon", nullable = true)
    public Integer getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(Integer tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
    }

    @Basic
    @Column(name = "TallaCalzado", nullable = true)
    public Integer getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(Integer tallaCalzado) {
        this.tallaCalzado = tallaCalzado;
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
    @Column(name = "FechaCreacion", nullable = true)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "IdTipoPersona", nullable = true)
    public Integer getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    @Basic
    @Column(name = "RazonSocial", nullable = true, length = 128)
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "Talla", nullable = true, precision = 0)
    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    @Basic
    @Column(name = "Peso", nullable = true, precision = 0)
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Basic
    @Column(name = "IMC", nullable = true, precision = 0)
    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    @Basic
    @Column(name = "IdProfesion", nullable = true)
    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    @Basic
    @Column(name = "IdNivelEducacion", nullable = true)
    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    @Basic
    @Column(name = "IdVehiculo", nullable = true)
    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
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

        TercerosEntity that = (TercerosEntity) o;

        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null)
            return false;
        if (imagen != null ? !imagen.equals(that.imagen) : that.imagen != null) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (fechaDocumento != null ? !fechaDocumento.equals(that.fechaDocumento) : that.fechaDocumento != null)
            return false;
        if (idCiudadExpDocumento != null ? !idCiudadExpDocumento.equals(that.idCiudadExpDocumento) : that.idCiudadExpDocumento != null)
            return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(that.fechaNacimiento) : that.fechaNacimiento != null)
            return false;
        if (idCiudadNacimiento != null ? !idCiudadNacimiento.equals(that.idCiudadNacimiento) : that.idCiudadNacimiento != null)
            return false;
        if (idGenero != null ? !idGenero.equals(that.idGenero) : that.idGenero != null) return false;
        if (idEstadoCivil != null ? !idEstadoCivil.equals(that.idEstadoCivil) : that.idEstadoCivil != null)
            return false;
        if (idFactorRh != null ? !idFactorRh.equals(that.idFactorRh) : that.idFactorRh != null) return false;
        if (factorRh != null ? !factorRh.equals(that.factorRh) : that.factorRh != null) return false;
        if (nroHijos != null ? !nroHijos.equals(that.nroHijos) : that.nroHijos != null) return false;
        if (idLateralidad != null ? !idLateralidad.equals(that.idLateralidad) : that.idLateralidad != null)
            return false;
        if (idTipoVivienda != null ? !idTipoVivienda.equals(that.idTipoVivienda) : that.idTipoVivienda != null)
            return false;
        if (estrato != null ? !estrato.equals(that.estrato) : that.estrato != null) return false;
        if (tallaCamisa != null ? !tallaCamisa.equals(that.tallaCamisa) : that.tallaCamisa != null) return false;
        if (tallaPantalon != null ? !tallaPantalon.equals(that.tallaPantalon) : that.tallaPantalon != null)
            return false;
        if (tallaCalzado != null ? !tallaCalzado.equals(that.tallaCalzado) : that.tallaCalzado != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        /*if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;*/
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (idTipoPersona != null ? !idTipoPersona.equals(that.idTipoPersona) : that.idTipoPersona != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) return false;
        if (talla != null ? !talla.equals(that.talla) : that.talla != null) return false;
        if (peso != null ? !peso.equals(that.peso) : that.peso != null) return false;
        if (imc != null ? !imc.equals(that.imc) : that.imc != null) return false;
        if (idProfesion != null ? !idProfesion.equals(that.idProfesion) : that.idProfesion != null) return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(that.idNivelEducacion) : that.idNivelEducacion != null)
            return false;
        if (idVehiculo != null ? !idVehiculo.equals(that.idVehiculo) : that.idVehiculo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
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
       // result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
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
        return result;
    }
}