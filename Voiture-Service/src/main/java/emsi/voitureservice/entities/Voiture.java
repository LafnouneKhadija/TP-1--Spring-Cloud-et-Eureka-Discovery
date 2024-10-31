package emsi.voitureservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Long getClientId() {
        return id_client;
    }

    public void setClientId(Long clientId) {
        this.id_client = clientId;
    }
}
