package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "UnidadesTerritoriales", schema = "crz_th", catalog = "CREZCAMOS")
public class UnidadesTerritorialesEntity {
    private Integer idUnidadTerritorial;
    private Integer idPais;
    private String unidadTerritorial;
    private Integer idTipoUnidadTerritorial;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdUnidadTerritorial", nullable = false)
    public Integer getIdUnidadTerritorial() {
        return idUnidadTerritorial;
    }

    public void setIdUnidadTerritorial(Integer idUnidadTerritorial) {
        this.idUnidadTerritorial = idUnidadTerritorial;
    }

    @Basic
    @Column(name = "IdPais", nullable = true)
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "UnidadTerritorial", nullable = true, length = 128)
    public String getUnidadTerritorial() {
        return unidadTerritorial;
    }

    public void setUnidadTerritorial(String unidadTerritorial) {
        this.unidadTerritorial = unidadTerritorial;
    }

    @Basic
    @Column(name = "IdTipoUnidadTerritorial", nullable = true)
    public Integer getIdTipoUnidadTerritorial() {
        return idTipoUnidadTerritorial;
    }

    public void setIdTipoUnidadTerritorial(Integer idTipoUnidadTerritorial) {
        this.idTipoUnidadTerritorial = idTipoUnidadTerritorial;
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

        UnidadesTerritorialesEntity that = (UnidadesTerritorialesEntity) o;

        if (idUnidadTerritorial != null ? !idUnidadTerritorial.equals(that.idUnidadTerritorial) : that.idUnidadTerritorial != null)
            return false;
        if (idPais != null ? !idPais.equals(that.idPais) : that.idPais != null) return false;
        if (unidadTerritorial != null ? !unidadTerritorial.equals(that.unidadTerritorial) : that.unidadTerritorial != null)
            return false;
        if (idTipoUnidadTerritorial != null ? !idTipoUnidadTerritorial.equals(that.idTipoUnidadTerritorial) : that.idTipoUnidadTerritorial != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUnidadTerritorial != null ? idUnidadTerritorial.hashCode() : 0;
        result = 31 * result + (idPais != null ? idPais.hashCode() : 0);
        result = 31 * result + (unidadTerritorial != null ? unidadTerritorial.hashCode() : 0);
        result = 31 * result + (idTipoUnidadTerritorial != null ? idTipoUnidadTerritorial.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
