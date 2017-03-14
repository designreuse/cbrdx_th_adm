package com.ciberdix.th.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Tercero {

    private int idTerceroFamiliar; //para post no lo debo enviar
    private long idTercero;         //id Padre
    private long idFamiliar;
    private Integer idTipoDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String correoElectronico;
    private String numeroDocumento;
    private int idConvivencia;
    private int idParentesco;
    private String telefonoFijo;
    private String telefonoCelular;
    private String direccion;

    public Tercero(long idTercero, long idFamiliar, Integer idTipoDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String correoElectronico, String numeroDocumento, int idConvivencia, int idParentesco, String telefonoFijo, String telefonoCelular, String direccion) {
        this.idTercero = idTercero;
        this.idFamiliar = idFamiliar;
        this.idTipoDocumento = idTipoDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.numeroDocumento = numeroDocumento;
        this.idConvivencia = idConvivencia;
        this.idParentesco = idParentesco;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }



    public Tercero(long idTercero, String correoElectronico, String telefonoFijo, String telefonoCelular) {
        this.idTercero = idTercero;
        this.correoElectronico = correoElectronico;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
    }

    public int getIdTerceroFamiliar() {
        return idTerceroFamiliar;
    }

    public void setIdTerceroFamiliar(int idTerceroFamiliar) {
        this.idTerceroFamiliar = idTerceroFamiliar;
    }

    public long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(long idTercero) {
        this.idTercero = idTercero;
    }

    public long getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(long idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(int idConvivencia) {
        this.idConvivencia = idConvivencia;
    }

    public int getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(int idParentesco) {
        this.idParentesco = idParentesco;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
