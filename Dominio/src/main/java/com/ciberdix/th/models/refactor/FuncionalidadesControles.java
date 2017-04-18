package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
public class FuncionalidadesControles {
    private Integer idFuncionalidadControl;
    private String codigo;
    private String control;
    private Integer idClasificacion;
    private Integer idFuncionalidad;
    private Boolean indicadorVisible;
    private Boolean indicadorImprimir;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idPadre;
    private Boolean indicadorSeccion;

    @Id
    @Column(name = "IdFuncionalidadControl")
    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Control")
    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    @Basic
    @Column(name = "IdClasificacion")
    public Integer getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    @Basic
    @Column(name = "IdFuncionalidad")
    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    @Basic
    @Column(name = "IndicadorVisible")
    public Boolean getIndicadorVisible() {
        return indicadorVisible;
    }

    public void setIndicadorVisible(Boolean indicadorVisible) {
        this.indicadorVisible = indicadorVisible;
    }

    @Basic
    @Column(name = "IndicadorImprimir")
    public Boolean getIndicadorImprimir() {
        return indicadorImprimir;
    }

    public void setIndicadorImprimir(Boolean indicadorImprimir) {
        this.indicadorImprimir = indicadorImprimir;
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
    @Column(name = "IdPadre")
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    @Basic
    @Column(name = "IndicadorSeccion")
    public Boolean getIndicadorSeccion() {
        return indicadorSeccion;
    }

    public void setIndicadorSeccion(Boolean indicadorSeccion) {
        this.indicadorSeccion = indicadorSeccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FuncionalidadesControles that = (FuncionalidadesControles) o;

        if (idFuncionalidadControl != null ? !idFuncionalidadControl.equals(that.idFuncionalidadControl) : that.idFuncionalidadControl != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (control != null ? !control.equals(that.control) : that.control != null) return false;
        if (idClasificacion != null ? !idClasificacion.equals(that.idClasificacion) : that.idClasificacion != null)
            return false;
        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;
        if (indicadorVisible != null ? !indicadorVisible.equals(that.indicadorVisible) : that.indicadorVisible != null)
            return false;
        if (indicadorImprimir != null ? !indicadorImprimir.equals(that.indicadorImprimir) : that.indicadorImprimir != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idPadre != null ? !idPadre.equals(that.idPadre) : that.idPadre != null) return false;
        if (indicadorSeccion != null ? !indicadorSeccion.equals(that.indicadorSeccion) : that.indicadorSeccion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFuncionalidadControl != null ? idFuncionalidadControl.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (control != null ? control.hashCode() : 0);
        result = 31 * result + (idClasificacion != null ? idClasificacion.hashCode() : 0);
        result = 31 * result + (idFuncionalidad != null ? idFuncionalidad.hashCode() : 0);
        result = 31 * result + (indicadorVisible != null ? indicadorVisible.hashCode() : 0);
        result = 31 * result + (indicadorImprimir != null ? indicadorImprimir.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idPadre != null ? idPadre.hashCode() : 0);
        result = 31 * result + (indicadorSeccion != null ? indicadorSeccion.hashCode() : 0);
        return result;
    }
}
