package com.dillian.supervisorservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupervisorGenerator {

    private final SupervisorRepository repository;

    public void create() {
        Supervisor kaitoTanaka = new Supervisor();
        kaitoTanaka.setId(1L);
        kaitoTanaka.setFirstName("Kaito");
        kaitoTanaka.setLastName("Tanaka");
        kaitoTanaka.setImageUrl("/assets/supervisor/kaito_tanaka.png");
        kaitoTanaka.setBiography("He's from Japan enzo");
        Supervisor ameliaLupina = new Supervisor();
        ameliaLupina.setId(2L);
        ameliaLupina.setFirstName("Amelia");
        ameliaLupina.setLastName("Lupina");
        ameliaLupina.setImageUrl("/assets/supervisor/amelia_lupina.png");
        ameliaLupina.setBiography("Pretty girl enzo");
        repository.saveAll(List.of(kaitoTanaka, ameliaLupina));
    }
}
