package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasTiposPersonas {
    private Integer idListaTipoPersona;
    private String codigoListaTipoPersona;
    private String nombreListaTipoPersona;
    private Integer ordenListaTipoPersona;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaTipoPersona() {
        return idListaTipoPersona;
    }

    public void setIdListaTipoPersona(Integer idListaTipoPersona) {
        this.idListaTipoPersona = idListaTipoPersona;
    }

    public String getCodigoListaTipoPersona() {
        return codigoListaTipoPersona;
    }

    public void setCodigoListaTipoPersona(String codigoListaTipoPersona) {
        this.codigoListaTipoPersona = codigoListaTipoPersona;
    }

    public String getNombreListaTipoPersona() {
        return nombreListaTipoPersona;
    }

    public void setNombreListaTipoPersona(String nombreListaTipoPersona) {
        this.nombreListaTipoPersona = nombreListaTipoPersona;
    }

    public Integer getOrdenListaTipoPersona() {
        return ordenListaTipoPersona;
    }

    public void setOrdenListaTipoPersona(Integer ordenListaTipoPersona) {
        this.ordenListaTipoPersona = ordenListaTipoPersona;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idListaTipoPersona);
        hash = 97 * hash + Objects.hashCode(this.codigoListaTipoPersona);
        hash = 97 * hash + Objects.hashCode(this.nombreListaTipoPersona);
        hash = 97 * hash + Objects.hashCode(this.ordenListaTipoPersona);
        hash = 97 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 97 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 97 * hash + Objects.hashCode(this.auditoriaFecha);
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
        final ListasTiposPersonas other = (ListasTiposPersonas) obj;
        if (!Objects.equals(this.codigoListaTipoPersona, other.codigoListaTipoPersona)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaTipoPersona, other.nombreListaTipoPersona)) {
            return false;
        }
        if (!Objects.equals(this.idListaTipoPersona, other.idListaTipoPersona)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaTipoPersona, other.ordenListaTipoPersona)) {
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
