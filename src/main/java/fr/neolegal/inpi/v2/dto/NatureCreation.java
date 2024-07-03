package fr.neolegal.inpi.v2.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NatureCreation {
    LocalDate dateCreation;
    Boolean societeEtrangere;
    String formeJuridique;
    String formeJuridiqueInsee;
    boolean etablieEnFrance;
    boolean salarieEnFrance;
    boolean relieeEntrepriseAgricole;
    boolean entrepriseAgricole;
}
