package fr.neolegal.inpi.v2.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activite {

    /** Rôle pour l'établissement */
    String rolePourEtablissement;

    /** Date d'effet */
    String dateEffet;

    /** Indicateur principal */
    Boolean indicateurPrincipal;

    /** Indicateur prolongement */
    Boolean indicateurProlongement;

    /** Date de début */
    LocalDate dateDebut;

    /** Date de fin */
    String dateFin;

    /** Exercice activité permanente/saisonnière */
    String exerciceActivite;

    /** Date début période */
    String dateDebutPeriode;

    /** Date fin période  */
    String dateFinPeriode;

    /** Indicateur non sédentaire */
    Boolean indicateurNonSedentaire;

    /** Forme d'exercice */
    String formeExercice;

    /** Catégorisation activité 1 */
    String categorisationActivite1;

    /** Catégorisation activité 2 */
    String categorisationActivite2;

    /** Catégorisation activité 3 */
    String categorisationActivite3;

    /** Catégorisation activité 4 */
    String categorisationActivite4;

    /** Indicateur d’activité viticole */
    Boolean indicateurActiviteViticole;

    /** Indicateur d’activité élévage */
    Boolean indicateurActiviteElevage;

    /** Description détaillée */
    String descriptionDetaillee;

    /** Précision activité */
    String precisionActivite;

    /** Précision autre */
    String precisionAutre;

    /** Surface */
    Integer surface;

    /** Qualité de non-sédentaire */
    String qualiteNonSedentaire;

    /** Autre motif de modification */
    String autreMotifModification;

    /** Totalité/partie */
    String totalitePartie;

    /** Location de DPB  */
    Boolean locationDpb;

    /** Indicateur d’artiste auteur  */
    Boolean indicateurArtisteAuteur;

    /** Soumission au précompte */
    Boolean soumissionAuPrecompte;

    /** Indicateur de marin professionnel  */
    Boolean indicateurMarinProfessionnel;

    /** Rôle principal pour l’entreprise  */
    Boolean rolePrincipalPourEntreprise;

    /** Code APE */
    String codeApe;

    /** numéro du praticien */
    String numPraticien;

    /** statut du praticien  */
    String statutPraticien;

    /** Activité rattachée à l'EIRL  */
    Boolean activiteRattacheeEirl;

    /** Activité régulière  */
    String activiteReguliere;

    /** Indicateur de première activité  */
    Boolean indicateurPremiereActivite;

    /** Date d'effet de transfert  */
    String dateEffetTransfert;

    /** Identifiant temporaire de l'établissement de destination  */
    String identifiantTemporaireEtablissementDestination;

    /** String */
    Adresse ancienneAdresse;

    /** Origine */
    // BlocOrigineActivite origine;

    /** JQPA  */
    // JQPA jqpa;

    /** Location gérance mandat */
    // LocationGeranceMandat locationGeranceMandat;

    /** Locataire gérant mandataire */
    // LocataireGerantMandataire locataireGerantMandataire;

    /** Adresse du gérant mandataire */
    Adresse adresseGerantMandataire;

    /** Dénomination de l'EIRL rattachée à l'activité */
    String denominationEirlRattachee;
}
