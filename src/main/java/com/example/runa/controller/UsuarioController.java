package com.example.runa.controller;

import com.example.runa.model.Requerimiento;
import com.example.runa.model.Usuario;
import com.example.runa.repository.RequerimientoRepository;
import com.example.runa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/users")
    public List<Usuario> guardarUsuariossss(@RequestBody List<Usuario> usuarios) {
        usuarioRepository.saveAll(usuarios);
        return usuarios;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/user")
    public List<Usuario> guardarUsuario() {
        List<Usuario> listadoUsuarios =  usuarioRepository.findAll();
        return listadoUsuarios;
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/user")
    public void deleteUsuario() {
         usuarioRepository.deleteAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/requerimiento")
    public Requerimiento guardarRequerimiento(@RequestBody Requerimiento requerimiento) {
        requerimientoRepository.save(requerimiento);
        return requerimiento;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/requerimientos")
    public List<Requerimiento> guardarRequerimientos(@RequestBody List<Requerimiento> requerimientos) {
        requerimientoRepository.saveAll(requerimientos);
        return requerimientos;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/requerimiento")
    public List<Requerimiento> listarRequerimiento() {
        List<Requerimiento>  requerimientos = requerimientoRepository.findAll();
        return requerimientos;
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/requerimiento")
    public void  deleteRequerimiento() {
        requerimientoRepository.deleteAll();
    }

    @DeleteMapping("/requerimiento/{id}")
    public ResponseEntity<Void> deleteRequerimiento(@PathVariable Long id) {
        // Verificar si el objeto con el ID proporcionado existe
        if (requerimientoRepository.existsById(id)) {
            // Si existe, eliminar el objeto por ID
            requerimientoRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // Retorna 204 No Content
        } else {
            // Si no existe, puedes devolver un código de estado 404 Not Found o personalizado
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/requerimiento/{id}")
    public ResponseEntity<Requerimiento> updateRequerimiento(@PathVariable Long id,
                                             @RequestBody Requerimiento requerimiento) {
        Optional<Requerimiento> existingRequerimientoOptional = requerimientoRepository.findById(id+"");

        if (existingRequerimientoOptional.isPresent()) {
            Requerimiento existingRequerimiento = existingRequerimientoOptional.get();

            // Actualiza los campos del requerimiento existente con los valores proporcionados en el cuerpo de la solicitud
            existingRequerimiento = requerimiento;
            // ...

            // Guarda el requerimiento actualizado en la base de datos
            Requerimiento updatedRequerimiento = requerimientoRepository.save(existingRequerimiento);

            return new ResponseEntity<>(updatedRequerimiento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/requerimiento/{id}")
    public ResponseEntity<Requerimiento> updateRequerimientoUno(@PathVariable Long id) {
        Optional<Requerimiento> existingRequerimientoOptional = requerimientoRepository.findById(id+"");

        if (existingRequerimientoOptional.isPresent()) {
            Requerimiento existingRequerimiento = existingRequerimientoOptional.get();

            return new ResponseEntity<>(existingRequerimiento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /************************************/
    @CrossOrigin(origins = "*")
    @PutMapping("/requerimientos")
    public ResponseEntity<String> actualizarMasivo(@RequestBody List<Requerimiento> requerimientos) {
        try {
            actualizarRequerimientosMasivo(requerimientos);
            return new ResponseEntity<>("Actualización masiva exitosa", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al actualizar requerimientos: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void actualizarRequerimientosMasivo(List<Requerimiento> requerimientos) {
        for (Requerimiento dto : requerimientos) {
            Optional<Requerimiento> optionalRequerimiento = requerimientoRepository.findById(dto.getId()+"");

            if (optionalRequerimiento.isPresent()) {
                Requerimiento requerimiento = optionalRequerimiento.get();
                // Actualiza los campos del objeto requerimiento con los valores del DTO

              //  requerimiento.setStatus(dto.getStatus());
               // requerimiento.setVMO(dto.getVMO());
                //requerimiento.setSolicitante(dto.getSolicitante());

                 requerimiento = dto;
                // Actualiza otros campos si es necesario
                requerimientoRepository.save(requerimiento);
            }
        }
    }

}

