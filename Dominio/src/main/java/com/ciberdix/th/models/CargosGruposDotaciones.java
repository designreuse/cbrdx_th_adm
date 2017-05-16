package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class CargosGruposDotaciones {
    private Integer idCargoGrupoDotacion;
    private Integer idCargo;
    private Integer idGrupoDotacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoGrupoDotacion")
    public Integer getIdCargoGrupoDotacion() {
        return idCargoGrupoDotacion;
    }

    public void setIdCargoGrupoDotacion(Integer idCargoGrupoDotacion) {
        this.idCargoGrupoDotacion = idCargoGrupoDotacion;
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
    @Column(name = "IdGrupoDotacion")
    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosGruposDotaciones that = (CargosGruposDotaciones) o;

        if (idCargoGrupoDotacion != null ? !idCargoGrupoDotacion.equals(that.idCargoGrupoDotacion) : that.idCargoGrupoDotacion != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idGrupoDotacion != null ? !idGrupoDotacion.equals(that.idGrupoDotacion) : that.idGrupoDotacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoGrupoDotacion != null ? idCargoGrupoDotacion.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idGrupoDotacion != null ? idGrupoDotacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
