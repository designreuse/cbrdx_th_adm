package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by Danny on 31/05/2017.
 */
@Entity
@Table(name = "V_CantidadPublicacion", schema = "dbo", catalog = "CREZCAMOS")
public class VCantidadPublicacion {
    private Integer idPublicacion;
    private Integer cantidad;

    @Id
    @Column(name = "IdPublicacion", nullable = false)
    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    @Basic
    @Column(name = "Cantidad", nullable = true)
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

        VCantidadPublicacion that = (VCantidadPublicacion) o;

        if (idPublicacion != null ? !idPublicacion.equals(that.idPublicacion) : that.idPublicacion != null)
            return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPublicacion != null ? idPublicacion.hashCode() : 0;
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        return result;
    }
}
