package fr.neolegal.inpi.v2.dto;

import java.time.Instant;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Description {

    String objet;
    Integer duree;
    LocalDate datePremiereCloture;
    Boolean ess;
    Boolean capitalVariable;
    Double montantCapital;
    String deviseCapital;
}
