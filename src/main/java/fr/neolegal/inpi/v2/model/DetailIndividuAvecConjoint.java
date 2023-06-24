package fr.neolegal.inpi.v2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailIndividuAvecConjoint extends DetailIndividu {

    RoleConjoint roleConjoint;
    DetailIndividu conjoint;
}
