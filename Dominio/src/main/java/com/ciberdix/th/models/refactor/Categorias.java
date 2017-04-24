package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Categorias", schema = "crz_th", catalog = "CREZCAMOS")
public class Categorias {
    private Integer idCategoria;
    private String categoria;
    private Integer puntosMinimos;
    private Integer puntosMaximos;
    private Integer idNivel;
    private String nivel;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Categorias() {
    }

    public Categorias(String categoria, Integer puntosMinimos, Integer puntosMaximos, Integer idNivel, String nivel, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.categoria = categoria;
        this.puntosMinimos = puntosMinimos;
        this.puntosMaximos = puntosMaximos;
        this.idNivel = idNivel;
        this.nivel = nivel;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCategoria")
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "Categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Basic
    @Column(name = "PuntosMinimos")
    public Integer getPuntosMinimos() {
        return puntosMinimos;
    }

    public void setPuntosMinimos(Integer puntosMinimos) {
        this.puntosMinimos = puntosMinimos;
    }

    @Basic
    @Column(name = "PuntosMaximos")
    public Integer getPuntosMaximos() {
        return puntosMaximos;
    }

    public void setPuntosMaximos(Integer puntosMaximos) {
        this.puntosMaximos = puntosMaximos;
    }

    @Basic
    @Column(name = "IdNivel")
    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    @Basic
    @Column(name = "Nivel")
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

        Categorias that = (Categorias) o;

        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (categoria != null ? !categoria.equals(that.categoria) : that.categoria != null) return false;
        if (puntosMinimos != null ? !puntosMinimos.equals(that.puntosMinimos) : that.puntosMinimos != null)
            return false;
        if (puntosMaximos != null ? !puntosMaximos.equals(that.puntosMaximos) : that.puntosMaximos != null)
            return false;
        if (idNivel != null ? !idNivel.equals(that.idNivel) : that.idNivel != null) return false;
        if (nivel != null ? !nivel.equals(that.nivel) : that.nivel != null) return false;
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
        int result = idCategoria != null ? idCategoria.hashCode() : 0;
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (puntosMinimos != null ? puntosMinimos.hashCode() : 0);
        result = 31 * result + (puntosMaximos != null ? puntosMaximos.hashCode() : 0);
        result = 31 * result + (idNivel != null ? idNivel.hashCode() : 0);
        result = 31 * result + (nivel != null ? nivel.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
