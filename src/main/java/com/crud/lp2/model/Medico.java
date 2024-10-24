package com.crud.lp2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_MEDICOCL3")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmedicocl3;

    private String nombrecl3;
    private String apellidocl3;
    private String email;
    private String dnicl3;
    private String estadocivilcl3;

    @Column(name = "fechanacimcl3")
    private java.sql.Date fechanacimcl3;

    // Getters y Setters
    public Integer getIdmedicocl3() {
        return idmedicocl3;
    }

    public void setIdmedicocl3(Integer idmedicocl3) {
        this.idmedicocl3 = idmedicocl3;
    }

    public String getNombrecl3() {
        return nombrecl3;
    }

    public void setNombrecl3(String nombrecl3) {
        this.nombrecl3 = nombrecl3;
    }

    public String getApellidocl3() {
        return apellidocl3;
    }

    public void setApellidocl3(String apellidocl3) {
        this.apellidocl3 = apellidocl3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDnicl3() {
        return dnicl3;
    }

    public void setDnicl3(String dnicl3) {
        this.dnicl3 = dnicl3;
    }

    public String getEstadocivilcl3() {
        return estadocivilcl3;
    }

    public void setEstadocivilcl3(String estadocivilcl3) {
        this.estadocivilcl3 = estadocivilcl3;
    }

    public java.sql.Date getFechanacimcl3() {
        return fechanacimcl3;
    }

    public void setFechanacimcl3(java.sql.Date fechanacimcl3) {
        this.fechanacimcl3 = fechanacimcl3;
    }
}

