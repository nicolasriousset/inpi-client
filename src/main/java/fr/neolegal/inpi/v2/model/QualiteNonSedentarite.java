package fr.neolegal.inpi.v2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum QualiteNonSedentarite {
    FORAIN("F", "Forain"),
    AMBULANT_FRANCAIS("A", "Ambulant, non sédentaire"),
    AMBULANT_UE("E", "Ambulant ressortissant UE hors France");

    @JsonValue
    final String code;

    final String label;

    QualiteNonSedentarite(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
