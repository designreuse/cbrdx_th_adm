package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "RequerimientosTICS", schema = "crz_th", catalog = "CREZCAMOS")
public class RequerimientosTics {
    private Integer idRequerimientoTic;
    private Integer idRequerimiento;
    private Integer idTic;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RequerimientosTics() {
    }

    public RequerimientosTics(Integer idRequerimiento, Integer idTic, Integer auditoriaUsuario) {
        this.idRequerimiento = idRequerimiento;
        this.idTic = idTic;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimientoTIC")
    public Integer getIdRequerimientoTic() {
        return idRequerimientoTic;
    }

    public void setIdRequerimientoTic(Integer idRequerimientoTic) {
        this.idRequerimientoTic = idRequerimientoTic;
    }

    @Basic
    @Column(name = "IdRequerimiento")
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "IdTIC")
    public Integer getIdTic() {
        return idTic;
    }

    public void setIdTic(Integer idTic) {
        this.idTic = idTic;
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

        RequerimientosTics that = (RequerimientosTics) o;

        if (idRequerimientoTic != null ? !idRequerimientoTic.equals(that.idRequerimientoTic) : that.idRequerimientoTic != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idTic != null ? !idTic.equals(that.idTic) : that.idTic != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoTic != null ? idRequerimientoTic.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (idTic != null ? idTic.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
