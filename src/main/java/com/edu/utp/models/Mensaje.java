package com.edu.utp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.PrePersist;

@Entity
@Table(name = "tb_mensajes")
public class Mensaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mensajeId;

    @Column(length = 5000)
    private String Mensaje;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnvio;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuarioEnvio;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuarioRecepcion;

    public Mensaje() {
    
    }

    @PrePersist
    public void PrePersist() {
        this.fechaEnvio = new Date();
    }

    public Long getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(Long mensajeId) {
        this.mensajeId = mensajeId;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public Usuario getUsuarioEnvio() {
        return usuarioEnvio;
    }

    public void setUsuarioEnvio(Usuario usuarioEnvio) {
        this.usuarioEnvio = usuarioEnvio;
    }

    public Usuario getUsuarioRecepcion() {
        return usuarioRecepcion;
    }

    public void setUsuarioRecepcion(Usuario usuarioRecepcion) {
        this.usuarioRecepcion = usuarioRecepcion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
}
