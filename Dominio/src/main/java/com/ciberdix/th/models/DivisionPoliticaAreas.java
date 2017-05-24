package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "DivisionPoliticaAreas", schema = "crz_th", catalog = "CREZCAMOS")
public class DivisionPoliticaAreas {
    private Integer idDivisionPoliticaArea;
    private String descripcionDivisionPoliticaArea;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public DivisionPoliticaAreas() {
    }

    public DivisionPoliticaAreas(String descripcionDivisionPoliticaArea, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public DivisionPoliticaAreas(Integer idDivisionPoliticaArea, String descripcionDivisionPoliticaArea, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdDivisionPoliticaArea")
    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    @Basic
    @Column(name = "DescripcionDivisionPoliticaArea")
    public String getDescripcionDivisionPoliticaArea() {
        return descripcionDivisionPoliticaArea;
    }

    public void setDescripcionDivisionPoliticaArea(String descripcionDivisionPoliticaArea) {
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DivisionPoliticaAreas that = (DivisionPoliticaAreas) o;

        if (idDivisionPoliticaArea != null ? !idDivisionPoliticaArea.equals(that.idDivisionPoliticaArea) : that.idDivisionPoliticaArea != null)
            return false;
        if (descripcionDivisionPoliticaArea != null ? !descripcionDivisionPoliticaArea.equals(that.descripcionDivisionPoliticaArea) : that.descripcionDivisionPoliticaArea != null)
            return false;
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
        int result = idDivisionPoliticaArea != null ? idDivisionPoliticaArea.hashCode() : 0;
        result = 31 * result + (descripcionDivisionPoliticaArea != null ? descripcionDivisionPoliticaArea.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
