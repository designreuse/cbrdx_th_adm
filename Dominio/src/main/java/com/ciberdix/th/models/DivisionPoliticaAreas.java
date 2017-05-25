package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "DivisionPoliticaAreas", schema = "dbo", catalog = "CREZCAMOS")
public class DivisionPoliticaAreas {
    private Integer idDivisionPoliticaArea;
    private String descripcionDivisionPoliticaArea;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigo;


    public DivisionPoliticaAreas() {
    }

    public DivisionPoliticaAreas(String descripcionDivisionPoliticaArea, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigo) {
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigo = codigo;
    }

    public DivisionPoliticaAreas(Integer idDivisionPoliticaArea, String descripcionDivisionPoliticaArea, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigo) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigo = codigo;
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

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DivisionPoliticaAreas that = (DivisionPoliticaAreas) o;

        if (!idDivisionPoliticaArea.equals(that.idDivisionPoliticaArea)) return false;
        if (descripcionDivisionPoliticaArea != null ? !descripcionDivisionPoliticaArea.equals(that.descripcionDivisionPoliticaArea) : that.descripcionDivisionPoliticaArea != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (!auditoriaUsuario.equals(that.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(that.auditoriaFecha)) return false;
        return codigo != null ? codigo.equals(that.codigo) : that.codigo == null;
    }

    @Override
    public int hashCode() {
        int result = idDivisionPoliticaArea.hashCode();
        result = 31 * result + (descripcionDivisionPoliticaArea != null ? descripcionDivisionPoliticaArea.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        return result;
    }
}
