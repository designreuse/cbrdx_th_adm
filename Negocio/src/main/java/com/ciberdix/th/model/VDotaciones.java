package com.ciberdix.th.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Danny on 17/07/2017.
 */
public class VDotaciones {

    private Integer idDotacion;
    private String grupoDotacion;
    private Integer idGrupoDotacion;
    private String dotacion;
    private String descripcion;
    private BigDecimal costo;
    private String detalleProveedor;
    private String cicloEntrega;
    private Integer idCicloEntrega;
    private String tipoTalla;
    private Integer idTipoTalla;
    private Integer cantidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Boolean indicadorAdicional;
    private String codigo;
    private Boolean indicadorRequiereTalla;
    private Integer CantidadTotal;

    public Integer getIdDotacion() {
        return idDotacion;
    }

    public void setIdDotacion(Integer idDotacion) {
        this.idDotacion = idDotacion;
    }

    public String getGrupoDotacion() {
        return grupoDotacion;
    }

    public void setGrupoDotacion(String grupoDotacion) {
        this.grupoDotacion = grupoDotacion;
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

    public String getCicloEntrega() {
        return cicloEntrega;
    }

    public void setCicloEntrega(String cicloEntrega) {
        this.cicloEntrega = cicloEntrega;
    }

    public Integer getIdCicloEntrega() {
        return idCicloEntrega;
    }

    public void setIdCicloEntrega(Integer idCicloEntrega) {
        this.idCicloEntrega = idCicloEntrega;
    }

    public String getTipoTalla() {
        return tipoTalla;
    }

    public void setTipoTalla(String tipoTalla) {
        this.tipoTalla = tipoTalla;
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

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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

    public Integer getCantidadTotal() {
        return CantidadTotal;
    }

    public void setCantidadTotal(Integer cantidadTotal) {
        CantidadTotal = cantidadTotal;
    }
}
