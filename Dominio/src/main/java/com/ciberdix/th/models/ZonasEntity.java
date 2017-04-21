package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Zonas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ZonasEntity {
    private Integer idZona;
    private Integer idArea;
    private Integer idTipoZona;
    private String zona;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdZona", nullable = false)
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "IdArea", nullable = true)
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    @Basic
    @Column(name = "IdTipoZona", nullable = true)
    public Integer getIdTipoZona() {
        return idTipoZona;
    }

    public void setIdTipoZona(Integer idTipoZona) {
        this.idTipoZona = idTipoZona;
    }

    @Basic
    @Column(name = "Zona", nullable = true, length = 64)
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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

        ZonasEntity that = (ZonasEntity) o;

        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (idArea != null ? !idArea.equals(that.idArea) : that.idArea != null) return false;
        if (idTipoZona != null ? !idTipoZona.equals(that.idTipoZona) : that.idTipoZona != null) return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idZona != null ? idZona.hashCode() : 0;
        result = 31 * result + (idArea != null ? idArea.hashCode() : 0);
        result = 31 * result + (idTipoZona != null ? idTipoZona.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
