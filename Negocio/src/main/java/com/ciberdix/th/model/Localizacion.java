package com.ciberdix.th.model;

public class Localizacion {
    private Integer idUbicacion;
    private String direccion;
    private Integer ciudad;
    private Integer departamento;
    private Integer pais;
    private Integer barrio;
    private String longitud;
    private String latitud;
    private String comoLlegar;    
    private TipoDireccion tipoDireccion;
    private DivisionPolitica idDivisionPolitica;

    public DivisionPolitica getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(DivisionPolitica idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
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

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public Integer getBarrio() {
        return barrio;
    }

    public void setBarrio(Integer barrio) {
        this.barrio = barrio;
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
