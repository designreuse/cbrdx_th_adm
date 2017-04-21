package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Areas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class AreasEntity {
    private Integer idArea;
    private Integer idCentroPoblado;
    private String area;
    private Integer tipoArea;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdArea", nullable = false)
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    @Basic
    @Column(name = "IdCentroPoblado", nullable = true)
    public Integer getIdCentroPoblado() {
        return idCentroPoblado;
    }

    public void setIdCentroPoblado(Integer idCentroPoblado) {
        this.idCentroPoblado = idCentroPoblado;
    }

    @Basic
    @Column(name = "Area", nullable = true, length = 64)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "TipoArea", nullable = true)
    public Integer getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(Integer tipoArea) {
        this.tipoArea = tipoArea;
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

        AreasEntity that = (AreasEntity) o;

        if (idArea != null ? !idArea.equals(that.idArea) : that.idArea != null) return false;
        if (idCentroPoblado != null ? !idCentroPoblado.equals(that.idCentroPoblado) : that.idCentroPoblado != null)
            return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (tipoArea != null ? !tipoArea.equals(that.tipoArea) : that.tipoArea != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArea != null ? idArea.hashCode() : 0;
        result = 31 * result + (idCentroPoblado != null ? idCentroPoblado.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (tipoArea != null ? tipoArea.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
