package com.ciberdix.th.models.refactor;

import javax.persistence.*;

/**
 * Created by robertochajin on 24/04/17.
 */
@Entity
@Table(name = "V_PolicyRules", schema = "crz_th", catalog = "CREZCAMOS")
public class VPolicyRules {
    private Integer idFuncionalidad;
    private String rol;

    @Id
    @Column(name = "IdFuncionalidad")
    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    @Basic
    @Column(name = "Rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VPolicyRules that = (VPolicyRules) o;

        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFuncionalidad != null ? idFuncionalidad.hashCode() : 0;
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        return result;
    }
}
