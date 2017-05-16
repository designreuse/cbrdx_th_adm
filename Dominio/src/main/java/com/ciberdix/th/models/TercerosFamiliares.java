package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosFamiliares", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosFamiliares {
    private Integer idTerceroFamiliar;
    private Long idTercero;
    private Long idFamiliar;
    private Integer idParentesco;
    private Integer idConvivencia;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idLocalizacion;
    private String direccion;

    public TercerosFamiliares() {
    }

    public TercerosFamiliares(Long idTercero, Long idFamiliar, Integer idParentesco, Integer idConvivencia, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idLocalizacion) {
        this.idTercero = idTercero;
        this.idFamiliar = idFamiliar;
        this.idParentesco = idParentesco;
        this.idConvivencia = idConvivencia;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.idLocalizacion = idLocalizacion;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosFamiliares(Integer idTerceroFamiliar, Long idTercero, Long idFamiliar, Integer idParentesco, Integer idConvivencia, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idLocalizacion) {
        this.idTerceroFamiliar = idTerceroFamiliar;
        this.idTercero = idTercero;
        this.idFamiliar = idFamiliar;
        this.idParentesco = idParentesco;
        this.idConvivencia = idConvivencia;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.idLocalizacion = idLocalizacion;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroFamiliar")
    public Integer getIdTerceroFamiliar() {
        return idTerceroFamiliar;
    }

    public void setIdTerceroFamiliar(Integer idTerceroFamiliar) {
        this.idTerceroFamiliar = idTerceroFamiliar;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdFamiliar")
    public Long getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(Long idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    @Basic
    @Column(name = "IdParentesco")
    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    @Basic
    @Column(name = "IdConvivencia")
    public Integer getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(Integer idConvivencia) {
        this.idConvivencia = idConvivencia;
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

        TercerosFamiliares that = (TercerosFamiliares) o;

        if (idTerceroFamiliar != null ? !idTerceroFamiliar.equals(that.idTerceroFamiliar) : that.idTerceroFamiliar != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idFamiliar != null ? !idFamiliar.equals(that.idFamiliar) : that.idFamiliar != null) return false;
        if (idParentesco != null ? !idParentesco.equals(that.idParentesco) : that.idParentesco != null) return false;
        if (idConvivencia != null ? !idConvivencia.equals(that.idConvivencia) : that.idConvivencia != null)
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
        int result = idTerceroFamiliar != null ? idTerceroFamiliar.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idFamiliar != null ? idFamiliar.hashCode() : 0);
        result = 31 * result + (idParentesco != null ? idParentesco.hashCode() : 0);
        result = 31 * result + (idConvivencia != null ? idConvivencia.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
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
    @Column(name = "Direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
