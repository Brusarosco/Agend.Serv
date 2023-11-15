package com.agendserv.service;

import com.agendserv.model.Agendamento;
import com.agendserv.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    @Override
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento buscarAgendamento(Long id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

    @Override
    public Agendamento criarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento atualizarAgendamento(Long id, Agendamento agendamento) {
        Agendamento existente = agendamentoRepository.findById(id).orElse(null);

        if (existente != null) {
            // Acesse as propriedades usando os métodos gerados pelo Lombok
            existente.setCliente(agendamento.getCliente());
            existente.setServico(agendamento.getServico());
            existente.setDataHora(agendamento.getDataHora());

            return agendamentoRepository.save(existente);
        } else {
            return null;
        }
    }

    @Override
    public void deletarAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }
}
