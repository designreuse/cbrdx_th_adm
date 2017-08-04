package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_Terceros", schema = "dbo", catalog = "CREZCAMOS")
public class VTerceros {
    private Long idTercero;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String imagen;
    private Integer idTipoDocumento;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaDocumento;
    private Integer idCiudadExpDocumento;
    private String ciudadExpDocumento;
    private Date fechaNacimiento;
    private Integer idCiudadNacimiento;
    private String ciudadNacimiento;
    private String gentilicio;
    private Integer idGenero;
    private String genero;
    private Integer idEstadoCivil;
    private String estadoCivil;
    private Integer idFactorRh;
    private String factorRh;
    private Integer nroHijos;
    private Integer idLateralidad;
    private String lateralidad;
    private Integer idTallaCamisa;
    private String tallaCamisa;
    private Integer idTallaPantalon;
    private String tallaPantalon;
    private Integer idTallaCalzado;
    private String tallaCalzado;
    private String correoElectronico;
    private Date fechaCreacion;
    private Integer idTipoPersona;
    private String tipoPersona;
    private String razonSocial;
    private Double talla;
    private Double peso;
    private Double imc;
    private Integer idProfesion;
    private String profesion;
    private Integer idNivelEducacion;
    private String nivelEstudio;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String telefonoFijo;
    private String telefonoCelular;
    private Date fechaDefuncion;
    private Integer idTipoOcupacion;
    private String tipoOcupacion;
    private Integer idSectorEconomico;
    private String sectorEconomico;
    private Integer idActividadEconomica;
    private String actividadEconomica;
    private Integer idOcupacion;
    private String ocupacion;
    private Integer idEstadoJuridico;
    private String estadoJuridico;
    private Integer idCoberturaSalud;
    private String coberturaSalud;
    private Boolean indicadorVivo;
    private Integer idTipoAfiliacion;
    private String tipoAfiliacion;
    private Boolean indicadorHabilitado;
    private Integer idTipoTercero;
    private String tipoTercero;
    private String sitioWeb;
    private Integer idAdjunto;
    private String estadoTercero;
    private Integer idEstadoTercero;
    private String nombreArchivo;
    private Integer idAdjuntoExamenMedico;
    private String cargo;
    private String estructuraOrganizacional;
    private String estructuraArea;

    @Id
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
    @Column(name = "TipoDocumento", nullable = true, length = 100)
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
    @Column(name = "CiudadExpDocumento", nullable = true, length = 100)
    public String getCiudadExpDocumento() {
        return ciudadExpDocumento;
    }

