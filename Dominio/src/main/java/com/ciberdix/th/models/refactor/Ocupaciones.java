package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Ocupaciones", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class Ocupaciones {
    private Integer idOcupacion;
    private Integer idOcupacionPadre;
    private Integer idOcupacionTipo;
    private String codigoOcupacion;
    private String ocupacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Ocupaciones() {
    }

    public Ocupaciones(Integer idOcupacionPadre, Integer idOcupacionTipo, String codigoOcupacion, String ocupacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idOcupacionPadre = idOcupacionPadre;
        this.idOcupacionTipo = idOcupacionTipo;
        this.codigoOcupacion = codigoOcupacion;
        this.ocupacion = ocupacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdOcupacion")
    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    @Basic
    @Column(name = "IdOcupacionPadre")
    public Integer getIdOcupacionPadre() {
        return idOcupacionPadre;
    }

    public void setIdOcupacionPadre(Integer idOcupacionPadre) {
        this.idOcupacionPadre = idOcupacionPadre;
    }

    @Basic
    @Column(name = "IdOcupacionTipo")
    public Integer getIdOcupacionTipo() {
        return idOcupacionTipo;
    }

    public void setIdOcupacionTipo(Integer idOcupacionTipo) {
        this.idOcupacionTipo = idOcupacionTipo;
    }

    @Basic
    @Column(name = "CodigoOcupacion")
    public String getCodigoOcupacion() {
        return codigoOcupacion;
    }

    public void setCodigoOcupacion(String codigoOcupacion) {
        this.codigoOcupacion = codigoOcupacion;
    }

    @Basic
    @Column(name = "Ocupacion")
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

        Ocupaciones that = (Ocupaciones) o;

        if (idOcupacion != null ? !idOcupacion.equals(that.idOcupacion) : that.idOcupacion != null) return false;
        if (idOcupacionPadre != null ? !idOcupacionPadre.equals(that.idOcupacionPadre) : that.idOcupacionPadre != null)
            return false;
        if (idOcupacionTipo != null ? !idOcupacionTipo.equals(that.idOcupacionTipo) : that.idOcupacionTipo != null)
            return false;
        if (codigoOcupacion != null ? !codigoOcupacion.equals(that.codigoOcupacion) : that.codigoOcupacion != null)
            return false;
        if (ocupacion != null ? !ocupacion.equals(that.ocupacion) : that.ocupacion != null) return false;
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
        int result = idOcupacion != null ? idOcupacion.hashCode() : 0;
        result = 31 * result + (idOcupacionPadre != null ? idOcupacionPadre.hashCode() : 0);
        result = 31 * result + (idOcupacionTipo != null ? idOcupacionTipo.hashCode() : 0);
        result = 31 * result + (codigoOcupacion != null ? codigoOcupacion.hashCode() : 0);
        result = 31 * result + (ocupacion != null ? ocupacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
