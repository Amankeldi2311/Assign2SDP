import example1.Factory.DocumentFactoryProducer;
import example1.documents.Document;
import example1.Factory.DocumentFactory;

// This is the Main class. It creates a PDF document and a Word document.
public class Main {
    public static void main(String[] args) {
        documentTest();


    }

    public static void documentTest() {
        DocumentFactory pdfFactory = DocumentFactoryProducer.getFactory("PDF");
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        // Create Word document
        DocumentFactory wordFactory = DocumentFactoryProducer.getFactory("WORD");
        Document wordDocument = wordFactory.createDocument();
        wordDocument.create();
    }


}