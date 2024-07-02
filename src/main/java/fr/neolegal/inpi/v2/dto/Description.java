package fr.neolegal.inpi.v2.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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
