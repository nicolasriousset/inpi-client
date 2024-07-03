package fr.neolegal.inpi.v2.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Evenement {
    Instant dateIntegration;
    String codeEvenement;
    String libelleEvenement;
    String numeroLiasse;
    String patchId;
    // Instant dateEffet;
    String cheminDateEffet;
}
