package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosFamiliares {

    private Long idTercerosFamiliar;
    private Long idTerceros;
    private Long idFamiliar;
    private int idParentezco;
    private int idConvivencia;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosFamiliares(Long idTerceros, Long idFamiliar, int idParentezco, int idConvivencia, boolean indicadorHabilitado, int auditoriaUsuario) {
        this.idTerceros = idTerceros;
        this.idFamiliar = idFamiliar;
        this.idParentezco = idParentezco;
        this.idConvivencia = idConvivencia;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosFamiliares() {
    }
}
