package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Danny on 11/07/2017.
 */
@Entity
public class TercerosPublicacionesMaestroRespuestas {
    private Integer idTerceroPublicacionMaestroRespuestas;
    private Integer idTercerosPublicaciones;
    private Integer idMaestroRespuesta;

    @Id
    @Column(name = "IdTerceroPublicacionMaestroRespuestas", nullable = false)
    public Integer getIdTerceroPublicacionMaestroRespuestas() {
        return idTerceroPublicacionMaestroRespuestas;
    }

    public void setIdTerceroPublicacionMaestroRespuestas(Integer idTerceroPublicacionMaestroRespuestas) {
        this.idTerceroPublicacionMaestroRespuestas = idTerceroPublicacionMaestroRespuestas;
    }

    @Basic
    @Column(name = "IdTercerosPublicaciones", nullable = true)
    public Integer getIdTercerosPublicaciones() {
        return idTercerosPublicaciones;
    }

    public void setIdTercerosPublicaciones(Integer idTercerosPublicaciones) {
        this.idTercerosPublicaciones = idTercerosPublicaciones;
    }

    @Basic
    @Column(name = "IdMaestroRespuesta", nullable = true)
    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosPublicacionesMaestroRespuestas that = (TercerosPublicacionesMaestroRespuestas) o;

        if (idTerceroPublicacionMaestroRespuestas != null ? !idTerceroPublicacionMaestroRespuestas.equals(that.idTerceroPublicacionMaestroRespuestas) : that.idTerceroPublicacionMaestroRespuestas != null)
            return false;
        if (idTercerosPublicaciones != null ? !idTercerosPublicaciones.equals(that.idTercerosPublicaciones) : that.idTercerosPublicaciones != null)
            return false;
        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroPublicacionMaestroRespuestas != null ? idTerceroPublicacionMaestroRespuestas.hashCode() : 0;
        result = 31 * result + (idTercerosPublicaciones != null ? idTercerosPublicaciones.hashCode() : 0);
        result = 31 * result + (idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0);
        return result;
    }
}
