package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@Table(name = "RolesFuncionalidadesControles", schema = "dbo", catalog = "CREZCAMOS")
public class RolesFuncionalidadesControles {
    private Integer idRolFuncionalidadControl;
    private Integer idRol;
    private Integer idFuncionalidadControl;
    private Boolean indicadorEditar;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RolesFuncionalidadesControles() {
    }

    public RolesFuncionalidadesControles(Integer idRol, Integer idFuncionalidadControl, Boolean indicadorEditar, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRol = idRol;
        this.idFuncionalidadControl = idFuncionalidadControl;
        this.indicadorEditar = indicadorEditar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public RolesFuncionalidadesControles(Integer idRolFuncionalidadControl, Integer idRol, Integer idFuncionalidadControl, Boolean indicadorEditar, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRolFuncionalidadControl = idRolFuncionalidadControl;
        this.idRol = idRol;
        this.idFuncionalidadControl = idFuncionalidadControl;
        this.indicadorEditar = indicadorEditar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRolFuncionalidadControl", nullable = false)
    public Integer getIdRolFuncionalidadControl() {
        return idRolFuncionalidadControl;
    }

    public void setIdRolFuncionalidadControl(Integer idRolFuncionalidadControl) {
        this.idRolFuncionalidadControl = idRolFuncionalidadControl;
    }

    @Basic
    @Column(name = "IdRol", nullable = true)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "IdFuncionalidadControl", nullable = true)
    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    @Basic
    @Column(name = "IndicadorEditar", nullable = true)
    public Boolean getIndicadorEditar() {
        return indicadorEditar;
    }

    public void setIndicadorEditar(Boolean indicadorEditar) {
        this.indicadorEditar = indicadorEditar;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesFuncionalidadesControles that = (RolesFuncionalidadesControles) o;

        if (idRolFuncionalidadControl != null ? !idRolFuncionalidadControl.equals(that.idRolFuncionalidadControl) : that.idRolFuncionalidadControl != null)
            return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idFuncionalidadControl != null ? !idFuncionalidadControl.equals(that.idFuncionalidadControl) : that.idFuncionalidadControl != null)
            return false;
        if (indicadorEditar != null ? !indicadorEditar.equals(that.indicadorEditar) : that.indicadorEditar != null)
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
        int result = idRolFuncionalidadControl != null ? idRolFuncionalidadControl.hashCode() : 0;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (idFuncionalidadControl != null ? idFuncionalidadControl.hashCode() : 0);
        result = 31 * result + (indicadorEditar != null ? indicadorEditar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
