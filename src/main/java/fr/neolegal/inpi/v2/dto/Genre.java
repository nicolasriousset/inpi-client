package fr.neolegal.inpi.v2.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Genre {
    INCONNU("0", null),
    MASCULIN("1", "M"),
    FEMININ("2", "F");

    @JsonValue
    final String code;

    final String label;

    Genre(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
