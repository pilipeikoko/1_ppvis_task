package org.bsuir.document.model;

import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.entity.Document;

public interface Secretary {
    boolean addDocumentToCatalogue(Catalogue catalogue, Document document);

    Document searchDocumentByHeader(Catalogue catalogue, String header);

    Document searchDocumentByWriter(Catalogue catalogue, String writer);
}
