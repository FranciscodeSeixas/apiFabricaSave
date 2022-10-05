
package com.example.fabrica.service;

import com.example.fabrica.entity.Muestra;
import java.util.List;


public interface FabricaService {
    //READ
    public List<Muestra> getMuestra();
    //sacar maximo
    public double maximo();
    //sacar minimo
    public double minimo();
    //sacar promedio
}
