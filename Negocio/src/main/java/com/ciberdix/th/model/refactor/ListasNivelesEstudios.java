package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class ListasNivelesEstudios {
    private Integer idListaNivelEstudio;
    private String codigoListaNivelEstudio;
    private String nombreListaNivelEstudio;
    private Integer ordenListaNivelEstudio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdListaNivelEstudio() {
        return idListaNivelEstudio;
    }

    public void setIdListaNivelEstudio(Integer idListaNivelEstudio) {
        this.idListaNivelEstudio = idListaNivelEstudio;
    }

    public String getCodigoListaNivelEstudio() {
        return codigoListaNivelEstudio;
    }

    public void setCodigoListaNivelEstudio(String codigoListaNivelEstudio) {
        this.codigoListaNivelEstudio = codigoListaNivelEstudio;
    }

    public String getNombreListaNivelEstudio() {
        return nombreListaNivelEstudio;
    }

    public void setNombreListaNivelEstudio(String nombreListaNivelEstudio) {
        this.nombreListaNivelEstudio = nombreListaNivelEstudio;
    }

    public Integer getOrdenListaNivelEstudio() {
        return ordenListaNivelEstudio;
    }

    public void setOrdenListaNivelEstudio(Integer ordenListaNivelEstudio) {
        this.ordenListaNivelEstudio = ordenListaNivelEstudio;
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
        hash = 31 * hash + Objects.hashCode(this.idListaNivelEstudio);
        hash = 31 * hash + Objects.hashCode(this.codigoListaNivelEstudio);
        hash = 31 * hash + Objects.hashCode(this.nombreListaNivelEstudio);
        hash = 31 * hash + Objects.hashCode(this.ordenListaNivelEstudio);
        hash = 31 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 31 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 31 * hash + Objects.hashCode(this.auditoriaFecha);
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
        final ListasNivelesEstudios other = (ListasNivelesEstudios) obj;
        if (!Objects.equals(this.codigoListaNivelEstudio, other.codigoListaNivelEstudio)) {
            return false;
        }
        if (!Objects.equals(this.nombreListaNivelEstudio, other.nombreListaNivelEstudio)) {
            return false;
        }
        if (!Objects.equals(this.idListaNivelEstudio, other.idListaNivelEstudio)) {
            return false;
        }
        if (!Objects.equals(this.ordenListaNivelEstudio, other.ordenListaNivelEstudio)) {
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
