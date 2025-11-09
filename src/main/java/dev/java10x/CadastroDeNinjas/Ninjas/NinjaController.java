package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //Endpoints (CRUD)

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!!";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listarID")
    public String mostrarAllNinjasId(){
        return "Todos os ninjas id";
    }

    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "Alterar Ninja";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaId(){
        return "Ninja deletado";
    }


}
