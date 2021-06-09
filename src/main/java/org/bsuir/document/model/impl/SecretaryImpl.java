package org.bsuir.document.model.impl;

import org.bsuir.document.entity.Document;
import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.model.Secretary;
import org.bsuir.document.service.DocumentService;

public class SecretaryImpl implements Secretary {

    @Override
    public synchronized boolean addDocumentToCatalogue(Catalogue catalogue, Document document) {
        return catalogue.addDocument(document);
    }

    @Override
    public synchronized Document searchDocumentByHeader(Catalogue catalogue, String header) {
        return DocumentService.searchDocumentByHeader(catalogue, header);
    }

    @Override
    public synchronized Document searchDocumentByWriter(Catalogue catalogue, String writer) {
        return DocumentService.searchDocumentByWriter(catalogue,writer);
    }
}
