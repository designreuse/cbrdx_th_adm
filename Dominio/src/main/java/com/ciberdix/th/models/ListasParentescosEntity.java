package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by TracesMaker on 12/03/2017.
 */
@Entity
@Table(name = "ListasParentescos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ListasParentescosEntity {
    private int value;
    private String codigoListaParentesco;
    private String label;
    private int ordenListaParentesco;
    private boolean indicadorHabilitado;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaParentesco")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "CodigoListaParentesco")
    public String getCodigoListaParentesco() {
        return codigoListaParentesco;
    }

    public void setCodigoListaParentesco(String codigoListaParentesco) {
        this.codigoListaParentesco = codigoListaParentesco;
    }

    @Basic
    @Column(name = "NombreListaParentesco")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "OrdenListaParentesco")
    public int getOrdenListaParentesco() {
        return ordenListaParentesco;
    }

    public void setOrdenListaParentesco(int ordenListaParentesco) {
        this.ordenListaParentesco = ordenListaParentesco;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        ListasParentescosEntity that = (ListasParentescosEntity) o;

        if (value != that.value) return false;
        if (ordenListaParentesco != that.ordenListaParentesco) return false;
        if (indicadorHabilitado != that.indicadorHabilitado) return false;
        if (codigoListaParentesco != null ? !codigoListaParentesco.equals(that.codigoListaParentesco) : that.codigoListaParentesco != null)
            return false;
        if (label != null ? !label.equals(that.label) : that.label != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (codigoListaParentesco != null ? codigoListaParentesco.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + ordenListaParentesco;
        result = 31 * result + (indicadorHabilitado ? 1 : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
