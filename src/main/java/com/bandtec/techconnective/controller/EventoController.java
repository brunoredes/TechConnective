package com.bandtec.techconnective.controller;

import com.bandtec.techconnective.dao.EventoRepository;
import com.bandtec.techconnective.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;


    @CrossOrigin
    @PostMapping("/evento")
    public ResponseEntity<String> createEvent(@RequestBody Evento evento) {
        eventoRepository.save(evento);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin
    @GetMapping("/evento")
    public ResponseEntity<List<Evento>> listEvent() {
        List<Evento> lista = eventoRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

}
