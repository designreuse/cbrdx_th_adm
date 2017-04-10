package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
@Entity
@Table(name = "V_Cargos", schema = "crz_th", catalog = "CREZCAMOS")
public class VCargos {
    private Integer idCargo;
    private String cargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer personaACargoDir;
    private Integer personaACargoInd;
    private Integer idCargoJefe;
    private String cargoJefe;
    private String mision;
    private Integer puntos;
    private Integer idCategoria;
    private String categoria;
    private Integer salario;
    private Boolean indicadorRequiereFormacion;
    private Boolean indicadorHabilitado;
    private String interrelacionesInternas;
    private String interrelacionesExternas;
    private String responsabilidadesAd;
    private String tomaDecisiones;
    private String actividadesSupervisa;
    private Integer idNivelEducacion;
    private String nivelEducacion;
    private String conocimientosBasicos;
    private String tiempoExperiencia;
    private String otrosRequisitos;
    private BigInteger edad;
    private String cargaFisica;
    private String cargaMental;
    private String nivelPsicoSocial;
    private String codigoCargo;
    private Integer idEstructuraArea;
    private String estructuraArea;
    private Integer idGenero;
    private String genero;
    private Integer idEstadoCivil;
    private String estadoCivil;
    private Integer idEstado;
    private String estado;
    private Integer paso;

