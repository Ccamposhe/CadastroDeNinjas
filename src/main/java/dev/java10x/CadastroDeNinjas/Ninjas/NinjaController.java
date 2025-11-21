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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasId(@PathVariable Long id){
        return ninjaService.listarNinjaID(id);
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
