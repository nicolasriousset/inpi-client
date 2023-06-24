package fr.neolegal.inpi.v2.model;

import java.time.LocalDate;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

@Getter
@Setter
public class Acte {

    String id;
    Integer idOdrncs;
    String siren;
    String denomination;
    LocalDate dateDepot;
    String nomDocument;
    String nomDocumentOrigine;
    String confidentiality;
    LocalDate dateReceptionRne;
    String tailleFichier;
    String documentExtension;
    Integer nbPages;
    String natureArchive;
    String path;
    String pathOrigine;
    String typeDocument;
    String numNat;
    String numNatChrono;
    String valideParCfe;
    String nomDocumentDeposant;
    Collection<TypeRDD> typeRdd;

    public boolean isPublicationStatuts() {
        return CollectionUtils.emptyIfNull(typeRdd).stream().anyMatch(TypeRDD::isPublicationStatuts);
    }
}
