package com.example.runa;

import com.example.runa.model.Usuario;
import com.example.runa.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class UsuarioControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        usuarioRepository.deleteAll();
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("administrador");
        usuario.setContraseña("administrador123");
        usuario.setPerfil("admin");
        usuario.setEmail("administrador@runa-it.com");
        usuario.setStatus("activo");
        usuarioRepository.save(usuario);
    }

    @Test
    public void testGuardarUsuario() throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("nuevoUsuario");
        usuario.setContraseña("nuevoUsuario123");
        usuario.setPerfil("user");
        usuario.setEmail("nuevo@runa-it.com");
        usuario.setStatus("activo");

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(usuario)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombreUsuario").value("nuevoUsuario"))
                .andExpect(jsonPath("$.email").value("nuevo@runa-it.com"));
    }

    @Test
    public void testListarUsuarios() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombreUsuario").value("administrador"))
                .andExpect(jsonPath("$[0].email").value("administrador@runa-it.com"));
    }

    @Test
    public void testEliminarUsuarios() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .delete("/user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }
}
