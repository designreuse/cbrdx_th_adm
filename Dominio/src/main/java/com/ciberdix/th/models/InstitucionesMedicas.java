package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 16/06/2017.
 */
@Entity
@Table(name = "InstitucionesMedicas", schema = "dbo", catalog = "CREZCAMOS")
public class InstitucionesMedicas {
    private Integer idInstitucionMedica;
    private String institucionMedica;
    private String representanteLegal;
    private Integer idLocalizacion;
    private String correoElectronico;
    private String telefonoContacto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public InstitucionesMedicas() {
    }

    public InstitucionesMedicas(String institucionMedica, String representanteLegal, Integer idLocalizacion, String correoElectronico, String telefonoContacto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.institucionMedica = institucionMedica;
        this.representanteLegal = representanteLegal;
        this.idLocalizacion = idLocalizacion;
        this.correoElectronico = correoElectronico;
        this.telefonoContacto = telefonoContacto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public InstitucionesMedicas(Integer idInstitucionMedica, String institucionMedica, String representanteLegal, Integer idLocalizacion, String correoElectronico, String telefonoContacto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idInstitucionMedica = idInstitucionMedica;
        this.institucionMedica = institucionMedica;
        this.representanteLegal = representanteLegal;
        this.idLocalizacion = idLocalizacion;
        this.correoElectronico = correoElectronico;
        this.telefonoContacto = telefonoContacto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdInstitucionMedica", nullable = false)
    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    @Basic
    @Column(name = "InstitucionMedica", nullable = true, length = 50)
    public String getInstitucionMedica() {
        return institucionMedica;
    }

    public void setInstitucionMedica(String institucionMedica) {
        this.institucionMedica = institucionMedica;
    }

    @Basic
    @Column(name = "RepresentanteLegal", nullable = true, length = 128)
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
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
    @Column(name = "CorreoElectronico", nullable = true, length = 128)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "TelefonoContacto", nullable = true, length = 25)
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
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

        InstitucionesMedicas that = (InstitucionesMedicas) o;

        if (idInstitucionMedica != null ? !idInstitucionMedica.equals(that.idInstitucionMedica) : that.idInstitucionMedica != null)
            return false;
        if (institucionMedica != null ? !institucionMedica.equals(that.institucionMedica) : that.institucionMedica != null)
            return false;
        if (representanteLegal != null ? !representanteLegal.equals(that.representanteLegal) : that.representanteLegal != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (telefonoContacto != null ? !telefonoContacto.equals(that.telefonoContacto) : that.telefonoContacto != null)
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
        int result = idInstitucionMedica != null ? idInstitucionMedica.hashCode() : 0;
        result = 31 * result + (institucionMedica != null ? institucionMedica.hashCode() : 0);
        result = 31 * result + (representanteLegal != null ? representanteLegal.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (telefonoContacto != null ? telefonoContacto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
