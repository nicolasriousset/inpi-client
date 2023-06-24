package fr.neolegal.inpi.v2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeDePersonne {
    INDIVDU("INDIVIDU", "Personne Physique"),
    ENTREPRISE("ENTREPRISE", "Personne Morale"),
    ASSOCIATION("ASSOCIATION", "Association"),
    AUTRE("AUTRE", "Autre");

    @JsonValue
    final String code;

    final String label;

    TypeDePersonne(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
