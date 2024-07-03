package fr.neolegal.inpi.v2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Content {

    PersonneMorale personneMorale;
    String formeExerciceActivitePrincipale;
    NatureCreation natureCreation;
}
