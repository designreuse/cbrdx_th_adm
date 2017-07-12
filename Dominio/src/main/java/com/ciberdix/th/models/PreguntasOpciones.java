package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 9/07/2017.
 */
@Entity
@Table(name = "PreguntasOpciones", schema = "dbo", catalog = "CREZCAMOS")
public class PreguntasOpciones {
    private Integer idPreguntaOpcion;
    private Integer idCuestionarioPregunta;
    private String codigoOpcion;
    private String opcion;
    private Integer orden;
    private Boolean indicadorCorrecto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public PreguntasOpciones() {
    }

    public PreguntasOpciones(Integer idCuestionarioPregunta, String codigoOpcion, String opcion, Integer orden, Boolean indicadorCorrecto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
        this.codigoOpcion = codigoOpcion;
        this.opcion = opcion;
        this.orden = orden;
        this.indicadorCorrecto = indicadorCorrecto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public PreguntasOpciones(Integer idPreguntaOpcion, Integer idCuestionarioPregunta, String codigoOpcion, String opcion, Integer orden, Boolean indicadorCorrecto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPreguntaOpcion = idPreguntaOpcion;
        this.idCuestionarioPregunta = idCuestionarioPregunta;
        this.codigoOpcion = codigoOpcion;
        this.opcion = opcion;
        this.orden = orden;
        this.indicadorCorrecto = indicadorCorrecto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdPreguntaOpcion", nullable = false)
    public Integer getIdPreguntaOpcion() {
        return idPreguntaOpcion;
    }

    public void setIdPreguntaOpcion(Integer idPreguntaOpcion) {
        this.idPreguntaOpcion = idPreguntaOpcion;
    }

    @Basic
    @Column(name = "IdCuestionarioPregunta", nullable = false)
    public Integer getIdCuestionarioPregunta() {
        return idCuestionarioPregunta;
    }

    public void setIdCuestionarioPregunta(Integer idCuestionarioPregunta) {
        this.idCuestionarioPregunta = idCuestionarioPregunta;
    }

    @Basic
    @Column(name = "CodigoOpcion", nullable = true, length = 50)
    public String getCodigoOpcion() {
        return codigoOpcion;
    }

    public void setCodigoOpcion(String codigoOpcion) {
        this.codigoOpcion = codigoOpcion;
    }

    @Basic
    @Column(name = "Opcion", nullable = true, length = 500)
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    @Basic
    @Column(name = "Orden", nullable = true)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "IndicadorCorrecto", nullable = true)
    public Boolean getIndicadorCorrecto() {
        return indicadorCorrecto;
    }

    public void setIndicadorCorrecto(Boolean indicadorCorrecto) {
        this.indicadorCorrecto = indicadorCorrecto;
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

        PreguntasOpciones that = (PreguntasOpciones) o;

        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (idCuestionarioPregunta != null ? !idCuestionarioPregunta.equals(that.idCuestionarioPregunta) : that.idCuestionarioPregunta != null)
            return false;
        if (codigoOpcion != null ? !codigoOpcion.equals(that.codigoOpcion) : that.codigoOpcion != null) return false;
        if (opcion != null ? !opcion.equals(that.opcion) : that.opcion != null) return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
        if (indicadorCorrecto != null ? !indicadorCorrecto.equals(that.indicadorCorrecto) : that.indicadorCorrecto != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0;
        result = 31 * result + (idCuestionarioPregunta != null ? idCuestionarioPregunta.hashCode() : 0);
        result = 31 * result + (codigoOpcion != null ? codigoOpcion.hashCode() : 0);
        result = 31 * result + (opcion != null ? opcion.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (indicadorCorrecto != null ? indicadorCorrecto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
