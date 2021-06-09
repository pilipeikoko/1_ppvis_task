package org.bsuir.document.service;

import org.bsuir.document.entity.Catalogue;
import org.bsuir.document.entity.Document;

import java.util.List;

public class DocumentService {

    //Using private constructor so none creates object of such class
    private DocumentService(){

    }

    public static synchronized Document searchDocumentByHeader(Catalogue currentCatalogue, String header){
        List<Catalogue> foldersInCurrentCatalogue = currentCatalogue.getCatalogues();

        for (Catalogue catalogue : foldersInCurrentCatalogue) {
            List<Document> documentsInFolder = catalogue.getDocuments();
            for (Document document : documentsInFolder) {
                if (document.getHeader().equals(header)) {
                    return document;
                }
            }
        }
        return null;
    }

    public static synchronized Document searchDocumentByWriter(Catalogue currentCatalogue, String writer){
        List<Catalogue> foldersInCurrentCatalogue = currentCatalogue.getCatalogues();

        for (Catalogue catalogue : foldersInCurrentCatalogue) {
            List<Document> documentsInFolder = catalogue.getDocuments();
            for (Document document : documentsInFolder) {
                if (document.getWriter().equals(writer)) {
                    return document;
                }
            }
        }
        return null;
    }

    public static synchronized boolean removeDocument(Catalogue catalogue, Document document) {
        List<Document> documents = catalogue.getDocuments();
        return documents.remove(document);
    }

    public static synchronized boolean moveTo(Catalogue sourceCatalogue, Catalogue targetCatalogue, Document documentToMove) {
        List<Document> sourceFolderDocuments = sourceCatalogue.getDocuments();
        if (sourceFolderDocuments.remove(documentToMove)) {
            List<Document> targetFolderDocuments = targetCatalogue.getDocuments();
            return targetFolderDocuments.add(documentToMove);
        }
        return false;
    }
}
