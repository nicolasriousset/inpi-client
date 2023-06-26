package fr.neolegal.inpi.v2.dto;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Description {

    String objet;
    Integer duree;
    Instant datePremiereCloture;
    Boolean ess;
    Boolean capitalVariable;
    Double montantCapital;
    String deviseCapital;
}
