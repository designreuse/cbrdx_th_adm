package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_Constantes", schema = "dbo", catalog = "CREZCAMOS")
public class VConstantes {
    private Integer idConstante;
    private String constante;
    private Integer idTipoDato;
    private String tipoDato;
    private String valor;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Timestamp auditoriaFecha;
    private Integer auditoriaUsuario;

    @Basic
    @Id
    @Column(name = "IdConstante", nullable = false)
    public Integer getIdConstante() {
        return idConstante;
    }

    public void setIdConstante(Integer idConstante) {
        this.idConstante = idConstante;
    }

    @Basic
    @Column(name = "Constante", nullable = true, length = 6)
    public String getConstante() {
        return constante;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    @Basic
    @Column(name = "IdTipoDato", nullable = true)
    public Integer getIdTipoDato() {
        return idTipoDato;
    }

    public void setIdTipoDato(Integer idTipoDato) {
        this.idTipoDato = idTipoDato;
    }

    @Basic
    @Column(name = "TipoDato", nullable = true, length = 100)
    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    @Basic
    @Column(name = "Valor", nullable = true, length = 250)
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 250)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VConstantes that = (VConstantes) o;

        if (idConstante != null ? !idConstante.equals(that.idConstante) : that.idConstante != null) return false;
        if (constante != null ? !constante.equals(that.constante) : that.constante != null) return false;
        if (idTipoDato != null ? !idTipoDato.equals(that.idTipoDato) : that.idTipoDato != null) return false;
        if (tipoDato != null ? !tipoDato.equals(that.tipoDato) : that.tipoDato != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idConstante != null ? idConstante.hashCode() : 0;
        result = 31 * result + (constante != null ? constante.hashCode() : 0);
        result = 31 * result + (idTipoDato != null ? idTipoDato.hashCode() : 0);
        result = 31 * result + (tipoDato != null ? tipoDato.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        return result;
    }
}
