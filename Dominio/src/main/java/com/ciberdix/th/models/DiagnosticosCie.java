package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import javax.persistence.Table;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "DiagnosticosCIE", schema = "dbo", catalog = "CREZCAMOS")
public class DiagnosticosCie {
    private Integer idDiagnosticoCie;
    private String codigo;
    private String simbolo;
    private String descripcion;
    private Integer sexo;
    private Integer limiteInferior;
    private Integer limiteSuperior;
    private Integer noAfeccion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public DiagnosticosCie() {
    }

    public DiagnosticosCie(String codigo, String simbolo, String descripcion, Integer sexo, Integer limiteInferior, Integer limiteSuperior, Integer noAfeccion, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.simbolo = simbolo;
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.noAfeccion = noAfeccion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public DiagnosticosCie(Integer idDiagnosticoCie, String codigo, String simbolo, String descripcion, Integer sexo, Integer limiteInferior, Integer limiteSuperior, Integer noAfeccion, Integer auditoriaUsuario) {
        this.idDiagnosticoCie = idDiagnosticoCie;
        this.codigo = codigo;
        this.simbolo = simbolo;
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.noAfeccion = noAfeccion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @Column(name = "IdDiagnosticoCIE", nullable = false)
    public Integer getIdDiagnosticoCie() {
        return idDiagnosticoCie;
    }

    public void setIdDiagnosticoCie(Integer idDiagnosticoCie) {
        this.idDiagnosticoCie = idDiagnosticoCie;
    }

    @Basic
    @Column(name = "Codigo", nullable = false, length = 4)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Simbolo", nullable = true, length = 1)
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Basic
    @Column(name = "Descripcion", nullable = false, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "Sexo", nullable = false)
    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "LimiteInferior", nullable = true, precision = 0)
    public Integer getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(Integer limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    @Basic
    @Column(name = "LimiteSuperior", nullable = true, precision = 0)
    public Integer getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(Integer limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    @Basic
    @Column(name = "NoAfeccion", nullable = true, precision = 0)
    public Integer getNoAfeccion() {
        return noAfeccion;
    }

    public void setNoAfeccion(Integer noAfeccion) {
        this.noAfeccion = noAfeccion;
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

        DiagnosticosCie that = (DiagnosticosCie) o;

        if (idDiagnosticoCie != null ? !idDiagnosticoCie.equals(that.idDiagnosticoCie) : that.idDiagnosticoCie != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (simbolo != null ? !simbolo.equals(that.simbolo) : that.simbolo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (limiteInferior != null ? !limiteInferior.equals(that.limiteInferior) : that.limiteInferior != null)
            return false;
        if (limiteSuperior != null ? !limiteSuperior.equals(that.limiteSuperior) : that.limiteSuperior != null)
            return false;
        if (noAfeccion != null ? !noAfeccion.equals(that.noAfeccion) : that.noAfeccion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDiagnosticoCie != null ? idDiagnosticoCie.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (simbolo != null ? simbolo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (limiteInferior != null ? limiteInferior.hashCode() : 0);
        result = 31 * result + (limiteSuperior != null ? limiteSuperior.hashCode() : 0);
        result = 31 * result + (noAfeccion != null ? noAfeccion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
