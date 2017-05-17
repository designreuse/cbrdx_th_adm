package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by Danny on 17/05/2017.
 */
@Entity
@Table(name = "V_TercerosCargosAreasFisicas", schema = "crz_th", catalog = "CREZCAMOS")
public class VTercerosCargosAreasFisicas {
    private Long idTercero;
    private String nombreCompleto;
    private String cargo;
    private String area;
    private String direccionGeneral;
    private String correoTercero;
    private String correoUsuario;

    @Id
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "NombreCompleto", nullable = false, length = 259)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    @Column(name = "DireccionGeneral", nullable = true, length = 50)
    public String getDireccionGeneral() {
        return direccionGeneral;
    }

    public void setDireccionGeneral(String direccionGeneral) {
        this.direccionGeneral = direccionGeneral;
    }

    @Basic
    @Column(name = "CorreoTercero", nullable = true, length = 128)
    public String getCorreoTercero() {
        return correoTercero;
    }

    public void setCorreoTercero(String correoTercero) {
        this.correoTercero = correoTercero;
    }

    @Basic
    @Column(name = "CorreoUsuario", nullable = true, length = 64)
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosCargosAreasFisicas that = (VTercerosCargosAreasFisicas) o;

        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (nombreCompleto != null ? !nombreCompleto.equals(that.nombreCompleto) : that.nombreCompleto != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (direccionGeneral != null ? !direccionGeneral.equals(that.direccionGeneral) : that.direccionGeneral != null)
            return false;
        if (correoTercero != null ? !correoTercero.equals(that.correoTercero) : that.correoTercero != null)
            return false;
        if (correoUsuario != null ? !correoUsuario.equals(that.correoUsuario) : that.correoUsuario != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTercero != null ? idTercero.hashCode() : 0;
        result = 31 * result + (nombreCompleto != null ? nombreCompleto.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (direccionGeneral != null ? direccionGeneral.hashCode() : 0);
        result = 31 * result + (correoTercero != null ? correoTercero.hashCode() : 0);
        result = 31 * result + (correoUsuario != null ? correoUsuario.hashCode() : 0);
        return result;
    }
}
