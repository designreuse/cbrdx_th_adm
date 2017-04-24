package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "DivisionPolitica", schema = "crz_th", catalog = "CREZCAMOS")
public class FiltroDivPoliticaEntity {
   private Integer idDivisionPolitica;
   private String descripcionDivisionPolitica;

    @Id
    @Column(name = "IdDivisionPolitica", nullable = false)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    @Basic
    @Column(name = "DescripcionDivisonPolitica", nullable = false)
    public String getDescripcionDivisionPolitica() {
        return descripcionDivisionPolitica;
    }

    public void setDescripcionDivisionPolitica(String descripcionDivisionPolitica) {
        this.descripcionDivisionPolitica = descripcionDivisionPolitica;
    }
}
