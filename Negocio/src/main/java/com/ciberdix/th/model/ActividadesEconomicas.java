package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ActividadesEconomicas {
    private Integer idActividadEconomica;
    private Integer idActividadPadre;
    private Integer idActividadTipo;
    private String actividadEconomica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigoActividadEconomica;    

    public Integer getIdActividadEconomica() {
        return idActividadEconomica;
    }

    public void setIdActividadEconomica(Integer idActividadEconomica) {
        this.idActividadEconomica = idActividadEconomica;
    }

    public Integer getIdActividadPadre() {
        return idActividadPadre;
    }

    public void setIdActividadPadre(Integer idActividadPadre) {
        this.idActividadPadre = idActividadPadre;
    }

    public Integer getIdActividadTipo() {
        return idActividadTipo;
    }

    public void setIdActividadTipo(Integer idActividadTipo) {
        this.idActividadTipo = idActividadTipo;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
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

    public String getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(String codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }
}
