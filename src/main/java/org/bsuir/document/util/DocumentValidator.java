package org.bsuir.document.util;

import org.bsuir.document.entity.Document;

import java.util.List;

public class DocumentValidator {

    //Using private constructor so none creates object of such class
    private DocumentValidator(){

    }

    public static boolean isSameHeaderInCatalogue(List<Document> documents, String header) {

        for (Document document : documents) {
            if (document.getHeader().equals(header)) {
                return true;
            }
        }
        return false;
    }
}