    @Id
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "PersonaACargoDir")
    public Integer getPersonaACargoDir() {
        return personaACargoDir;
    }

    public void setPersonaACargoDir(Integer personaACargoDir) {
        this.personaACargoDir = personaACargoDir;
    }

    @Basic
    @Column(name = "PersonaACargoInd")
    public Integer getPersonaACargoInd() {
        return personaACargoInd;
    }

    public void setPersonaACargoInd(Integer personaACargoInd) {
        this.personaACargoInd = personaACargoInd;
    }

    @Basic
    @Column(name = "IdCargoJefe")
    public Integer getIdCargoJefe() {
        return idCargoJefe;
    }

    public void setIdCargoJefe(Integer idCargoJefe) {
        this.idCargoJefe = idCargoJefe;
    }

    @Basic
    @Column(name = "CargoJefe")
    public String getCargoJefe() {
        return cargoJefe;
    }

    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }

    @Basic
    @Column(name = "Mision")
    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    @Basic
    @Column(name = "Puntos")
    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Basic
    @Column(name = "IdCategoria")
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "Categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Basic
    @Column(name = "Salario")
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "IndicadorRequiereFormacion")
    public Boolean getIndicadorRequiereFormacion() {
        return indicadorRequiereFormacion;
    }

    public void setIndicadorRequiereFormacion(Boolean indicadorRequiereFormacion) {
        this.indicadorRequiereFormacion = indicadorRequiereFormacion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "InterrelacionesInternas")
    public String getInterrelacionesInternas() {
        return interrelacionesInternas;
    }

    public void setInterrelacionesInternas(String interrelacionesInternas) {
        this.interrelacionesInternas = interrelacionesInternas;
    }

    @Basic
    @Column(name = "InterrelacionesExternas")
    public String getInterrelacionesExternas() {
        return interrelacionesExternas;
    }

    public void setInterrelacionesExternas(String interrelacionesExternas) {
        this.interrelacionesExternas = interrelacionesExternas;
    }

    @Basic
    @Column(name = "ResponsabilidadesAd")
    public String getResponsabilidadesAd() {
        return responsabilidadesAd;
    }

    public void setResponsabilidadesAd(String responsabilidadesAd) {
        this.responsabilidadesAd = responsabilidadesAd;
    }

    @Basic
    @Column(name = "TomaDecisiones")
    public String getTomaDecisiones() {
        return tomaDecisiones;
    }

    public void setTomaDecisiones(String tomaDecisiones) {
        this.tomaDecisiones = tomaDecisiones;
    }

    @Basic
    @Column(name = "ActividadesSupervisa")
    public String getActividadesSupervisa() {
        return actividadesSupervisa;
    }

    public void setActividadesSupervisa(String actividadesSupervisa) {
        this.actividadesSupervisa = actividadesSupervisa;
    }

    @Basic
    @Column(name = "IdNivelEducacion")
    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    @Basic
    @Column(name = "NivelEducacion")
    public String getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    @Basic
    @Column(name = "ConocimientosBasicos")
    public String getConocimientosBasicos() {
        return conocimientosBasicos;
    }

    public void setConocimientosBasicos(String conocimientosBasicos) {
        this.conocimientosBasicos = conocimientosBasicos;
    }

    @Basic
    @Column(name = "TiempoExperiencia")
    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    @Basic
    @Column(name = "OtrosRequisitos")
    public String getOtrosRequisitos() {
        return otrosRequisitos;
    }

    public void setOtrosRequisitos(String otrosRequisitos) {
        this.otrosRequisitos = otrosRequisitos;
    }

    @Basic
    @Column(name = "Edad")
    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "CargaFisica")
    public String getCargaFisica() {
        return cargaFisica;
    }

    public void setCargaFisica(String cargaFisica) {
        this.cargaFisica = cargaFisica;
    }

    @Basic
    @Column(name = "CargaMental")
    public String getCargaMental() {
        return cargaMental;
    }

    public void setCargaMental(String cargaMental) {
        this.cargaMental = cargaMental;
    }

    @Basic
    @Column(name = "NivelPsicoSocial")
    public String getNivelPsicoSocial() {
        return nivelPsicoSocial;
    }

    public void setNivelPsicoSocial(String nivelPsicoSocial) {
        this.nivelPsicoSocial = nivelPsicoSocial;
    }

    @Basic
    @Column(name = "CodigoCargo")
    public String getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(String codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    @Basic
    @Column(name = "IdEstructuraArea")
    public Integer getIdEstructuraArea() {
        return idEstructuraArea;
    }

    public void setIdEstructuraArea(Integer idEstructuraArea) {
        this.idEstructuraArea = idEstructuraArea;
    }

    @Basic
    @Column(name = "EstructuraArea")
    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VCargos vCargos = (VCargos) o;

        if (idCargo != null ? !idCargo.equals(vCargos.idCargo) : vCargos.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(vCargos.cargo) : vCargos.cargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(vCargos.auditoriaUsuario) : vCargos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(vCargos.auditoriaFecha) : vCargos.auditoriaFecha != null)
            return false;
        if (personaACargoDir != null ? !personaACargoDir.equals(vCargos.personaACargoDir) : vCargos.personaACargoDir != null)
            return false;
        if (personaACargoInd != null ? !personaACargoInd.equals(vCargos.personaACargoInd) : vCargos.personaACargoInd != null)
            return false;
        if (idCargoJefe != null ? !idCargoJefe.equals(vCargos.idCargoJefe) : vCargos.idCargoJefe != null) return false;
        if (cargoJefe != null ? !cargoJefe.equals(vCargos.cargoJefe) : vCargos.cargoJefe != null) return false;
        if (mision != null ? !mision.equals(vCargos.mision) : vCargos.mision != null) return false;
        if (puntos != null ? !puntos.equals(vCargos.puntos) : vCargos.puntos != null) return false;
        if (idCategoria != null ? !idCategoria.equals(vCargos.idCategoria) : vCargos.idCategoria != null) return false;
        if (categoria != null ? !categoria.equals(vCargos.categoria) : vCargos.categoria != null) return false;
        if (salario != null ? !salario.equals(vCargos.salario) : vCargos.salario != null) return false;
        if (indicadorRequiereFormacion != null ? !indicadorRequiereFormacion.equals(vCargos.indicadorRequiereFormacion) : vCargos.indicadorRequiereFormacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(vCargos.indicadorHabilitado) : vCargos.indicadorHabilitado != null)
            return false;
        if (interrelacionesInternas != null ? !interrelacionesInternas.equals(vCargos.interrelacionesInternas) : vCargos.interrelacionesInternas != null)
            return false;
        if (interrelacionesExternas != null ? !interrelacionesExternas.equals(vCargos.interrelacionesExternas) : vCargos.interrelacionesExternas != null)
            return false;
        if (responsabilidadesAd != null ? !responsabilidadesAd.equals(vCargos.responsabilidadesAd) : vCargos.responsabilidadesAd != null)
            return false;
        if (tomaDecisiones != null ? !tomaDecisiones.equals(vCargos.tomaDecisiones) : vCargos.tomaDecisiones != null)
            return false;
        if (actividadesSupervisa != null ? !actividadesSupervisa.equals(vCargos.actividadesSupervisa) : vCargos.actividadesSupervisa != null)
            return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(vCargos.idNivelEducacion) : vCargos.idNivelEducacion != null)
            return false;
        if (nivelEducacion != null ? !nivelEducacion.equals(vCargos.nivelEducacion) : vCargos.nivelEducacion != null)
            return false;
        if (conocimientosBasicos != null ? !conocimientosBasicos.equals(vCargos.conocimientosBasicos) : vCargos.conocimientosBasicos != null)
            return false;
        if (tiempoExperiencia != null ? !tiempoExperiencia.equals(vCargos.tiempoExperiencia) : vCargos.tiempoExperiencia != null)
            return false;
        if (otrosRequisitos != null ? !otrosRequisitos.equals(vCargos.otrosRequisitos) : vCargos.otrosRequisitos != null)
            return false;
        if (edad != null ? !edad.equals(vCargos.edad) : vCargos.edad != null) return false;
        if (cargaFisica != null ? !cargaFisica.equals(vCargos.cargaFisica) : vCargos.cargaFisica != null) return false;
        if (cargaMental != null ? !cargaMental.equals(vCargos.cargaMental) : vCargos.cargaMental != null) return false;
        if (nivelPsicoSocial != null ? !nivelPsicoSocial.equals(vCargos.nivelPsicoSocial) : vCargos.nivelPsicoSocial != null)
            return false;
        if (codigoCargo != null ? !codigoCargo.equals(vCargos.codigoCargo) : vCargos.codigoCargo != null) return false;
        if (idEstructuraArea != null ? !idEstructuraArea.equals(vCargos.idEstructuraArea) : vCargos.idEstructuraArea != null)
            return false;
        if (estructuraArea != null ? !estructuraArea.equals(vCargos.estructuraArea) : vCargos.estructuraArea != null)
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
        result = 31 * result + (cargoJefe != null ? cargoJefe.hashCode() : 0);
        result = 31 * result + (mision != null ? mision.hashCode() : 0);
        result = 31 * result + (puntos != null ? puntos.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (indicadorRequiereFormacion != null ? indicadorRequiereFormacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (interrelacionesInternas != null ? interrelacionesInternas.hashCode() : 0);
        result = 31 * result + (interrelacionesExternas != null ? interrelacionesExternas.hashCode() : 0);
        result = 31 * result + (responsabilidadesAd != null ? responsabilidadesAd.hashCode() : 0);
        result = 31 * result + (tomaDecisiones != null ? tomaDecisiones.hashCode() : 0);
        result = 31 * result + (actividadesSupervisa != null ? actividadesSupervisa.hashCode() : 0);
        result = 31 * result + (idNivelEducacion != null ? idNivelEducacion.hashCode() : 0);
        result = 31 * result + (nivelEducacion != null ? nivelEducacion.hashCode() : 0);
        result = 31 * result + (conocimientosBasicos != null ? conocimientosBasicos.hashCode() : 0);
        result = 31 * result + (tiempoExperiencia != null ? tiempoExperiencia.hashCode() : 0);
        result = 31 * result + (otrosRequisitos != null ? otrosRequisitos.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (cargaFisica != null ? cargaFisica.hashCode() : 0);
        result = 31 * result + (cargaMental != null ? cargaMental.hashCode() : 0);
        result = 31 * result + (nivelPsicoSocial != null ? nivelPsicoSocial.hashCode() : 0);
        result = 31 * result + (codigoCargo != null ? codigoCargo.hashCode() : 0);
        result = 31 * result + (idEstructuraArea != null ? idEstructuraArea.hashCode() : 0);
        result = 31 * result + (estructuraArea != null ? estructuraArea.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IdGenero")
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    @Basic
    @Column(name = "Genero")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Basic
    @Column(name = "IdEstadoCivil")
    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    @Basic
    @Column(name = "EstadoCivil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "Estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "Paso")
    public Integer getPaso() {
        return paso;
    }

    public void setPaso(Integer paso) {
        this.paso = paso;
    }
}
