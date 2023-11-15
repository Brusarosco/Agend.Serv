package com.agendserv.repository;

import com.agendserv.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    // você pode adicionar consultas personalizadas, se necessário
}
