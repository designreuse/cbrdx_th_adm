package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasSectoresEmpresas {
    private Integer idListaSectorEmpresa;
    private String codigoListaSectorEmpresa;
    private String nombreListaSectorEmpresa;
    private Integer ordenListaSectorEmpresa;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaSectorEmpresa() {
        return idListaSectorEmpresa;
    }

    public void setIdListaSectorEmpresa(Integer idListaSectorEmpresa) {
        this.idListaSectorEmpresa = idListaSectorEmpresa;
    }

    public String getCodigoListaSectorEmpresa() {
        return codigoListaSectorEmpresa;
    }

    public void setCodigoListaSectorEmpresa(String codigoListaSectorEmpresa) {
        this.codigoListaSectorEmpresa = codigoListaSectorEmpresa;
    }

    public String getNombreListaSectorEmpresa() {
        return nombreListaSectorEmpresa;
    }

    public void setNombreListaSectorEmpresa(String nombreListaSectorEmpresa) {
        this.nombreListaSectorEmpresa = nombreListaSectorEmpresa;
    }

    public Integer getOrdenListaSectorEmpresa() {
        return ordenListaSectorEmpresa;
    }

    public void setOrdenListaSectorEmpresa(Integer ordenListaSectorEmpresa) {
        this.ordenListaSectorEmpresa = ordenListaSectorEmpresa;
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
        hash = 97 * hash + Objects.hashCode(this.idListaSectorEmpresa);
        hash = 97 * hash + Objects.hashCode(this.codigoListaSectorEmpresa);
        hash = 97 * hash + Objects.hashCode(this.nombreListaSectorEmpresa);
        hash = 97 * hash + Objects.hashCode(this.ordenListaSectorEmpresa);
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
        final ListasSectoresEmpresas other = (ListasSectoresEmpresas) obj;
        if (!Objects.equals(this.codigoListaSectorEmpresa, other.codigoListaSectorEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaSectorEmpresa, other.nombreListaSectorEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.idListaSectorEmpresa, other.idListaSectorEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaSectorEmpresa, other.ordenListaSectorEmpresa)) {
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
