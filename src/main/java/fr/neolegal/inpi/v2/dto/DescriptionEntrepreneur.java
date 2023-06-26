package fr.neolegal.inpi.v2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DescriptionEntrepreneur extends DescriptionPersonne {

    String siren;
    String nicSiege;
}
