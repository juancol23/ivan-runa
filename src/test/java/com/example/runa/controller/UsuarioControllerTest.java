package com.example.runa.controller;

import com.example.runa.controller.UsuarioController;
import com.example.runa.model.Usuario;
import com.example.runa.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UsuarioControllerTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioController usuarioController;

    public UsuarioControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGuardarUsuario() {
        Usuario usuario = new Usuario("administrador", "administrador123", "admin", "administrador@runa-it.com", "activo");
        when(usuarioRepository.save(any(Usuario.class))).thenReturn(usuario);

        Usuario result = usuarioController.guardarUsuario(usuario);
        assertEquals(usuario, result);
    }

    @Test
    public void testGuardarUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("administrador", "administrador123", "admin", "administrador@runa-it.com", "activo"),
                new Usuario("Lesly", "lesly123", "analista", "lesly.huaman@runa-it.com", "activo")
        );
        when(usuarioRepository.saveAll(anyList())).thenReturn(usuarios);

        List<Usuario> result = usuarioController.guardarUsuariossss(usuarios);
        assertEquals(usuarios, result);
    }

    @Test
    public void testListarUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("administrador", "administrador123", "admin", "administrador@runa-it.com", "activo"),
                new Usuario("Lesly", "lesly123", "analista", "lesly.huaman@runa-it.com", "activo")
        );
        when(usuarioRepository.findAll()).thenReturn(usuarios);

        List<Usuario> result = usuarioController.guardarUsuario();
        assertEquals(usuarios, result);
    }

    @Test
    public void testDeleteUsuarios() {
        doNothing().when(usuarioRepository).deleteAll();

        usuarioController.deleteUsuario();
        verify(usuarioRepository, times(1)).deleteAll();
    }
}
