package emsi.voitureservice.repositories;

import emsi.voitureservice.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByClient_Id(Long clientId);


}
