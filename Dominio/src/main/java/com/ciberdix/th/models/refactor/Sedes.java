package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Sedes {
    private Integer idSede;
    private Integer idEmpresa;
    private Long sede;
    private Integer idLocalizacion;
    private Long telefono;
    private Long extension;
    private Long celular;
    private String correoElectronico;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdSede")
    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    @Basic
    @Column(name = "IdEmpresa")
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Basic
    @Column(name = "Sede")
    public Long getSede() {
        return sede;
    }

    public void setSede(Long sede) {
        this.sede = sede;
    }

    @Basic
    @Column(name = "IdLocalizacion")
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "Telefono")
    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Extension")
    public Long getExtension() {
        return extension;
    }

    public void setExtension(Long extension) {
        this.extension = extension;
    }

    @Basic
    @Column(name = "Celular")
    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
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
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        Sedes sedes = (Sedes) o;

        if (idSede != null ? !idSede.equals(sedes.idSede) : sedes.idSede != null) return false;
        if (idEmpresa != null ? !idEmpresa.equals(sedes.idEmpresa) : sedes.idEmpresa != null) return false;
        if (sede != null ? !sede.equals(sedes.sede) : sedes.sede != null) return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(sedes.idLocalizacion) : sedes.idLocalizacion != null)
            return false;
        if (telefono != null ? !telefono.equals(sedes.telefono) : sedes.telefono != null) return false;
        if (extension != null ? !extension.equals(sedes.extension) : sedes.extension != null) return false;
        if (celular != null ? !celular.equals(sedes.celular) : sedes.celular != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(sedes.correoElectronico) : sedes.correoElectronico != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(sedes.indicadorHabilitado) : sedes.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(sedes.auditoriaUsuario) : sedes.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(sedes.auditoriaFecha) : sedes.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSede != null ? idSede.hashCode() : 0;
        result = 31 * result + (idEmpresa != null ? idEmpresa.hashCode() : 0);
        result = 31 * result + (sede != null ? sede.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
