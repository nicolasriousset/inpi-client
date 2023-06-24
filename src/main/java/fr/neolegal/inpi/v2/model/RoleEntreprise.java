package fr.neolegal.inpi.v2.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum RoleEntreprise {
    MEMBRE("Membre", "11"),
    CONTROLEUR_DE_GESTION("Contrôleur de gestion", "13"),
    CONTROLEUR_DES_COMPTES("Contrôleur des comptes", "14"),
    AUTRE_ASSOCIE_MAJORITAIRE("Autre associé majoritaire", "23"),
    GERANT_ET_ASSOCIE_SOLIDAIREMENT_RESPONSABLE(
            "Gérant et associé indéfiniment et solidairement responsable",
            "28"),
    GERANT_ET_ASSOCIE_RESPONSABLE("Gérant et associé indéfiniment responsable", "29"),
    GERANT("Gérant", "30"),
    LIQUIDATEUR("Liquidateur", "40"),
    ASSOCIE_UNIQUE("Associé unique (qui participe à l’activité EURL)", "41"),
    PRESIDENT_CONSEIL_ADMINISTRATION(
            "Président du conseil d’administration",
            "51"),
    PRESIDENT_DU_DIRECTOIRE("Président du directoire", "52"),
    DIRECTEUR_GENERAL("Directeur Général", "53"),
    DIRIGEANT_ETRANGER_SOCIETE_ETRANGERE("Dirigeant à l’étranger d’une personne morale étrangère", "55"),
    DIRIGEANT_FRANCE_SOCIETE_ETRANGERE("Dirigeant en France d’une personne morale étrangère", "56"),
    PRESIDENT_CONSEIL_ADMINISTRATION_ET_DIRECTEUR_GENERAL(
            "Président du conseil d’administration et directeur général",
            "60"),
    PRESIDENT_CONSEIL_SURVEILLANCE("Président du conseil de surveillance", "61"),
    MEMBRE_DIRECTOIRE("Membre du directoire", "63"),
    MEMBRE_CONSEIL_SURVEILLANCE("Membre du conseil de surveillance", "64"),
    ADMINISTRATEUR("Administrateur", "65"),
    FONDE_DE_POUVOIR("Personne ayant le pouvoir d’engager à titre habituel la société", "66"),
    FONDE_DE_POUVOIR_ETABLISSEMENT("Personne ayant le pouvoir d’engager l'établissement", "67"),
    DIRECTEUR_GENERAL_SA("Directeur général unique de SA à directoire", "69"),
    DIRECTEUR_GENERAL_DELEGUE("Directeur général délégué", "70"),
    COMMISSAIRE_AUX_COMPTES("Commissaire aux comptes titulaire", "71"),
    COMMISSAIRE_AUX_COMPTES_SUPPLEANT("Commissaire aux comptes suppléant", "72"),
    PRESIDENT_SAS("Président de SAS", "73"),
    ASSOCIE_SOLIDAIREMENT_RESPONSABLE("Associé indéfiniment et solidairement responsable", "74"),
    ASSOCIE_RESPONSABLE("Associé indéfiniment responsable", "75"),
    REPRESENTANT_SOCIAL_FRANCE_SOCIETE_ETRANGERE(
            "Représentant social en France d’une entreprise étrangère",
            "76"),
    REPRESENTANT_FISCAL_FRANCE_SOCIETE_ETRANGERE(
            "Représentant fiscal en France d’une entreprise étrangère",
            "77"),
    INDIVISAIRE("Indivisaire", "82"),
    EXPLOITANT_POUR_INDIVISION("Exploitant pour le compte de l’indivision", "86"),
    PERSONNE_PHYSIQUE_EXPLOITANT_EN_COMMUN("Personne physique, exploitant en commun", "90"),
    MANDATAIRE_AD_HOC("Mandataire ad hoc", "97"),
    ADMINISTRATEUR_PROVISOIRE("Administrateur provisoire", "98"),
    AUTRE("Autre", "99"),
    MEMBRE_NON_SALARIE("Membre non salarié participant aux travaux", "94"),
    ASSOCIE_PARTICIPANT("Associé qui participe à la gestion", "95"),
    ASSOCIE_NON_SALARIE("Associé non salarié", "96"),
    REPRENEUR("Repreneur", "100"),
    ENTREPRENEUR("Entrepreneur", "101"),
    SUPPLEANT("Suppléant", "103"),
    PERSONNE_CHARGEE_CONTROLE("Personne chargée du contrôle", "104"),
    DECISIONNAIRE_DESIGNE("Personne décisionnaire désignée", "105"),
    COMPTABLE("Comptable", "106"),
    HERITIER_INDIVISAIRE("Héritier indivisaire", "107"),
    LOUEUR("Loueur", "108");

    @JsonValue
    final String code;

    final String label;

    RoleEntreprise(String label, String code) {
        this.label = label;
        this.code = code;
    }
}
