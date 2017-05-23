package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class TercerosExperienciasLaborales {
    private Integer idTerceroExperienciaLaboral;
    private Long idTercero;
    private String empresa;
    private String telefonoEmpresa;
    private Integer idSectorEmpresa;
    private Integer idSubSectorEmpresa;
    private String cargo;
    private Integer idNivelCargo;
    private String areaCargo;
    private String jefeInmediato;
    private String tiempoExperiencia;
    private Integer idCiudad;
    private Boolean indicadorActualmente;
    private Date fechaIngresa;
    private Date fechaTermina;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroExperienciaLaboral() {
        return idTerceroExperienciaLaboral;
    }

    public void setIdTerceroExperienciaLaboral(Integer idTerceroExperienciaLaboral) {
        this.idTerceroExperienciaLaboral = idTerceroExperienciaLaboral;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Integer getIdSectorEmpresa() {
        return idSectorEmpresa;
    }

    public void setIdSectorEmpresa(Integer idSectorEmpresa) {
        this.idSectorEmpresa = idSectorEmpresa;
    }

    public Integer getIdSubSectorEmpresa() {
        return idSubSectorEmpresa;
    }

    public void setIdSubSectorEmpresa(Integer idSubSectorEmpresa) {
        this.idSubSectorEmpresa = idSubSectorEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdNivelCargo() {
        return idNivelCargo;
    }

    public void setIdNivelCargo(Integer idNivelCargo) {
        this.idNivelCargo = idNivelCargo;
    }

    public String getAreaCargo() {
        return areaCargo;
    }

    public void setAreaCargo(String areaCargo) {
        this.areaCargo = areaCargo;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Boolean getIndicadorActualmente() {
        return indicadorActualmente;
    }

    public void setIndicadorActualmente(Boolean indicadorActualmente) {
        this.indicadorActualmente = indicadorActualmente;
    }

    public Date getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    public Date getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Date fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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
