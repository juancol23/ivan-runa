package com.example.runa.controller;

import com.example.runa.model.Usuario;
import com.example.runa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/user")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

    @GetMapping("/user")
    public List<Usuario> guardarUsuario() {
        List<Usuario> listadoUsuarios =  usuarioRepository.findAll();
        return listadoUsuarios;
    }


}
