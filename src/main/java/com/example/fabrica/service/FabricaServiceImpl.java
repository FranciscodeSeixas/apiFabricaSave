
package com.example.fabrica.service;

import com.example.fabrica.entity.Muestra;
import com.example.fabrica.repository.FabricaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FabricaServiceImpl implements FabricaService{
    @Autowired
    FabricaRepository fabricaRepositorio;
    //READ

    @Override
    public List<Muestra> getMuestra() {
        return fabricaRepositorio.findAll();
    }

    @Override
    public double maximo() {
        return fabricaRepositorio.maximo();
    }

    @Override
    public double minimo() {
        return fabricaRepositorio.minimo();
    }
        
}
