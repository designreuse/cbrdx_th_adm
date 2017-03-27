package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class Ocupaciones {
    private Integer idOcupacion;
    private Integer idOcupacionPadre;
    private Integer idOcupacionTipo;
    private String codigoOcupacion;
    private String ocupacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public Integer getIdOcupacionPadre() {
        return idOcupacionPadre;
    }

    public void setIdOcupacionPadre(Integer idOcupacionPadre) {
        this.idOcupacionPadre = idOcupacionPadre;
    }

    public Integer getIdOcupacionTipo() {
        return idOcupacionTipo;
    }

    public void setIdOcupacionTipo(Integer idOcupacionTipo) {
        this.idOcupacionTipo = idOcupacionTipo;
    }

    public String getCodigoOcupacion() {
        return codigoOcupacion;
    }

    public void setCodigoOcupacion(String codigoOcupacion) {
        this.codigoOcupacion = codigoOcupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
        hash = 41 * hash + Objects.hashCode(this.idOcupacion);
        hash = 41 * hash + Objects.hashCode(this.idOcupacionPadre);
        hash = 41 * hash + Objects.hashCode(this.idOcupacionTipo);
        hash = 41 * hash + Objects.hashCode(this.codigoOcupacion);
        hash = 41 * hash + Objects.hashCode(this.ocupacion);
        hash = 41 * hash + Objects.hashCode(this.indicadorHabilitado);
        hash = 41 * hash + Objects.hashCode(this.auditoriaUsuario);
        hash = 41 * hash + Objects.hashCode(this.auditoriaFecha);
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
        final Ocupaciones other = (Ocupaciones) obj;
        if (!Objects.equals(this.codigoOcupacion, other.codigoOcupacion)) {
            return false;
        }
        if (!Objects.equals(this.ocupacion, other.ocupacion)) {
            return false;
        }
        if (!Objects.equals(this.idOcupacion, other.idOcupacion)) {
            return false;
        }
        if (!Objects.equals(this.idOcupacionPadre, other.idOcupacionPadre)) {
            return false;
        }
        if (!Objects.equals(this.idOcupacionTipo, other.idOcupacionTipo)) {
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
