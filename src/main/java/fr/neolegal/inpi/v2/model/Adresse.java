package fr.neolegal.inpi.v2.model;

import static java.util.Objects.*;
import static org.apache.commons.lang3.StringUtils.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Adresse {

    String roleAdresse;
    String pays;
    String codePays;
    String codePostal;
    String commune;
    String codeInseeCommune;
    String voie;
    String numVoie;
    TypeVoie typeVoie;
    String voieCodifiee;
    String indiceRepetition;
    String distributionSpeciale;
    String communeAncienne;
    String datePriseEffetAdresse;
    String complementLocalisation;
    String communeDeRattachement;
    CaracteristiquesSiegeAdresseEntreprise caracteristiques;

    public String getLigne1() {
        StringBuilder builder = new StringBuilder();
        if (isNotBlank(numVoie)) {
            builder.append(numVoie);

            if (isNotBlank(indiceRepetition)) builder.append(indiceRepetition);
            builder.append(" ");
        }

        if (nonNull(typeVoie)) {
            builder.append(typeVoie.getLibelle());
            builder.append(" ");
        }

        if (isNotBlank(voie)) {
            builder.append(voie);
            builder.append(" ");
        }

        return builder.toString();
    }

    public String getLigne2() {
        return complementLocalisation;
    }
}
