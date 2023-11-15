package com.agendserv.service;

import com.agendserv.model.Agendamento;

import java.util.List;

public interface AgendamentoService {
    List<Agendamento> listarAgendamentos();
    Agendamento buscarAgendamento(Long id);
    Agendamento criarAgendamento(Agendamento agendamento);
    Agendamento atualizarAgendamento(Long id, Agendamento agendamento);
    void deletarAgendamento(Long id);
}
