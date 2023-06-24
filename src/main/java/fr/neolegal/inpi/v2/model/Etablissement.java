package fr.neolegal.inpi.v2.model;

import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */

@Getter
@Setter
public class Etablissement {

    DescriptionEtablissement descriptionEtablissement;
    Adresse adresse;
    Adresse adresseDomiciliataire;
    Collection<Activite> activites;
}
