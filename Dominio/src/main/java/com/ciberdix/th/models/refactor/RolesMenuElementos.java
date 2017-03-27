package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class RolesMenuElementos {
    private Integer idRolMenuElemento;
    private Integer idRol;
    private Integer idMenuElemento;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdRolMenuElemento")
    public Integer getIdRolMenuElemento() {
        return idRolMenuElemento;
    }

    public void setIdRolMenuElemento(Integer idRolMenuElemento) {
        this.idRolMenuElemento = idRolMenuElemento;
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
    @Column(name = "IdMenuElemento")
    public Integer getIdMenuElemento() {
        return idMenuElemento;
    }

    public void setIdMenuElemento(Integer idMenuElemento) {
        this.idMenuElemento = idMenuElemento;
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

    @Basic
    @Column(name = "IndicadorHabilitado")
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

        RolesMenuElementos that = (RolesMenuElementos) o;

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
