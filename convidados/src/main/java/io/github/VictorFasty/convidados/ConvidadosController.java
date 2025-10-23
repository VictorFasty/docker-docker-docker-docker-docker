package io.github.VictorFasty.convidados;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {
    @Autowired
    private ConvidadosRepository repository;

    @GetMapping
    public List<Convidado> getconvidados(){
        return repository.findAll();
    }
}
