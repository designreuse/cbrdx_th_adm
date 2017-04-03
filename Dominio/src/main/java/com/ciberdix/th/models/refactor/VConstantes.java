package com.ciberdix.th.models.refactor;

import javax.persistence.*;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/3/2017.
 */
@Entity
@Table(name = "V_Constantes", schema = "crz_th", catalog = "CREZCAMOS")
public class VConstantes {
    private Integer idConstante;
    private String constante;
    private String tipoDato;
    private String valor;
    private String descripcion;
    private Boolean indicadorHabilitado;

    @Id
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
    @Column(name = "TipoDato")
    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VConstantes that = (VConstantes) o;

        if (idConstante != null ? !idConstante.equals(that.idConstante) : that.idConstante != null) return false;
        if (constante != null ? !constante.equals(that.constante) : that.constante != null) return false;
        if (tipoDato != null ? !tipoDato.equals(that.tipoDato) : that.tipoDato != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idConstante != null ? idConstante.hashCode() : 0;
        result = 31 * result + (constante != null ? constante.hashCode() : 0);
        result = 31 * result + (tipoDato != null ? tipoDato.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
