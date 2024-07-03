package fr.neolegal.inpi.v2.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pouvoir {

    /** Individu */
    DetailIndividuAvecConjoint individu;

    /** Entreprise */
    Entreprise entreprise;

    /** Adresse de l'entreprise */
    Adresse adresseEntreprise;

    /** Représentant */
    DetailIndividu representant;

    /** Rôle dans l'entreprise */
    RoleEntreprise roleEntreprise;

    /** Date d'effet */
    LocalDate dateEffet;

    /** Etablissement(s) concerné(s) */
    // Collection<PouvoirEtablissement> etablissementConcerne

    /** Type de personne */
    TypeDePersonne typeDePersonne;

    /** Bénéficiaire effectif */
    Boolean beneficiaireEffectif;

    /** Indicateur de second rôle dans l'entreprise */
    Boolean indicateurSecondRoleEntreprise;

    /** Second rôle dans l'entreprise */
    RoleEntreprise secondRoleEntreprise;
}
