package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosTiposClasificaciones", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosTiposClasificaciones {
    private Integer idTerceroTipoClasificacion;
    private String codigo;
    private String terceroTipoClasificacion;
    private Integer idTerceroTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosTiposClasificaciones() {
    }

    public TercerosTiposClasificaciones(String codigo, String terceroTipoClasificacion, Integer idTerceroTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.terceroTipoClasificacion = terceroTipoClasificacion;
        this.idTerceroTipo = idTerceroTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosTiposClasificaciones(Integer idTerceroTipoClasificacion, String codigo, String terceroTipoClasificacion, Integer idTerceroTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroTipoClasificacion = idTerceroTipoClasificacion;
        this.codigo = codigo;
        this.terceroTipoClasificacion = terceroTipoClasificacion;
        this.idTerceroTipo = idTerceroTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroTipoClasificacion", nullable = false)
    public Integer getIdTerceroTipoClasificacion() {
        return idTerceroTipoClasificacion;
    }

    public void setIdTerceroTipoClasificacion(Integer idTerceroTipoClasificacion) {
        this.idTerceroTipoClasificacion = idTerceroTipoClasificacion;
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
    @Column(name = "TerceroTipoClasificacion", nullable = true, length = 200)
    public String getTerceroTipoClasificacion() {
        return terceroTipoClasificacion;
    }

    public void setTerceroTipoClasificacion(String terceroTipoClasificacion) {
        this.terceroTipoClasificacion = terceroTipoClasificacion;
    }

    @Basic
    @Column(name = "IdTerceroTipo", nullable = true)
    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
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

        TercerosTiposClasificaciones that = (TercerosTiposClasificaciones) o;

        if (idTerceroTipoClasificacion != null ? !idTerceroTipoClasificacion.equals(that.idTerceroTipoClasificacion) : that.idTerceroTipoClasificacion != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (terceroTipoClasificacion != null ? !terceroTipoClasificacion.equals(that.terceroTipoClasificacion) : that.terceroTipoClasificacion != null)
            return false;
        if (idTerceroTipo != null ? !idTerceroTipo.equals(that.idTerceroTipo) : that.idTerceroTipo != null)
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
        int result = idTerceroTipoClasificacion != null ? idTerceroTipoClasificacion.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (terceroTipoClasificacion != null ? terceroTipoClasificacion.hashCode() : 0);
        result = 31 * result + (idTerceroTipo != null ? idTerceroTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
