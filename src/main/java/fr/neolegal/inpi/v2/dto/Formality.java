package fr.neolegal.inpi.v2.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Formality {

    String siren;
    Content content;
    String diffusionINSEE;
    String typePersonne;
    boolean diffusionCommerciale;
    List<Evenement> historique;
    String formeJuridique;
    // Instant created;
    // Instant updated;
}
