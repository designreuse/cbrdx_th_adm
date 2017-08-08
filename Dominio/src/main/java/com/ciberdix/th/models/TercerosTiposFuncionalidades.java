package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TercerosTiposDocumentosTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosTiposFuncionalidades {
    private Integer idTerceroTipoFuncionalidad;
    private Integer idTipoTercero;
    private String funcionalidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idFuncionalidad;

    public TercerosTiposFuncionalidades() {
    }

    public TercerosTiposFuncionalidades(Integer idTipoTercero, String funcionalidad, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idFuncionalidad) {
        this.idTipoTercero = idTipoTercero;
        this.funcionalidad = funcionalidad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idFuncionalidad = idFuncionalidad;
    }

    public TercerosTiposFuncionalidades(Integer idTerceroTipoFuncionalidad, Integer idTipoTercero, String funcionalidad, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idFuncionalidad) {
        this.idTerceroTipoFuncionalidad = idTerceroTipoFuncionalidad;
        this.idTipoTercero = idTipoTercero;
        this.funcionalidad = funcionalidad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idFuncionalidad = idFuncionalidad;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroTipoFuncionalidad", nullable = false)
    public Integer getIdTerceroTipoFuncionalidad() {
        return idTerceroTipoFuncionalidad;
    }

    public void setIdTerceroTipoFuncionalidad(Integer idTerceroTipoFuncionalidad) {
        this.idTerceroTipoFuncionalidad = idTerceroTipoFuncionalidad;
    }

    @Basic
    @Column(name = "IdTipoTercero", nullable = true)
    public Integer getIdTipoTercero() {
        return idTipoTercero;
    }

    public void setIdTipoTercero(Integer idTipoTercero) {
        this.idTipoTercero = idTipoTercero;
    }

    @Basic
    @Column(name = "Funcionalidad", nullable = true, length = 200)
    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
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

    @Basic
    @Column(name = "IdFuncionalidad", nullable = true)
    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosTiposFuncionalidades that = (TercerosTiposFuncionalidades) o;

        if (idTerceroTipoFuncionalidad != null ? !idTerceroTipoFuncionalidad.equals(that.idTerceroTipoFuncionalidad) : that.idTerceroTipoFuncionalidad != null)
            return false;
        if (idTipoTercero != null ? !idTipoTercero.equals(that.idTipoTercero) : that.idTipoTercero != null)
            return false;
        if (funcionalidad != null ? !funcionalidad.equals(that.funcionalidad) : that.funcionalidad != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroTipoFuncionalidad != null ? idTerceroTipoFuncionalidad.hashCode() : 0;
        result = 31 * result + (idTipoTercero != null ? idTipoTercero.hashCode() : 0);
        result = 31 * result + (funcionalidad != null ? funcionalidad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idFuncionalidad != null ? idFuncionalidad.hashCode() : 0);
        return result;
    }
}
