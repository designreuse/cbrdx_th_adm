package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 27/06/2017.
 */
public class VRelacionesListasCampos {

    private Integer idRelacionListaCampo;
    private String nombreRelacion;
    private Integer idRelacionLista;
    private String menu;
    private String funcionalidadControl;
    private Integer idFuncionalidadesControles;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRelacionListaCampo() {
        return idRelacionListaCampo;
    }

    public void setIdRelacionListaCampo(Integer idRelacionListaCampo) {
        this.idRelacionListaCampo = idRelacionListaCampo;
    }

    public String getNombreRelacion() {
        return nombreRelacion;
    }

    public void setNombreRelacion(String nombreRelacion) {
        this.nombreRelacion = nombreRelacion;
    }

    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getFuncionalidadControl() {
        return funcionalidadControl;
    }

    public void setFuncionalidadControl(String funcionalidadControl) {
        this.funcionalidadControl = funcionalidadControl;
    }

    public Integer getIdFuncionalidadesControles() {
        return idFuncionalidadesControles;
    }

    public void setIdFuncionalidadesControles(Integer idFuncionalidadesControles) {
        this.idFuncionalidadesControles = idFuncionalidadesControles;
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
}
