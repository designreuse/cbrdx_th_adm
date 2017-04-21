package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VEstructuraFisica {
    private Integer idEstructuraFisica;
    private String codigo;
    private String estructuraFisica;
    private Integer idClasificacionSede;
    private String clasificacionSede;
    private Integer idLocalizacion;
    private String direccion;
    private String camino;
    private String telefono;
    private String celular;
    private String correoElectronico;
    private Boolean indicadorVirtual;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
    }

    public Integer getIdClasificacionSede() {
        return idClasificacionSede;
    }

    public void setIdClasificacionSede(Integer idClasificacionSede) {
        this.idClasificacionSede = idClasificacionSede;
    }

    public String getClasificacionSede() {
        return clasificacionSede;
    }

    public void setClasificacionSede(String clasificacionSede) {
        this.clasificacionSede = clasificacionSede;
    }

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCamino() {
        return camino;
    }

    public void setCamino(String camino) {
        this.camino = camino;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Boolean getIndicadorVirtual() {
        return indicadorVirtual;
    }

    public void setIndicadorVirtual(Boolean indicadorVirtual) {
        this.indicadorVirtual = indicadorVirtual;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
}
