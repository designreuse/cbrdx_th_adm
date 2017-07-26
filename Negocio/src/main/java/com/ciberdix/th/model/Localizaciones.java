package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class Localizaciones {
    private Integer idLocalizacion;
    private Integer idTipoDireccion;
    private String direccion;
    private String latitud;
    private String longitud;
    private String comoLlegar;
    private Boolean indicadorHabilitado;
    private Integer idDivisionPolitica;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTipoNomenclatura;
    private String principal;
    private String adicional;
    private String adicionalComplementaria;
    private ArrayList<LocalizacionesNomenclaturas> listLN;

    public Localizaciones() {
    }
    
    public Localizaciones(Integer idTipoDireccion, String direccion, String latitud, String longitud, String comoLlegar, Boolean indicadorHabilitado, Integer idDivisionPolitica, Integer auditoriaUsuario) {
        this.idTipoDireccion = idTipoDireccion;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.comoLlegar = comoLlegar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idDivisionPolitica = idDivisionPolitica;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }    

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public Integer getIdTipoDireccion() {
        return idTipoDireccion;
    }

    public void setIdTipoDireccion(Integer idTipoDireccion) {
        this.idTipoDireccion = idTipoDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getComoLlegar() {
        return comoLlegar;
    }

    public void setComoLlegar(String comoLlegar) {
        this.comoLlegar = comoLlegar;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

    public Integer getIdTipoNomenclatura() {
        return idTipoNomenclatura;
    }

    public void setIdTipoNomenclatura(Integer idTipoNomenclatura) {
        this.idTipoNomenclatura = idTipoNomenclatura;
    }

    public ArrayList<LocalizacionesNomenclaturas> getListLN() {
        return listLN;
    }

    public void setListLN(ArrayList<LocalizacionesNomenclaturas> listLN) {
        this.listLN = listLN;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getAdicionalComplementaria() {
        return adicionalComplementaria;
    }

    public void setAdicionalComplementaria(String adicionalComplementaria) {
        this.adicionalComplementaria = adicionalComplementaria;
    }
}
