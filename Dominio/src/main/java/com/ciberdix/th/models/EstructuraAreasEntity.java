package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "EstructuraAreas", schema = "crz_th", catalog = "CREZCAMOS")
public class EstructuraAreasEntity {
    private Integer idEstructuraArea;
    private String estructuraArea;
    private String codigoArea;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @GeneratedValue
    @Column(name = "IdEstructuraArea", nullable = false)
    public Integer getIdEstructuraArea() {
        return idEstructuraArea;
    }

    public void setIdEstructuraArea(Integer idEstructuraArea) {
        this.idEstructuraArea = idEstructuraArea;
    }

    @Basic
    @Column(name = "EstructuraArea", nullable = true, length = 40)
    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    @Basic
    @Column(name = "CodigoArea", nullable = true, length = 8)
    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        EstructuraAreasEntity that = (EstructuraAreasEntity) o;

        if (idEstructuraArea != null ? !idEstructuraArea.equals(that.idEstructuraArea) : that.idEstructuraArea != null)
            return false;
        if (estructuraArea != null ? !estructuraArea.equals(that.estructuraArea) : that.estructuraArea != null)
            return false;
        if (codigoArea != null ? !codigoArea.equals(that.codigoArea) : that.codigoArea != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstructuraArea != null ? idEstructuraArea.hashCode() : 0;
        result = 31 * result + (estructuraArea != null ? estructuraArea.hashCode() : 0);
        result = 31 * result + (codigoArea != null ? codigoArea.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }

    public EstructuraAreasEntity() {
    }

    public EstructuraAreasEntity(String estructuraArea, String codigoArea, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.estructuraArea = estructuraArea;
        this.codigoArea = codigoArea;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }
}
