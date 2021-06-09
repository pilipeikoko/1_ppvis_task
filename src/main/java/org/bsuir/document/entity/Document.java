package org.bsuir.document.entity;

import org.bsuir.document.util.DocumentValidator;

import java.time.LocalDate;

public class Document {
    private String header;
    private LocalDate createDate;
    private String writer;
    private String context;

    public Document(Catalogue catalogue, String header, LocalDate createDate, String writer, String context) throws Exception {
        init(header,createDate, writer,context);
        validate(catalogue);
    }

    private void validate(Catalogue catalogue) throws Exception {
        if (!DocumentValidator.isSameHeaderInCatalogue(catalogue.getDocuments(), header)) {
            catalogue.addDocument(this);
        } else {
            throw new Exception("This header already exists! " + header);
        }
    }

    private void init(String header, LocalDate createDate, String writer, String context){
        this.header = header;
        this.createDate = createDate;
        this.writer = writer;
        this.context = context;
    }

    public String getHeader() {
        return header;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public String getWriter() {
        return writer;
    }

    public String getContext() {
        return context;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContext(String context) {
        this.context = context;
    }
}