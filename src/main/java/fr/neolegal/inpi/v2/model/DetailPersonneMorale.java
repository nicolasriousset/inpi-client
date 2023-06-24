package fr.neolegal.inpi.v2.model;

import static java.util.Objects.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailPersonneMorale {

    String objet;
    String sigle;
    Integer duree;
    String dateClotureExerciceSocial;
    LocalDate datePremiereCloture;
    Boolean ess;
    Boolean societeMission;
    Boolean capitalVariable;
    Double montantCapital;
    Double capitalMinimum;
    String deviseCapital;
    String statutLegalParticulier;
    String dateAgrementGAEC;
    String typeDeStatuts;
    Boolean indicateurOrigineFusionScission;
    Boolean indicateurEtablissementsEtrangers;
    Boolean indicateurAssocieUnique;
    Boolean depotDemandeAcre;
    Boolean indicateurAssocieUniqueDirigeant;
    String natureGerance;
    String natureDesActivite;
    Boolean formeCooperative;
    String numeroAgrementGAEC;
    Boolean capitalDisponible;
    Boolean prorogationDuree;
    Boolean continuationAvecActifNetInferieurMoitieCapital;
    Boolean reconstitutionCapitauxPropres;
    String origineFusionScission;
    String dateEffet;

    public Boolean isCapitalVariable() {
        return Boolean.TRUE.equals(capitalVariable);
    }

    public Integer jourClotureExercice() {
        if (isNull(datePremiereCloture)) {
            return null;
        }
        return datePremiereCloture.getDayOfMonth();
    }

    public Integer moisClotureExercice() {
        if (isNull(datePremiereCloture)) {
            return null;
        }
        return datePremiereCloture.getMonthValue();
    }

    public Integer anneeCloturePremierExercice() {
        if (isNull(datePremiereCloture)) {
            return null;
        }
        return datePremiereCloture.getYear();
    }
}
