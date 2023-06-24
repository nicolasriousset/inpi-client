package fr.neolegal.inpi.v2.model;

import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachments {

    List<Acte> actes = new LinkedList<>();
    List<Bilan> bilans = new LinkedList<>();
    List<BilanSaisi> bilansSaisis = new LinkedList<>();
}
