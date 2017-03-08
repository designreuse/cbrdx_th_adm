package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "TercerosExperienciasLaborales", schema = "crz_th", catalog = "CREZCAMOS")
public class ExperienciaEntity {
    private int idTerceroExperienciaLaboral;
    private int idTercero;
    private String empresa;
    private String telefonoEmpresa;
    private int idSectorEmpresa;
    private int idSubSectorEmpresa;
    private String cargo;
    private int idNivelCargo;
    private String areaCargo;
    private String jefeInmediato;
    private String tiempoExperiencia;
    private int idPais;
    private int idDepartamento;
    private int idCiudad;
    private boolean indicadorActualmente;
    private Timestamp fechaIngresa;
    private Timestamp fechaTermina;
    private int idAdjunto;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ExperienciaEntity(int idTerceroExperienciaLaboral, int idTercero, String empresa, String telefonoEmpresa, int idSectorEmpresa, int idSubSectorEmpresa, String cargo, int idNivelCargo, String areaCargo, String jefeInmediato, String tiempoExperiencia, int idPais, int idDepartamento, int idCiudad, boolean indicadorActualmente, Timestamp fechaIngresa, Timestamp fechaTermina, int idAdjunto, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTerceroExperienciaLaboral = idTerceroExperienciaLaboral;
        this.idTercero = idTercero;
        this.empresa = empresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.idSectorEmpresa = idSectorEmpresa;
        this.idSubSectorEmpresa = idSubSectorEmpresa;
        this.cargo = cargo;
        this.idNivelCargo = idNivelCargo;
        this.areaCargo = areaCargo;
        this.jefeInmediato = jefeInmediato;
        this.tiempoExperiencia = tiempoExperiencia;
        this.idPais = idPais;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
        this.indicadorActualmente = indicadorActualmente;
        this.fechaIngresa = fechaIngresa;
        this.fechaTermina = fechaTermina;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public ExperienciaEntity() {
    }

    @Id
    @Column(name = "IdTerceroExperienciaLaboral", nullable = false)
    public int getIdTerceroExperienciaLaboral() {
        return idTerceroExperienciaLaboral;
    }

    public void setIdTerceroExperienciaLaboral(int idTerceroExperienciaLaboral) {
        this.idTerceroExperienciaLaboral = idTerceroExperienciaLaboral;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }
    @Basic
    @Column(name = "Empresa", nullable = true)
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    @Basic
    @Column(name = "TelefonoEmpresa", nullable = true)
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }
    @Basic
    @Column(name = "IdSectorEmpresa", nullable = true)
    public int getIdSectorEmpresa() {
        return idSectorEmpresa;
    }

    public void setIdSectorEmpresa(int idSectorEmpresa) {
        this.idSectorEmpresa = idSectorEmpresa;
    }
    @Basic
    @Column(name = "IdSubSectorEmpresa", nullable = true)
    public int getIdSubSectorEmpresa() {
        return idSubSectorEmpresa;
    }

    public void setIdSubSectorEmpresa(int idSubSectorEmpresa) {
        this.idSubSectorEmpresa = idSubSectorEmpresa;
    }
    @Basic
    @Column(name = "Cargo", nullable = true)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Basic
    @Column(name = "IdNivelCargo", nullable = true)
    public int getIdNivelCargo() {
        return idNivelCargo;
    }

    public void setIdNivelCargo(int idNivelCargo) {
        this.idNivelCargo = idNivelCargo;
    }
    @Basic
    @Column(name = "AreaCargo", nullable = true)
    public String getAreaCargo() {
        return areaCargo;
    }

    public void setAreaCargo(String areaCargo) {
        this.areaCargo = areaCargo;
    }
    @Basic
    @Column(name = "JefeInmediato", nullable = true)
    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }
    @Basic
    @Column(name = "TiempoExperiencia", nullable = true)
    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }
    @Basic
    @Column(name = "IdPais", nullable = true)
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    @Basic
    @Column(name = "IdDepartamento", nullable = true)
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    @Basic
    @Column(name = "IdCiudad", nullable = true)
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    @Basic
    @Column(name = "IndicadorActualmente", nullable = true)
    public boolean isIndicadorActualmente() {
        return indicadorActualmente;
    }

    public void setIndicadorActualmente(boolean indicadorActualmente) {
        this.indicadorActualmente = indicadorActualmente;
    }
    @Basic
    @Column(name = "FechaIngresa", nullable = true)
    public Timestamp getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Timestamp fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }
    @Basic
    @Column(name = "FechaTermina", nullable = true)
    public Timestamp getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Timestamp fechaTermina) {
        this.fechaTermina = fechaTermina;
    }
    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public int getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(int idAdjunto) {
        this.idAdjunto = idAdjunto;
    }
    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }
    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
