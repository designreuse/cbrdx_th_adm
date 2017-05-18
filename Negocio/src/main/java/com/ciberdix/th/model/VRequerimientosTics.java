package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 18/05/2017.
 */
public class VRequerimientosTics {

    private Integer idRequerimientoTic;
    private Integer idRequerimiento;
    private String tic;
    private Integer idTic;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRequerimientoTic() {
        return idRequerimientoTic;
    }

    public void setIdRequerimientoTic(Integer idRequerimientoTic) {
        this.idRequerimientoTic = idRequerimientoTic;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getTic() {
        return tic;
    }

    public void setTic(String tic) {
        this.tic = tic;
    }

    public Integer getIdTic() {
        return idTic;
    }

    public void setIdTic(Integer idTic) {
        this.idTic = idTic;
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
