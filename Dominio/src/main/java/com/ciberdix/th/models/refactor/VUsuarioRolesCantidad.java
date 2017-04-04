package com.ciberdix.th.models.refactor;

import javax.persistence.*;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/4/2017.
 */
@Entity
@Table(name = "V_UsuarioRolesCantidad", schema = "crz_th", catalog = "CREZCAMOS")
public class VUsuarioRolesCantidad {
    private String rol;
    private Integer cantidad;

    @Id
    @Column(name = "Rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "Cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VUsuarioRolesCantidad that = (VUsuarioRolesCantidad) o;

        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rol != null ? rol.hashCode() : 0;
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        return result;
    }
}
