package fr.neolegal.inpi.v2.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Entreprise {

    String roleEntreprise;
    String pays;
    String siren;
    String registre;
    String denomination;
    String formeJuridique;
    String codeApe;
    Boolean indicateurAssocieUnique;
    String dateEffet;
    LocalDate dateImmat;
    Integer numDetenteur;
    Integer numExploitant;
    Integer numRna;
    String lieuRegistre;
    String autreIdentifiantEtranger;
    String nicSiege;
    String nomCommercial;
    String typeRepresentant;
    String role;
}
