package com.pucminas.gestaoquadras.agendamento.agendamento.usecases;

import com.pucminas.gestaoquadras.agendamento.agendamento.usecases.dto.CancelarAgendamentoUsecaseInput;
import com.pucminas.gestaoquadras.agendamento.agendamento.usecases.dto.CancelarAgendamentoUsecaseOutput;

public interface CancelarAgendamentoUsecase {

    CancelarAgendamentoUsecaseOutput execute(CancelarAgendamentoUsecaseInput input);
}
