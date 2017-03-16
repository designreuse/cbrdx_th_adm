package com.ciberdix.th.model;
import java.sql.Date;
import java.sql.Timestamp;
public class Cargo {

    private Integer idCargo;
    private String cargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer personaACargoDir;
    private Integer personaACargoInd;
    private Integer idCargoJefe;
    private String mision;
    private Integer puntos;
    private Integer idCategoria;
    private Integer salario;
    private Boolean idRequiereFormacion;
    private Boolean indicadorHabilitado;
    private String interrelacionesInternas;
    private String interrelacionesExternas;
    private String responsabilidadesAd;
    private String tomaDecisiones;
    private String actividadesSupervisa;
    private Integer idNivelEducacion;
    private String conocimientosBasicos;
    private String tiempoExperiencia;
    private String otrosRequisitos;
    private Integer edad;
    private Integer idGenero;
    private Integer idEstadoCivil;
    private String cargaFisica;
    private String cargaMental;
    private String nivelPsicoSocial;

    public Cargo(Integer idCargo, String cargo, Integer auditoriaUsuario, Timestamp auditoriaFecha, Integer personaACargoDir, Integer personaACargoInd, Integer idCargoJefe, String mision, Integer puntos, Integer idCategoria, Integer salario, Boolean idRequiereFormacion, Boolean indicadorHabilitado, String interrelacionesInternas, String interrelacionesExternas, String responsabilidadesAd, String tomaDecisiones, String actividadesSupervisa, Integer idNivelEducacion, String conocimientosBasicos, String tiempoExperiencia, String otrosRequisitos, Integer edad, Integer idGenero, Integer idEstadoCivil, String cargaFisica, String cargaMental, String nivelPsicoSocial) {
        this.idCargo = idCargo;
        this.cargo = cargo;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
        this.personaACargoDir = personaACargoDir;
        this.personaACargoInd = personaACargoInd;
        this.idCargoJefe = idCargoJefe;
        this.mision = mision;
        this.puntos = puntos;
        this.idCategoria = idCategoria;
        this.salario = salario;
        this.idRequiereFormacion = idRequiereFormacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.interrelacionesInternas = interrelacionesInternas;
        this.interrelacionesExternas = interrelacionesExternas;
        this.responsabilidadesAd = responsabilidadesAd;
        this.tomaDecisiones = tomaDecisiones;
        this.actividadesSupervisa = actividadesSupervisa;
        this.idNivelEducacion = idNivelEducacion;
        this.conocimientosBasicos = conocimientosBasicos;
        this.tiempoExperiencia = tiempoExperiencia;
        this.otrosRequisitos = otrosRequisitos;
        this.edad = edad;
        this.idGenero = idGenero;
        this.idEstadoCivil = idEstadoCivil;
        this.cargaFisica = cargaFisica;
        this.cargaMental = cargaMental;
        this.nivelPsicoSocial = nivelPsicoSocial;
    }
    
    public Cargo(){}

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public Integer getPersonaACargoDir() {
        return personaACargoDir;
    }

    public void setPersonaACargoDir(Integer personaACargoDir) {
        this.personaACargoDir = personaACargoDir;
    }

    public Integer getPersonaACargoInd() {
        return personaACargoInd;
    }

    public void setPersonaACargoInd(Integer personaACargoInd) {
        this.personaACargoInd = personaACargoInd;
    }

    public Integer getIdCargoJefe() {
        return idCargoJefe;
    }

    public void setIdCargoJefe(Integer idCargoJefe) {
        this.idCargoJefe = idCargoJefe;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Boolean getIdRequiereFormacion() {
        return idRequiereFormacion;
    }

    public void setIdRequiereFormacion(Boolean idRequiereFormacion) {
        this.idRequiereFormacion = idRequiereFormacion;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getInterrelacionesInternas() {
        return interrelacionesInternas;
    }

    public void setInterrelacionesInternas(String interrelacionesInternas) {
        this.interrelacionesInternas = interrelacionesInternas;
    }

    public String getInterrelacionesExternas() {
        return interrelacionesExternas;
    }

    public void setInterrelacionesExternas(String interrelacionesExternas) {
        this.interrelacionesExternas = interrelacionesExternas;
    }

    public String getResponsabilidadesAd() {
        return responsabilidadesAd;
    }

    public void setResponsabilidadesAd(String responsabilidadesAd) {
        this.responsabilidadesAd = responsabilidadesAd;
    }

    public String getTomaDecisiones() {
        return tomaDecisiones;
    }

    public void setTomaDecisiones(String tomaDecisiones) {
        this.tomaDecisiones = tomaDecisiones;
    }

    public String getActividadesSupervisa() {
        return actividadesSupervisa;
    }

    public void setActividadesSupervisa(String actividadesSupervisa) {
        this.actividadesSupervisa = actividadesSupervisa;
    }

    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    public String getConocimientosBasicos() {
        return conocimientosBasicos;
    }

    public void setConocimientosBasicos(String conocimientosBasicos) {
        this.conocimientosBasicos = conocimientosBasicos;
    }

    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getOtrosRequisitos() {
        return otrosRequisitos;
    }

    public void setOtrosRequisitos(String otrosRequisitos) {
        this.otrosRequisitos = otrosRequisitos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getCargaFisica() {
        return cargaFisica;
    }

    public void setCargaFisica(String cargaFisica) {
        this.cargaFisica = cargaFisica;
    }

    public String getCargaMental() {
        return cargaMental;
    }

    public void setCargaMental(String cargaMental) {
        this.cargaMental = cargaMental;
    }

    public String getNivelPsicoSocial() {
        return nivelPsicoSocial;
    }

    public void setNivelPsicoSocial(String nivelPsicoSocial) {
        this.nivelPsicoSocial = nivelPsicoSocial;
    }
}
