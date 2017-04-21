package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "RolesMenuElementos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class RolesMenuElementosEntity {
    private Integer idRolMenuElemento;
    private Integer idRol;
    private Integer idMenuElemento;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdRolMenuElemento", nullable = false)
    public Integer getIdRolMenuElemento() {
        return idRolMenuElemento;
    }

    public void setIdRolMenuElemento(Integer idRolMenuElemento) {
        this.idRolMenuElemento = idRolMenuElemento;
    }

    @Basic
    @Column(name = "IdRol", nullable = false)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "IdMenuElemento", nullable = false)
    public Integer getIdMenuElemento() {
        return idMenuElemento;
    }

    public void setIdMenuElemento(Integer idMenuElemento) {
        this.idMenuElemento = idMenuElemento;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesMenuElementosEntity that = (RolesMenuElementosEntity) o;

        if (idRolMenuElemento != null ? !idRolMenuElemento.equals(that.idRolMenuElemento) : that.idRolMenuElemento != null)
            return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idMenuElemento != null ? !idMenuElemento.equals(that.idMenuElemento) : that.idMenuElemento != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolMenuElemento != null ? idRolMenuElemento.hashCode() : 0;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (idMenuElemento != null ? idMenuElemento.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
