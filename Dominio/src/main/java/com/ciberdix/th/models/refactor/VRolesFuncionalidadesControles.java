package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 24/04/17.
 */
@Entity
@Table(name = "V_RolesFuncionalidadesControles", schema = "crz_th", catalog = "CREZCAMOS")
public class VRolesFuncionalidadesControles {
    private Integer idRolFuncionalidadControl;
    private Integer idRol;
    private String rol;
    private Integer idFuncionalidadControl;
    private String control;
    private Boolean indicadorSeccion;
    private Boolean indicadorEditar;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRolFuncionalidadControl")
    public Integer getIdRolFuncionalidadControl() {
        return idRolFuncionalidadControl;
    }

    public void setIdRolFuncionalidadControl(Integer idRolFuncionalidadControl) {
        this.idRolFuncionalidadControl = idRolFuncionalidadControl;
    }

    @Basic
    @Column(name = "IdRol")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "Rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "IdFuncionalidadControl")
    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    @Basic
    @Column(name = "Control")
    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    @Basic
    @Column(name = "IndicadorSeccion")
    public Boolean getIndicadorSeccion() {
        return indicadorSeccion;
    }

    public void setIndicadorSeccion(Boolean indicadorSeccion) {
        this.indicadorSeccion = indicadorSeccion;
    }

    @Basic
    @Column(name = "IndicadorEditar")
    public Boolean getIndicadorEditar() {
        return indicadorEditar;
    }

    public void setIndicadorEditar(Boolean indicadorEditar) {
        this.indicadorEditar = indicadorEditar;
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

        VRolesFuncionalidadesControles that = (VRolesFuncionalidadesControles) o;

        if (idRolFuncionalidadControl != null ? !idRolFuncionalidadControl.equals(that.idRolFuncionalidadControl) : that.idRolFuncionalidadControl != null)
            return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (idFuncionalidadControl != null ? !idFuncionalidadControl.equals(that.idFuncionalidadControl) : that.idFuncionalidadControl != null)
            return false;
        if (control != null ? !control.equals(that.control) : that.control != null) return false;
        if (indicadorSeccion != null ? !indicadorSeccion.equals(that.indicadorSeccion) : that.indicadorSeccion != null)
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
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (idFuncionalidadControl != null ? idFuncionalidadControl.hashCode() : 0);
        result = 31 * result + (control != null ? control.hashCode() : 0);
        result = 31 * result + (indicadorSeccion != null ? indicadorSeccion.hashCode() : 0);
        result = 31 * result + (indicadorEditar != null ? indicadorEditar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
