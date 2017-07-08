package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "ProcesoSeleccionPruebasTecnicas", schema = "dbo", catalog = "CREZCAMOS")
public class ProcesoSeleccionPruebasTecnicas {
    private Integer idProcesoSeleccionPruebaTecnica;
    private Integer idProcesoSeleccion;
    private Integer idPruebaTecnica;
    private Boolean indicadorRealiza;
    private String nota;
    private String observacion;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProcesoSeleccionPruebasTecnicas() {
    }

    public ProcesoSeleccionPruebasTecnicas(Integer idProcesoSeleccion, Integer idPruebaTecnica, Boolean indicadorRealiza, String nota, String observacion, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProcesoSeleccion = idProcesoSeleccion;
        this.idPruebaTecnica = idPruebaTecnica;
        this.indicadorRealiza = indicadorRealiza;
        this.nota = nota;
        this.observacion = observacion;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProcesoSeleccionPruebasTecnicas(Integer idProcesoSeleccionPruebaTecnica, Integer idProcesoSeleccion, Integer idPruebaTecnica, Boolean indicadorRealiza, String nota, String observacion, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProcesoSeleccionPruebaTecnica = idProcesoSeleccionPruebaTecnica;
        this.idProcesoSeleccion = idProcesoSeleccion;
        this.idPruebaTecnica = idPruebaTecnica;
        this.indicadorRealiza = indicadorRealiza;
        this.nota = nota;
        this.observacion = observacion;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProcesoSeleccionPruebaTecnica", nullable = false)
    public Integer getIdProcesoSeleccionPruebaTecnica() {
        return idProcesoSeleccionPruebaTecnica;
    }

    public void setIdProcesoSeleccionPruebaTecnica(Integer idProcesoSeleccionPruebaTecnica) {
        this.idProcesoSeleccionPruebaTecnica = idProcesoSeleccionPruebaTecnica;
    }

    @Basic
    @Column(name = "IdProcesoSeleccion", nullable = true)
    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    @Basic
    @Column(name = "IdPruebaTecnica", nullable = true)
    public Integer getIdPruebaTecnica() {
        return idPruebaTecnica;
    }

    public void setIdPruebaTecnica(Integer idPruebaTecnica) {
        this.idPruebaTecnica = idPruebaTecnica;
    }

    @Basic
    @Column(name = "IndicadorRealiza", nullable = true)
    public Boolean getIndicadorRealiza() {
        return indicadorRealiza;
    }

    public void setIndicadorRealiza(Boolean indicadorRealiza) {
        this.indicadorRealiza = indicadorRealiza;
    }

    @Basic
    @Column(name = "Nota", nullable = true, length = 200)
    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 500)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        ProcesoSeleccionPruebasTecnicas that = (ProcesoSeleccionPruebasTecnicas) o;

        if (idProcesoSeleccionPruebaTecnica != null ? !idProcesoSeleccionPruebaTecnica.equals(that.idProcesoSeleccionPruebaTecnica) : that.idProcesoSeleccionPruebaTecnica != null)
            return false;
        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (idPruebaTecnica != null ? !idPruebaTecnica.equals(that.idPruebaTecnica) : that.idPruebaTecnica != null)
            return false;
        if (indicadorRealiza != null ? !indicadorRealiza.equals(that.indicadorRealiza) : that.indicadorRealiza != null)
            return false;
        if (nota != null ? !nota.equals(that.nota) : that.nota != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProcesoSeleccionPruebaTecnica != null ? idProcesoSeleccionPruebaTecnica.hashCode() : 0;
        result = 31 * result + (idProcesoSeleccion != null ? idProcesoSeleccion.hashCode() : 0);
        result = 31 * result + (idPruebaTecnica != null ? idPruebaTecnica.hashCode() : 0);
        result = 31 * result + (indicadorRealiza != null ? indicadorRealiza.hashCode() : 0);
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
