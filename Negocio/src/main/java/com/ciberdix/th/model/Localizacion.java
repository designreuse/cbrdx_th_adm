package com.ciberdix.th.model;

import java.sql.Timestamp;

public class Localizacion {
    private Integer idUbicacion;
    private String direccion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idDivisionPolitica;
    private String longitud;
    private String latitud;
    private String comoLlegar;    
    private Demografia barrio;
    private Demografia ciudad;
    private Demografia departamento;
    private Demografia pais;
    private TipoDireccion tipoDireccion;
    private boolean indicadorHabilitado;

    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Demografia getBarrio() {
        return barrio;
    }

    public void setBarrio(Demografia barrio) {
        this.barrio = barrio;
    }

    public Demografia getCiudad() {
        return ciudad;
    }

    public void setCiudad(Demografia ciudad) {
        this.ciudad = ciudad;
    }

    public Demografia getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Demografia departamento) {
        this.departamento = departamento;
    }

    public Demografia getPais() {
        return pais;
    }

    public void setPais(Demografia pais) {
        this.pais = pais;
    }

    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
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

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getComoLlegar() {
        return comoLlegar;
    }

    public void setComoLlegar(String comoLlegar) {
        this.comoLlegar = comoLlegar;
    }    
}
