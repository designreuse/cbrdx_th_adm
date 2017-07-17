package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "Cuestionarios", schema = "dbo", catalog = "CREZCAMOS")
public class Cuestionarios {
    private Integer idCuestionario;
    private String codigoCuestionario;
    private String cuestionario;
    private String descripcion;
    private Boolean indicadorPonderacion;
    private BigDecimal valor;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Cuestionarios() {
    }

    public Cuestionarios(String codigoCuestionario, String cuestionario, String descripcion, Boolean indicadorPonderacion, BigDecimal valor, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigoCuestionario = codigoCuestionario;
        this.cuestionario = cuestionario;
        this.descripcion = descripcion;
        this.indicadorPonderacion = indicadorPonderacion;
        this.valor = valor;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Cuestionarios(Integer idCuestionario, String codigoCuestionario, String cuestionario, String descripcion, Boolean indicadorPonderacion, BigDecimal valor, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idCuestionario = idCuestionario;
        this.codigoCuestionario = codigoCuestionario;
        this.cuestionario = cuestionario;
        this.descripcion = descripcion;
        this.indicadorPonderacion = indicadorPonderacion;
        this.valor = valor;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCuestionario", nullable = false)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    @Basic
    @Column(name = "CodigoCuestionario", nullable = true, length = 50)
    public String getCodigoCuestionario() {
        return codigoCuestionario;
    }

    public void setCodigoCuestionario(String codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    @Basic
    @Column(name = "Cuestionario", nullable = true, length = 200)
    public String getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(String cuestionario) {
        this.cuestionario = cuestionario;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IndicadorPonderacion", nullable = true)
    public Boolean getIndicadorPonderacion() {
        return indicadorPonderacion;
    }

    public void setIndicadorPonderacion(Boolean indicadorPonderacion) {
        this.indicadorPonderacion = indicadorPonderacion;
    }

    @Basic
    @Column(name = "Valor", nullable = true, precision = 2)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
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

        Cuestionarios that = (Cuestionarios) o;

        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (codigoCuestionario != null ? !codigoCuestionario.equals(that.codigoCuestionario) : that.codigoCuestionario != null)
            return false;
        if (cuestionario != null ? !cuestionario.equals(that.cuestionario) : that.cuestionario != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorPonderacion != null ? !indicadorPonderacion.equals(that.indicadorPonderacion) : that.indicadorPonderacion != null)
            return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
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
        int result = idCuestionario != null ? idCuestionario.hashCode() : 0;
        result = 31 * result + (codigoCuestionario != null ? codigoCuestionario.hashCode() : 0);
        result = 31 * result + (cuestionario != null ? cuestionario.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorPonderacion != null ? indicadorPonderacion.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
