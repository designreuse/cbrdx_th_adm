package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosExperienciasLaborales", schema = "dbo", catalog = "CREZCAMOS")
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
    public TercerosExperienciasLaborales() {
    }
    public TercerosExperienciasLaborales(Long idTercero, String empresa, String telefonoEmpresa, Integer idSectorEmpresa, Integer idSubSectorEmpresa, String cargo, Integer idNivelCargo, String areaCargo, String jefeInmediato, String tiempoExperiencia, Integer idCiudad, Boolean indicadorActualmente, Date fechaIngresa, Date fechaTermina, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
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
        this.idCiudad = idCiudad;
        this.indicadorActualmente = indicadorActualmente;
        this.fechaIngresa = fechaIngresa!=null?new Date(fechaIngresa.getTime()):null;
        this.fechaTermina = fechaTermina!=null?new Date(fechaTermina.getTime()):null;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosExperienciasLaborales(Integer idTerceroExperienciaLaboral, Long idTercero, String empresa, String telefonoEmpresa, Integer idSectorEmpresa, Integer idSubSectorEmpresa, String cargo, Integer idNivelCargo, String areaCargo, String jefeInmediato, String tiempoExperiencia, Integer idCiudad, Boolean indicadorActualmente, Date fechaIngresa, Date fechaTermina, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
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
        this.idCiudad = idCiudad;
        this.indicadorActualmente = indicadorActualmente;
        this.fechaIngresa = fechaIngresa!=null?new Date(fechaIngresa.getTime()):null;
        this.fechaTermina = fechaTermina!=null?new Date(fechaTermina.getTime()):null;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroExperienciaLaboral", nullable = false)
    public Integer getIdTerceroExperienciaLaboral() {
        return idTerceroExperienciaLaboral;
    }

    public void setIdTerceroExperienciaLaboral(Integer idTerceroExperienciaLaboral) {
        this.idTerceroExperienciaLaboral = idTerceroExperienciaLaboral;
    }

    @Basic
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "Empresa", nullable = false, length = 100)
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "TelefonoEmpresa", nullable = false, length = 100)
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    @Basic
    @Column(name = "IdSectorEmpresa", nullable = false)
    public Integer getIdSectorEmpresa() {
        return idSectorEmpresa;
    }

    public void setIdSectorEmpresa(Integer idSectorEmpresa) {
        this.idSectorEmpresa = idSectorEmpresa;
    }

    @Basic
    @Column(name = "IdSubSectorEmpresa", nullable = false)
    public Integer getIdSubSectorEmpresa() {
        return idSubSectorEmpresa;
    }

    public void setIdSubSectorEmpresa(Integer idSubSectorEmpresa) {
        this.idSubSectorEmpresa = idSubSectorEmpresa;
    }

    @Basic
    @Column(name = "Cargo", nullable = false, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdNivelCargo", nullable = false)
    public Integer getIdNivelCargo() {
        return idNivelCargo;
    }

    public void setIdNivelCargo(Integer idNivelCargo) {
        this.idNivelCargo = idNivelCargo;
    }

    @Basic
    @Column(name = "AreaCargo", nullable = false, length = 100)
    public String getAreaCargo() {
        return areaCargo;
    }

    public void setAreaCargo(String areaCargo) {
        this.areaCargo = areaCargo;
    }

    @Basic
    @Column(name = "JefeInmediato", nullable = false, length = 100)
    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    @Basic
    @Column(name = "TiempoExperiencia", nullable = false, length = 100)
    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    @Basic
    @Column(name = "IdCiudad", nullable = false)
    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Basic
    @Column(name = "IndicadorActualmente", nullable = false)
    public Boolean getIndicadorActualmente() {
        return indicadorActualmente;
    }

    public void setIndicadorActualmente(Boolean indicadorActualmente) {
        this.indicadorActualmente = indicadorActualmente;
    }

    @Basic
    @Column(name = "FechaIngresa", nullable = false)
    public Date getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    @Basic
    @Column(name = "FechaTermina", nullable = true)
    public Date getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Date fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosExperienciasLaborales that = (TercerosExperienciasLaborales) o;

        if (idTerceroExperienciaLaboral != null ? !idTerceroExperienciaLaboral.equals(that.idTerceroExperienciaLaboral) : that.idTerceroExperienciaLaboral != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (empresa != null ? !empresa.equals(that.empresa) : that.empresa != null) return false;
        if (telefonoEmpresa != null ? !telefonoEmpresa.equals(that.telefonoEmpresa) : that.telefonoEmpresa != null)
            return false;
        if (idSectorEmpresa != null ? !idSectorEmpresa.equals(that.idSectorEmpresa) : that.idSectorEmpresa != null)
            return false;
        if (idSubSectorEmpresa != null ? !idSubSectorEmpresa.equals(that.idSubSectorEmpresa) : that.idSubSectorEmpresa != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idNivelCargo != null ? !idNivelCargo.equals(that.idNivelCargo) : that.idNivelCargo != null) return false;
        if (areaCargo != null ? !areaCargo.equals(that.areaCargo) : that.areaCargo != null) return false;
        if (jefeInmediato != null ? !jefeInmediato.equals(that.jefeInmediato) : that.jefeInmediato != null)
            return false;
        if (tiempoExperiencia != null ? !tiempoExperiencia.equals(that.tiempoExperiencia) : that.tiempoExperiencia != null)
            return false;
        if (idCiudad != null ? !idCiudad.equals(that.idCiudad) : that.idCiudad != null) return false;
        if (indicadorActualmente != null ? !indicadorActualmente.equals(that.indicadorActualmente) : that.indicadorActualmente != null)
            return false;
        if (fechaIngresa != null ? !fechaIngresa.equals(that.fechaIngresa) : that.fechaIngresa != null) return false;
        if (fechaTermina != null ? !fechaTermina.equals(that.fechaTermina) : that.fechaTermina != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroExperienciaLaboral != null ? idTerceroExperienciaLaboral.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (empresa != null ? empresa.hashCode() : 0);
        result = 31 * result + (telefonoEmpresa != null ? telefonoEmpresa.hashCode() : 0);
        result = 31 * result + (idSectorEmpresa != null ? idSectorEmpresa.hashCode() : 0);
        result = 31 * result + (idSubSectorEmpresa != null ? idSubSectorEmpresa.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idNivelCargo != null ? idNivelCargo.hashCode() : 0);
        result = 31 * result + (areaCargo != null ? areaCargo.hashCode() : 0);
        result = 31 * result + (jefeInmediato != null ? jefeInmediato.hashCode() : 0);
        result = 31 * result + (tiempoExperiencia != null ? tiempoExperiencia.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (indicadorActualmente != null ? indicadorActualmente.hashCode() : 0);
        result = 31 * result + (fechaIngresa != null ? fechaIngresa.hashCode() : 0);
        result = 31 * result + (fechaTermina != null ? fechaTermina.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
