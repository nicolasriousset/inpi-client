package fr.neolegal.inpi.v2.model;

import static org.apache.commons.lang3.StringUtils.*;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeRDD {

    TypeActe typeActe;
    String decision;

    public boolean isPublicationStatuts() {
        if (Objects.isNull(typeActe)) {
            return false;
        }

        if (typeActe.isPublicationStatuts()) {
            return true;
        }

        if (TypeActe.ACTE_SOUS_SEING_PRIVE == typeActe && equalsIgnoreCase(trim(decision), "Constitution")) {
            return true;
        }

        return false;
    }
}
