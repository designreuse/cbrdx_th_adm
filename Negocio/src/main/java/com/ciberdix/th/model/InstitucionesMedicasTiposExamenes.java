package com.ciberdix.th.model;

import java.sql.Timestamp;

public class InstitucionesMedicasTiposExamenes {

    private Integer idInstitucionMedicaTipoExamen;
    private Integer idInstitucionMedica;
    private Integer idTipoExamen;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdInstitucionMedicaTipoExamen() {
        return idInstitucionMedicaTipoExamen;
    }

    public void setIdInstitucionMedicaTipoExamen(Integer idInstitucionMedicaTipoExamen) {
        this.idInstitucionMedicaTipoExamen = idInstitucionMedicaTipoExamen;
    }

    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    public Integer getIdTipoExamen() {
        return idTipoExamen;
    }

    public void setIdTipoExamen(Integer idTipoExamen) {
        this.idTipoExamen = idTipoExamen;
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
