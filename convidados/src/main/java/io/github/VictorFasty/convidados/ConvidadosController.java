package io.github.VictorFasty.convidados;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {
    @GetMapping
    public List<convidado> getconvidados(){
        List<convidado> lista = new ArrayList<convidado>();
        lista.add(new convidado("fulano", "3018033098"));
        lista.add(new convidado("cicrano", "31903119393"));
        return lista;
    }
}
