
package com.example.fabrica.controller;


import com.example.fabrica.entity.Muestra;
import com.example.fabrica.service.FabricaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FabricaController {
    @Autowired
    private FabricaService fabricaService;
    
    @GetMapping("/muestra")
    public List<Muestra> readMuestra(){
        return fabricaService.getMuestra();
    }
    
    @GetMapping("/maximo")
    public double tempMaxima(){
        return fabricaService.maximo();
    }
    
    @GetMapping("/minimo")
    public double tempMinima(){
        return fabricaService.minimo();
    }
}
