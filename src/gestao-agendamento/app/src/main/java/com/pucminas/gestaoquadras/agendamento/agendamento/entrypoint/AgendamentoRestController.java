package com.pucminas.gestaoquadras.agendamento.agendamento.entrypoint;

import com.pucminas.gestaoquadras.agendamento.agendamento.entrypoint.requests.AgendarQuadraRequest;
import com.pucminas.gestaoquadras.agendamento.agendamento.entrypoint.responses.AgendarQuadraResponse;
import com.pucminas.gestaoquadras.agendamento.agendamento.usecases.AgendarQuadraUsecase;
import com.pucminas.gestaoquadras.agendamento.agendamento.usecases.dto.AgendarQuadraUsecaseInput;
import jakarta.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Objects;

@RestController
public class AgendamentoRestController implements AgendamentoRestEndpoint {
    private final AgendarQuadraUsecase agendarQuadraUsecase;

    @Inject
    public AgendamentoRestController(final AgendarQuadraUsecase agendarQuadraUsecase) {
        this.agendarQuadraUsecase = Objects.requireNonNull(agendarQuadraUsecase);
    }

    @Override
    public ResponseEntity<AgendarQuadraResponse> agendarQuadra(AgendarQuadraRequest request) {
        final var usecaseOutput = agendarQuadraUsecase.execute(
                new AgendarQuadraUsecaseInput(request.usuarioId(), request.quadraId(), request.inicioAgendamento(), request.fimAgendamento())
        );

        final var response = new AgendarQuadraResponse(
                usecaseOutput.id(),
                usecaseOutput.status(),
                usecaseOutput.quadra(),
                usecaseOutput.usuario(),
                usecaseOutput.inicioAgendamento(),
                usecaseOutput.fimAgendamento()
        );

        final var location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();
        return ResponseEntity.created(location).body(response);
    }
}
