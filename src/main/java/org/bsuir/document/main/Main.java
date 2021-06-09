package org.bsuir.document.main;

import org.bsuir.document.entity.*;
import org.bsuir.document.model.impl.AdministratorImpl;
import org.bsuir.document.model.impl.WriterImpl;
import org.bsuir.document.model.impl.SecretaryImpl;
import org.bsuir.document.model.Administrator;
import org.bsuir.document.model.Secretary;
import org.bsuir.document.model.Writer;

public class Main {
    public static void main(String[] args) throws Exception {
        Catalogue rootCatalogue = Catalogue.getRootCatalogue();
        Administrator administrator = new AdministratorImpl();
        Writer writer = new WriterImpl("Pushkin");
        Secretary secretary = new SecretaryImpl();

        Catalogue firstCatalogue = administrator.createCatalogue("first catalogue");
        Catalogue secondCatalogue = administrator.createCatalogue("second catalogue");

        Document firstDocument = writer.createDocument(firstCatalogue,"first","first context");
        Document secondDocument = writer.createDocument(firstCatalogue,"second","second context");

        administrator.moveTo(firstCatalogue,secondCatalogue,firstDocument);

        System.out.println(firstCatalogue.getDocuments().size() == secondCatalogue.getDocuments().size());

    }
}
