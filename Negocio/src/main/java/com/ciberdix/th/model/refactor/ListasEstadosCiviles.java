package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasEstadosCiviles {
    private Integer idListaEstadoCivil;
    private String codigoListaEstadoCivil;
    private String nombreListaEstadoCivil;
    private Integer ordenListaEstadoCivil;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaEstadoCivil() {
        return idListaEstadoCivil;
    }

    public void setIdListaEstadoCivil(Integer idListaEstadoCivil) {
        this.idListaEstadoCivil = idListaEstadoCivil;
    }

    public String getCodigoListaEstadoCivil() {
        return codigoListaEstadoCivil;
    }

    public void setCodigoListaEstadoCivil(String codigoListaEstadoCivil) {
        this.codigoListaEstadoCivil = codigoListaEstadoCivil;
    }

    public String getNombreListaEstadoCivil() {
        return nombreListaEstadoCivil;
    }

    public void setNombreListaEstadoCivil(String nombreListaEstadoCivil) {
        this.nombreListaEstadoCivil = nombreListaEstadoCivil;
    }

    public Integer getOrdenListaEstadoCivil() {
        return ordenListaEstadoCivil;
    }

    public void setOrdenListaEstadoCivil(Integer ordenListaEstadoCivil) {
        this.ordenListaEstadoCivil = ordenListaEstadoCivil;
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
        hash = 67 * hash + Objects.hashCode(this.idListaEstadoCivil);
        hash = 67 * hash + Objects.hashCode(this.codigoListaEstadoCivil);
        hash = 67 * hash + Objects.hashCode(this.nombreListaEstadoCivil);
        hash = 67 * hash + Objects.hashCode(this.ordenListaEstadoCivil);
        hash = 67 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 67 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 67 * hash + Objects.hashCode(this.auditoriaFecha);
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
        final ListasEstadosCiviles other = (ListasEstadosCiviles) obj;
        if (!Objects.equals(this.codigoListaEstadoCivil, other.codigoListaEstadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaEstadoCivil, other.nombreListaEstadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.idListaEstadoCivil, other.idListaEstadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaEstadoCivil, other.ordenListaEstadoCivil)) {
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
