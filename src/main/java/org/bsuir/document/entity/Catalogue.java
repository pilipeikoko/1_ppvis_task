package org.bsuir.document.entity;

import java.util.List;
import java.util.Vector;

public class Catalogue {
    //Kind of singleton
    private static final Catalogue ROOT_CATALOGUE = new Catalogue();

    private String name;
    private List<Document> documents;
    private List<Catalogue> catalogues;

    private Catalogue(){
        init();
    }

    public Catalogue(String name) {
        init();
        this.name = name;
    }

    private void init(){
        documents = new Vector<>();
        catalogues = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Catalogue> getCatalogues() {
        return catalogues;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addDocument(Document document) {
        return documents.add(document);
    }

    public boolean addCatalogue(Catalogue catalogue) {
        return catalogues.add(catalogue);
    }

    public static Catalogue getRootCatalogue() {
        return ROOT_CATALOGUE;
    }
}
