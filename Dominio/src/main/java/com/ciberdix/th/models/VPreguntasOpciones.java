package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 9/07/2017.
 */
@Entity
@Table(name = "V_PreguntasOpciones", schema = "dbo", catalog = "CREZCAMOS")
public class VPreguntasOpciones {
    private Integer idPreguntaOpcion;
    private String pregunta;
    private Integer idCuestionarioPregunta;
    private String codigoOpcion;
    private String opcion;
    private Integer orden;
    private Boolean indicadorCorrecto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdPreguntaOpcion", nullable = false)
    public Integer getIdPreguntaOpcion() {
        return idPreguntaOpcion;
    }

    public void setIdPreguntaOpcion(Integer idPreguntaOpcion) {
        this.idPreguntaOpcion = idPreguntaOpcion;
    }

    @Basic
    @Column(name = "Pregunta", nullable = true, length = 100)
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
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
    @Column(name = "Opcion", nullable = true, length = 200)
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

        VPreguntasOpciones that = (VPreguntasOpciones) o;

        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (pregunta != null ? !pregunta.equals(that.pregunta) : that.pregunta != null) return false;
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
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0;
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
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
