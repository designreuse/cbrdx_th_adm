package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "RolesMenuElementosAcciones", schema = "crz_th", catalog = "CREZCAMOS")
public class RolesMenuElementosAccionesEntity {
    private Integer idRolMenuElementoAccion;
    private Integer idRolMenuElemento;
    private Integer idListaItem;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRolMenuElementoAccion", nullable = false)
    public Integer getIdRolMenuElementoAccion() {
        return idRolMenuElementoAccion;
    }

    public void setIdRolMenuElementoAccion(Integer idRolMenuElementoAccion) {
        this.idRolMenuElementoAccion = idRolMenuElementoAccion;
    }

    @Basic
    @Column(name = "IdRolMenuElemento", nullable = false)
    public Integer getIdRolMenuElemento() {
        return idRolMenuElemento;
    }

    public void setIdRolMenuElemento(Integer idRolMenuElemento) {
        this.idRolMenuElemento = idRolMenuElemento;
    }

    @Basic
    @Column(name = "IdListaItem", nullable = false)
    public Integer getIdListaItem() {
        return idListaItem;
    }

    public void setIdListaItem(Integer idListaItem) {
        this.idListaItem = idListaItem;
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

        RolesMenuElementosAccionesEntity that = (RolesMenuElementosAccionesEntity) o;

        if (idRolMenuElementoAccion != null ? !idRolMenuElementoAccion.equals(that.idRolMenuElementoAccion) : that.idRolMenuElementoAccion != null)
            return false;
        if (idRolMenuElemento != null ? !idRolMenuElemento.equals(that.idRolMenuElemento) : that.idRolMenuElemento != null)
            return false;
        if (idListaItem != null ? !idListaItem.equals(that.idListaItem) : that.idListaItem != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolMenuElementoAccion != null ? idRolMenuElementoAccion.hashCode() : 0;
        result = 31 * result + (idRolMenuElemento != null ? idRolMenuElemento.hashCode() : 0);
        result = 31 * result + (idListaItem != null ? idListaItem.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
