package com.edu.utp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_apoderados")
public class Apoderado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apoderadoId;
    private String nombre;
    private String apellido;
    private String dni;
    private String genero;
    private String celular;
    private String direccion;
    private String email;
    
    @JsonIgnore
    @OneToMany(mappedBy = "apoderado")
    private List<Estudiante> estudiantes;

    public Apoderado() {
        
    }

    public Long getApoderadoId() {
        return apoderadoId;
    }

    public void setApoderadoId(Long apoderadoId) {
        this.apoderadoId = apoderadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
