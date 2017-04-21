package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "ListasTiposNomenclaturasComplementarias", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class ComplementariaNomenclaturaEntity {
    private int value;
    private String codigoListaTipoNomenclatura;
    private String label;
    private int ordenListaTipoNomenclatura;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ComplementariaNomenclaturaEntity(int idListaTipoNomenclatura, String codigoListaTipoNomenclatura, String nombreListaTipoNomenclatura, int ordenListaTipoNomenclatura, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.value = idListaTipoNomenclatura;
        this.codigoListaTipoNomenclatura = codigoListaTipoNomenclatura;
        this.label = nombreListaTipoNomenclatura;
        this.ordenListaTipoNomenclatura = ordenListaTipoNomenclatura;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public ComplementariaNomenclaturaEntity() {
    }

    @Id
    @Column(name = "IdListaTipoNomenclaturaComplementaria", nullable = false)
    public int getValue() {
        return value;
    }

    public void setValue(int idListaTipoNomenclatura) {
        this.value = idListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "CodigoListaTipoNomenclaturaComplementaria", nullable = false)
    public String getCodigoListaTipoNomenclatura() {
        return codigoListaTipoNomenclatura;
    }

    public void setCodigoListaTipoNomenclatura(String codigoListaTipoNomenclatura) {
        this.codigoListaTipoNomenclatura = codigoListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "NombreListaTipoNomenclaturaComplementaria", nullable = false)
    public String getLabel() {
        return label;
    }

    public void setLabel(String nombreListaTipoNomenclatura) {
        this.label = nombreListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "OrdenListaTipoNomenclaturaComplementaria", nullable = false)
    public int getOrdenListaTipoNomenclatura() {
        return ordenListaTipoNomenclatura;
    }

    public void setOrdenListaTipoNomenclatura(int ordenListaTipoNomenclatura) {
        this.ordenListaTipoNomenclatura = ordenListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
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
}
