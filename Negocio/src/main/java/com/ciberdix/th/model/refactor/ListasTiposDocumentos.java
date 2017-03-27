package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasTiposDocumentos {
    private Integer idListaTipoDocumento;
    private String codigoListaTipoDocumento;
    private String nombreListaTipoDocumento;
    private Integer ordenListaTipoDocumento;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaTipoDocumento() {
        return idListaTipoDocumento;
    }

    public void setIdListaTipoDocumento(Integer idListaTipoDocumento) {
        this.idListaTipoDocumento = idListaTipoDocumento;
    }

    public String getCodigoListaTipoDocumento() {
        return codigoListaTipoDocumento;
    }

    public void setCodigoListaTipoDocumento(String codigoListaTipoDocumento) {
        this.codigoListaTipoDocumento = codigoListaTipoDocumento;
    }

    public String getNombreListaTipoDocumento() {
        return nombreListaTipoDocumento;
    }

    public void setNombreListaTipoDocumento(String nombreListaTipoDocumento) {
        this.nombreListaTipoDocumento = nombreListaTipoDocumento;
    }

    public Integer getOrdenListaTipoDocumento() {
        return ordenListaTipoDocumento;
    }

    public void setOrdenListaTipoDocumento(Integer ordenListaTipoDocumento) {
        this.ordenListaTipoDocumento = ordenListaTipoDocumento;
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
        hash = 37 * hash + Objects.hashCode(this.idListaTipoDocumento);
        hash = 37 * hash + Objects.hashCode(this.codigoListaTipoDocumento);
        hash = 37 * hash + Objects.hashCode(this.nombreListaTipoDocumento);
        hash = 37 * hash + Objects.hashCode(this.ordenListaTipoDocumento);
        hash = 37 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 37 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 37 * hash + Objects.hashCode(this.auditoriaFecha);
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
        final ListasTiposDocumentos other = (ListasTiposDocumentos) obj;
        if (!Objects.equals(this.codigoListaTipoDocumento, other.codigoListaTipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaTipoDocumento, other.nombreListaTipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.idListaTipoDocumento, other.idListaTipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaTipoDocumento, other.ordenListaTipoDocumento)) {
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
