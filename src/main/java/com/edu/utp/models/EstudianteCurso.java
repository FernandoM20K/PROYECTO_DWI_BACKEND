package com.edu.utp.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_estudiante_cursos")
public class EstudianteCurso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudianteCursoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Estudiante estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private ProfesorCurso profesorCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Nota nota;
}
