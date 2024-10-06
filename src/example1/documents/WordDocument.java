package example1.documents;

import example1.documents.Document;

public class WordDocument implements Document {

    // This class implements the Document interface and overrides the create method.
    @Override
    public void create() {
        System.out.println("Create Word document");
    }

}
