package com.example.demo.Service;

import com.example.demo.Entity.Atleta;
import com.example.demo.Repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public void testAtleta() {

        Atleta a1 = new Atleta("Marc", "Debuen", "España", LocalDate.of(1994, 11, 30));
        Atleta a2 = new Atleta("Victor", "Jaria", "España", LocalDate.of(1994, 10, 9));
        Atleta a3 = new Atleta("Ferran", "Valls", "Francia", LocalDate.of(1990, 5, 12));
        Atleta a4 = new Atleta("Mar", "Aguayo", "Italia", LocalDate.of(1995, 2, 2));
        Atleta a5 = new Atleta("Javier", "Manzano", "China", LocalDate.of(1998, 8, 12));

        atletaRepository.save(a1);
        atletaRepository.save(a2);
        atletaRepository.save(a3);
        atletaRepository.save(a4);
        atletaRepository.save(a5);


        System.out.println("Devolver Atletas de una nacionalidad");
        System.out.println(atletaRepository.findByNacionalidad("España"));
        System.out.println();

        System.out.println("Devolver Atletas que han nacido antes de una fecha");
        System.out.println(atletaRepository.findByNacimientoBefore(LocalDate.of(1995, 5, 12)));
        System.out.println();

    }




}
