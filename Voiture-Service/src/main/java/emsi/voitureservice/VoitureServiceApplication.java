package emsi.voitureservice;

import emsi.voitureservice.entities.Client;
import emsi.voitureservice.entities.Voiture;
import emsi.voitureservice.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@EnableFeignClients
@SpringBootApplication
public class VoitureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(VoitureRepository voitureRepository) {
        return args -> {
            Voiture voiture1 = new Voiture(null, "Toyota", "ABC123", "Corolla", 1L, null);
            Voiture voiture2 = new Voiture(null, "Honda", "DEF456", "Civic", 2L, null);
            Voiture voiture3 = new Voiture(null, "Ford", "GHI789", "Focus", 3L, null);

            voitureRepository.save(voiture1);
            voitureRepository.save(voiture2);
            voitureRepository.save(voiture3);
        };
    }

    @FeignClient(name = "service-client")
    public interface ClientService {
        @GetMapping("/clients/{id}")
        Client clientById(@PathVariable Long id);
    }
}
