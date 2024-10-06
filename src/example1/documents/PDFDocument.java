package example1.documents;

import example1.documents.Document;

public class PDFDocument implements Document {

    // This method is called when the PDFDocument object is created and it prints a message.
    @Override
    public void create() {
        System.out.println("Create PDF document");
    }
}
