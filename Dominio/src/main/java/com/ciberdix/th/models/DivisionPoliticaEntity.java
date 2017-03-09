package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "DivisionPolitica", schema = "crz_th", catalog = "CREZCAMOS")
public class DivisionPoliticaEntity {
   private Integer idDivisionPolitica;
   private Integer idDivisionPoliticaPadre;
   private String codigoDivisionPolitica;
   private String descripcionDivisionPolitica;
   private Integer indicativoDivisionPolitica;
   private String codigoPostalDivisionPolitica;
   private Integer idDivisionPoliticaTipo;
   private Integer idDivisionPoliticaArea;
   private Integer idDivisionPoliticaResguardo;
   private Integer idEstratooDivisionPolitica;
   private boolean indicadorHabilitado;
   private Integer auditoriaUsuario;
   private Timestamp auditoriaFecha;
   //private Timestamp auditoriaFecha;


    public DivisionPoliticaEntity() {
    }

    public DivisionPoliticaEntity(Integer idDivisionPolitica, Integer idDivisionPoliticaPadre, String codigoDivisionPolitica, String descripcionDivisionPolitica, Integer indicativoDivisionPolitica, String codigoPostalDivisionPolitica, Integer idDivisionPoliticaTipo, Integer idDivisionPoliticaArea, Integer idDivisionPoliticaResguardo, Integer idEstratooDivisionPolitica, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idDivisionPolitica = idDivisionPolitica;
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
        this.codigoDivisionPolitica = codigoDivisionPolitica;
        this.descripcionDivisionPolitica = descripcionDivisionPolitica;
        this.indicativoDivisionPolitica = indicativoDivisionPolitica;
        this.codigoPostalDivisionPolitica = codigoPostalDivisionPolitica;
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
        this.idEstratooDivisionPolitica = idEstratooDivisionPolitica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }
    @Id
    @Column(name = "IdDivisionPolitica", nullable = false)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }
    @Basic
    @Column(name = "IdDivisionPoliticaPadre", nullable = false)
    public Integer getIdDivisionPoliticaPadre() {
        return idDivisionPoliticaPadre;
    }

    public void setIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
    }
    @Basic
    @Column(name = "CodigoDivisionPolitica", nullable = false)
    public String getCodigoDivisionPolitica() {
        return codigoDivisionPolitica;
    }

    public void setCodigoDivisionPolitica(String codigoDivisionPolitica) {
        this.codigoDivisionPolitica = codigoDivisionPolitica;
    }
    @Basic
    @Column(name = "DescripcionDivisonPolitica", nullable = false)
    public String getDescripcionDivisionPolitica() {
        return descripcionDivisionPolitica;
    }

    public void setDescripcionDivisionPolitica(String descripcionDivisionPolitica) {
        this.descripcionDivisionPolitica = descripcionDivisionPolitica;
    }
    @Basic
    @Column(name = "IndicativoDivisonPolitica", nullable = false)
    public Integer getIndicativoDivisionPolitica() {
        return indicativoDivisionPolitica;
    }

    public void setIndicativoDivisionPolitica(Integer indicativoDivisionPolitica) {
        this.indicativoDivisionPolitica = indicativoDivisionPolitica;
    }
    @Basic
    @Column(name = "CodigoPostalDivisionPolitica", nullable = false)
    public String getCodigoPostalDivisionPolitica() {
        return codigoPostalDivisionPolitica;
    }

    public void setCodigoPostalDivisionPolitica(String codigoPostalDivisionPolitica) {
        this.codigoPostalDivisionPolitica = codigoPostalDivisionPolitica;
    }
    @Basic
    @Column(name = "IdDivisionPoliticaTipo", nullable = false)
    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }
    @Basic
    @Column(name = "IdDivisionPoliticaArea", nullable = false)
    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }
    @Basic
    @Column(name = "IdDivisionPoliticaResguardo", nullable = false)
    public Integer getIdDivisionPoliticaResguardo() {
        return idDivisionPoliticaResguardo;
    }

    public void setIdDivisionPoliticaResguardo(Integer idDivisionPoliticaResguardo) {
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
    }
    @Basic
    @Column(name = "IdEstratoDivisionPolitica", nullable = false)
    public Integer getIdEstratooDivisionPolitica() {
        return idEstratooDivisionPolitica;
    }

    public void setIdEstratooDivisionPolitica(Integer idEstratooDivisionPolitica) {
        this.idEstratooDivisionPolitica = idEstratooDivisionPolitica;
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

}
