package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "RequerimientosAspirantes", schema = "crz_th", catalog = "CREZCAMOS")
public class RequerimientosAspirantesEntity {
    private Integer idRequerimientoAspirante;
    private Integer idRequerimiento;
    private Long idAspirante;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRequerimientoAspirante", nullable = false)
    public Integer getIdRequerimientoAspirante() {
        return idRequerimientoAspirante;
    }

    public void setIdRequerimientoAspirante(Integer idRequerimientoAspirante) {
        this.idRequerimientoAspirante = idRequerimientoAspirante;
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
    @Column(name = "IdAspirante", nullable = false)
    public Long getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(Long idAspirante) {
        this.idAspirante = idAspirante;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosAspirantesEntity that = (RequerimientosAspirantesEntity) o;

        if (idRequerimientoAspirante != null ? !idRequerimientoAspirante.equals(that.idRequerimientoAspirante) : that.idRequerimientoAspirante != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idAspirante != null ? !idAspirante.equals(that.idAspirante) : that.idAspirante != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoAspirante != null ? idRequerimientoAspirante.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (idAspirante != null ? idAspirante.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
