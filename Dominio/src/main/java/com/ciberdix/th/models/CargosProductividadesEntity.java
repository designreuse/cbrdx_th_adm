package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosProductividades", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosProductividadesEntity {
    private Integer idCargoProductividad;
    private Integer idCargo;
    private Integer idProductividadItem;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoProductividad", nullable = false)
    public Integer getIdCargoProductividad() {
        return idCargoProductividad;
    }

    public void setIdCargoProductividad(Integer idCargoProductividad) {
        this.idCargoProductividad = idCargoProductividad;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdProductividadItem", nullable = true)
    public Integer getIdProductividadItem() {
        return idProductividadItem;
    }

    public void setIdProductividadItem(Integer idProductividadItem) {
        this.idProductividadItem = idProductividadItem;
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

        CargosProductividadesEntity that = (CargosProductividadesEntity) o;

        if (idCargoProductividad != null ? !idCargoProductividad.equals(that.idCargoProductividad) : that.idCargoProductividad != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idProductividadItem != null ? !idProductividadItem.equals(that.idProductividadItem) : that.idProductividadItem != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoProductividad != null ? idCargoProductividad.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idProductividadItem != null ? idProductividadItem.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
