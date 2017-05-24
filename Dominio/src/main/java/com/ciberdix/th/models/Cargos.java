package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Danny on 24/05/2017.
 */
@Entity
@Table(name = "Cargos", schema = "crz_th", catalog = "CREZCAMOS")
public class Cargos {
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
    private Boolean indicadorRequiereFormacion;
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
    private String cargaFisica;
    private String cargaMental;
    private String nivelPsicoSocial;
    private String codigoCargo;
    private Integer idEstructuraArea;
    private Integer idGenero;
    private Integer idEstadoCivil;
    private Integer idEstado;
    private Integer paso;
    private Boolean indicadorZona;

    public Cargos() {
    }

    public Cargos(String cargo, Integer auditoriaUsuario, Integer personaACargoDir, Integer personaACargoInd, Integer idCargoJefe, String mision, Integer puntos, Integer idCategoria, Integer salario, Boolean indicadorRequiereFormacion, Boolean indicadorHabilitado, String interrelacionesInternas, String interrelacionesExternas, String responsabilidadesAd, String tomaDecisiones, String actividadesSupervisa, Integer idNivelEducacion, String conocimientosBasicos, String tiempoExperiencia, String otrosRequisitos, BigInteger edad, String cargaFisica, String cargaMental, String nivelPsicoSocial, String codigoCargo, Integer idEstructuraArea, Integer idGenero, Integer idEstadoCivil, Integer idEstado, Integer paso, Boolean indicadorZona) {
        this.cargo = cargo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.personaACargoDir = personaACargoDir;
        this.personaACargoInd = personaACargoInd;
        this.idCargoJefe = idCargoJefe;
        this.mision = mision;
        this.puntos = puntos;
        this.idCategoria = idCategoria;
        this.salario = salario;
        this.indicadorRequiereFormacion = indicadorRequiereFormacion;
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
        this.cargaFisica = cargaFisica;
        this.cargaMental = cargaMental;
        this.nivelPsicoSocial = nivelPsicoSocial;
        this.codigoCargo = codigoCargo;
        this.idEstructuraArea = idEstructuraArea;
        this.idGenero = idGenero;
        this.idEstadoCivil = idEstadoCivil;
        this.idEstado = idEstado;
        this.paso = paso;
        this.indicadorZona = indicadorZona;
    }

    public Cargos(Integer idCargo, String cargo, Integer auditoriaUsuario, Integer personaACargoDir, Integer personaACargoInd, Integer idCargoJefe, String mision, Integer puntos, Integer idCategoria, Integer salario, Boolean indicadorRequiereFormacion, Boolean indicadorHabilitado, String interrelacionesInternas, String interrelacionesExternas, String responsabilidadesAd, String tomaDecisiones, String actividadesSupervisa, Integer idNivelEducacion, String conocimientosBasicos, String tiempoExperiencia, String otrosRequisitos, BigInteger edad, String cargaFisica, String cargaMental, String nivelPsicoSocial, String codigoCargo, Integer idEstructuraArea, Integer idGenero, Integer idEstadoCivil, Integer idEstado, Integer paso, Boolean indicadorZona) {
        this.idCargo = idCargo;
        this.cargo = cargo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.personaACargoDir = personaACargoDir;
        this.personaACargoInd = personaACargoInd;
        this.idCargoJefe = idCargoJefe;
        this.mision = mision;
        this.puntos = puntos;
        this.idCategoria = idCategoria;
        this.salario = salario;
        this.indicadorRequiereFormacion = indicadorRequiereFormacion;
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
        this.cargaFisica = cargaFisica;
        this.cargaMental = cargaMental;
        this.nivelPsicoSocial = nivelPsicoSocial;
        this.codigoCargo = codigoCargo;
        this.idEstructuraArea = idEstructuraArea;
        this.idGenero = idGenero;
        this.idEstadoCivil = idEstadoCivil;
        this.idEstado = idEstado;
        this.paso = paso;
        this.indicadorZona = indicadorZona;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargo", nullable = false)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
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
    @Column(name = "Salario", nullable = true, precision = 0)
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "IndicadorRequiereFormacion", nullable = true)
    public Boolean getIndicadorRequiereFormacion() {
        return indicadorRequiereFormacion;
    }

