package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Terceros", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosEntity {

    private long idTercero;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String imagen;
    private String numeroDocumento;
    private Date fechaDocumento;
    private Date fechaNacimiento;
    private Integer idFactorRh;
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
    private String telefonoFijo;
    private String telefonoCelular;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTipoDocumento;

    private TipoDocumentoEntity TipoDocumento;
    private DivPoliticaEntity CiudadExpDocumento;
    private DivPoliticaEntity CiudadNacimiento;
    private GenerosEntity Genero;
    private EstadoCivilEntity EstadoCivil;
    private TipoPersonaEntity TipoPersona;
    private ProfesionesEntity Profesion;
    private NivelEstudioEntity NivelEducacion;
    private ListasItemsEntity Lateralidad;
    private ListasItemsEntity Factorrh;

    @Basic
    @Column(name = "IdTipoDocumento")
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTercero")
    public long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(long idTercero) {
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
    @Column(name = "FechaNacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
    @Column(name = "IdVehiculo")
    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
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
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @ManyToOne(targetEntity = TipoDocumentoEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdTipoDocumento", nullable = true, insertable = false, updatable = false)
    public TipoDocumentoEntity getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    @ManyToOne(targetEntity = DivPoliticaEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCiudadExpDocumento", nullable = true, insertable = false, updatable = false)
    public DivPoliticaEntity getCiudadExpDocumento() {
        return CiudadExpDocumento;
    }

    public void setCiudadExpDocumento(DivPoliticaEntity ciudadExpDocumento) {
        CiudadExpDocumento = ciudadExpDocumento;
    }

    @ManyToOne(targetEntity = DivPoliticaEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCiudadNacimiento", nullable = true, insertable = false, updatable = false)
    public DivPoliticaEntity getCiudadNacimiento() {
        return CiudadNacimiento;
    }

    public void setCiudadNacimiento(DivPoliticaEntity ciudadNacimiento) {
        CiudadNacimiento = ciudadNacimiento;
    }

    @ManyToOne(targetEntity = TipoPersonaEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdTipoPersona", nullable = true, insertable = false, updatable = false)
    public TipoPersonaEntity getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(TipoPersonaEntity tipoPersona) {
        TipoPersona = tipoPersona;
    }

    @ManyToOne(targetEntity = ProfesionesEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdProfesion", nullable = true, insertable = false, updatable = false)
    public ProfesionesEntity getProfesion() {
        return Profesion;
    }

    public void setProfesion(ProfesionesEntity profesion) {
        Profesion = profesion;
    }

    @ManyToOne(targetEntity = NivelEstudioEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdNivelEducacion", nullable = true, insertable = false, updatable = false)
    public NivelEstudioEntity getNivelEducacion() {
        return NivelEducacion;
    }

    public void setNivelEducacion(NivelEstudioEntity nivelEducacion) {
        NivelEducacion = nivelEducacion;
    }

    @ManyToOne(targetEntity = GenerosEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdGenero", nullable = true, insertable = false, updatable = false)
    public GenerosEntity getGenero() {
        return Genero;
    }

    public void setGenero(GenerosEntity genero) {
        Genero = genero;
    }

    @ManyToOne(targetEntity = EstadoCivilEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdEstadoCivil", nullable = true, insertable = false, updatable = false)
    public EstadoCivilEntity getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEntity estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    @ManyToOne(targetEntity = ListasItemsEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdLateralidad", referencedColumnName = "IdListaItem", nullable = true, insertable = false, updatable = false)
    public ListasItemsEntity getLateralidad() {
        return Lateralidad;
    }

    public void setLateralidad(ListasItemsEntity lateralidad) {
        Lateralidad = lateralidad;
    }

    @ManyToOne(targetEntity = ListasItemsEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdFactorRh", referencedColumnName = "IdListaItem", nullable = true, insertable = false, updatable = false)
    public ListasItemsEntity getFactorrh() {
        return Factorrh;
    }

    public void setFactorrh(ListasItemsEntity rh) {
        Factorrh = rh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TercerosEntity that = (TercerosEntity) o;

        if (idTercero != that.idTercero) {
            return false;
        }
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) {
            return false;
        }
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null) {
            return false;
        }
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null) {
            return false;
        }
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null) {
            return false;
        }
        if (imagen != null ? !imagen.equals(that.imagen) : that.imagen != null) {
            return false;
        }
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null) {
            return false;
        }
        if (fechaDocumento != null ? !fechaDocumento.equals(that.fechaDocumento) : that.fechaDocumento != null) {
            return false;
        }
        if (fechaNacimiento != null ? !fechaNacimiento.equals(that.fechaNacimiento) : that.fechaNacimiento != null) {
            return false;
        }
        if (idFactorRh != null ? !idFactorRh.equals(that.idFactorRh) : that.idFactorRh != null) {
            return false;
        }
        if (nroHijos != null ? !nroHijos.equals(that.nroHijos) : that.nroHijos != null) {
            return false;
        }
        if (idLateralidad != null ? !idLateralidad.equals(that.idLateralidad) : that.idLateralidad != null) {
            return false;
        }
        if (idTipoVivienda != null ? !idTipoVivienda.equals(that.idTipoVivienda) : that.idTipoVivienda != null) {
            return false;
        }
        if (estrato != null ? !estrato.equals(that.estrato) : that.estrato != null) {
            return false;
        }
        if (tallaCamisa != null ? !tallaCamisa.equals(that.tallaCamisa) : that.tallaCamisa != null) {
            return false;
        }
        if (tallaPantalon != null ? !tallaPantalon.equals(that.tallaPantalon) : that.tallaPantalon != null) {
            return false;
        }
        if (tallaCalzado != null ? !tallaCalzado.equals(that.tallaCalzado) : that.tallaCalzado != null) {
            return false;
        }
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null) {
            return false;
        }
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null) {
            return false;
        }
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) {
            return false;
        }
        if (talla != null ? !talla.equals(that.talla) : that.talla != null) {
            return false;
        }
        if (peso != null ? !peso.equals(that.peso) : that.peso != null) {
            return false;
        }
        if (imc != null ? !imc.equals(that.imc) : that.imc != null) {
            return false;
        }
        if (idVehiculo != null ? !idVehiculo.equals(that.idVehiculo) : that.idVehiculo != null) {
            return false;
        }
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null) {
            return false;
        }
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) {
            return false;
        }
        if (telefonoCelular != null ? !telefonoCelular.equals(that.telefonoCelular) : that.telefonoCelular != null) {
            return false;
        }
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idTercero ^ (idTercero >>> 32));
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (imagen != null ? imagen.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (fechaDocumento != null ? fechaDocumento.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (idFactorRh != null ? idFactorRh.hashCode() : 0);
        result = 31 * result + (nroHijos != null ? nroHijos.hashCode() : 0);
        result = 31 * result + (idLateralidad != null ? idLateralidad.hashCode() : 0);
        result = 31 * result + (idTipoVivienda != null ? idTipoVivienda.hashCode() : 0);
        result = 31 * result + (estrato != null ? estrato.hashCode() : 0);
        result = 31 * result + (tallaCamisa != null ? tallaCamisa.hashCode() : 0);
        result = 31 * result + (tallaPantalon != null ? tallaPantalon.hashCode() : 0);
        result = 31 * result + (tallaCalzado != null ? tallaCalzado.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (talla != null ? talla.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (imc != null ? imc.hashCode() : 0);
        result = 31 * result + (idVehiculo != null ? idVehiculo.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        return result;
    }

    public TercerosEntity(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String imagen, String numeroDocumento, Date fechaDocumento, Date fechaNacimiento, Integer idFactorRh, Integer nroHijos, Integer idLateralidad, Integer idTipoVivienda, Integer estrato, Integer tallaCamisa, Integer tallaPantalon, Integer tallaCalzado, String correoElectronico, Date fechaCreacion, String razonSocial, Double talla, Double peso, Double imc, Integer idVehiculo, String telefonoFijo, String telefonoCelular, Integer auditoriaUsuario, Integer tipoDocumento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.imagen = imagen;
        this.numeroDocumento = numeroDocumento;
        this.fechaDocumento = fechaDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.idFactorRh = idFactorRh;
        this.nroHijos = nroHijos;
        this.idLateralidad = idLateralidad;
        this.idTipoVivienda = idTipoVivienda;
        this.estrato = estrato;
        this.tallaCamisa = tallaCamisa;
        this.tallaPantalon = tallaPantalon;
        this.tallaCalzado = tallaCalzado;
        this.correoElectronico = correoElectronico;
        this.fechaCreacion = fechaCreacion;
        this.razonSocial = razonSocial;
        this.talla = talla;
        this.peso = peso;
        this.imc = imc;
        this.idVehiculo = idVehiculo;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idTipoDocumento = tipoDocumento;
    }

    public TercerosEntity() {
    }
}
