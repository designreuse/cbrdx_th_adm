package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Terceros", schema = "dbo", catalog = "CREZCAMOS")
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
    private Integer nroHijos;
    private Integer idLateralidad;
    private String tallaCamisa;
    private String tallaPantalon;
    private String tallaCalzado;
    private String correoElectronico;
    private Date fechaCreacion;
    private Integer idTipoPersona;
    private String razonSocial;
    private Double talla;
    private Double peso;
    private Double imc;
    private Integer idProfesion;
    private Integer idNivelEducacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String telefonoFijo;
    private String telefonoCelular;
    private Date fechaDefuncion;
    private Integer idTipoOcupacion;
    private Integer idSectorEconomico;
    private Integer idActividadEconomica;
    private Integer idOcupacion;
    private Integer idEstadoJuridico;
    private Integer idCoberturaSalud;
    private Boolean indicadorVivo;
    private Integer idTipoAfiliacion;
    private Boolean indicadorHabilitado;
    private Integer idTipoTercero;
    private Integer idTallaCamisa;
    private Integer idTallaPantalon;
    private Integer idTallaCalzado;
    private String sitioWeb;
    private Integer idAdjunto;

    public Terceros() {
    }
    public Terceros(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String imagen, Integer idTipoDocumento, String numeroDocumento, Date fechaDocumento, Integer idCiudadExpDocumento, Date fechaNacimiento, Integer idCiudadNacimiento, Integer idGenero, Integer idEstadoCivil, Integer idFactorRh, Integer nroHijos, Integer idLateralidad, String tallaCamisa, String tallaPantalon, String tallaCalzado, String correoElectronico, Date fechaCreacion, Integer idTipoPersona, String razonSocial, Double talla, Double peso, Double imc, Integer idProfesion, Integer idNivelEducacion, Integer auditoriaUsuario, String telefonoFijo, String telefonoCelular, Date fechaDefuncion, Integer idTipoOcupacion, Integer idSectorEconomico, Integer idActividadEconomica, Integer idOcupacion, Integer idEstadoJuridico, Integer idCoberturaSalud, Boolean indicadorVivo, Integer idTipoAfiliacion, Boolean indicadorHabilitado, Integer idTipoTercero, Integer idTallaCamisa, Integer idTallaPantalon, Integer idTallaCalzado, String sitioWeb, Integer idAdjunto) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        if(imagen == null || imagen == ""){
            imagen = "avatar.jpg";
        }
        this.imagen = imagen;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaDocumento = fechaDocumento != null ? new Date(fechaDocumento.getTime()) : null;
        this.idCiudadExpDocumento = idCiudadExpDocumento;
        this.fechaNacimiento = fechaNacimiento != null ? new Date(fechaNacimiento.getTime()) : null;
        this.idCiudadNacimiento = idCiudadNacimiento;
        this.idGenero = idGenero;
        this.idEstadoCivil = idEstadoCivil;
        this.idFactorRh = idFactorRh;
        this.nroHijos = nroHijos;
        this.idLateralidad = idLateralidad;
        this.tallaCamisa = tallaCamisa;
        this.tallaPantalon = tallaPantalon;
        this.tallaCalzado = tallaCalzado;
        this.correoElectronico = correoElectronico;
        this.fechaCreacion = fechaCreacion != null ? fechaCreacion : new Date(System.currentTimeMillis());
        this.idTipoPersona = idTipoPersona;
        this.razonSocial = razonSocial;
        this.talla = talla;
        this.peso = peso;
        this.imc = imc;
        this.idProfesion = idProfesion;
        this.idNivelEducacion = idNivelEducacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.fechaDefuncion = fechaDefuncion != null ? new Date(fechaDefuncion.getTime()) : null;
        this.idTipoOcupacion = idTipoOcupacion;
        this.idSectorEconomico = idSectorEconomico;
        this.idActividadEconomica = idActividadEconomica;
        this.idOcupacion = idOcupacion;
        this.idEstadoJuridico = idEstadoJuridico;
        this.idCoberturaSalud = idCoberturaSalud;
        this.indicadorVivo = indicadorVivo;
        this.idTipoAfiliacion = idTipoAfiliacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idTipoTercero = idTipoTercero;
        this.idTallaCamisa = idTallaCamisa;
        this.idTallaPantalon = idTallaPantalon;
        this.idTallaCalzado = idTallaCalzado;
        this.sitioWeb = sitioWeb;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idAdjunto = idAdjunto;
    }
    public Terceros(Long idTercero, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String imagen, Integer idTipoDocumento, String numeroDocumento, Date fechaDocumento, Integer idCiudadExpDocumento, Date fechaNacimiento, Integer idCiudadNacimiento, Integer idGenero, Integer idEstadoCivil, Integer idFactorRh, Integer nroHijos, Integer idLateralidad, String tallaCamisa, String tallaPantalon, String tallaCalzado, String correoElectronico, Date fechaCreacion, Integer idTipoPersona, String razonSocial, Double talla, Double peso, Double imc, Integer idProfesion, Integer idNivelEducacion, Integer auditoriaUsuario, String telefonoFijo, String telefonoCelular, Date fechaDefuncion, Integer idTipoOcupacion, Integer idSectorEconomico, Integer idActividadEconomica, Integer idOcupacion, Integer idEstadoJuridico, Integer idCoberturaSalud, Boolean indicadorVivo, Integer idTipoAfiliacion, Boolean indicadorHabilitado, Integer idTipoTercero, Integer idTallaCamisa, Integer idTallaPantalon, Integer idTallaCalzado, String sitioWeb, Integer idAdjunto) {
        this.idTercero = idTercero;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        if(imagen == null || imagen == ""){
            imagen = "avatar.jpg";
        }
        this.imagen = imagen;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaDocumento = fechaDocumento != null ? new Date(fechaDocumento.getTime()) : null;
        this.idCiudadExpDocumento = idCiudadExpDocumento;
        this.fechaNacimiento = fechaNacimiento != null ? new Date(fechaNacimiento.getTime()) : null;
        this.idCiudadNacimiento = idCiudadNacimiento;
        this.idGenero = idGenero;
        this.idEstadoCivil = idEstadoCivil;
        this.idFactorRh = idFactorRh;
        this.nroHijos = nroHijos;
        this.idLateralidad = idLateralidad;
        this.tallaCamisa = tallaCamisa;
        this.tallaPantalon = tallaPantalon;
        this.tallaCalzado = tallaCalzado;
        this.correoElectronico = correoElectronico;
        this.fechaCreacion = fechaCreacion != null ? fechaCreacion : new Date(System.currentTimeMillis());
        this.idTipoPersona = idTipoPersona;
        this.razonSocial = razonSocial;
        this.talla = talla;
        this.peso = peso;
        this.imc = imc;
        this.idProfesion = idProfesion;
        this.idNivelEducacion = idNivelEducacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.fechaDefuncion = fechaDefuncion != null ? new Date(fechaDefuncion.getTime()) : null;
        this.idTipoOcupacion = idTipoOcupacion;
        this.idSectorEconomico = idSectorEconomico;
        this.idActividadEconomica = idActividadEconomica;
        this.idOcupacion = idOcupacion;
        this.idEstadoJuridico = idEstadoJuridico;
        this.idCoberturaSalud = idCoberturaSalud;
        this.indicadorVivo = indicadorVivo;
        this.idTipoAfiliacion = idTipoAfiliacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idTipoTercero = idTipoTercero;
        this.idTallaCamisa = idTallaCamisa;
        this.idTallaPantalon = idTallaPantalon;
        this.idTallaCalzado = idTallaCalzado;
        this.sitioWeb = sitioWeb;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idAdjunto = idAdjunto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
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
    @Column(name = "FechaDocumento", nullable = true)
    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    @Basic
    @Column(name = "IdCiudadExpDocumento", nullable = true)
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
    @Column(name = "IdCiudadNacimiento", nullable = true)
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
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }
  
    @Basic
    @Column(name = "FechaDefuncion", nullable = true)
    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    @Basic
    @Column(name = "IdTipoOcupacion", nullable = true)
    public Integer getIdTipoOcupacion() {
        return idTipoOcupacion;
    }

    public void setIdTipoOcupacion(Integer idTipoOcupacion) {
        this.idTipoOcupacion = idTipoOcupacion;
    }

    @Basic
    @Column(name = "IdSectorEconomico", nullable = true)
    public Integer getIdSectorEconomico() {
        return idSectorEconomico;
    }

    public void setIdSectorEconomico(Integer idSectorEconomico) {
        this.idSectorEconomico = idSectorEconomico;
    }

    @Basic
    @Column(name = "IdActividadEconomica", nullable = true)
    public Integer getIdActividadEconomica() {
        return idActividadEconomica;
    }

    public void setIdActividadEconomica(Integer idActividadEconomica) {
        this.idActividadEconomica = idActividadEconomica;
    }

    @Basic
    @Column(name = "IdOcupacion", nullable = true)
    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    @Basic
    @Column(name = "IdEstadoJuridico", nullable = true)
    public Integer getIdEstadoJuridico() {
        return idEstadoJuridico;
    }

    public void setIdEstadoJuridico(Integer idEstadoJuridico) {
        this.idEstadoJuridico = idEstadoJuridico;
    }

    @Basic
    @Column(name = "IdCoberturaSalud", nullable = true)
    public Integer getIdCoberturaSalud() {
        return idCoberturaSalud;
    }

    public void setIdCoberturaSalud(Integer idCoberturaSalud) {
        this.idCoberturaSalud = idCoberturaSalud;
    }

    @Basic
    @Column(name = "IndicadorVivo", nullable = true)
    public Boolean getIndicadorVivo() {
        return indicadorVivo;
    }

    public void setIndicadorVivo(Boolean indicadorVivo) {
        this.indicadorVivo = indicadorVivo;
    }

    @Basic
    @Column(name = "IdTipoAfiliacion", nullable = true)
    public Integer getIdTipoAfiliacion() {
        return idTipoAfiliacion;
    }

    public void setIdTipoAfiliacion(Integer idTipoAfiliacion) {
        this.idTipoAfiliacion = idTipoAfiliacion;
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
    @Column(name = "IdTipoTercero", nullable = true)
    public Integer getIdTipoTercero() {
        return idTipoTercero;
    }

    public void setIdTipoTercero(Integer idTipoTercero) {
        this.idTipoTercero = idTipoTercero;
    }

    @Basic
    @Column(name = "IdTallaCamisa", nullable = true)
    public Integer getIdTallaCamisa() {
        return idTallaCamisa;
    }

    public void setIdTallaCamisa(Integer idTallaCamisa) {
        this.idTallaCamisa = idTallaCamisa;
    }

    @Basic
    @Column(name = "IdTallaPantalon", nullable = true)
    public Integer getIdTallaPantalon() {
        return idTallaPantalon;
    }

    public void setIdTallaPantalon(Integer idTallaPantalon) {
        this.idTallaPantalon = idTallaPantalon;
    }

    @Basic
    @Column(name = "IdTallaCalzado", nullable = true)
    public Integer getIdTallaCalzado() {
        return idTallaCalzado;
    }

    public void setIdTallaCalzado(Integer idTallaCalzado) {
        this.idTallaCalzado = idTallaCalzado;
    }

    @Basic
    @Column(name = "SitioWeb", nullable = true, length = 256)
    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Terceros terceros = (Terceros) o;

        if (!idTercero.equals(terceros.idTercero)) return false;
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
        if (nroHijos != null ? !nroHijos.equals(terceros.nroHijos) : terceros.nroHijos != null) return false;
        if (idLateralidad != null ? !idLateralidad.equals(terceros.idLateralidad) : terceros.idLateralidad != null)
            return false;
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
        if (!auditoriaUsuario.equals(terceros.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(terceros.auditoriaFecha)) return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(terceros.telefonoFijo) : terceros.telefonoFijo != null)
            return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(terceros.telefonoCelular) : terceros.telefonoCelular != null)
            return false;
        if (fechaDefuncion != null ? !fechaDefuncion.equals(terceros.fechaDefuncion) : terceros.fechaDefuncion != null)
            return false;
        if (idTipoOcupacion != null ? !idTipoOcupacion.equals(terceros.idTipoOcupacion) : terceros.idTipoOcupacion != null)
            return false;
        if (idSectorEconomico != null ? !idSectorEconomico.equals(terceros.idSectorEconomico) : terceros.idSectorEconomico != null)
            return false;
        if (idActividadEconomica != null ? !idActividadEconomica.equals(terceros.idActividadEconomica) : terceros.idActividadEconomica != null)
            return false;
        if (idOcupacion != null ? !idOcupacion.equals(terceros.idOcupacion) : terceros.idOcupacion != null)
            return false;
        if (idEstadoJuridico != null ? !idEstadoJuridico.equals(terceros.idEstadoJuridico) : terceros.idEstadoJuridico != null)
            return false;
        if (idCoberturaSalud != null ? !idCoberturaSalud.equals(terceros.idCoberturaSalud) : terceros.idCoberturaSalud != null)
            return false;
        if (indicadorVivo != null ? !indicadorVivo.equals(terceros.indicadorVivo) : terceros.indicadorVivo != null)
            return false;
        if (idTipoAfiliacion != null ? !idTipoAfiliacion.equals(terceros.idTipoAfiliacion) : terceros.idTipoAfiliacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(terceros.indicadorHabilitado) : terceros.indicadorHabilitado != null)
            return false;
        if (idTipoTercero != null ? !idTipoTercero.equals(terceros.idTipoTercero) : terceros.idTipoTercero != null)
            return false;
        if (idTallaCamisa != null ? !idTallaCamisa.equals(terceros.idTallaCamisa) : terceros.idTallaCamisa != null)
            return false;
        if (idTallaPantalon != null ? !idTallaPantalon.equals(terceros.idTallaPantalon) : terceros.idTallaPantalon != null)
            return false;
        if (idTallaCalzado != null ? !idTallaCalzado.equals(terceros.idTallaCalzado) : terceros.idTallaCalzado != null)
            return false;
        if (sitioWeb != null ? !sitioWeb.equals(terceros.sitioWeb) : terceros.sitioWeb != null) return false;
        return idAdjunto != null ? idAdjunto.equals(terceros.idAdjunto) : terceros.idAdjunto == null;
    }

    @Override
    public int hashCode() {
        int result = idTercero.hashCode();
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
        result = 31 * result + (nroHijos != null ? nroHijos.hashCode() : 0);
        result = 31 * result + (idLateralidad != null ? idLateralidad.hashCode() : 0);
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
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (fechaDefuncion != null ? fechaDefuncion.hashCode() : 0);
        result = 31 * result + (idTipoOcupacion != null ? idTipoOcupacion.hashCode() : 0);
        result = 31 * result + (idSectorEconomico != null ? idSectorEconomico.hashCode() : 0);
        result = 31 * result + (idActividadEconomica != null ? idActividadEconomica.hashCode() : 0);
        result = 31 * result + (idOcupacion != null ? idOcupacion.hashCode() : 0);
        result = 31 * result + (idEstadoJuridico != null ? idEstadoJuridico.hashCode() : 0);
        result = 31 * result + (idCoberturaSalud != null ? idCoberturaSalud.hashCode() : 0);
        result = 31 * result + (indicadorVivo != null ? indicadorVivo.hashCode() : 0);
        result = 31 * result + (idTipoAfiliacion != null ? idTipoAfiliacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (idTipoTercero != null ? idTipoTercero.hashCode() : 0);
        result = 31 * result + (idTallaCamisa != null ? idTallaCamisa.hashCode() : 0);
        result = 31 * result + (idTallaPantalon != null ? idTallaPantalon.hashCode() : 0);
        result = 31 * result + (idTallaCalzado != null ? idTallaCalzado.hashCode() : 0);
        result = 31 * result + (sitioWeb != null ? sitioWeb.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        return result;
    }
}
