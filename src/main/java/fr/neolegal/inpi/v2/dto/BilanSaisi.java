package fr.neolegal.inpi.v2.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BilanSaisi {

    String id;
    String siren;
    String denomination;
    LocalDate dateDepot;
    String numChrono;
    String nomDocument;
    // "bilanSaisi": {
}
