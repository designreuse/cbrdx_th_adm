package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_ProyeccionesDotacionesTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class VProyeccionesDotacionesTerceros {
    private Integer idProyeccionDotacionTerceros;
    private String nombreProyeccion;
    private Integer idProyeccionDotacion;
    private String documento;
    private String imagen;
    private String nombreCompleto;
    private String cargo;
    private String area;
    private String tipoArea;
    private Long idTercero;
    private String estado;
    private Integer idEstado;
    private Date fechaEntrega;
    private Date fechaPosibleEntrega;
    private String comentario;
    private String comentarioAdicional;
    private String comentarioEntrega;
    private String observacion;
    private String motivoInsatisfecho;
    private Integer idMotivoSatisfecho;
    private Boolean indicadorSatisfecho;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdProyeccionDotacionTerceros", nullable = false)
    public Integer getIdProyeccionDotacionTerceros() {
        return idProyeccionDotacionTerceros;
    }

    public void setIdProyeccionDotacionTerceros(Integer idProyeccionDotacionTerceros) {
        this.idProyeccionDotacionTerceros = idProyeccionDotacionTerceros;
    }

    @Basic
    @Column(name = "NombreProyeccion", nullable = true, length = 200)
    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
    }

    @Basic
    @Column(name = "IdProyeccionDotacion", nullable = true)
    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
    }

    @Basic
    @Column(name = "Documento", nullable = true, length = 13)
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Basic
    @Column(name = "Imagen", nullable = true, length = 64)
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Basic
    @Column(name = "NombreCompleto", nullable = false, length = 259)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "Area", nullable = true, length = 50)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "TipoArea", nullable = true, length = 40)
    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "Estado", nullable = true, length = 100)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "FechaEntrega", nullable = true)
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Basic
    @Column(name = "FechaPosibleEntrega", nullable = true)
    public Date getFechaPosibleEntrega() {
        return fechaPosibleEntrega;
    }

    public void setFechaPosibleEntrega(Date fechaPosibleEntrega) {
        this.fechaPosibleEntrega = fechaPosibleEntrega;
    }

    @Basic
    @Column(name = "Comentario", nullable = true, length = 500)
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Basic
    @Column(name = "ComentarioAdicional", nullable = true, length = 500)
    public String getComentarioAdicional() {
        return comentarioAdicional;
    }

    public void setComentarioAdicional(String comentarioAdicional) {
        this.comentarioAdicional = comentarioAdicional;
    }

    @Basic
    @Column(name = "ComentarioEntrega", nullable = true, length = 500)
    public String getComentarioEntrega() {
        return comentarioEntrega;
    }

    public void setComentarioEntrega(String comentarioEntrega) {
        this.comentarioEntrega = comentarioEntrega;
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
    @Column(name = "MotivoInsatisfecho", nullable = true, length = 100)
    public String getMotivoInsatisfecho() {
        return motivoInsatisfecho;
    }

    public void setMotivoInsatisfecho(String motivoInsatisfecho) {
        this.motivoInsatisfecho = motivoInsatisfecho;
    }

    @Basic
    @Column(name = "IdMotivoSatisfecho", nullable = true)
    public Integer getIdMotivoSatisfecho() {
        return idMotivoSatisfecho;
    }

    public void setIdMotivoSatisfecho(Integer idMotivoSatisfecho) {
        this.idMotivoSatisfecho = idMotivoSatisfecho;
    }

    @Basic
    @Column(name = "IndicadorSatisfecho", nullable = true)
    public Boolean getIndicadorSatisfecho() {
        return indicadorSatisfecho;
    }

    public void setIndicadorSatisfecho(Boolean indicadorSatisfecho) {
        this.indicadorSatisfecho = indicadorSatisfecho;
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

        VProyeccionesDotacionesTerceros that = (VProyeccionesDotacionesTerceros) o;

        if (idProyeccionDotacionTerceros != null ? !idProyeccionDotacionTerceros.equals(that.idProyeccionDotacionTerceros) : that.idProyeccionDotacionTerceros != null)
            return false;
        if (nombreProyeccion != null ? !nombreProyeccion.equals(that.nombreProyeccion) : that.nombreProyeccion != null)
            return false;
        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (documento != null ? !documento.equals(that.documento) : that.documento != null) return false;
        if (imagen != null ? !imagen.equals(that.imagen) : that.imagen != null) return false;
        if (nombreCompleto != null ? !nombreCompleto.equals(that.nombreCompleto) : that.nombreCompleto != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (tipoArea != null ? !tipoArea.equals(that.tipoArea) : that.tipoArea != null) return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(that.fechaEntrega) : that.fechaEntrega != null) return false;
        if (fechaPosibleEntrega != null ? !fechaPosibleEntrega.equals(that.fechaPosibleEntrega) : that.fechaPosibleEntrega != null)
            return false;
        if (comentario != null ? !comentario.equals(that.comentario) : that.comentario != null) return false;
        if (comentarioAdicional != null ? !comentarioAdicional.equals(that.comentarioAdicional) : that.comentarioAdicional != null)
            return false;
        if (comentarioEntrega != null ? !comentarioEntrega.equals(that.comentarioEntrega) : that.comentarioEntrega != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (motivoInsatisfecho != null ? !motivoInsatisfecho.equals(that.motivoInsatisfecho) : that.motivoInsatisfecho != null)
            return false;
        if (idMotivoSatisfecho != null ? !idMotivoSatisfecho.equals(that.idMotivoSatisfecho) : that.idMotivoSatisfecho != null)
            return false;
        if (indicadorSatisfecho != null ? !indicadorSatisfecho.equals(that.indicadorSatisfecho) : that.indicadorSatisfecho != null)
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
        int result = idProyeccionDotacionTerceros != null ? idProyeccionDotacionTerceros.hashCode() : 0;
        result = 31 * result + (nombreProyeccion != null ? nombreProyeccion.hashCode() : 0);
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (documento != null ? documento.hashCode() : 0);
        result = 31 * result + (imagen != null ? imagen.hashCode() : 0);
        result = 31 * result + (nombreCompleto != null ? nombreCompleto.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (tipoArea != null ? tipoArea.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (fechaPosibleEntrega != null ? fechaPosibleEntrega.hashCode() : 0);
        result = 31 * result + (comentario != null ? comentario.hashCode() : 0);
        result = 31 * result + (comentarioAdicional != null ? comentarioAdicional.hashCode() : 0);
        result = 31 * result + (comentarioEntrega != null ? comentarioEntrega.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (motivoInsatisfecho != null ? motivoInsatisfecho.hashCode() : 0);
        result = 31 * result + (idMotivoSatisfecho != null ? idMotivoSatisfecho.hashCode() : 0);
        result = 31 * result + (indicadorSatisfecho != null ? indicadorSatisfecho.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
