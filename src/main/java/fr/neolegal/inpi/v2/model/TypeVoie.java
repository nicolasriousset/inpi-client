package fr.neolegal.inpi.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.stream.Stream;
import lombok.Getter;

@Getter
public enum TypeVoie {
    ALLEE("ALL", "ALLEE"),
    AVENUE("AV", "AVENUE"),
    BOULEVARD("BD", "BOULEVARD"),
    CARREFOUR("CAR", "CARREFOUR"),
    CHEMIN("CHE", "CHEMIN"),
    CHAUSSEE("CHS", "CHAUSSEE"),
    CITE("CITE", "CITE"),
    CORNICHE("COR", "CORNICHE"),
    COURS("CRS", "COURS"),
    DOMAINE("DOM", "DOMAINE"),
    DESCENTE("DSC", "DESCENTE"),
    ECART("ECA", "ECART"),
    ESPLANAGE("ESP", "ESPLANAGE"),
    FAUBOURG("FG", "FAUBOURG"),
    GRANDE_RUE("GR", "GRANDE RUE"),
    HAMEAU("HAM", "HAMEAU"),
    HALLE("HLE", "HALLE"),
    IMPASSE("IMP", "IMPASSE"),
    JETEE("JTE", "JETEE"),
    LIEU_DIT("LD", "LIEU-DIT"),
    LOTISSEMENT("LOT", "LOTISSEMENT"),
    MARCHE("MAR", "MARCHE"),
    MONTEE("MTE", "MONTEE"),
    PARC("PARC", "PARC"),
    PASSAGE("PAS", "PASSAGE"),
    PLACE("PL", "PLACE"),
    PLAINE("PLN", "PLAINE"),
    PLATEZA("PLT", "PLATEZA"),
    PROMENADE("PRO", "PROMENADE"),
    PARVIS("PRV", "PARVIS"),
    QUARTIER("QUA", "QUARTIER"),
    QUAI("QUAI", "QUAI"),
    RESIDENCE("RES", "RESIDENCE"),
    RUELLE("RLE", "RUELLE"),
    ROCADE("ROC", "ROCADE"),
    ROND_POINT("RPT", "ROND-POINT"),
    ROUTE("RTE", "ROUTE"),
    RUE("RUE", "RUE"),
    SENTIER("SEN", "SENTIER"),
    SQUARE("SQ", "SQUARE"),
    TERRE_PLEIN("TPL", "TERRE-PLEIN"),
    TERTRE("TRT", "TERTRE"),
    TRAVERSE("TRA", "TRAVERSE"),
    VILLA("VLA", "VILLA"),
    VILLAGE("VLGE", "VILLAGE");

    final String code;

    final String libelle;

    TypeVoie(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    @JsonCreator
    public static TypeVoie forValue(String code) {
        return Stream.of(TypeVoie.values()).filter(typeVoie -> typeVoie.code.equalsIgnoreCase(code)).findFirst().orElse(null);
    }
}
