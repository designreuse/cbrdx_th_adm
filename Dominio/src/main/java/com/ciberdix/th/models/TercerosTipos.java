package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosTipos", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosTipos {
    private Integer idTerceroTipo;
    private String codigo;
    private String terceroTipo;
    private Boolean indicadorRequiereClasificacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosTipos() {
    }

    public TercerosTipos(String codigo, String terceroTipo, Boolean indicadorRequiereClasificacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.terceroTipo = terceroTipo;
        this.indicadorRequiereClasificacion = indicadorRequiereClasificacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosTipos(Integer idTerceroTipo, String codigo, String terceroTipo, Boolean indicadorRequiereClasificacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroTipo = idTerceroTipo;
        this.codigo = codigo;
        this.terceroTipo = terceroTipo;
        this.indicadorRequiereClasificacion = indicadorRequiereClasificacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroTipo", nullable = false)
    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 10)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "TerceroTipo", nullable = true, length = 200)
    public String getTerceroTipo() {
        return terceroTipo;
    }

    public void setTerceroTipo(String terceroTipo) {
        this.terceroTipo = terceroTipo;
    }

    @Basic
    @Column(name = "IndicadorRequiereClasificacion", nullable = true)
    public Boolean getIndicadorRequiereClasificacion() {
        return indicadorRequiereClasificacion;
    }

    public void setIndicadorRequiereClasificacion(Boolean indicadorRequiereClasificacion) {
        this.indicadorRequiereClasificacion = indicadorRequiereClasificacion;
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

        TercerosTipos that = (TercerosTipos) o;

        if (idTerceroTipo != null ? !idTerceroTipo.equals(that.idTerceroTipo) : that.idTerceroTipo != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (terceroTipo != null ? !terceroTipo.equals(that.terceroTipo) : that.terceroTipo != null) return false;
        if (indicadorRequiereClasificacion != null ? !indicadorRequiereClasificacion.equals(that.indicadorRequiereClasificacion) : that.indicadorRequiereClasificacion != null)
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
        int result = idTerceroTipo != null ? idTerceroTipo.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (terceroTipo != null ? terceroTipo.hashCode() : 0);
        result = 31 * result + (indicadorRequiereClasificacion != null ? indicadorRequiereClasificacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
