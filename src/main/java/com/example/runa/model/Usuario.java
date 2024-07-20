package com.example.runa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;


@Entity
public class Usuario {
    @Id
    private String nombreUsuario;
    private String contraseña;
    private String perfil;
    private String email;
    private String status;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseña, String perfil, String email, String status) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.perfil = perfil;
        this.email = email;
        this.status = status;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
