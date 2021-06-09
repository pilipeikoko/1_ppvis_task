package org.bsuir.document.model.impl;

import org.bsuir.document.model.Administrator;
import org.bsuir.document.entity.Document;
import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.service.DocumentService;

public class AdministratorImpl implements Administrator {
    @Override
    public synchronized boolean removeDocument(Catalogue catalogue, Document document) {
        return DocumentService.removeDocument(catalogue, document);
    }

    @Override
    public synchronized Catalogue createCatalogue(String name) {
        return new Catalogue(name);
    }

    @Override
    public synchronized boolean moveTo(Catalogue sourceCatalogue, Catalogue targetCatalogue, Document documentToMove) {
        return DocumentService.moveTo(sourceCatalogue, targetCatalogue, documentToMove);
    }
}
