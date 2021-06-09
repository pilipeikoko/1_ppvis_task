package org.bsuir.document.model.impl;

import org.bsuir.document.model.Writer;
import org.bsuir.document.entity.Document;
import org.bsuir.document.entity.Catalogue;

import java.time.LocalDate;

public class WriterImpl implements Writer {
    private final String name;

    public WriterImpl(String name) {
        this.name = name;
    }

    @Override
    public synchronized void updateHeader(Document document, String newHeader) {
        document.setHeader(newHeader);
    }

    @Override
    public synchronized Document createDocument(Catalogue catalogue, String header, String context) throws Exception {
        return new Document(catalogue, header, LocalDate.now(), this.name, context);
    }

    @Override
    public synchronized void updateContext(Document document, String newContext) {
        document.setContext(newContext);
    }
}
