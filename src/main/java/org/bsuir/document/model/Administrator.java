package org.bsuir.document.model;

import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.entity.Document;

public interface Administrator {
    Catalogue createCatalogue(String name);
    boolean removeDocument(Catalogue catalogue, Document document);
    boolean moveTo(Catalogue sourceCatalogue, Catalogue targetCatalogue, Document documentToMove);
}
