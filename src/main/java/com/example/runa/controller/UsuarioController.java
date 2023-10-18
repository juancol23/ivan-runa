package com.example.runa.controller;

import com.example.runa.model.Requerimiento;
import com.example.runa.model.Usuario;
import com.example.runa.repository.RequerimientoRepository;
import com.example.runa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RequerimientoRepository requerimientoRepository;

    @CrossOrigin(origins = "*")
    @PostMapping("/user")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/user")
    public List<Usuario> guardarUsuario() {
        List<Usuario> listadoUsuarios =  usuarioRepository.findAll();
        return listadoUsuarios;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/requerimiento")
    public Requerimiento guardarRequerimiento(@RequestBody Requerimiento requerimiento) {
        requerimientoRepository.save(requerimiento);
        return requerimiento;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/requerimiento")
    public List<Requerimiento> listarRequerimiento() {
        List<Requerimiento>  requerimientos = requerimientoRepository.findAll();
        return requerimientos;
    }

}
