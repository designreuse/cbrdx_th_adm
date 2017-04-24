package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Constantes", schema = "crz_th", catalog = "CREZCAMOS")
public class Constantes {
    private Integer idConstante;
    private String constante;
    private Integer idTipoDato;
    private String valor;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Constantes() {
    }

    public Constantes(String constante, Integer idTipoDato, String valor, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.constante = constante;
        this.idTipoDato = idTipoDato;
        this.valor = valor;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdConstante")
    public Integer getIdConstante() {
        return idConstante;
    }

    public void setIdConstante(Integer idConstante) {
        this.idConstante = idConstante;
    }

    @Basic
    @Column(name = "Constante")
    public String getConstante() {
        return constante;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    @Basic
    @Column(name = "IdTipoDato")
    public Integer getIdTipoDato() {
        return idTipoDato;
    }

    public void setIdTipoDato(Integer idTipoDato) {
        this.idTipoDato = idTipoDato;
    }

    @Basic
    @Column(name = "Valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        Constantes that = (Constantes) o;

        if (idConstante != null ? !idConstante.equals(that.idConstante) : that.idConstante != null) return false;
        if (constante != null ? !constante.equals(that.constante) : that.constante != null) return false;
        if (idTipoDato != null ? !idTipoDato.equals(that.idTipoDato) : that.idTipoDato != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
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
        int result = idConstante != null ? idConstante.hashCode() : 0;
        result = 31 * result + (constante != null ? constante.hashCode() : 0);
        result = 31 * result + (idTipoDato != null ? idTipoDato.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
