package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Boas vindas a essa rota";
    }

    //Endpoints (CRUD)

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!!";
    }

    @GetMapping("/listar")
    public String mostrarAllNinjas(){
        return "Todos os ninjas";
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
