package com.example.runa.controller;

import com.example.runa.model.Usuario;
import com.example.runa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticacionController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/verificarCredenciales")
    public Usuario verificarCredenciales(@RequestBody Usuario usuario) {
        Usuario usuarioEnBD = usuarioRepository.findById(usuario.getNombreUsuario()).orElse(null);
        if( usuarioEnBD != null && usuarioEnBD.getContraseña().equals(usuario.getContraseña())){
            return usuarioEnBD;
        }else{
            return usuarioEnBD = null;
        }
    }
}
