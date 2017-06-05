package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 5/06/2017.
 */
public class VProcesosPasos {

    private Integer idProcesoPaso;
    private Integer idProceso;
    private String codigo;
    private Integer orden;
    private String nombre;
    private String rol;
    private Integer idRol;
    private String tipoConvocatoria;
    private Integer idTipoConvocatoria;
    private Boolean indicadorInterfazInterna;
    private String interfazInterna;
    private Boolean indicadorBloqueante;
    private Boolean indicadorObservacion;
    private Boolean indicadorCorreo;
    private Boolean indicadorAdjunto;
    private Boolean indicadorLlamada;
    private Boolean indicadorCalendario;
    private Boolean indicadorContratado;
    private Boolean indicadorCuestionarios;
    private String cuestionario;
    private String descripcionCuestionario;
    private Integer idCuestionario;
    private Boolean indicadorInterfaz;
    private String interfaz;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getTipoConvocatoria() {
        return tipoConvocatoria;
    }

    public void setTipoConvocatoria(String tipoConvocatoria) {
        this.tipoConvocatoria = tipoConvocatoria;
    }

    public Integer getIdTipoConvocatoria() {
        return idTipoConvocatoria;
    }

    public void setIdTipoConvocatoria(Integer idTipoConvocatoria) {
        this.idTipoConvocatoria = idTipoConvocatoria;
    }

    public Boolean getIndicadorInterfazInterna() {
        return indicadorInterfazInterna;
    }

    public void setIndicadorInterfazInterna(Boolean indicadorInterfazInterna) {
        this.indicadorInterfazInterna = indicadorInterfazInterna;
    }

    public String getInterfazInterna() {
        return interfazInterna;
    }

    public void setInterfazInterna(String interfazInterna) {
        this.interfazInterna = interfazInterna;
    }

    public Boolean getIndicadorBloqueante() {
        return indicadorBloqueante;
    }

    public void setIndicadorBloqueante(Boolean indicadorBloqueante) {
        this.indicadorBloqueante = indicadorBloqueante;
    }

    public Boolean getIndicadorObservacion() {
        return indicadorObservacion;
    }

    public void setIndicadorObservacion(Boolean indicadorObservacion) {
        this.indicadorObservacion = indicadorObservacion;
    }

    public Boolean getIndicadorCorreo() {
        return indicadorCorreo;
    }

    public void setIndicadorCorreo(Boolean indicadorCorreo) {
        this.indicadorCorreo = indicadorCorreo;
    }

    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
    }

    public Boolean getIndicadorLlamada() {
        return indicadorLlamada;
    }

    public void setIndicadorLlamada(Boolean indicadorLlamada) {
        this.indicadorLlamada = indicadorLlamada;
    }

    public Boolean getIndicadorCalendario() {
        return indicadorCalendario;
    }

    public void setIndicadorCalendario(Boolean indicadorCalendario) {
        this.indicadorCalendario = indicadorCalendario;
    }

    public Boolean getIndicadorContratado() {
        return indicadorContratado;
    }

    public void setIndicadorContratado(Boolean indicadorContratado) {
        this.indicadorContratado = indicadorContratado;
    }

    public Boolean getIndicadorCuestionarios() {
        return indicadorCuestionarios;
    }

    public void setIndicadorCuestionarios(Boolean indicadorCuestionarios) {
        this.indicadorCuestionarios = indicadorCuestionarios;
    }

    public String getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(String cuestionario) {
        this.cuestionario = cuestionario;
    }

    public String getDescripcionCuestionario() {
        return descripcionCuestionario;
    }

    public void setDescripcionCuestionario(String descripcionCuestionario) {
        this.descripcionCuestionario = descripcionCuestionario;
    }

    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    public Boolean getIndicadorInterfaz() {
        return indicadorInterfaz;
    }

    public void setIndicadorInterfaz(Boolean indicadorInterfaz) {
        this.indicadorInterfaz = indicadorInterfaz;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
