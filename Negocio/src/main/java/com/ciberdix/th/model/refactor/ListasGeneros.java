package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasGeneros {
    private Integer idListaGenero;
    private String codigoListaGenero;
    private String nombreListaGenero;
    private Integer ordenListaGenero;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaGenero() {
        return idListaGenero;
    }

    public void setIdListaGenero(Integer idListaGenero) {
        this.idListaGenero = idListaGenero;
    }

    public String getCodigoListaGenero() {
        return codigoListaGenero;
    }

    public void setCodigoListaGenero(String codigoListaGenero) {
        this.codigoListaGenero = codigoListaGenero;
    }

    public String getNombreListaGenero() {
        return nombreListaGenero;
    }

    public void setNombreListaGenero(String nombreListaGenero) {
        this.nombreListaGenero = nombreListaGenero;
    }

    public Integer getOrdenListaGenero() {
        return ordenListaGenero;
    }

    public void setOrdenListaGenero(Integer ordenListaGenero) {
        this.ordenListaGenero = ordenListaGenero;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idListaGenero);
        hash = 79 * hash + Objects.hashCode(this.codigoListaGenero);
        hash = 79 * hash + Objects.hashCode(this.nombreListaGenero);
        hash = 79 * hash + Objects.hashCode(this.ordenListaGenero);
        hash = 79 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 79 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 79 * hash + Objects.hashCode(this.auditoriaFecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListasGeneros other = (ListasGeneros) obj;
        if (!Objects.equals(this.codigoListaGenero, other.codigoListaGenero)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaGenero, other.nombreListaGenero)) {
            return false;
        }
        if (!Objects.equals(this.idListaGenero, other.idListaGenero)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaGenero, other.ordenListaGenero)) {
            return false;
        }
        if (!Objects.equals(this.indicadorHabilitado, other.indicadorHabilitado)) {
            return false;
        }
        if (!Objects.equals(this.auditoriaUsuario, other.auditoriaUsuario)) {
            return false;
        }
        if (!Objects.equals(this.auditoriaFecha, other.auditoriaFecha)) {
            return false;
        }
        return true;
    }
}
