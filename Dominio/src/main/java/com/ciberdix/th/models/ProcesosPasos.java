package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/06/2017.
 */
@Entity
@Table(name = "ProcesosPasos", schema = "dbo", catalog = "CREZCAMOS")
public class ProcesosPasos {
    private Integer idProcesoPaso;
    private Integer idProceso;
    private String codigo;
    private Integer orden;
    private String nombre;
    private Integer idRol;
    private Integer idTipoConvocatoria;
    private Boolean indicadorInterfazInterna;
    private String interfazInterna;
    private Boolean indicadorBloqueante;
    private Boolean indicadorObservacion;
    private Boolean indicadorCorreo;
    private Boolean indicadorAdjunto;
    private Boolean indicadorCalendario;
    private Boolean indicadorCuestionarios;
    private Integer idCuestionario;
    private Boolean indicadorInterfaz;
    private String interfaz;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public ProcesosPasos() {
    }

    public ProcesosPasos(Integer idProceso, String codigo, Integer orden, String nombre, Integer idRol, Integer idTipoConvocatoria, Boolean indicadorInterfazInterna, String interfazInterna, Boolean indicadorBloqueante, Boolean indicadorObservacion, Boolean indicadorCorreo, Boolean indicadorAdjunto, Boolean indicadorCalendario, Boolean indicadorCuestionarios, Integer idCuestionario, Boolean indicadorInterfaz, String interfaz, String descripcion, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idProceso = idProceso;
        this.codigo = codigo;
        this.orden = orden;
        this.nombre = nombre;
        this.idRol = idRol;
        this.idTipoConvocatoria = idTipoConvocatoria;
        this.indicadorInterfazInterna = indicadorInterfazInterna;
        this.interfazInterna = interfazInterna;
        this.indicadorBloqueante = indicadorBloqueante;
        this.indicadorObservacion = indicadorObservacion;
        this.indicadorCorreo = indicadorCorreo;
        this.indicadorAdjunto = indicadorAdjunto;
        this.indicadorCalendario = indicadorCalendario;
        this.indicadorCuestionarios = indicadorCuestionarios;
        this.idCuestionario = idCuestionario;
        this.indicadorInterfaz = indicadorInterfaz;
        this.interfaz = interfaz;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public ProcesosPasos(Integer idProcesoPaso, Integer idProceso, String codigo, Integer orden, String nombre, Integer idRol, Integer idTipoConvocatoria, Boolean indicadorInterfazInterna, String interfazInterna, Boolean indicadorBloqueante, Boolean indicadorObservacion, Boolean indicadorCorreo, Boolean indicadorAdjunto, Boolean indicadorCalendario, Boolean indicadorCuestionarios, Integer idCuestionario, Boolean indicadorInterfaz, String interfaz, String descripcion, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idProcesoPaso = idProcesoPaso;
        this.idProceso = idProceso;
        this.codigo = codigo;
        this.orden = orden;
        this.nombre = nombre;
        this.idRol = idRol;
        this.idTipoConvocatoria = idTipoConvocatoria;
        this.indicadorInterfazInterna = indicadorInterfazInterna;
        this.interfazInterna = interfazInterna;
        this.indicadorBloqueante = indicadorBloqueante;
        this.indicadorObservacion = indicadorObservacion;
        this.indicadorCorreo = indicadorCorreo;
        this.indicadorAdjunto = indicadorAdjunto;
        this.indicadorCalendario = indicadorCalendario;
        this.indicadorCuestionarios = indicadorCuestionarios;
        this.idCuestionario = idCuestionario;
        this.indicadorInterfaz = indicadorInterfaz;
        this.interfaz = interfaz;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProcesoPaso", nullable = false)
    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    @Basic
    @Column(name = "IdProceso", nullable = true)
    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 20)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    @Column(name = "Nombre", nullable = true, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "IdRol", nullable = true)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "IdTipoConvocatoria", nullable = true)
    public Integer getIdTipoConvocatoria() {
        return idTipoConvocatoria;
    }

    public void setIdTipoConvocatoria(Integer idTipoConvocatoria) {
        this.idTipoConvocatoria = idTipoConvocatoria;
    }

    @Basic
    @Column(name = "IndicadorInterfazInterna", nullable = true)
    public Boolean getIndicadorInterfazInterna() {
        return indicadorInterfazInterna;
    }

    public void setIndicadorInterfazInterna(Boolean indicadorInterfazInterna) {
        this.indicadorInterfazInterna = indicadorInterfazInterna;
    }

    @Basic
    @Column(name = "InterfazInterna", nullable = true, length = 100)
    public String getInterfazInterna() {
        return interfazInterna;
    }

    public void setInterfazInterna(String interfazInterna) {
        this.interfazInterna = interfazInterna;
    }

    @Basic
    @Column(name = "IndicadorBloqueante", nullable = true)
    public Boolean getIndicadorBloqueante() {
        return indicadorBloqueante;
    }

    public void setIndicadorBloqueante(Boolean indicadorBloqueante) {
        this.indicadorBloqueante = indicadorBloqueante;
    }

