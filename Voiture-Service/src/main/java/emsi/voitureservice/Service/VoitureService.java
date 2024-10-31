package emsi.voitureservice.Service;

import emsi.voitureservice.VoitureServiceApplication;
import emsi.voitureservice.entities.Client;
import emsi.voitureservice.entities.Voiture;
import emsi.voitureservice.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private VoitureServiceApplication.ClientService clientService;

    public Client getClientById(Long id) {
        return clientService.clientById(id);
    }

    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}
