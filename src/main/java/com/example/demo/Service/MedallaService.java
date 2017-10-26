package com.example.demo.Service;

import com.example.demo.Entity.Medalla;
import com.example.demo.Entity.TipoMedalla;
import com.example.demo.Repository.AtletaRepository;
import com.example.demo.Repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MedallaService {

    @Autowired
    private MedallaRepository medallaRepository;

    @Autowired
    private AtletaRepository atletaRepository;

    public void testMedalla() {

        Medalla m1 = new Medalla(TipoMedalla.ORO , "100 metros", "Olimpiadas");
        Medalla m2 = new Medalla(TipoMedalla.BRONCE, "Salto", "Competicion Barcelona");
        Medalla m3 = new Medalla(TipoMedalla.ORO, "Lanzamiento de disco", "Olimpiadas");

        m1.setAtleta(atletaRepository.findOne(1L));
        m2.setAtleta(atletaRepository.findOne(3L));
        m3.setAtleta(atletaRepository.findOne(5L));

        medallaRepository.save(m1);
        medallaRepository.save(m2);
        medallaRepository.save(m3);

        System.out.println("");

    }

}
