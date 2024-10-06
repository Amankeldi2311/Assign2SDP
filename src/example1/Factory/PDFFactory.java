package example1.Factory;

import example1.documents.Document;
import example1.documents.PDFDocument;

// This class extends the DocumentFactory class and overrides the createDocument method.
public class PDFFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
