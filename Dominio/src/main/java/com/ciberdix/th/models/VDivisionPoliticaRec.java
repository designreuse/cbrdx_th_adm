package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_DivisionPolitica_Rec", schema = "crz_th", catalog = "CREZCAMOS")
public class VDivisionPoliticaRec {
    private Integer idDivisionPolitica;
    private Integer idDivisionPoliticaPadre;
    private String codigoDivisionPolitica;
    private String descripcionDivisonPolitica;
    private String indicativoDivisonPolitica;
    private String codigoPostalDivisionPolitica;
    private Integer idDivisionPoliticaTipo;
    private Integer idDivisionPoliticaArea;
    private Integer idDivisionPoliticaResguardo;
    private Integer idEstratoDivisionPolitica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String camino;
    private String gentilicio;

    @Id
    @Column(name = "IdDivisionPolitica")
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaPadre")
    public Integer getIdDivisionPoliticaPadre() {
        return idDivisionPoliticaPadre;
    }

    public void setIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
    }

    @Basic
    @Column(name = "CodigoDivisionPolitica")
    public String getCodigoDivisionPolitica() {
        return codigoDivisionPolitica;
    }

    public void setCodigoDivisionPolitica(String codigoDivisionPolitica) {
        this.codigoDivisionPolitica = codigoDivisionPolitica;
    }

    @Basic
    @Column(name = "DescripcionDivisonPolitica")
    public String getDescripcionDivisonPolitica() {
        return descripcionDivisonPolitica;
    }

    public void setDescripcionDivisonPolitica(String descripcionDivisonPolitica) {
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
    }

    @Basic
    @Column(name = "IndicativoDivisonPolitica")
    public String getIndicativoDivisonPolitica() {
        return indicativoDivisonPolitica;
    }

    public void setIndicativoDivisonPolitica(String indicativoDivisonPolitica) {
        this.indicativoDivisonPolitica = indicativoDivisonPolitica;
    }

    @Basic
    @Column(name = "CodigoPostalDivisionPolitica")
    public String getCodigoPostalDivisionPolitica() {
        return codigoPostalDivisionPolitica;
    }

    public void setCodigoPostalDivisionPolitica(String codigoPostalDivisionPolitica) {
        this.codigoPostalDivisionPolitica = codigoPostalDivisionPolitica;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaTipo")
    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaArea")
    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaResguardo")
    public Integer getIdDivisionPoliticaResguardo() {
        return idDivisionPoliticaResguardo;
    }

    public void setIdDivisionPoliticaResguardo(Integer idDivisionPoliticaResguardo) {
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
    }

    @Basic
    @Column(name = "IdEstratoDivisionPolitica")
    public Integer getIdEstratoDivisionPolitica() {
        return idEstratoDivisionPolitica;
    }

    public void setIdEstratoDivisionPolitica(Integer idEstratoDivisionPolitica) {
        this.idEstratoDivisionPolitica = idEstratoDivisionPolitica;
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
    @Column(name = "CAMINO")
    public String getCamino() {
        return camino;
    }

    public void setCamino(String camino) {
        this.camino = camino;
    }

    @Basic
    @Column(name = "Gentilicio")
    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VDivisionPoliticaRec that = (VDivisionPoliticaRec) o;

        if (idDivisionPolitica != null ? !idDivisionPolitica.equals(that.idDivisionPolitica) : that.idDivisionPolitica != null)
            return false;
        if (idDivisionPoliticaPadre != null ? !idDivisionPoliticaPadre.equals(that.idDivisionPoliticaPadre) : that.idDivisionPoliticaPadre != null)
            return false;
        if (codigoDivisionPolitica != null ? !codigoDivisionPolitica.equals(that.codigoDivisionPolitica) : that.codigoDivisionPolitica != null)
            return false;
        if (descripcionDivisonPolitica != null ? !descripcionDivisonPolitica.equals(that.descripcionDivisonPolitica) : that.descripcionDivisonPolitica != null)
            return false;
        if (indicativoDivisonPolitica != null ? !indicativoDivisonPolitica.equals(that.indicativoDivisonPolitica) : that.indicativoDivisonPolitica != null)
            return false;
        if (codigoPostalDivisionPolitica != null ? !codigoPostalDivisionPolitica.equals(that.codigoPostalDivisionPolitica) : that.codigoPostalDivisionPolitica != null)
            return false;
        if (idDivisionPoliticaTipo != null ? !idDivisionPoliticaTipo.equals(that.idDivisionPoliticaTipo) : that.idDivisionPoliticaTipo != null)
            return false;
        if (idDivisionPoliticaArea != null ? !idDivisionPoliticaArea.equals(that.idDivisionPoliticaArea) : that.idDivisionPoliticaArea != null)
            return false;
        if (idDivisionPoliticaResguardo != null ? !idDivisionPoliticaResguardo.equals(that.idDivisionPoliticaResguardo) : that.idDivisionPoliticaResguardo != null)
            return false;
        if (idEstratoDivisionPolitica != null ? !idEstratoDivisionPolitica.equals(that.idEstratoDivisionPolitica) : that.idEstratoDivisionPolitica != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (camino != null ? !camino.equals(that.camino) : that.camino != null) return false;
        if (gentilicio != null ? !gentilicio.equals(that.gentilicio) : that.gentilicio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDivisionPolitica != null ? idDivisionPolitica.hashCode() : 0;
        result = 31 * result + (idDivisionPoliticaPadre != null ? idDivisionPoliticaPadre.hashCode() : 0);
        result = 31 * result + (codigoDivisionPolitica != null ? codigoDivisionPolitica.hashCode() : 0);
        result = 31 * result + (descripcionDivisonPolitica != null ? descripcionDivisonPolitica.hashCode() : 0);
        result = 31 * result + (indicativoDivisonPolitica != null ? indicativoDivisonPolitica.hashCode() : 0);
        result = 31 * result + (codigoPostalDivisionPolitica != null ? codigoPostalDivisionPolitica.hashCode() : 0);
        result = 31 * result + (idDivisionPoliticaTipo != null ? idDivisionPoliticaTipo.hashCode() : 0);
        result = 31 * result + (idDivisionPoliticaArea != null ? idDivisionPoliticaArea.hashCode() : 0);
        result = 31 * result + (idDivisionPoliticaResguardo != null ? idDivisionPoliticaResguardo.hashCode() : 0);
        result = 31 * result + (idEstratoDivisionPolitica != null ? idEstratoDivisionPolitica.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (camino != null ? camino.hashCode() : 0);
        result = 31 * result + (gentilicio != null ? gentilicio.hashCode() : 0);
        return result;
    }
}
