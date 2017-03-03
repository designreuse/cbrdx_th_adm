package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Cargos", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosEntity {
    private Integer idCargo;
    private Integer cargo;
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
    private BigInteger edad;
    private Integer idGenero;
    private Integer idEstadoCivil;
    private String cargaFisica;
    private String cargaMental;
    private String nivelPsicoSocial;

    @Id
    @Column(name = "IdCargo", nullable = false)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Cargo", nullable = true)
    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
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

    @Basic
    @Column(name = "PersonaACargoDir", nullable = true, precision = 0)
    public Integer getPersonaACargoDir() {
        return personaACargoDir;
    }

    public void setPersonaACargoDir(Integer personaACargoDir) {
        this.personaACargoDir = personaACargoDir;
    }

    @Basic
    @Column(name = "PersonaACargoInd", nullable = true, precision = 0)
    public Integer getPersonaACargoInd() {
        return personaACargoInd;
    }

    public void setPersonaACargoInd(Integer personaACargoInd) {
        this.personaACargoInd = personaACargoInd;
    }

    @Basic
    @Column(name = "IdCargoJefe", nullable = true)
    public Integer getIdCargoJefe() {
        return idCargoJefe;
    }

    public void setIdCargoJefe(Integer idCargoJefe) {
        this.idCargoJefe = idCargoJefe;
    }

    @Basic
    @Column(name = "Mision", nullable = true, length = 500)
    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    @Basic
    @Column(name = "Puntos", nullable = true, precision = 0)
    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Basic
    @Column(name = "IdCategoria", nullable = true)
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "Salario", nullable = false, precision = 0)
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "IdRequiereFormacion", nullable = true)
    public Boolean getIdRequiereFormacion() {
        return idRequiereFormacion;
    }

    public void setIdRequiereFormacion(Boolean idRequiereFormacion) {
        this.idRequiereFormacion = idRequiereFormacion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "InterrelacionesInternas", nullable = true, length = 500)
    public String getInterrelacionesInternas() {
        return interrelacionesInternas;
    }

    public void setInterrelacionesInternas(String interrelacionesInternas) {
        this.interrelacionesInternas = interrelacionesInternas;
    }

    @Basic
    @Column(name = "InterrelacionesExternas", nullable = true, length = 500)
    public String getInterrelacionesExternas() {
        return interrelacionesExternas;
    }

    public void setInterrelacionesExternas(String interrelacionesExternas) {
        this.interrelacionesExternas = interrelacionesExternas;
    }

    @Basic
    @Column(name = "ResponsabilidadesAd", nullable = true, length = 500)
    public String getResponsabilidadesAd() {
        return responsabilidadesAd;
    }

    public void setResponsabilidadesAd(String responsabilidadesAd) {
        this.responsabilidadesAd = responsabilidadesAd;
    }

    @Basic
    @Column(name = "TomaDecisiones", nullable = true, length = 500)
    public String getTomaDecisiones() {
        return tomaDecisiones;
    }

    public void setTomaDecisiones(String tomaDecisiones) {
        this.tomaDecisiones = tomaDecisiones;
    }

    @Basic
    @Column(name = "ActividadesSupervisa", nullable = true, length = 500)
    public String getActividadesSupervisa() {
        return actividadesSupervisa;
    }

    public void setActividadesSupervisa(String actividadesSupervisa) {
        this.actividadesSupervisa = actividadesSupervisa;
    }

    @Basic
    @Column(name = "IdNivelEducacion", nullable = true)
    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    @Basic
    @Column(name = "ConocimientosBasicos", nullable = true, length = 200)
    public String getConocimientosBasicos() {
        return conocimientosBasicos;
    }

    public void setConocimientosBasicos(String conocimientosBasicos) {
        this.conocimientosBasicos = conocimientosBasicos;
    }

    @Basic
    @Column(name = "TiempoExperiencia", nullable = true, length = 200)
    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    @Basic
    @Column(name = "OtrosRequisitos", nullable = true, length = 200)
    public String getOtrosRequisitos() {
        return otrosRequisitos;
    }

    public void setOtrosRequisitos(String otrosRequisitos) {
        this.otrosRequisitos = otrosRequisitos;
    }

    @Basic
    @Column(name = "Edad", nullable = true, precision = 0)
    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "IdGenero", nullable = true)
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    @Basic
    @Column(name = "IdEstadoCivil", nullable = true)
    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    @Basic
    @Column(name = "CargaFisica", nullable = true, length = 100)
    public String getCargaFisica() {
        return cargaFisica;
    }

    public void setCargaFisica(String cargaFisica) {
        this.cargaFisica = cargaFisica;
    }

    @Basic
    @Column(name = "CargaMental", nullable = true, length = 100)
    public String getCargaMental() {
        return cargaMental;
    }

    public void setCargaMental(String cargaMental) {
        this.cargaMental = cargaMental;
    }

    @Basic
    @Column(name = "NivelPsicoSocial", nullable = true, length = 100)
    public String getNivelPsicoSocial() {
        return nivelPsicoSocial;
    }

    public void setNivelPsicoSocial(String nivelPsicoSocial) {
        this.nivelPsicoSocial = nivelPsicoSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosEntity that = (CargosEntity) o;

        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (personaACargoDir != null ? !personaACargoDir.equals(that.personaACargoDir) : that.personaACargoDir != null)
            return false;
        if (personaACargoInd != null ? !personaACargoInd.equals(that.personaACargoInd) : that.personaACargoInd != null)
            return false;
        if (idCargoJefe != null ? !idCargoJefe.equals(that.idCargoJefe) : that.idCargoJefe != null) return false;
        if (mision != null ? !mision.equals(that.mision) : that.mision != null) return false;
        if (puntos != null ? !puntos.equals(that.puntos) : that.puntos != null) return false;
        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (salario != null ? !salario.equals(that.salario) : that.salario != null) return false;
        if (idRequiereFormacion != null ? !idRequiereFormacion.equals(that.idRequiereFormacion) : that.idRequiereFormacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (interrelacionesInternas != null ? !interrelacionesInternas.equals(that.interrelacionesInternas) : that.interrelacionesInternas != null)
            return false;
        if (interrelacionesExternas != null ? !interrelacionesExternas.equals(that.interrelacionesExternas) : that.interrelacionesExternas != null)
            return false;
        if (responsabilidadesAd != null ? !responsabilidadesAd.equals(that.responsabilidadesAd) : that.responsabilidadesAd != null)
            return false;
        if (tomaDecisiones != null ? !tomaDecisiones.equals(that.tomaDecisiones) : that.tomaDecisiones != null)
            return false;
        if (actividadesSupervisa != null ? !actividadesSupervisa.equals(that.actividadesSupervisa) : that.actividadesSupervisa != null)
            return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(that.idNivelEducacion) : that.idNivelEducacion != null)
            return false;
        if (conocimientosBasicos != null ? !conocimientosBasicos.equals(that.conocimientosBasicos) : that.conocimientosBasicos != null)
            return false;
        if (tiempoExperiencia != null ? !tiempoExperiencia.equals(that.tiempoExperiencia) : that.tiempoExperiencia != null)
            return false;
        if (otrosRequisitos != null ? !otrosRequisitos.equals(that.otrosRequisitos) : that.otrosRequisitos != null)
            return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;
        if (idGenero != null ? !idGenero.equals(that.idGenero) : that.idGenero != null) return false;
        if (idEstadoCivil != null ? !idEstadoCivil.equals(that.idEstadoCivil) : that.idEstadoCivil != null)
            return false;
        if (cargaFisica != null ? !cargaFisica.equals(that.cargaFisica) : that.cargaFisica != null) return false;
        if (cargaMental != null ? !cargaMental.equals(that.cargaMental) : that.cargaMental != null) return false;
        if (nivelPsicoSocial != null ? !nivelPsicoSocial.equals(that.nivelPsicoSocial) : that.nivelPsicoSocial != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargo != null ? idCargo.hashCode() : 0;
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (personaACargoDir != null ? personaACargoDir.hashCode() : 0);
        result = 31 * result + (personaACargoInd != null ? personaACargoInd.hashCode() : 0);
        result = 31 * result + (idCargoJefe != null ? idCargoJefe.hashCode() : 0);
        result = 31 * result + (mision != null ? mision.hashCode() : 0);
        result = 31 * result + (puntos != null ? puntos.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (idRequiereFormacion != null ? idRequiereFormacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (interrelacionesInternas != null ? interrelacionesInternas.hashCode() : 0);
        result = 31 * result + (interrelacionesExternas != null ? interrelacionesExternas.hashCode() : 0);
        result = 31 * result + (responsabilidadesAd != null ? responsabilidadesAd.hashCode() : 0);
        result = 31 * result + (tomaDecisiones != null ? tomaDecisiones.hashCode() : 0);
        result = 31 * result + (actividadesSupervisa != null ? actividadesSupervisa.hashCode() : 0);
        result = 31 * result + (idNivelEducacion != null ? idNivelEducacion.hashCode() : 0);
        result = 31 * result + (conocimientosBasicos != null ? conocimientosBasicos.hashCode() : 0);
        result = 31 * result + (tiempoExperiencia != null ? tiempoExperiencia.hashCode() : 0);
        result = 31 * result + (otrosRequisitos != null ? otrosRequisitos.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (idGenero != null ? idGenero.hashCode() : 0);
        result = 31 * result + (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
        result = 31 * result + (cargaFisica != null ? cargaFisica.hashCode() : 0);
        result = 31 * result + (cargaMental != null ? cargaMental.hashCode() : 0);
        result = 31 * result + (nivelPsicoSocial != null ? nivelPsicoSocial.hashCode() : 0);
        return result;
    }
}
