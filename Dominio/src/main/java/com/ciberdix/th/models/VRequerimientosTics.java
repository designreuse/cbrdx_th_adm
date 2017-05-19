package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 18/05/2017.
 */
@Entity
@Table(name = "V_RequerimientosTics", schema = "crz_th", catalog = "CREZCAMOS")
public class VRequerimientosTics {
    private Integer idRequerimientoTic;
    private Integer idRequerimiento;
    private String tic;
    private Integer idTic;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdRequerimientoTIC", nullable = false)
    public Integer getIdRequerimientoTic() {
        return idRequerimientoTic;
    }

    public void setIdRequerimientoTic(Integer idRequerimientoTic) {
        this.idRequerimientoTic = idRequerimientoTic;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = false)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "TIC", nullable = false, length = 100)
    public String getTic() {
        return tic;
    }

    public void setTic(String tic) {
        this.tic = tic;
    }

    @Basic
    @Column(name = "IdTIC", nullable = true)
    public Integer getIdTic() {
        return idTic;
    }

    public void setIdTic(Integer idTic) {
        this.idTic = idTic;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
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

        VRequerimientosTics that = (VRequerimientosTics) o;

        if (idRequerimientoTic != null ? !idRequerimientoTic.equals(that.idRequerimientoTic) : that.idRequerimientoTic != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (tic != null ? !tic.equals(that.tic) : that.tic != null) return false;
        if (idTic != null ? !idTic.equals(that.idTic) : that.idTic != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoTic != null ? idRequerimientoTic.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (tic != null ? tic.hashCode() : 0);
        result = 31 * result + (idTic != null ? idTic.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
