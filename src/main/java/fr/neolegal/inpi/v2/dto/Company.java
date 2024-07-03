package fr.neolegal.inpi.v2.dto;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {

    String id;
    Instant updatedAt;
    Integer nombreRepresentantsActifs;
    Integer nombreEtablissementsOuverts;
    Integer nombreBeneficiairesEffectifsActifs;
    Formality formality;
}
