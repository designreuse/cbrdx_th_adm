package com.ciberdix.th.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Danny on 17/07/2017.
 */
public class Dotaciones {

    private Integer idDotacion;
    private Integer idGrupoDotacion;
    private String dotacion;
    private String descripcion;
    private BigDecimal costo;
    private String detalleProveedor;
    private Integer idCicloEntrega;
    private Integer idTipoTalla;
    private Integer cantidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idAdjunto;
    private Boolean indicadorAdicional;
    private String codigo;
    private Boolean indicadorRequiereTalla;

    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
    }

    public String getDotacion() {
        return dotacion;
    }

    public void setDotacion(String dotacion) {
        this.dotacion = dotacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getDetalleProveedor() {
        return detalleProveedor;
    }

    public void setDetalleProveedor(String detalleProveedor) {
        this.detalleProveedor = detalleProveedor;
    }

    public Integer getIdCicloEntrega() {
        return idCicloEntrega;
    }

    public void setIdCicloEntrega(Integer idCicloEntrega) {
        this.idCicloEntrega = idCicloEntrega;
    }

    public Integer getIdTipoTalla() {
        return idTipoTalla;
    }

    public void setIdTipoTalla(Integer idTipoTalla) {
        this.idTipoTalla = idTipoTalla;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    public Boolean getIndicadorAdicional() {
        return indicadorAdicional;
    }

    public void setIndicadorAdicional(Boolean indicadorAdicional) {
        this.indicadorAdicional = indicadorAdicional;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getIndicadorRequiereTalla() {
        return indicadorRequiereTalla;
    }

    public void setIndicadorRequiereTalla(Boolean indicadorRequiereTalla) {
        this.indicadorRequiereTalla = indicadorRequiereTalla;
    }
}