    @Basic
    @Column(name = "IndicadorObservacion", nullable = true)
    public Boolean getIndicadorObservacion() {
        return indicadorObservacion;
    }

    public void setIndicadorObservacion(Boolean indicadorObservacion) {
        this.indicadorObservacion = indicadorObservacion;
    }

    @Basic
    @Column(name = "IndicadorCorreo", nullable = true)
    public Boolean getIndicadorCorreo() {
        return indicadorCorreo;
    }

    public void setIndicadorCorreo(Boolean indicadorCorreo) {
        this.indicadorCorreo = indicadorCorreo;
    }

    @Basic
    @Column(name = "IndicadorAdjunto", nullable = true)
    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
    }

    @Basic
    @Column(name = "IndicadorCalendario", nullable = true)
    public Boolean getIndicadorCalendario() {
        return indicadorCalendario;
    }

    public void setIndicadorCalendario(Boolean indicadorCalendario) {
        this.indicadorCalendario = indicadorCalendario;
    }

    @Basic
    @Column(name = "IndicadorCuestionarios", nullable = true)
    public Boolean getIndicadorCuestionarios() {
        return indicadorCuestionarios;
    }

    public void setIndicadorCuestionarios(Boolean indicadorCuestionarios) {
        this.indicadorCuestionarios = indicadorCuestionarios;
    }

    @Basic
    @Column(name = "IdCuestionario", nullable = true)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    @Basic
    @Column(name = "IndicadorInterfaz", nullable = true)
    public Boolean getIndicadorInterfaz() {
        return indicadorInterfaz;
    }

    public void setIndicadorInterfaz(Boolean indicadorInterfaz) {
        this.indicadorInterfaz = indicadorInterfaz;
    }

    @Basic
    @Column(name = "Interfaz", nullable = true, length = 100)
    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 200)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        ProcesosPasos that = (ProcesosPasos) o;

        if (idProcesoPaso != null ? !idProcesoPaso.equals(that.idProcesoPaso) : that.idProcesoPaso != null)
            return false;
        if (idProceso != null ? !idProceso.equals(that.idProceso) : that.idProceso != null) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idTipoConvocatoria != null ? !idTipoConvocatoria.equals(that.idTipoConvocatoria) : that.idTipoConvocatoria != null)
            return false;
        if (indicadorInterfazInterna != null ? !indicadorInterfazInterna.equals(that.indicadorInterfazInterna) : that.indicadorInterfazInterna != null)
            return false;
        if (interfazInterna != null ? !interfazInterna.equals(that.interfazInterna) : that.interfazInterna != null)
            return false;
        if (indicadorBloqueante != null ? !indicadorBloqueante.equals(that.indicadorBloqueante) : that.indicadorBloqueante != null)
            return false;
        if (indicadorObservacion != null ? !indicadorObservacion.equals(that.indicadorObservacion) : that.indicadorObservacion != null)
            return false;
        if (indicadorCorreo != null ? !indicadorCorreo.equals(that.indicadorCorreo) : that.indicadorCorreo != null)
            return false;
        if (indicadorAdjunto != null ? !indicadorAdjunto.equals(that.indicadorAdjunto) : that.indicadorAdjunto != null)
            return false;
        if (indicadorCalendario != null ? !indicadorCalendario.equals(that.indicadorCalendario) : that.indicadorCalendario != null)
            return false;
        if (indicadorCuestionarios != null ? !indicadorCuestionarios.equals(that.indicadorCuestionarios) : that.indicadorCuestionarios != null)
            return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (indicadorInterfaz != null ? !indicadorInterfaz.equals(that.indicadorInterfaz) : that.indicadorInterfaz != null)
            return false;
        if (interfaz != null ? !interfaz.equals(that.interfaz) : that.interfaz != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
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
        int result = idProcesoPaso != null ? idProcesoPaso.hashCode() : 0;
        result = 31 * result + (idProceso != null ? idProceso.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (idTipoConvocatoria != null ? idTipoConvocatoria.hashCode() : 0);
        result = 31 * result + (indicadorInterfazInterna != null ? indicadorInterfazInterna.hashCode() : 0);
        result = 31 * result + (interfazInterna != null ? interfazInterna.hashCode() : 0);
        result = 31 * result + (indicadorBloqueante != null ? indicadorBloqueante.hashCode() : 0);
        result = 31 * result + (indicadorObservacion != null ? indicadorObservacion.hashCode() : 0);
        result = 31 * result + (indicadorCorreo != null ? indicadorCorreo.hashCode() : 0);
        result = 31 * result + (indicadorAdjunto != null ? indicadorAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorCalendario != null ? indicadorCalendario.hashCode() : 0);
        result = 31 * result + (indicadorCuestionarios != null ? indicadorCuestionarios.hashCode() : 0);
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (indicadorInterfaz != null ? indicadorInterfaz.hashCode() : 0);
        result = 31 * result + (interfaz != null ? interfaz.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