    public void setCiudadExpDocumento(String ciudadExpDocumento) {
        this.ciudadExpDocumento = ciudadExpDocumento;
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
    @Column(name = "CiudadNacimiento", nullable = true, length = 100)
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    @Basic
    @Column(name = "Gentilicio", nullable = true, length = 100)
    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
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
    @Column(name = "Genero", nullable = true, length = 100)
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
    @Column(name = "EstadoCivil", nullable = true, length = 100)
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
    @Column(name = "FactorRh", nullable = true, length = 100)
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
    @Column(name = "Lateralidad", nullable = true, length = 100)
    public String getLateralidad() {
        return lateralidad;
    }

    public void setLateralidad(String lateralidad) {
        this.lateralidad = lateralidad;
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
    @Column(name = "TallaCamisa", nullable = true, length = 100)
    public String getTallaCamisa() {
        return tallaCamisa;
    }

    public void setTallaCamisa(String tallaCamisa) {
        this.tallaCamisa = tallaCamisa;
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
    @Column(name = "TallaPantalon", nullable = true, length = 100)
    public String getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(String tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
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
    @Column(name = "TallaCalzado", nullable = true, length = 100)
    public String getTallaCalzado() {
        return tallaCalzado;
    }

    public void setTallaCalzado(String tallaCalzado) {
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
    @Column(name = "TipoPersona", nullable = true, length = 100)
    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
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
    @Column(name = "Profesion", nullable = true, length = 512)
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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
    @Column(name = "NivelEstudio", nullable = true, length = 100)
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
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
    @Column(name = "TipoOcupacion", nullable = true, length = 100)
    public String getTipoOcupacion() {
        return tipoOcupacion;
    }

    public void setTipoOcupacion(String tipoOcupacion) {
        this.tipoOcupacion = tipoOcupacion;
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
    @Column(name = "SectorEconomico", nullable = true, length = 300)
    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
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
    @Column(name = "ActividadEconomica", nullable = true, length = 300)
    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
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
    @Column(name = "Ocupacion", nullable = true, length = 300)
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
    @Column(name = "EstadoJuridico", nullable = true, length = 100)
    public String getEstadoJuridico() {
        return estadoJuridico;
    }

    public void setEstadoJuridico(String estadoJuridico) {
        this.estadoJuridico = estadoJuridico;
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
    @Column(name = "CoberturaSalud", nullable = true, length = 100)
    public String getCoberturaSalud() {
        return coberturaSalud;
    }

    public void setCoberturaSalud(String coberturaSalud) {
        this.coberturaSalud = coberturaSalud;
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
    @Column(name = "TipoAfiliacion", nullable = true, length = 100)
    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
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
    @Column(name = "TipoTercero", nullable = true, length = 100)
    public String getTipoTercero() {
        return tipoTercero;
    }

    public void setTipoTercero(String tipoTercero) {
        this.tipoTercero = tipoTercero;
    }

    @Basic
    @Column(name = "SitioWeb", nullable = true, length = 256)
    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    @Basic
    @Column(name = "idAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "EstadoTercero", nullable = true, length = 100)
    public String getEstadoTercero() {
        return estadoTercero;
    }

    public void setEstadoTercero(String estadoTercero) {
        this.estadoTercero = estadoTercero;
    }

    @Basic
    @Column(name = "IdEstadoTercero", nullable = true)
    public Integer getIdEstadoTercero() {
        return idEstadoTercero;
    }

    public void setIdEstadoTercero(Integer idEstadoTercero) {
        this.idEstadoTercero = idEstadoTercero;
    }

    @Basic
    @Column(name = "NombreArchivo", nullable = true, length = 100)
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Basic
    @Column(name = "IdAdjuntoExamenMedico", nullable = true)
    public Integer getIdAdjuntoExamenMedico() {
        return idAdjuntoExamenMedico;
    }

    public void setIdAdjuntoExamenMedico(Integer idAdjuntoExamenMedico) {
        this.idAdjuntoExamenMedico = idAdjuntoExamenMedico;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "EstructuraOrganizacional", nullable = true, length = 50)
    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
    }

    @Basic
    @Column(name = "EstructuraArea", nullable = true, length = 40)
    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTerceros vTerceros = (VTerceros) o;

        if (idTercero != null ? !idTercero.equals(vTerceros.idTercero) : vTerceros.idTercero != null) return false;
        if (primerNombre != null ? !primerNombre.equals(vTerceros.primerNombre) : vTerceros.primerNombre != null)
            return false;
        if (segundoNombre != null ? !segundoNombre.equals(vTerceros.segundoNombre) : vTerceros.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(vTerceros.primerApellido) : vTerceros.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(vTerceros.segundoApellido) : vTerceros.segundoApellido != null)
            return false;
        if (imagen != null ? !imagen.equals(vTerceros.imagen) : vTerceros.imagen != null) return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(vTerceros.idTipoDocumento) : vTerceros.idTipoDocumento != null)
            return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(vTerceros.tipoDocumento) : vTerceros.tipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(vTerceros.numeroDocumento) : vTerceros.numeroDocumento != null)
            return false;
        if (fechaDocumento != null ? !fechaDocumento.equals(vTerceros.fechaDocumento) : vTerceros.fechaDocumento != null)
            return false;
        if (idCiudadExpDocumento != null ? !idCiudadExpDocumento.equals(vTerceros.idCiudadExpDocumento) : vTerceros.idCiudadExpDocumento != null)
            return false;
        if (ciudadExpDocumento != null ? !ciudadExpDocumento.equals(vTerceros.ciudadExpDocumento) : vTerceros.ciudadExpDocumento != null)
            return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(vTerceros.fechaNacimiento) : vTerceros.fechaNacimiento != null)
            return false;
        if (idCiudadNacimiento != null ? !idCiudadNacimiento.equals(vTerceros.idCiudadNacimiento) : vTerceros.idCiudadNacimiento != null)
            return false;
        if (ciudadNacimiento != null ? !ciudadNacimiento.equals(vTerceros.ciudadNacimiento) : vTerceros.ciudadNacimiento != null)
            return false;
        if (gentilicio != null ? !gentilicio.equals(vTerceros.gentilicio) : vTerceros.gentilicio != null) return false;
        if (idGenero != null ? !idGenero.equals(vTerceros.idGenero) : vTerceros.idGenero != null) return false;
        if (genero != null ? !genero.equals(vTerceros.genero) : vTerceros.genero != null) return false;
        if (idEstadoCivil != null ? !idEstadoCivil.equals(vTerceros.idEstadoCivil) : vTerceros.idEstadoCivil != null)
            return false;
        if (estadoCivil != null ? !estadoCivil.equals(vTerceros.estadoCivil) : vTerceros.estadoCivil != null)
            return false;
        if (idFactorRh != null ? !idFactorRh.equals(vTerceros.idFactorRh) : vTerceros.idFactorRh != null) return false;
        if (factorRh != null ? !factorRh.equals(vTerceros.factorRh) : vTerceros.factorRh != null) return false;
        if (nroHijos != null ? !nroHijos.equals(vTerceros.nroHijos) : vTerceros.nroHijos != null) return false;
        if (idLateralidad != null ? !idLateralidad.equals(vTerceros.idLateralidad) : vTerceros.idLateralidad != null)
            return false;
        if (lateralidad != null ? !lateralidad.equals(vTerceros.lateralidad) : vTerceros.lateralidad != null)
            return false;
        if (idTallaCamisa != null ? !idTallaCamisa.equals(vTerceros.idTallaCamisa) : vTerceros.idTallaCamisa != null)
            return false;
        if (tallaCamisa != null ? !tallaCamisa.equals(vTerceros.tallaCamisa) : vTerceros.tallaCamisa != null)
            return false;
        if (idTallaPantalon != null ? !idTallaPantalon.equals(vTerceros.idTallaPantalon) : vTerceros.idTallaPantalon != null)
            return false;
        if (tallaPantalon != null ? !tallaPantalon.equals(vTerceros.tallaPantalon) : vTerceros.tallaPantalon != null)
            return false;
        if (idTallaCalzado != null ? !idTallaCalzado.equals(vTerceros.idTallaCalzado) : vTerceros.idTallaCalzado != null)
            return false;
        if (tallaCalzado != null ? !tallaCalzado.equals(vTerceros.tallaCalzado) : vTerceros.tallaCalzado != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(vTerceros.correoElectronico) : vTerceros.correoElectronico != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(vTerceros.fechaCreacion) : vTerceros.fechaCreacion != null)
            return false;
        if (idTipoPersona != null ? !idTipoPersona.equals(vTerceros.idTipoPersona) : vTerceros.idTipoPersona != null)
            return false;
        if (tipoPersona != null ? !tipoPersona.equals(vTerceros.tipoPersona) : vTerceros.tipoPersona != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(vTerceros.razonSocial) : vTerceros.razonSocial != null)
            return false;
        if (talla != null ? !talla.equals(vTerceros.talla) : vTerceros.talla != null) return false;
        if (peso != null ? !peso.equals(vTerceros.peso) : vTerceros.peso != null) return false;
        if (imc != null ? !imc.equals(vTerceros.imc) : vTerceros.imc != null) return false;
        if (idProfesion != null ? !idProfesion.equals(vTerceros.idProfesion) : vTerceros.idProfesion != null)
            return false;
        if (profesion != null ? !profesion.equals(vTerceros.profesion) : vTerceros.profesion != null) return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(vTerceros.idNivelEducacion) : vTerceros.idNivelEducacion != null)
            return false;
        if (nivelEstudio != null ? !nivelEstudio.equals(vTerceros.nivelEstudio) : vTerceros.nivelEstudio != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(vTerceros.auditoriaUsuario) : vTerceros.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(vTerceros.auditoriaFecha) : vTerceros.auditoriaFecha != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(vTerceros.telefonoFijo) : vTerceros.telefonoFijo != null)
            return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(vTerceros.telefonoCelular) : vTerceros.telefonoCelular != null)
            return false;
        if (fechaDefuncion != null ? !fechaDefuncion.equals(vTerceros.fechaDefuncion) : vTerceros.fechaDefuncion != null)
            return false;
        if (idTipoOcupacion != null ? !idTipoOcupacion.equals(vTerceros.idTipoOcupacion) : vTerceros.idTipoOcupacion != null)
            return false;
        if (tipoOcupacion != null ? !tipoOcupacion.equals(vTerceros.tipoOcupacion) : vTerceros.tipoOcupacion != null)
            return false;
        if (idSectorEconomico != null ? !idSectorEconomico.equals(vTerceros.idSectorEconomico) : vTerceros.idSectorEconomico != null)
            return false;
        if (sectorEconomico != null ? !sectorEconomico.equals(vTerceros.sectorEconomico) : vTerceros.sectorEconomico != null)
            return false;
        if (idActividadEconomica != null ? !idActividadEconomica.equals(vTerceros.idActividadEconomica) : vTerceros.idActividadEconomica != null)
            return false;
        if (actividadEconomica != null ? !actividadEconomica.equals(vTerceros.actividadEconomica) : vTerceros.actividadEconomica != null)
            return false;
        if (idOcupacion != null ? !idOcupacion.equals(vTerceros.idOcupacion) : vTerceros.idOcupacion != null)
            return false;
        if (ocupacion != null ? !ocupacion.equals(vTerceros.ocupacion) : vTerceros.ocupacion != null) return false;
        if (idEstadoJuridico != null ? !idEstadoJuridico.equals(vTerceros.idEstadoJuridico) : vTerceros.idEstadoJuridico != null)
            return false;
        if (estadoJuridico != null ? !estadoJuridico.equals(vTerceros.estadoJuridico) : vTerceros.estadoJuridico != null)
            return false;
        if (idCoberturaSalud != null ? !idCoberturaSalud.equals(vTerceros.idCoberturaSalud) : vTerceros.idCoberturaSalud != null)
            return false;
        if (coberturaSalud != null ? !coberturaSalud.equals(vTerceros.coberturaSalud) : vTerceros.coberturaSalud != null)
            return false;
        if (indicadorVivo != null ? !indicadorVivo.equals(vTerceros.indicadorVivo) : vTerceros.indicadorVivo != null)
            return false;
        if (idTipoAfiliacion != null ? !idTipoAfiliacion.equals(vTerceros.idTipoAfiliacion) : vTerceros.idTipoAfiliacion != null)
            return false;
        if (tipoAfiliacion != null ? !tipoAfiliacion.equals(vTerceros.tipoAfiliacion) : vTerceros.tipoAfiliacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(vTerceros.indicadorHabilitado) : vTerceros.indicadorHabilitado != null)
            return false;
        if (idTipoTercero != null ? !idTipoTercero.equals(vTerceros.idTipoTercero) : vTerceros.idTipoTercero != null)
            return false;
        if (tipoTercero != null ? !tipoTercero.equals(vTerceros.tipoTercero) : vTerceros.tipoTercero != null)
            return false;
        if (sitioWeb != null ? !sitioWeb.equals(vTerceros.sitioWeb) : vTerceros.sitioWeb != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(vTerceros.idAdjunto) : vTerceros.idAdjunto != null) return false;
        if (estadoTercero != null ? !estadoTercero.equals(vTerceros.estadoTercero) : vTerceros.estadoTercero != null)
            return false;
        if (idEstadoTercero != null ? !idEstadoTercero.equals(vTerceros.idEstadoTercero) : vTerceros.idEstadoTercero != null)
            return false;
        if (nombreArchivo != null ? !nombreArchivo.equals(vTerceros.nombreArchivo) : vTerceros.nombreArchivo != null)
            return false;
        if (idAdjuntoExamenMedico != null ? !idAdjuntoExamenMedico.equals(vTerceros.idAdjuntoExamenMedico) : vTerceros.idAdjuntoExamenMedico != null)
            return false;
        if (cargo != null ? !cargo.equals(vTerceros.cargo) : vTerceros.cargo != null) return false;
        if (estructuraOrganizacional != null ? !estructuraOrganizacional.equals(vTerceros.estructuraOrganizacional) : vTerceros.estructuraOrganizacional != null)
            return false;
        if (estructuraArea != null ? !estructuraArea.equals(vTerceros.estructuraArea) : vTerceros.estructuraArea != null)
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
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (fechaDocumento != null ? fechaDocumento.hashCode() : 0);
        result = 31 * result + (idCiudadExpDocumento != null ? idCiudadExpDocumento.hashCode() : 0);
        result = 31 * result + (ciudadExpDocumento != null ? ciudadExpDocumento.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (idCiudadNacimiento != null ? idCiudadNacimiento.hashCode() : 0);
        result = 31 * result + (ciudadNacimiento != null ? ciudadNacimiento.hashCode() : 0);
        result = 31 * result + (gentilicio != null ? gentilicio.hashCode() : 0);
        result = 31 * result + (idGenero != null ? idGenero.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
        result = 31 * result + (estadoCivil != null ? estadoCivil.hashCode() : 0);
        result = 31 * result + (idFactorRh != null ? idFactorRh.hashCode() : 0);
        result = 31 * result + (factorRh != null ? factorRh.hashCode() : 0);
        result = 31 * result + (nroHijos != null ? nroHijos.hashCode() : 0);
        result = 31 * result + (idLateralidad != null ? idLateralidad.hashCode() : 0);
        result = 31 * result + (lateralidad != null ? lateralidad.hashCode() : 0);
        result = 31 * result + (idTallaCamisa != null ? idTallaCamisa.hashCode() : 0);
        result = 31 * result + (tallaCamisa != null ? tallaCamisa.hashCode() : 0);
        result = 31 * result + (idTallaPantalon != null ? idTallaPantalon.hashCode() : 0);
        result = 31 * result + (tallaPantalon != null ? tallaPantalon.hashCode() : 0);
        result = 31 * result + (idTallaCalzado != null ? idTallaCalzado.hashCode() : 0);
        result = 31 * result + (tallaCalzado != null ? tallaCalzado.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (idTipoPersona != null ? idTipoPersona.hashCode() : 0);
        result = 31 * result + (tipoPersona != null ? tipoPersona.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (talla != null ? talla.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (imc != null ? imc.hashCode() : 0);
        result = 31 * result + (idProfesion != null ? idProfesion.hashCode() : 0);
        result = 31 * result + (profesion != null ? profesion.hashCode() : 0);
        result = 31 * result + (idNivelEducacion != null ? idNivelEducacion.hashCode() : 0);
        result = 31 * result + (nivelEstudio != null ? nivelEstudio.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (fechaDefuncion != null ? fechaDefuncion.hashCode() : 0);
        result = 31 * result + (idTipoOcupacion != null ? idTipoOcupacion.hashCode() : 0);
        result = 31 * result + (tipoOcupacion != null ? tipoOcupacion.hashCode() : 0);
        result = 31 * result + (idSectorEconomico != null ? idSectorEconomico.hashCode() : 0);
        result = 31 * result + (sectorEconomico != null ? sectorEconomico.hashCode() : 0);
        result = 31 * result + (idActividadEconomica != null ? idActividadEconomica.hashCode() : 0);
        result = 31 * result + (actividadEconomica != null ? actividadEconomica.hashCode() : 0);
        result = 31 * result + (idOcupacion != null ? idOcupacion.hashCode() : 0);
        result = 31 * result + (ocupacion != null ? ocupacion.hashCode() : 0);
        result = 31 * result + (idEstadoJuridico != null ? idEstadoJuridico.hashCode() : 0);
        result = 31 * result + (estadoJuridico != null ? estadoJuridico.hashCode() : 0);
        result = 31 * result + (idCoberturaSalud != null ? idCoberturaSalud.hashCode() : 0);
        result = 31 * result + (coberturaSalud != null ? coberturaSalud.hashCode() : 0);
        result = 31 * result + (indicadorVivo != null ? indicadorVivo.hashCode() : 0);
        result = 31 * result + (idTipoAfiliacion != null ? idTipoAfiliacion.hashCode() : 0);
        result = 31 * result + (tipoAfiliacion != null ? tipoAfiliacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (idTipoTercero != null ? idTipoTercero.hashCode() : 0);
        result = 31 * result + (tipoTercero != null ? tipoTercero.hashCode() : 0);
        result = 31 * result + (sitioWeb != null ? sitioWeb.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (estadoTercero != null ? estadoTercero.hashCode() : 0);
        result = 31 * result + (idEstadoTercero != null ? idEstadoTercero.hashCode() : 0);
        result = 31 * result + (nombreArchivo != null ? nombreArchivo.hashCode() : 0);
        result = 31 * result + (idAdjuntoExamenMedico != null ? idAdjuntoExamenMedico.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (estructuraOrganizacional != null ? estructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (estructuraArea != null ? estructuraArea.hashCode() : 0);
        return result;
    }
}
