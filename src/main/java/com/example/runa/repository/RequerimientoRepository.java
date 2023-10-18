package com.example.runa.repository;

import com.example.runa.model.Requerimiento;
import com.example.runa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RequerimientoRepository extends JpaRepository<Requerimiento, String> {
}
//