    public void setIndicadorRequiereFormacion(Boolean indicadorRequiereFormacion) {
        this.indicadorRequiereFormacion = indicadorRequiereFormacion;
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
    @Column(name = "ConocimientosBasicos", nullable = true, length = 500)
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

    @Basic
    @Column(name = "CodigoCargo", nullable = true, length = 50)
    public String getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(String codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    @Basic
    @Column(name = "IdEstructuraArea", nullable = true)
    public Integer getIdEstructuraArea() {
        return idEstructuraArea;
    }

    public void setIdEstructuraArea(Integer idEstructuraArea) {
        this.idEstructuraArea = idEstructuraArea;
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
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "Paso", nullable = true)
    public Integer getPaso() {
        return paso;
    }

    public void setPaso(Integer paso) {
        this.paso = paso;
    }

    @Basic
    @Column(name = "IndicadorZona", nullable = true)
    public Boolean getIndicadorZona() {
        return indicadorZona;
    }

    public void setIndicadorZona(Boolean indicadorZona) {
        this.indicadorZona = indicadorZona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cargos cargos = (Cargos) o;

        if (idCargo != null ? !idCargo.equals(cargos.idCargo) : cargos.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(cargos.cargo) : cargos.cargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(cargos.auditoriaUsuario) : cargos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(cargos.auditoriaFecha) : cargos.auditoriaFecha != null)
            return false;
        if (personaACargoDir != null ? !personaACargoDir.equals(cargos.personaACargoDir) : cargos.personaACargoDir != null)
            return false;
        if (personaACargoInd != null ? !personaACargoInd.equals(cargos.personaACargoInd) : cargos.personaACargoInd != null)
            return false;
        if (idCargoJefe != null ? !idCargoJefe.equals(cargos.idCargoJefe) : cargos.idCargoJefe != null) return false;
        if (mision != null ? !mision.equals(cargos.mision) : cargos.mision != null) return false;
        if (puntos != null ? !puntos.equals(cargos.puntos) : cargos.puntos != null) return false;
        if (idCategoria != null ? !idCategoria.equals(cargos.idCategoria) : cargos.idCategoria != null) return false;
        if (salario != null ? !salario.equals(cargos.salario) : cargos.salario != null) return false;
        if (indicadorRequiereFormacion != null ? !indicadorRequiereFormacion.equals(cargos.indicadorRequiereFormacion) : cargos.indicadorRequiereFormacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(cargos.indicadorHabilitado) : cargos.indicadorHabilitado != null)
            return false;
        if (interrelacionesInternas != null ? !interrelacionesInternas.equals(cargos.interrelacionesInternas) : cargos.interrelacionesInternas != null)
            return false;
        if (interrelacionesExternas != null ? !interrelacionesExternas.equals(cargos.interrelacionesExternas) : cargos.interrelacionesExternas != null)
            return false;
        if (responsabilidadesAd != null ? !responsabilidadesAd.equals(cargos.responsabilidadesAd) : cargos.responsabilidadesAd != null)
            return false;
        if (tomaDecisiones != null ? !tomaDecisiones.equals(cargos.tomaDecisiones) : cargos.tomaDecisiones != null)
            return false;
        if (actividadesSupervisa != null ? !actividadesSupervisa.equals(cargos.actividadesSupervisa) : cargos.actividadesSupervisa != null)
            return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(cargos.idNivelEducacion) : cargos.idNivelEducacion != null)
            return false;
        if (conocimientosBasicos != null ? !conocimientosBasicos.equals(cargos.conocimientosBasicos) : cargos.conocimientosBasicos != null)
            return false;
        if (tiempoExperiencia != null ? !tiempoExperiencia.equals(cargos.tiempoExperiencia) : cargos.tiempoExperiencia != null)
            return false;
        if (otrosRequisitos != null ? !otrosRequisitos.equals(cargos.otrosRequisitos) : cargos.otrosRequisitos != null)
            return false;
        if (edad != null ? !edad.equals(cargos.edad) : cargos.edad != null) return false;
        if (cargaFisica != null ? !cargaFisica.equals(cargos.cargaFisica) : cargos.cargaFisica != null) return false;
        if (cargaMental != null ? !cargaMental.equals(cargos.cargaMental) : cargos.cargaMental != null) return false;
        if (nivelPsicoSocial != null ? !nivelPsicoSocial.equals(cargos.nivelPsicoSocial) : cargos.nivelPsicoSocial != null)
            return false;
        if (codigoCargo != null ? !codigoCargo.equals(cargos.codigoCargo) : cargos.codigoCargo != null) return false;
        if (idEstructuraArea != null ? !idEstructuraArea.equals(cargos.idEstructuraArea) : cargos.idEstructuraArea != null)
            return false;
        if (idGenero != null ? !idGenero.equals(cargos.idGenero) : cargos.idGenero != null) return false;
        if (idEstadoCivil != null ? !idEstadoCivil.equals(cargos.idEstadoCivil) : cargos.idEstadoCivil != null)
            return false;
        if (idEstado != null ? !idEstado.equals(cargos.idEstado) : cargos.idEstado != null) return false;
        if (paso != null ? !paso.equals(cargos.paso) : cargos.paso != null) return false;
        if (indicadorZona != null ? !indicadorZona.equals(cargos.indicadorZona) : cargos.indicadorZona != null)
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
        result = 31 * result + (indicadorRequiereFormacion != null ? indicadorRequiereFormacion.hashCode() : 0);
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
        result = 31 * result + (cargaFisica != null ? cargaFisica.hashCode() : 0);
        result = 31 * result + (cargaMental != null ? cargaMental.hashCode() : 0);
        result = 31 * result + (nivelPsicoSocial != null ? nivelPsicoSocial.hashCode() : 0);
        result = 31 * result + (codigoCargo != null ? codigoCargo.hashCode() : 0);
        result = 31 * result + (idEstructuraArea != null ? idEstructuraArea.hashCode() : 0);
        result = 31 * result + (idGenero != null ? idGenero.hashCode() : 0);
        result = 31 * result + (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (paso != null ? paso.hashCode() : 0);
        result = 31 * result + (indicadorZona != null ? indicadorZona.hashCode() : 0);
        return result;
    }
}
