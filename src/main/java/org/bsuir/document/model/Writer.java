package org.bsuir.document.model;


import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.entity.Document;

public interface Writer {
    Document createDocument(Catalogue catalogue, String header, String context) throws Exception;

    void updateHeader(Document document, String newHeader);

    void updateContext(Document document, String newContext);
}
