package fr.neolegal.inpi.v2.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum SituationMatrimoniale {
    CELIBATAIRE("Célibataire", "1"),
    DIVORCE("Divorcé", "2"),
    VEUF("Veuf", "3"),
    MARIE("Marié", "4"),
    PACSE("Pacsé", "5"),
    EN_CONCUBINAGE("En concubinage", "6");

    @JsonValue
    final String code;

    final String label;

    SituationMatrimoniale(String label, String code) {
        this.label = label;
        this.code = code;
    }
}
