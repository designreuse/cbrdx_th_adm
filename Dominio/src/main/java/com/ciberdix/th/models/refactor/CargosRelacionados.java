package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
@Entity
@Table(name = "CargosRelacionados", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosRelacionados {
    private Integer idCargoRelacionado;
    private Integer idTipoRelacion;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idCargoRelacion;
    private Boolean indicadorHabilitado;

    public CargosRelacionados() {
    }

    public CargosRelacionados(Integer idTipoRelacion, Integer idCargo, Integer auditoriaUsuario, Integer idCargoRelacion, Boolean indicadorHabilitado) {
        this.idTipoRelacion = idTipoRelacion;
        this.idCargo = idCargo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.idCargoRelacion = idCargoRelacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoRelacionado")
    public Integer getIdCargoRelacionado() {
        return idCargoRelacionado;
    }

    public void setIdCargoRelacionado(Integer idCargoRelacionado) {
        this.idCargoRelacionado = idCargoRelacionado;
    }

    @Basic
    @Column(name = "IdTipoRelacion")
    public Integer getIdTipoRelacion() {
        return idTipoRelacion;
    }

    public void setIdTipoRelacion(Integer idTipoRelacion) {
        this.idTipoRelacion = idTipoRelacion;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
    @Column(name = "IdCargoRelacion")
    public Integer getIdCargoRelacion() {
        return idCargoRelacion;
    }

    public void setIdCargoRelacion(Integer idCargoRelacion) {
        this.idCargoRelacion = idCargoRelacion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosRelacionados that = (CargosRelacionados) o;

        if (idCargoRelacionado != null ? !idCargoRelacionado.equals(that.idCargoRelacionado) : that.idCargoRelacionado != null)
            return false;
        if (idTipoRelacion != null ? !idTipoRelacion.equals(that.idTipoRelacion) : that.idTipoRelacion != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idCargoRelacion != null ? !idCargoRelacion.equals(that.idCargoRelacion) : that.idCargoRelacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRelacionado != null ? idCargoRelacionado.hashCode() : 0;
        result = 31 * result + (idTipoRelacion != null ? idTipoRelacion.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idCargoRelacion != null ? idCargoRelacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
