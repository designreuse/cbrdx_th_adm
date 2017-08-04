package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class TercerosTiposFuncionalidadesListas {
    private Integer idTerceroTipoFuncionalidadListas;
    private Integer idTerceroTipoFuncionalidad;
    private Integer idSeccion;
    private Integer idControl;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroTipoFuncionalidadListas", nullable = false)
    public Integer getIdTerceroTipoFuncionalidadListas() {
        return idTerceroTipoFuncionalidadListas;
    }

    public void setIdTerceroTipoFuncionalidadListas(Integer idTerceroTipoFuncionalidadListas) {
        this.idTerceroTipoFuncionalidadListas = idTerceroTipoFuncionalidadListas;
    }

    @Basic
    @Column(name = "IdTerceroTipoFuncionalidad", nullable = true)
    public Integer getIdTerceroTipoFuncionalidad() {
        return idTerceroTipoFuncionalidad;
    }

    public void setIdTerceroTipoFuncionalidad(Integer idTerceroTipoFuncionalidad) {
        this.idTerceroTipoFuncionalidad = idTerceroTipoFuncionalidad;
    }

    @Basic
    @Column(name = "IdSeccion", nullable = true)
    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    @Basic
    @Column(name = "IdControl", nullable = true)
    public Integer getIdControl() {
        return idControl;
    }

    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }

    @Basic
    @Column(name = "IndicadorObligatorio", nullable = true)
    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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

        TercerosTiposFuncionalidadesListas that = (TercerosTiposFuncionalidadesListas) o;

        if (idTerceroTipoFuncionalidadListas != null ? !idTerceroTipoFuncionalidadListas.equals(that.idTerceroTipoFuncionalidadListas) : that.idTerceroTipoFuncionalidadListas != null)
            return false;
        if (idTerceroTipoFuncionalidad != null ? !idTerceroTipoFuncionalidad.equals(that.idTerceroTipoFuncionalidad) : that.idTerceroTipoFuncionalidad != null)
            return false;
        if (idSeccion != null ? !idSeccion.equals(that.idSeccion) : that.idSeccion != null) return false;
        if (idControl != null ? !idControl.equals(that.idControl) : that.idControl != null) return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
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
        int result = idTerceroTipoFuncionalidadListas != null ? idTerceroTipoFuncionalidadListas.hashCode() : 0;
        result = 31 * result + (idTerceroTipoFuncionalidad != null ? idTerceroTipoFuncionalidad.hashCode() : 0);
        result = 31 * result + (idSeccion != null ? idSeccion.hashCode() : 0);
        result = 31 * result + (idControl != null ? idControl.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
