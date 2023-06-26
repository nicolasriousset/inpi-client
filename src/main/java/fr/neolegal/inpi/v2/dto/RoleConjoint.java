package fr.neolegal.inpi.v2.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleConjoint {
    COLLABORATEUR("1", "Collaborateur"),
    ASSOCIE("2", "Associé ou chef d'exploitation"),
    SALARIE("3", "Salarié"),
    CO_EXPLOITANT("4", "Co-exploitant"),
    AUCUNE("5", "Aucun");

    @JsonValue
    final String code;

    final String label;

    RoleConjoint(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
