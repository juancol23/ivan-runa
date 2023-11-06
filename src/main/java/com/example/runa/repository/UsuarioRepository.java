package com.example.runa.repository;

import com.example.runa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, String> {


}
//