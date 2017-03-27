package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosRitualesCriterios {
    private Integer idTerceroRitualCriterio;
    private Integer idTerceroRitual;
    private Integer idCriterio;
    private BigDecimal nota;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroRitualCriterio")
    public Integer getIdTerceroRitualCriterio() {
        return idTerceroRitualCriterio;
    }

    public void setIdTerceroRitualCriterio(Integer idTerceroRitualCriterio) {
        this.idTerceroRitualCriterio = idTerceroRitualCriterio;
    }

    @Basic
    @Column(name = "IdTerceroRitual")
    public Integer getIdTerceroRitual() {
        return idTerceroRitual;
    }

    public void setIdTerceroRitual(Integer idTerceroRitual) {
        this.idTerceroRitual = idTerceroRitual;
    }

    @Basic
    @Column(name = "IdCriterio")
    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
    }

    @Basic
    @Column(name = "Nota")
    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
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

        TercerosRitualesCriterios that = (TercerosRitualesCriterios) o;

        if (idTerceroRitualCriterio != null ? !idTerceroRitualCriterio.equals(that.idTerceroRitualCriterio) : that.idTerceroRitualCriterio != null)
            return false;
        if (idTerceroRitual != null ? !idTerceroRitual.equals(that.idTerceroRitual) : that.idTerceroRitual != null)
            return false;
        if (idCriterio != null ? !idCriterio.equals(that.idCriterio) : that.idCriterio != null) return false;
        if (nota != null ? !nota.equals(that.nota) : that.nota != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroRitualCriterio != null ? idTerceroRitualCriterio.hashCode() : 0;
        result = 31 * result + (idTerceroRitual != null ? idTerceroRitual.hashCode() : 0);
        result = 31 * result + (idCriterio != null ? idCriterio.hashCode() : 0);
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
