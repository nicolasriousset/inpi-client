package fr.neolegal.inpi.v2.dto;

import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonneMorale {

    Identite identite;
    AdresseEntreprise adresseEntreprise;
    Composition composition;
    Etablissement etablissementPrincipal;
    Etablissement etablissementModifie;
    Collection<Etablissement> autresEtablissements;
}
