package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "DivisionPolitica", schema = "crz_th", catalog = "CREZCAMOS")
public class CiudadEntity {
   private int idDivisionPolitica;
   private int idDivisionPoliticaPadre;
   private String codigoDivisionPolitica;
   private String descripcionDivisionPolitica;
   private int indicativoDivisionPolitica;
   private String codigoPostalDivisionPolitica;
   private int idDivisionPoliticaTipo;
   private int idDivisionPoliticaArea;
   private int idDivisionPoliticaResguardo;
   private int idEstratooDivisionPolitica;
   private boolean indicadorHabilitado;
   private int auditoriaUsuario;
   private Timestamp auditoriaFecha;



    public CiudadEntity() {
    }

    public CiudadEntity(int idDivisionPolitica, int idDivisionPoliticaPadre, String codigoDivisionPolitica, String descripcionDivisionPolitica, int indicativoDivisionPolitica, String codigoPostalDivisionPolitica, int idDivisionPoliticaTipo, int idDivisionPoliticaArea, int idDivisionPoliticaResguardo, int idEstratooDivisionPolitica, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
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
    public int getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(int idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaPadre", nullable = false)
    public int getIdDivisionPoliticaPadre() {
        return idDivisionPoliticaPadre;
    }

    public void setIdDivisionPoliticaPadre(int idDivisionPoliticaPadre) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
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
    public int getIndicativoDivisionPolitica() {
        return indicativoDivisionPolitica;
    }

    public void setIndicativoDivisionPolitica(int indicativoDivisionPolitica) {
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
    public int getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(int idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaArea", nullable = false)
    public int getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(int idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaResguardo", nullable = false)
    public int getIdDivisionPoliticaResguardo() {
        return idDivisionPoliticaResguardo;
    }

    public void setIdDivisionPoliticaResguardo(int idDivisionPoliticaResguardo) {
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
    }

    @Basic
    @Column(name = "IdEstratoDivisionPolitica", nullable = false)
    public int getIdEstratooDivisionPolitica() {
        return idEstratooDivisionPolitica;
    }

    public void setIdEstratooDivisionPolitica(int idEstratooDivisionPolitica) {
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

    @Basic
    @Column(name = "CodigoDivisionPolitica", nullable = false)
    public String getCodigoDivisionPolitica() {
        return codigoDivisionPolitica;
    }

    public void setCodigoDivisionPolitica(String codigoDivisionPolitica) {
        this.codigoDivisionPolitica = codigoDivisionPolitica;
    }
}
