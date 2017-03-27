package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "DivisionPolitica", schema = "crz_th", catalog = "CREZCAMOS")
public class DivisionPolitica {
    private Integer idDivisionPolitica;
    private Integer idDivisionPoliticaPadre;
    private String codigoDivisionPolitica;
    private String descripcionDivisonPolitica;
    private Integer indicativoDivisonPolitica;
    private String codigoPostalDivisionPolitica;
    private Integer idDivisionPoliticaTipo;
    private Integer idDivisionPoliticaArea;
    private Integer idDivisionPoliticaResguardo;
    private Integer idEstratoDivisionPolitica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idDivisionPoliticaComuna;
    private Integer idDivisionPoliticaLocalidad;

    public DivisionPolitica() {
    }

    public DivisionPolitica(Integer idDivisionPoliticaPadre, String codigoDivisionPolitica, String descripcionDivisonPolitica, Integer indicativoDivisonPolitica, String codigoPostalDivisionPolitica, Integer idDivisionPoliticaTipo, Integer idDivisionPoliticaArea, Integer idDivisionPoliticaResguardo, Integer idEstratoDivisionPolitica, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idDivisionPoliticaComuna, Integer idDivisionPoliticaLocalidad) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
        this.codigoDivisionPolitica = codigoDivisionPolitica;
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
        this.indicativoDivisonPolitica = indicativoDivisonPolitica;
        this.codigoPostalDivisionPolitica = codigoPostalDivisionPolitica;
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
        this.idEstratoDivisionPolitica = idEstratoDivisionPolitica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.idDivisionPoliticaComuna = idDivisionPoliticaComuna;
        this.idDivisionPoliticaLocalidad = idDivisionPoliticaLocalidad;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
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
    public Integer getIndicativoDivisonPolitica() {
        return indicativoDivisonPolitica;
    }

    public void setIndicativoDivisonPolitica(Integer indicativoDivisonPolitica) {
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
    @Column(name = "IdDivisionPoliticaComuna")
    public Integer getIdDivisionPoliticaComuna() {
        return idDivisionPoliticaComuna;
    }

    public void setIdDivisionPoliticaComuna(Integer idDivisionPoliticaComuna) {
        this.idDivisionPoliticaComuna = idDivisionPoliticaComuna;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaLocalidad")
    public Integer getIdDivisionPoliticaLocalidad() {
        return idDivisionPoliticaLocalidad;
    }

    public void setIdDivisionPoliticaLocalidad(Integer idDivisionPoliticaLocalidad) {
        this.idDivisionPoliticaLocalidad = idDivisionPoliticaLocalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DivisionPolitica that = (DivisionPolitica) o;

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
        if (idDivisionPoliticaComuna != null ? !idDivisionPoliticaComuna.equals(that.idDivisionPoliticaComuna) : that.idDivisionPoliticaComuna != null)
            return false;
        if (idDivisionPoliticaLocalidad != null ? !idDivisionPoliticaLocalidad.equals(that.idDivisionPoliticaLocalidad) : that.idDivisionPoliticaLocalidad != null)
            return false;

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
        result = 31 * result + (idDivisionPoliticaComuna != null ? idDivisionPoliticaComuna.hashCode() : 0);
        result = 31 * result + (idDivisionPoliticaLocalidad != null ? idDivisionPoliticaLocalidad.hashCode() : 0);
        return result;
    }
}
