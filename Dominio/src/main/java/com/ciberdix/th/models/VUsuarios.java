package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_Usuarios", schema = "dbo", catalog = "CREZCAMOS")
public class VUsuarios {
    private Integer idUsuario;
    private String usuario;
    private Boolean indHab;
    private String documento;
    private String nombre;

    @Id
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "Usuario")
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "Ind_Hab")
    public Boolean getIndHab() {
        return indHab;
    }

    public void setIndHab(Boolean indHab) {
        this.indHab = indHab;
    }

    @Basic
    @Column(name = "Documento")
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VUsuarios vUsuarios = (VUsuarios) o;

        if (idUsuario != null ? !idUsuario.equals(vUsuarios.idUsuario) : vUsuarios.idUsuario != null) return false;
        if (usuario != null ? !usuario.equals(vUsuarios.usuario) : vUsuarios.usuario != null) return false;
        if (indHab != null ? !indHab.equals(vUsuarios.indHab) : vUsuarios.indHab != null) return false;
        if (documento != null ? !documento.equals(vUsuarios.documento) : vUsuarios.documento != null) return false;
        if (nombre != null ? !nombre.equals(vUsuarios.nombre) : vUsuarios.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario != null ? idUsuario.hashCode() : 0;
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (indHab != null ? indHab.hashCode() : 0);
        result = 31 * result + (documento != null ? documento.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
