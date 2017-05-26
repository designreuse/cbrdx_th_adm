package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@NamedStoredProcedureQuery(name = "ConProy", procedureName = "dbo.ConfirmarProyeccion", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "Output", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Usuario", type = Integer.class)})
@Table(name = "V_ProyeccionLaboral_Resumen", schema = "dbo", catalog = "CREZCAMOS")
public class VProyeccionLaboralResumen {
    private Long idProyeccionLaboralResumen;
    private Integer idArea;
    private String area;
    private String estado;
    private Integer cantidad;

    @Basic
    @Id
    @Column(name = "IdProyeccionLaboralResumen", nullable = true)
    public Long getIdProyeccionLaboralResumen() {
        return idProyeccionLaboralResumen;
    }

    public void setIdProyeccionLaboralResumen(Long idProyeccionLaboralResumen) {
        this.idProyeccionLaboralResumen = idProyeccionLaboralResumen;
    }

    @Basic
    @Column(name = "IdArea", nullable = false)
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    @Basic
    @Column(name = "Area", nullable = true, length = 50)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "Estado", nullable = false, length = 100)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

        VProyeccionLaboralResumen that = (VProyeccionLaboralResumen) o;

        if (idProyeccionLaboralResumen != null ? !idProyeccionLaboralResumen.equals(that.idProyeccionLaboralResumen) : that.idProyeccionLaboralResumen != null)
            return false;
        if (idArea != null ? !idArea.equals(that.idArea) : that.idArea != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyeccionLaboralResumen != null ? idProyeccionLaboralResumen.hashCode() : 0;
        result = 31 * result + (idArea != null ? idArea.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        return result;
    }
}
