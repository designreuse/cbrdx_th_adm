package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Sedes", schema = "crz_th", catalog = "CREZCAMOS")
public class SedesEntity {
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
    @Column(name = "IdSede", nullable = false)
    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    @Basic
    @Column(name = "IdEmpresa", nullable = true)
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Basic
    @Column(name = "Sede", nullable = true)
    public Long getSede() {
        return sede;
    }

    public void setSede(Long sede) {
        this.sede = sede;
    }

    @Basic
    @Column(name = "IdLocalizacion", nullable = true)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "Telefono", nullable = true)
    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Extension", nullable = true)
    public Long getExtension() {
        return extension;
    }

    public void setExtension(Long extension) {
        this.extension = extension;
    }

    @Basic
    @Column(name = "Celular", nullable = true)
    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "CorreoElectronico", nullable = true, length = 128)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

        SedesEntity that = (SedesEntity) o;

        if (idSede != null ? !idSede.equals(that.idSede) : that.idSede != null) return false;
        if (idEmpresa != null ? !idEmpresa.equals(that.idEmpresa) : that.idEmpresa != null) return false;
        if (sede != null ? !sede.equals(that.sede) : that.sede != null) return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
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
