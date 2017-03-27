package com.ciberdix.th.model.refactor;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
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

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public Integer getIdCiudadExpDocumento() {
        return idCiudadExpDocumento;
    }

    public void setIdCiudadExpDocumento(Integer idCiudadExpDocumento) {
        this.idCiudadExpDocumento = idCiudadExpDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdCiudadNacimiento() {
        return idCiudadNacimiento;
    }

    public void setIdCiudadNacimiento(Integer idCiudadNacimiento) {
        this.idCiudadNacimiento = idCiudadNacimiento;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdFactorRh() {
        return idFactorRh;
    }

    public void setIdFactorRh(Integer idFactorRh) {
        this.idFactorRh = idFactorRh;
    }

    public String getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }

    public Integer getNroHijos() {
        return nroHijos;
    }

    public void setNroHijos(Integer nroHijos) {
        this.nroHijos = nroHijos;
    }

    public Integer getIdLateralidad() {
        return idLateralidad;
    }

    public void setIdLateralidad(Integer idLateralidad) {
        this.idLateralidad = idLateralidad;
    }

    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public Integer getTallaCamisa() {
        return tallaCamisa;
    }

    public void setTallaCamisa(Integer tallaCamisa) {
        this.tallaCamisa = tallaCamisa;
    }

    public Integer getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(Integer tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
    }

    public Integer getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(Integer tallaCalzado) {
        this.tallaCalzado = tallaCalzado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idTercero);
        hash = 59 * hash + Objects.hashCode(this.primerNombre);
        hash = 59 * hash + Objects.hashCode(this.segundoNombre);
        hash = 59 * hash + Objects.hashCode(this.primerApellido);
        hash = 59 * hash + Objects.hashCode(this.segundoApellido);
        hash = 59 * hash + Objects.hashCode(this.imagen);
        hash = 59 * hash + Objects.hashCode(this.idTipoDocumento);
        hash = 59 * hash + Objects.hashCode(this.numeroDocumento);
        hash = 59 * hash + Objects.hashCode(this.fechaDocumento);
        hash = 59 * hash + Objects.hashCode(this.idCiudadExpDocumento);
        hash = 59 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 59 * hash + Objects.hashCode(this.idCiudadNacimiento);
        hash = 59 * hash + Objects.hashCode(this.idGenero);
        hash = 59 * hash + Objects.hashCode(this.idEstadoCivil);
        hash = 59 * hash + Objects.hashCode(this.idFactorRh);
        hash = 59 * hash + Objects.hashCode(this.factorRh);
        hash = 59 * hash + Objects.hashCode(this.nroHijos);
        hash = 59 * hash + Objects.hashCode(this.idLateralidad);
        hash = 59 * hash + Objects.hashCode(this.idTipoVivienda);
        hash = 59 * hash + Objects.hashCode(this.estrato);
        hash = 59 * hash + Objects.hashCode(this.tallaCamisa);
        hash = 59 * hash + Objects.hashCode(this.tallaPantalon);
        hash = 59 * hash + Objects.hashCode(this.tallaCalzado);
        hash = 59 * hash + Objects.hashCode(this.correoElectronico);
        hash = 59 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 59 * hash + Objects.hashCode(this.idTipoPersona);
        hash = 59 * hash + Objects.hashCode(this.razonSocial);
        hash = 59 * hash + Objects.hashCode(this.talla);
        hash = 59 * hash + Objects.hashCode(this.peso);
        hash = 59 * hash + Objects.hashCode(this.imc);
        hash = 59 * hash + Objects.hashCode(this.idProfesion);
        hash = 59 * hash + Objects.hashCode(this.idNivelEducacion);
        hash = 59 * hash + Objects.hashCode(this.idVehiculo);
        hash = 59 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 59 * hash + Objects.hashCode(this.auditoriaFecha);
        hash = 59 * hash + Objects.hashCode(this.telefonoFijo);
        hash = 59 * hash + Objects.hashCode(this.telefonoCelular);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Terceros other = (Terceros) obj;
        if (!Objects.equals(this.primerNombre, other.primerNombre)) {
            return false;
        }
        if (!Objects.equals(this.segundoNombre, other.segundoNombre)) {
            return false;
        }
        if (!Objects.equals(this.primerApellido, other.primerApellido)) {
            return false;
        }
        if (!Objects.equals(this.segundoApellido, other.segundoApellido)) {
            return false;
        }
        if (!Objects.equals(this.imagen, other.imagen)) {
            return false;
        }
        if (!Objects.equals(this.numeroDocumento, other.numeroDocumento)) {
            return false;
        }
        if (!Objects.equals(this.factorRh, other.factorRh)) {
            return false;
        }
        if (!Objects.equals(this.correoElectronico, other.correoElectronico)) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        if (!Objects.equals(this.telefonoFijo, other.telefonoFijo)) {
            return false;
        }
        if (!Objects.equals(this.telefonoCelular, other.telefonoCelular)) {
            return false;
        }
        if (!Objects.equals(this.idTercero, other.idTercero)) {
            return false;
        }
        if (!Objects.equals(this.idTipoDocumento, other.idTipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.fechaDocumento, other.fechaDocumento)) {
            return false;
        }
        if (!Objects.equals(this.idCiudadExpDocumento, other.idCiudadExpDocumento)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.idCiudadNacimiento, other.idCiudadNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.idGenero, other.idGenero)) {
            return false;
        }
        if (!Objects.equals(this.idEstadoCivil, other.idEstadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.idFactorRh, other.idFactorRh)) {
            return false;
        }
        if (!Objects.equals(this.nroHijos, other.nroHijos)) {
            return false;
        }
        if (!Objects.equals(this.idLateralidad, other.idLateralidad)) {
            return false;
        }
        if (!Objects.equals(this.idTipoVivienda, other.idTipoVivienda)) {
            return false;
        }
        if (!Objects.equals(this.estrato, other.estrato)) {
            return false;
        }
        if (!Objects.equals(this.tallaCamisa, other.tallaCamisa)) {
            return false;
        }
        if (!Objects.equals(this.tallaPantalon, other.tallaPantalon)) {
            return false;
        }
        if (!Objects.equals(this.tallaCalzado, other.tallaCalzado)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.idTipoPersona, other.idTipoPersona)) {
            return false;
        }
        if (!Objects.equals(this.talla, other.talla)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.imc, other.imc)) {
            return false;
        }
        if (!Objects.equals(this.idProfesion, other.idProfesion)) {
            return false;
        }
        if (!Objects.equals(this.idNivelEducacion, other.idNivelEducacion)) {
            return false;
        }
        if (!Objects.equals(this.idVehiculo, other.idVehiculo)) {
            return false;
        }
        if (!Objects.equals(this.auditoriaUsuario, other.auditoriaUsuario)) {
            return false;
        }
        if (!Objects.equals(this.auditoriaFecha, other.auditoriaFecha)) {
            return false;
        }
        return true;
    }
}
