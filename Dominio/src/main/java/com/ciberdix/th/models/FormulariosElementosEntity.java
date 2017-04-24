package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "FormulariosElementos", schema = "crz_th", catalog = "CREZCAMOS")
public class FormulariosElementosEntity {
    private Integer idFormularioElemento;
    private Integer idFormulario;
    private String formularioElemento;
    private String etiqueta;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdFormularioElemento", nullable = false)
    public Integer getIdFormularioElemento() {
        return idFormularioElemento;
    }

    public void setIdFormularioElemento(Integer idFormularioElemento) {
        this.idFormularioElemento = idFormularioElemento;
    }

    @Basic
    @Column(name = "IdFormulario", nullable = true)
    public Integer getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    @Basic
    @Column(name = "FormularioElemento", nullable = true, length = 128)
    public String getFormularioElemento() {
        return formularioElemento;
    }

    public void setFormularioElemento(String formularioElemento) {
        this.formularioElemento = formularioElemento;
    }

    @Basic
    @Column(name = "Etiqueta", nullable = true, length = 128)
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 512)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        FormulariosElementosEntity that = (FormulariosElementosEntity) o;

        if (idFormularioElemento != null ? !idFormularioElemento.equals(that.idFormularioElemento) : that.idFormularioElemento != null)
            return false;
        if (idFormulario != null ? !idFormulario.equals(that.idFormulario) : that.idFormulario != null) return false;
        if (formularioElemento != null ? !formularioElemento.equals(that.formularioElemento) : that.formularioElemento != null)
            return false;
        if (etiqueta != null ? !etiqueta.equals(that.etiqueta) : that.etiqueta != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormularioElemento != null ? idFormularioElemento.hashCode() : 0;
        result = 31 * result + (idFormulario != null ? idFormulario.hashCode() : 0);
        result = 31 * result + (formularioElemento != null ? formularioElemento.hashCode() : 0);
        result = 31 * result + (etiqueta != null ? etiqueta.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
