package com.bandtec.techconnective.controller;

import com.bandtec.techconnective.dao.EventoRepository;
import com.bandtec.techconnective.model.Evento;
import com.bandtec.techconnective.servicos.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EventoService eventoService;

    @CrossOrigin
    @PostMapping("/evento")
    @ResponseStatus(HttpStatus.CREATED)
    public Evento createEvent(@RequestBody Evento evento) {
        return eventoService.salvar(evento);
    }

    @CrossOrigin
    @GetMapping("/evento")
    public ResponseEntity<List<Evento>> listEvent() {
        List<Evento> lista = eventoRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

}
