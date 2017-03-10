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
    private String numeroDocumento;
    private Date fechaDocumento;
    private Date fechaNacimiento;
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
    private String razonSocial;
    private Double talla;
    private Double peso;
    private Double imc;
    private Integer idVehiculo;
    private Timestamp auditoriaFecha;

    private TipoDocumentoEntity TipoDocumento;
    private DivPoliticaEntity CiudadExpDocumento;
    private DivPoliticaEntity CiudadNacimiento;
    private GenerosEntity Genero;
    private EstadoCivilEntity EstadoCivil;
    private TipoPersonaEntity TipoPersona;
    private ProfesionesEntity Profesion;
    private NivelEstudioEntity NivelEducacion;
    private UsuariosEntity auditoriaUsuario;

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
    @Column(name = "FechaNacimiento", nullable = false)
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
    @Column(name = "IdVehiculo", nullable = true)
    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }


    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @ManyToOne(targetEntity = TipoDocumentoEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdTipoDocumento", nullable=true,  insertable = false , updatable = false)
    public TipoDocumentoEntity getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    @ManyToOne(targetEntity = DivPoliticaEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdCiudadExpDocumento", nullable=true,  insertable = false , updatable = false)
    public DivPoliticaEntity getCiudadExpDocumento() {
        return CiudadExpDocumento;
    }

    public void setCiudadExpDocumento(DivPoliticaEntity ciudadExpDocumento) {
        CiudadExpDocumento = ciudadExpDocumento;
    }

    @ManyToOne(targetEntity = DivPoliticaEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdCiudadNacimiento", nullable=true,  insertable = false , updatable = false)
    public DivPoliticaEntity getCiudadNacimiento() {
        return CiudadNacimiento;
    }

    public void setCiudadNacimiento(DivPoliticaEntity ciudadNacimiento) {
        CiudadNacimiento = ciudadNacimiento;
    }

    @ManyToOne(targetEntity = TipoPersonaEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdTipoPersona", nullable=true,  insertable = false , updatable = false)
    public TipoPersonaEntity getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(TipoPersonaEntity tipoPersona) {
        TipoPersona = tipoPersona;
    }

    @ManyToOne(targetEntity = ProfesionesEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdProfesion", nullable=true,  insertable = false , updatable = false)
    public ProfesionesEntity getProfesion() {
        return Profesion;
    }

    public void setProfesion(ProfesionesEntity profesion) {
        Profesion = profesion;
    }

    @ManyToOne(targetEntity = NivelEstudioEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdNivelEducacion", nullable=true,  insertable = false , updatable = false)
    public NivelEstudioEntity getNivelEducacion() {
        return NivelEducacion;
    }

    public void setNivelEducacion(NivelEstudioEntity nivelEducacion) {
        NivelEducacion = nivelEducacion;
    }

    @ManyToOne(targetEntity = UsuariosEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="AuditoriaUsuario", nullable=true,  insertable = false , updatable = false)
    public UsuariosEntity getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(UsuariosEntity auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @ManyToOne(targetEntity = GenerosEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdGenero", nullable=true,  insertable = false , updatable = false)
    public GenerosEntity getGenero() {
        return Genero;
    }

    public void setGenero(GenerosEntity genero) {
        Genero = genero;
    }

    @ManyToOne(targetEntity = EstadoCivilEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdEstadoCivil", nullable=true,  insertable = false , updatable = false)
    public EstadoCivilEntity getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEntity estadoCivil) {
        EstadoCivil = estadoCivil;
    }





}