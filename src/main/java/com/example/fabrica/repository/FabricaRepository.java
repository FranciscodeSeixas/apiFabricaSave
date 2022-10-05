
package com.example.fabrica.repository;

import com.example.fabrica.entity.Muestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricaRepository extends JpaRepository<Muestra, Long>{
    //maximo
    @Query(value = "select MAX(GREATEST(m1, m2, m3, m4, m5, m6, m7, m8)) FROM muestras", nativeQuery = true)
    double maximo();
    //maximo
    @Query(value = "select MIN(LEAST(m1, m2, m3, m4, m5, m6, m7, m8)) FROM muestras", nativeQuery = true)
    double minimo();
}
