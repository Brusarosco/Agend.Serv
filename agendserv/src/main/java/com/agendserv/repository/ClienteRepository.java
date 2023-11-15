package com.agendserv.repository;

import com.agendserv.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // você pode adicionar consultas personalizadas, se necessário
}
