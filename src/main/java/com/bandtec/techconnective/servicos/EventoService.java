package com.bandtec.techconnective.servicos;

import com.bandtec.techconnective.dao.EventoRepository;
import com.bandtec.techconnective.exception.EventoException;
import com.bandtec.techconnective.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    EventoRepository eventoRepository;

    public Evento salvar(Evento evento) {

        return eventoRepository.save(evento);
    }
}
