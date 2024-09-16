package com.pucminas.gestaoquadras.agendamento.agendamento.dataprovider;

import com.pucminas.gestaoquadras.agendamento.agendamento.Agendamento;
import com.pucminas.gestaoquadras.agendamento.quadra.Quadra;
import com.pucminas.gestaoquadras.agendamento.usuario.Usuario;

import java.time.Instant;
import java.util.Set;

public interface AgendamentoGateway {
    Agendamento save(Agendamento agendamento);
    Set<Agendamento> getAgendamentosByUsuario(Usuario usuario);
    Integer getCountAgendamentosByQuadraEHorario(Quadra quadra, Instant inicioAgendamento, Instant fimAgendamento);
}
