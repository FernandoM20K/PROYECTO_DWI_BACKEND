package com.edu.utp.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_profesores_cursos")
public class ProfesorCurso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profesorCursoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesorId")
    private Profesor profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cursoId")
    private Curso curso;

    public ProfesorCurso() {
    
    }

    public Long getProfesorCursoId() {
        return profesorCursoId;
    }

    public void setProfesorCursoId(Long profesorCursoId) {
        this.profesorCursoId = profesorCursoId;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
}
