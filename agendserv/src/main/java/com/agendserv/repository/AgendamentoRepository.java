package com.agendserv.repository;

import com.agendserv.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    // você pode adicionar consultas personalizadas, se necessário
}
